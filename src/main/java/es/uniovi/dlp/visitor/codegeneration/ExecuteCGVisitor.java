package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definition.Definition;
import es.uniovi.dlp.ast.definition.FunctionDefinition;
import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.FunctionInvocation;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.ast.types.VoidType;
import java.io.OutputStreamWriter;

public class ExecuteCGVisitor extends CGAbstractVisitor<Void, ReturnInfoTriple> {
  private String filePath;
  private AddressCGVisitor addressCGVisitor;
  private ValueCGVisitor valueCGVisitor;
  private CodeGenerator codeGenerator;

  public ExecuteCGVisitor(String filePath, OutputStreamWriter out, boolean showDebug) {
    this.filePath = filePath;
    this.codeGenerator = new CodeGenerator(out, showDebug);
    this.addressCGVisitor = new AddressCGVisitor(codeGenerator);
    this.valueCGVisitor = new ValueCGVisitor(codeGenerator, addressCGVisitor);
    this.addressCGVisitor.setValueCGVisitor(this.valueCGVisitor);
  }

  // Program

  @Override
  public Void visit(Program program, ReturnInfoTriple param) {
    // Pragma con el source file
    codeGenerator.sourceFile(filePath);

    codeGenerator.writeComment("Global variables");
    // Execute código para definición de variables
    for (Definition definition : program.getDefinitions()) {
      if (definition instanceof VarDefinition) {
        definition.accept(this, null);
      }
    }

    // Execute código para funcion main
    codeGenerator.callMain();

    // Execute código para definición de funciones
    for (Definition definition : program.getDefinitions()) {
      if (definition instanceof FunctionDefinition) {
        definition.accept(this, null);
      }
    }

    return null;
  }

  // Definitions

  @Override
  public Void visit(FunctionDefinition functionDefinition, ReturnInfoTriple param) {
    // Pragma for the line number
    codeGenerator.writeLine(functionDefinition.getLine());

    // Write function name as label
    codeGenerator.writeLabel(functionDefinition.getName());

    // Visit the function type (for the parameters)
    functionDefinition.getType().accept(this, param);

    // Visit the local variables
    codeGenerator.writeComment("Local variables");
    int localBytes = 0;
    for (VarDefinition varDefinition : functionDefinition.getDefinitions()) {
      varDefinition.accept(this, param);
      localBytes += Math.abs(varDefinition.getType().getNumberOfBytes());
    }

    // Reserve space for local variables
    assert functionDefinition.getDefinitions().size() == 0
        || Math.abs(
                functionDefinition
                    .getDefinitions()
                    .get(functionDefinition.getDefinitions().size() - 1)
                    .getOffset())
            == localBytes;
    codeGenerator.enter(localBytes);

    FunctionType functionType = (FunctionType) functionDefinition.getType();
    int paramBytes = 0;
    for (VarDefinition parameter : functionType.getParameters()) {
      paramBytes += parameter.getType().getNumberOfBytes();
    }

    ReturnInfoTriple returnInfoTriple =
        new ReturnInfoTriple()
            .setLocalBytes(localBytes)
            .setParamBytes(paramBytes)
            .setReturnBytes(functionType.getReturnType().getNumberOfBytes())
            .setExpectedTypeToReturn(functionType.returnType);

    for (Statement statement : functionDefinition.getStatements()) {
      statement.accept(this, returnInfoTriple);
    }

    if (functionType.getReturnType() instanceof VoidType) {
      assert returnInfoTriple.getReturnBytes() == 0;
      codeGenerator.returnInstruction(returnInfoTriple);
    }

    return null;
  }

  @Override
  public Void visit(VarDefinition varDefinition, ReturnInfoTriple param) {
    codeGenerator.writeComment(
        varDefinition.getName()
            + " :: "
            + varDefinition.getType()
            + " (offset "
            + varDefinition.getOffset()
            + ")");
    return null;
  }

  // Types
  @Override
  public Void visit(FunctionType functionType, ReturnInfoTriple param) {
    codeGenerator.writeComment("Parameters");

    for (VarDefinition varDefinition : functionType.getParameters()) {
      varDefinition.accept(this, param);
    }

    return null;
  }

  // Statements
  @Override
  public Void visit(WriteStatement writeStatement, ReturnInfoTriple param) {
    codeGenerator.writeLine(writeStatement.getLine());
    codeGenerator.writeComment("Write statement");

    writeStatement.getExpression().accept(valueCGVisitor, null);
    codeGenerator.out(writeStatement.getExpression().getType());

    return null;
  }

