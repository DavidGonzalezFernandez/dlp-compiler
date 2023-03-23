package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definition.FunctionDefinition;
import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.types.*;

/**
 * Recorre el arbol AST completo
 *
 * @param <ReturnType>
 * @param <ParamType>
 */
public abstract class AbstractVisitor<ReturnType, ParamType>
    implements Visitor<ReturnType, ParamType> {

  @Override
  public ReturnType visit(Program program, ParamType param) {
    program.getDefinitions().forEach(definition -> definition.accept(this, param));
    return null;
  }

  // Definitions
  @Override
  public ReturnType visit(VarDefinition varDefinition, ParamType param) {
    varDefinition.getType().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(FunctionDefinition functionDefinition, ParamType param) {
    functionDefinition.getType().accept(this, param);
    for (var statement : functionDefinition.getStatements()) {
      statement.accept(this, param);
    }
    for (var definition : functionDefinition.getDefinitions()) {
      definition.accept(this, param);
    }
    return null;
  }

  // Expressions
  @Override
  public ReturnType visit(ArithmeticOperation arithmeticOperation, ParamType param) {
    arithmeticOperation.getLeftExpression().accept(this, param);
    arithmeticOperation.getRightExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(ArrayIndexing arrayIndexing, ParamType param) {
    arrayIndexing.getArray().accept(this, param);
    arrayIndexing.getIndex().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Cast cast, ParamType param) {
    cast.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(CharLiteral charLiteral, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(ComparisonOperation comparisonOperation, ParamType param) {
    comparisonOperation.getLeftExpression().accept(this, param);
    comparisonOperation.getRightExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(DoubleLiteral doubleLiteral, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(FieldAccess fieldAccess, ParamType param) {
    fieldAccess.getStruct().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(FunctionInvocation functionInvocation, ParamType param) {
    functionInvocation.getVariable().accept(this, param);
    for (Expression expression : functionInvocation.getArguments()) {
      expression.accept(this, param);
    }
    return null;
  }

  @Override
  public ReturnType visit(IntLiteral intLiteral, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(LogicOperation logicOperation, ParamType param) {
    logicOperation.getLeftExpression().accept(this, param);
    logicOperation.getRightExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(MinusOperation minusOperation, ParamType param) {
    minusOperation.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(NotOperation notOperation, ParamType param) {
    notOperation.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Variable variable, ParamType param) {
    return null;
  }

  // Statements
  @Override
  public ReturnType visit(Assignment assignment, ParamType param) {
    assignment.getValue().accept(this, param);
    assignment.getLeftPart().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(IfElse ifElse, ParamType param) {
    ifElse.getCondition().accept(this, param);
    for (Statement statement : ifElse.getIfBody()) {
      statement.accept(this, param);
    }
    for (Statement statement : ifElse.getElseBody()) {
      statement.accept(this, param);
    }
    return null;
  }

  @Override
  public ReturnType visit(ReadStatement readStatement, ParamType param) {
    readStatement.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(ReturnStatement returnStatement, ParamType param) {
    returnStatement.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(While whileStatement, ParamType param) {
    whileStatement.getCondition().accept(this, param);
    for (Statement statement : whileStatement.getBody()) {
      statement.accept(this, param);
    }
    return null;
  }

  @Override
  public ReturnType visit(WriteStatement writeStatement, ParamType param) {
    writeStatement.getExpression().accept(this, param);
    return null;
  }

  // Types
  @Override
  public ReturnType visit(ArrayType arrayType, ParamType param) {
    arrayType.getType().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(CharType charType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(DoubleType doubleType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(FunctionType functionType, ParamType param) {
    for (VarDefinition varDefinition : functionType.getParameters()) {
      varDefinition.accept(this, param);
    }
    functionType.getReturnType().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(IntType intType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(StructField structField, ParamType param) {
    structField.getType().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(StructType structType, ParamType param) {
    for (StructField structField : structType.getFields()) {
      structField.accept(this, param);
    }
    return null;
  }

  @Override
  public ReturnType visit(VoidType voidType, ParamType param) {
    return null;
  }
}
