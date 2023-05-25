package es.uniovi.dlp.compiler;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.parser.XanaLexer;
import es.uniovi.dlp.parser.XanaParser;
import es.uniovi.dlp.visitor.codegeneration.ExecuteCGVisitor;
import es.uniovi.dlp.visitor.codegeneration.OffsetVisitor;
import es.uniovi.dlp.visitor.semantic.IdentificationVisitor;
import es.uniovi.dlp.visitor.semantic.TypeCheckingVisitor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Compiler {
  private boolean showDebug = true;
  private String filename;
  private Program program;
  private boolean reportErrors = true;

  private OutputStreamWriter outputStreamWriter;

  public Compiler(String filename, OutputStreamWriter outputStreamWriter) {
    this.filename = filename;
    this.outputStreamWriter = outputStreamWriter;
  }

  public void run() throws IOException {
    ErrorManager.getInstance().clearErrors();
    program = parse(filename);
    assignScope();

    assignType();

    checkErrors();
    if (ErrorManager.getInstance().hasErrors()) return;

    runOffset();
    generateMAPLCode();
  }

  private void checkErrors() {
    if (!reportErrors) return;

    ErrorManager errorManager = ErrorManager.getInstance();
    if (errorManager.hasErrors()) {
      errorManager.getErrors().forEach(System.err::println);
      System.exit(-1);
    }
  }

  private void runOffset() {
    OffsetVisitor offsetVisitor = new OffsetVisitor();
    offsetVisitor.visit(program, null);
  }

  public Program getProgram() {
    return program;
  }

  private Program parse(String file) throws IOException {
    CharStream input = CharStreams.fromFileName(file);
    XanaLexer lexer = new XanaLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);
    XanaParser parser = new XanaParser(tokens);

    return parser.program().ast;
  }

  private void assignType() {
    TypeCheckingVisitor typeCheckingVisitor = new TypeCheckingVisitor();
    typeCheckingVisitor.visit(program, null);
  }

  private void assignScope() {
    IdentificationVisitor identificationVisitor = new IdentificationVisitor();
    identificationVisitor.visit(program, null);
  }

  public void setReportErrors(boolean reportErrors) {
    this.reportErrors = reportErrors;
  }

  public void setShowDebug(boolean showDebug) {
    this.showDebug = showDebug;
  }

  private void generateMAPLCode() {
    try {
      this.outputStreamWriter = new FileWriter(this.filename + ".mp");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    File file = new File(this.filename);
    ExecuteCGVisitor executeCGVisitor =
        new ExecuteCGVisitor(filename, outputStreamWriter, this.showDebug);
    executeCGVisitor.visit(program, null);
  }
}
