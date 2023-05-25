package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.ast.types.IntType;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {
  private OutputStreamWriter out;
  private boolean showDebug;

  private int currentLabel;

  public CodeGenerator(OutputStreamWriter out, boolean showDebug) {
    this.currentLabel = 0;
    this.out = out;
    this.showDebug = showDebug;
  }

  private void writePragma(String string) {
    write("# " + string + "\n");
  }

  private void write(String string) {
    try {
      out.write(string);
      out.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void writeComment(String string) {
    if (showDebug) {
      this.write("' " + string + "\n");
    }
  }

  public void writeInstruction(String string) {
    this.write(string + "\n");
  }

  public char getSuffix(CompilerType compilerType) {
    if (compilerType instanceof CharType) return 'b';
    if (compilerType instanceof IntType) return 'i';
    if (compilerType instanceof DoubleType) return 'f';

    throw new IllegalArgumentException("Compiler type");
  }

  public void sourceFile(String sourceFile) {
    writePragma("source\t\"" + sourceFile + "\"\n");
  }

  public void writeLine(int lineNumber) {
    writeEmptyLine();
    writePragma("line " + lineNumber + "\n");
  }

  public void writeLabel(String labelName) {
    write(labelName + ":\n");
  }

  private void writeEmptyLine() {
    write("\n");
  }

  public void callMain() {
    writeEmptyLine();

    // Comentario como en el fichero de ejemplo
    writeComment("Invocation to the main function");

    call("main");
    halt();

    writeEmptyLine();
  }

  public String generateNewLabel() {
    assert currentLabel >= 0;

    String label = "label" + currentLabel;
    currentLabel += 1;

    assert currentLabel > 0;

    return label;
  }

  // --- MAPL instructions

  public void halt() {
    writeInstruction("halt");
  }

  public void call(String funcName) {
    writeInstruction("call " + funcName);
  }

  public void enter(int localBytes) {
    writeInstruction("enter\t" + localBytes);
  }

  public void returnInstruction(ReturnInfoTriple returnInfoTriple) {
    writeInstruction(
        "ret\t"
            + returnInfoTriple.getReturnBytes()
            + ", "
            + returnInfoTriple.getLocalBytes()
            + ", "
            + returnInfoTriple.getParamBytes());
  }

  public void out(CompilerType compilerType) {
    writeInstruction("out" + getSuffix(compilerType));
  }

  public void in(CompilerType compilerType) {
    writeInstruction("in" + getSuffix(compilerType));
  }

  public void store(CompilerType compilerType) {
    writeInstruction("store" + getSuffix(compilerType));
  }

  public void promoteType(CompilerType fromType, CompilerType toType) {
    if (!fromType.canPromoteTo(toType)) return;

    recursiveCast(fromType, toType);
  }

  private void recursiveCast(CompilerType fromType, CompilerType toType) {
    if (fromType.getClass().equals(toType.getClass())) {
      // Parar recursividad
      return;
    }

    CompilerType intermediateType = fromType.getIntermediateType(toType);
    cast(fromType, intermediateType);
    recursiveCast(intermediateType, toType);
  }

  public void cast(CompilerType fromType, CompilerType toType) {
    writeInstruction(getSuffix(fromType) + "2" + getSuffix(toType));
  }

  public void jz(String label) {
    writeInstruction("jz\t" + label);
  }

  public void jmp(String label) {
    writeInstruction("jmp\t" + label);
  }

  public void pop(CompilerType type) {
    writeInstruction("pop" + getSuffix(type));
  }

  public void addi() {
    writeInstruction("addi");
  }

  public void pushb(char value) {
    writeInstruction("pushb\t" + (int) value);
  }

  public void pushf(double value) {
    writeInstruction("pushf\t" + value);
  }

  public void pushi(int value) {
    writeInstruction("pushi\t" + value);
  }

  public void pusha(int value) {
    writeInstruction("pusha\t" + value);
  }

  public void push_bp() {
    writeInstruction("push\tbp");
  }

  public void muli() {
    writeInstruction("muli");
  }

  private String getLogicOperator(String operator) {
    switch (operator) {
      case "&&":
        return "and";
      case "||":
        return "or";
      default:
        throw new IllegalArgumentException("Operador lógico no reconocido");
    }
  }

  public void logicOperator(String operator) {
    writeInstruction(getLogicOperator(operator));
  }

  public void minus() {
    writeInstruction("-");
  }

  public void not() {
    writeInstruction("not");
  }

  private String getComparissonOperator(String operator) {
    switch (operator) {
      case ">":
        return "gt";
      case "<":
        return "lt";
      case ">=":
        return "ge";
      case "<=":
        return "le";
      case "==":
        return "eq";
      case "!=":
        return "ne";
      default:
        throw new IllegalArgumentException("Operador relacional no reconocido");
    }
  }

  public void comparissonOperator(String operator, CompilerType type) {
    writeInstruction(getComparissonOperator(operator) + getSuffix(type));
  }

  public void load(CompilerType type) {
    writeInstruction("load" + getSuffix(type));
  }

  private String getArithmeticOperator(String operator) {
    switch (operator) {
      case "+":
        return "add";
      case "-":
        return "sub";
      case "*":
        return "mul";
      case "/":
        return "div";
      case "%":
        return "mod";
      default:
        throw new IllegalArgumentException("Operador aritmético no reconocido");
    }
  }

  public void arithmeticOperation(String operator, CompilerType type) {
    writeInstruction(getArithmeticOperator(operator) + getSuffix(type));
  }
}
