package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definition.FunctionDefinition;
import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.visitor.Visitor;

/**
 * Sobreescribe los métodos del visitor para lanzar excepciones La utilidad es comprobar que las
 * subclases de este visitor sobreescriben correctamente los métodos.
 *
 * @param <ReturnType>
 * @param <ParamType>
 */
public abstract class CGAbstractVisitor<ReturnType, ParamType>
    implements Visitor<ReturnType, ParamType> {
  @Override
  public ReturnType visit(Program program, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(VarDefinition varDefinition, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(FunctionDefinition functionDefinition, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(ArithmeticOperation arithmeticOperation, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(ArrayIndexing arrayIndexing, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(Cast cast, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(CharLiteral charLiteral, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(ComparisonOperation comparisonOperation, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(DoubleLiteral doubleLiteral, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(FieldAccess fieldAccess, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(FunctionInvocation arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(IntLiteral intLiteral, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(LogicOperation logicOperation, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(MinusOperation minusOperation, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(NotOperation notOperation, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(Variable variable, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(Assignment arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(IfElse arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(ReadStatement arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(ReturnStatement arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(While arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(WriteStatement arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(ArrayType arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(CharType arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(DoubleType arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(FunctionType arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(IntType arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(StructField arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(StructType arrayType, ParamType param) {
    throw new IllegalStateException();
  }

  @Override
  public ReturnType visit(VoidType arrayType, ParamType param) {
    throw new IllegalStateException();
  }
}
