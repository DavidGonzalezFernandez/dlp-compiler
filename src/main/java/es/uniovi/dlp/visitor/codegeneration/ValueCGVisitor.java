package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.types.IntType;

public class ValueCGVisitor extends CGAbstractVisitor<Void, Void> {
  CodeGenerator codeGenerator;
  AddressCGVisitor addressCGVisitor;

  public ValueCGVisitor(CodeGenerator codeGenerator, AddressCGVisitor addressCGVisitor) {
    this.codeGenerator = codeGenerator;
    this.addressCGVisitor = addressCGVisitor;
  }

  // Expressions
  @Override
  public Void visit(ArithmeticOperation arithmeticOperation, Void param) {
    arithmeticOperation.getLeftExpression().accept(this, param);
    codeGenerator.promoteType(
        arithmeticOperation.getLeftExpression().getType(), arithmeticOperation.getType());

    arithmeticOperation.getRightExpression().accept(this, param);
    codeGenerator.promoteType(
        arithmeticOperation.getRightExpression().getType(), arithmeticOperation.getType());

    codeGenerator.arithmeticOperation(
        arithmeticOperation.getOperator(), arithmeticOperation.getType());

    return null;
  }

  @Override
  public Void visit(ArrayIndexing arrayIndexing, Void param) {
    codeGenerator.writeComment("Array indexing");

    arrayIndexing.accept(addressCGVisitor, param);
    codeGenerator.load(arrayIndexing.getType());

    return null;
  }

  @Override
  public Void visit(Cast cast, Void param) {
    cast.getExpression().accept(this, param);
    codeGenerator.cast(cast.getExpression().getType(), cast.getToType());

    return null;
  }

  @Override
  public Void visit(CharLiteral charLiteral, Void param) {
    codeGenerator.pushb(charLiteral.getValue());

    return null;
  }

  @Override
  public Void visit(ComparisonOperation comparisonOperation, Void param) {
    codeGenerator.writeComment("Comparisson operation");

    comparisonOperation.getLeftExpression().accept(this, param);
    codeGenerator.promoteType(
        comparisonOperation.getLeftExpression().getType(), comparisonOperation.getOperandTypes());
    comparisonOperation.getRightExpression().accept(this, param);
    codeGenerator.promoteType(
        comparisonOperation.getRightExpression().getType(), comparisonOperation.getOperandTypes());

    codeGenerator.comparissonOperator(
        comparisonOperation.getOperator(), comparisonOperation.getOperandTypes());

    return null;
  }

  @Override
  public Void visit(DoubleLiteral doubleLiteral, Void param) {
    codeGenerator.pushf(doubleLiteral.getValue());

    return null;
  }

  @Override
  public Void visit(FieldAccess fieldAccess, Void param) {
    codeGenerator.writeComment("Field access");

    fieldAccess.accept(addressCGVisitor, param);
    codeGenerator.load(fieldAccess.getType());

    return null;
  }

  @Override
  public Void visit(FunctionInvocation functionInvocation, Void param) {
    codeGenerator.writeLine(functionInvocation.getLine());
    codeGenerator.writeComment("Function invocation (expression)");

    // Apilar de IZQ a DRCH
    for (Expression argument : functionInvocation.getArguments()) {
      argument.accept(this, param);
    }

    codeGenerator.call(functionInvocation.getVariable().getName());

    // TODO: mirar cast

    return null;
  }

  @Override
  public Void visit(IntLiteral intLiteral, Void param) {
    codeGenerator.pushi(intLiteral.getValue());

    return null;
  }

  @Override
  public Void visit(LogicOperation logicOperation, Void param) {
    codeGenerator.writeComment("Logic operation");

    // Como está hecho MAPL no hace falta casts
    // porque solo se permiten operaciones lógicas entre tipo Int

    logicOperation.getLeftExpression().accept(this, param);
    logicOperation.getRightExpression().accept(this, param);

    codeGenerator.logicOperator(logicOperation.getOperator());

    return null;
  }

  @Override
  public Void visit(MinusOperation minusOperation, Void param) {
    codeGenerator.writeComment("Minus operation");

    // push valor 0
    codeGenerator.pushi(0);
    // casteo del 0 a tipo de expresión
    codeGenerator.cast(IntType.getInstance(), minusOperation.getType());

    // push valor de la expresión
    minusOperation.getExpression().accept(this, param);

    // resta
    codeGenerator.arithmeticOperation("-", minusOperation.getType());

    return null;
  }

  @Override
  public Void visit(NotOperation notOperation, Void param) {
    codeGenerator.writeComment("Not operation");

    // Como está hecho MAPL no hace falta casts
    // porque solo se permiten operaciones lógicas entre tipo Int

    notOperation.getExpression().accept(this, param);

    codeGenerator.not();

    return null;
  }

  @Override
  public Void visit(Variable variable, Void param) {
    variable.accept(addressCGVisitor, param);
    codeGenerator.load(variable.getType());

    return null;
  }
}