  @Override
  public Void visit(ReadStatement readStatement, ReturnInfoTriple param) {
    codeGenerator.writeLine(readStatement.getLine());
    codeGenerator.writeComment("Read statement");

    readStatement.getExpression().accept(addressCGVisitor, null);

    // in instruction
    codeGenerator.in(readStatement.getExpression().getType());

    // store
    codeGenerator.store(readStatement.getExpression().getType());

    return null;
  }

  @Override
  public Void visit(Assignment assignment, ReturnInfoTriple param) {
    codeGenerator.writeLine(assignment.getLine());
    codeGenerator.writeComment("Assignment statement");

    assignment.getLeftPart().accept(addressCGVisitor, null);

    assignment.getValue().accept(valueCGVisitor, null);

    codeGenerator.promoteType(assignment.getValue().getType(), assignment.getLeftPart().getType());
    codeGenerator.store(assignment.getLeftPart().getType());

    return null;
  }

  @Override
  public Void visit(IfElse ifElse, ReturnInfoTriple param) {
    codeGenerator.writeLine(ifElse.getLine());
    codeGenerator.writeComment("If statement");

    String elseBodyLabel = codeGenerator.generateNewLabel();
    String exitIfStatement = codeGenerator.generateNewLabel();

    codeGenerator.writeComment("Condition");
    ifElse.getCondition().accept(valueCGVisitor, null);

    // false -> jump to else
    codeGenerator.jz(elseBodyLabel);

    codeGenerator.writeComment("If branch body");
    for (Statement statement : ifElse.getIfBody()) {
      statement.accept(this, param);
    }
    codeGenerator.jmp(exitIfStatement);

    codeGenerator.writeLabel(elseBodyLabel);

    codeGenerator.writeComment("Else branch body");
    for (Statement statement : ifElse.getElseBody()) {
      statement.accept(this, param);
    }

    codeGenerator.writeLabel(exitIfStatement);

    return null;
  }

  @Override
  public Void visit(While whileStatement, ReturnInfoTriple param) {
    codeGenerator.writeLine(whileStatement.getLine());
    codeGenerator.writeComment("While statement");

    String startWhileLabel = codeGenerator.generateNewLabel();
    String exitWhileLabel = codeGenerator.generateNewLabel();

    codeGenerator.writeLabel(startWhileLabel);

    codeGenerator.writeComment("Condition");
    whileStatement.getCondition().accept(valueCGVisitor, null);
    codeGenerator.jz(exitWhileLabel);

    codeGenerator.writeComment("While body");
    for (Statement statement : whileStatement.getBody()) {
      statement.accept(this, param);
    }

    codeGenerator.jmp(startWhileLabel);
    codeGenerator.writeLabel(exitWhileLabel);

    return null;
  }

  @Override
  public Void visit(ReturnStatement returnStatement, ReturnInfoTriple param) {
    codeGenerator.writeLine(returnStatement.getLine());
    codeGenerator.writeComment("Return statement");

    returnStatement.getExpression().accept(valueCGVisitor, null);

    // Promotes the return value
    codeGenerator.promoteType(
        returnStatement.getExpression().getType(), param.getExpectedTypeToReturn());

    codeGenerator.returnInstruction(param);

    return null;
  }

  @Override
  public Void visit(FunctionInvocation functionInvocation, ReturnInfoTriple param) {
    codeGenerator.writeLine(functionInvocation.getLine());
    codeGenerator.writeComment("Function invocation (statement)");

    // Apilar de IZQ a DRCH
    FunctionType functionType = (FunctionType) functionInvocation.getVariable().getType();
    var params = functionType.getParameters();
    var arguments = functionInvocation.getArguments();
    for (int i = 0; i < arguments.size(); i++) {
      Expression argument = arguments.get(i);

      argument.accept(valueCGVisitor, null);

      // Promote de los argumentos si es necesario
      codeGenerator.promoteType(argument.getType(), params.get(i).getType());
    }

    codeGenerator.call(functionInvocation.getVariable().getName());

    // Eliminar el resultado retornado de la pila
    if (!(functionInvocation.getType() instanceof VoidType)) {
      codeGenerator.pop(functionInvocation.getType());
    }

    return null;
  }

  // Expressions
  // Las expresiones no tienen execute
}
