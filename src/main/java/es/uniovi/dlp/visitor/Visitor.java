package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definition.FunctionDefinition;
import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.types.*;

public interface Visitor<ReturnType, ParamType> {
  ReturnType visit(Program program, ParamType param);

  // Definiciones
  ReturnType visit(VarDefinition varDefinition, ParamType param);

  ReturnType visit(FunctionDefinition functionDefinition, ParamType param);

  // Expresiones
  ReturnType visit(ArithmeticOperation arithmeticOperation, ParamType param);

  ReturnType visit(ArrayIndexing arrayIndexing, ParamType param);

  ReturnType visit(Cast cast, ParamType param);

  ReturnType visit(CharLiteral charLiteral, ParamType param);

  ReturnType visit(ComparisonOperation comparisonOperation, ParamType param);

  ReturnType visit(DoubleLiteral doubleLiteral, ParamType param);

  ReturnType visit(FieldAccess fieldAccess, ParamType param);

  ReturnType visit(FunctionInvocation arrayType, ParamType param);

  ReturnType visit(IntLiteral intLiteral, ParamType param);

  ReturnType visit(LogicOperation logicOperation, ParamType param);

  ReturnType visit(MinusOperation minusOperation, ParamType param);

  ReturnType visit(NotOperation notOperation, ParamType param);

  ReturnType visit(Variable variable, ParamType param);

  // Statements
  ReturnType visit(Assignment arrayType, ParamType param);

  ReturnType visit(IfElse arrayType, ParamType param);

  ReturnType visit(ReadStatement arrayType, ParamType param);

  ReturnType visit(ReturnStatement arrayType, ParamType param);

  ReturnType visit(While arrayType, ParamType param);

  ReturnType visit(WriteStatement arrayType, ParamType param);

  // Tipos
  ReturnType visit(ArrayType arrayType, ParamType param);

  ReturnType visit(CharType charType, ParamType param);

  ReturnType visit(DoubleType doubleType, ParamType param);

  ReturnType visit(FunctionType functionType, ParamType param);

  ReturnType visit(IntType intType, ParamType param);

  ReturnType visit(StructField structField, ParamType param);

  ReturnType visit(StructType structType, ParamType param);

  ReturnType visit(VoidType voidType, ParamType param);
}
