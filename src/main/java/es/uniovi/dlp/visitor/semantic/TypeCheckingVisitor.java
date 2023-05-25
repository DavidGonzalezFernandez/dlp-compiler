package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definition.FunctionDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<CompilerType, CompilerType> {
  // Definitions
  public CompilerType visit(FunctionDefinition functionDefinition, CompilerType param) {
    super.visit(functionDefinition, param);
    FunctionType functionType = (FunctionType) functionDefinition.getType();

    for (Statement statement : functionDefinition.getStatements()) {
      if (statement instanceof ReturnStatement) {
        statement.accept(this, ((FunctionType) (functionDefinition.getType())).getReturnType());
      }
    }

    return null;
  }

  // Statements
  public CompilerType visit(Assignment assignment, CompilerType param) {
    super.visit(assignment, param);

    if (!assignment.getLeftPart().getLValue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(
                      assignment.getLeftPart().getLine(), assignment.getLeftPart().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));
    }

    CompilerType leftType = assignment.getLeftPart().getType();
    CompilerType rightType = assignment.getValue().getType();

    if (leftType == null || leftType.isError() || rightType == null || rightType.isError()) {
      // TODO ¿añadir error?
      return null;
    }

    if (leftType.getClass() != rightType.getClass() && !rightType.canPromoteTo(leftType)) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(assignment.getLine(), assignment.getColumn()),
                  ErrorReason.INCOMPATIBLE_TYPES));
    }

    return null;
  }

  public CompilerType visit(ReadStatement readStatement, CompilerType param) {
    if (!readStatement.getExpression().getLValue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(
                      readStatement.getExpression().getLine(),
                      readStatement.getExpression().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));
    }

    return super.visit(readStatement, param);
  }

  public CompilerType visit(IfElse ifElse, CompilerType param) {
    super.visit(ifElse, param);

    CompilerType conditionType = ifElse.getCondition().getType();
    if (!conditionType.isLogical() && !conditionType.isError()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(ifElse.getCondition().getLine(), ifElse.getCondition().getColumn()),
                  ErrorReason.NOT_LOGICAL));
    }

    return null;
  }

  public CompilerType visit(While whileStatement, CompilerType param) {
    super.visit(whileStatement, param);

    CompilerType conditionType = whileStatement.getCondition().getType();
    if (!conditionType.isLogical() && !conditionType.isError()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(
                      whileStatement.getCondition().getLine(),
                      whileStatement.getCondition().getColumn()),
                  ErrorReason.NOT_LOGICAL));
    }

    return null;
  }

  public CompilerType visit(ReturnStatement returnStatement, CompilerType param) {
    super.visit(returnStatement, param);

    if (param != null) {
      if (param.getClass() != returnStatement.getExpression().getType().getClass()
          && !returnStatement.getExpression().getType().canPromoteTo(param)) {
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(returnStatement.getLine(), returnStatement.getColumn()),
                    ErrorReason.INVALID_RETURN_TYPE));
      }
    }

    // TODO: hacer
    return null;
  }

  // Expressions
  public CompilerType visit(ArithmeticOperation arithmeticOperation, CompilerType param) {
    super.visit(arithmeticOperation, param);

    Expression left = arithmeticOperation.getLeftExpression();
    Expression right = arithmeticOperation.getRightExpression();
    arithmeticOperation.setType(left.getType().arithmetic(right.getType()));

    if (arithmeticOperation.getType() == null) {
      arithmeticOperation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(arithmeticOperation.getLine(), arithmeticOperation.getColumn()),
                  ErrorReason.INVALID_ARITHMETIC));
    }

    return null;
  }

  public CompilerType visit(ArrayIndexing arrayIndexing, CompilerType param) {
    super.visit(arrayIndexing, param);

    CompilerType arrayType = arrayIndexing.getArray().getType();
    CompilerType indexType = arrayIndexing.getIndex().getType();
    arrayIndexing.setType(arrayType.indexing(indexType));

    if (arrayIndexing.getType() == null) {
      arrayIndexing.setType(ErrorType.getInstance());
      if (!arrayType.isArray()) {
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(
                        arrayIndexing.getArray().getLine(), arrayIndexing.getArray().getColumn()),
                    ErrorReason.INVALID_INDEXING));
      }
      if (!indexType.isIndexable()) {
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(
                        arrayIndexing.getIndex().getLine(), arrayIndexing.getIndex().getColumn()),
                    ErrorReason.INVALID_INDEX_EXPRESSION));
      }
    }

    return null;
  }

  public CompilerType visit(Cast cast, CompilerType param) {
    super.visit(cast, param);

    CompilerType fromType = cast.getExpression().getType();
    CompilerType toType = cast.getToType();
    cast.setType(fromType.cast(toType));

    if (cast.getType() == null) {
      ErrorManager.getInstance()
          .addError(
              new Error(new Location(cast.getLine(), cast.getColumn()), ErrorReason.INVALID_CAST));
    }

    // TODO:
    return null;
  }

  public CompilerType visit(ComparisonOperation comparisonOperation, CompilerType param) {
    super.visit(comparisonOperation, param);

    Expression left = comparisonOperation.getLeftExpression();
    Expression right = comparisonOperation.getRightExpression();
    comparisonOperation.setType(left.getType().comparison(right.getType()));

    if (comparisonOperation.getType() == null) {
      comparisonOperation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(comparisonOperation.getLine(), comparisonOperation.getColumn()),
                  ErrorReason.INVALID_COMPARISON));
    } else {
      // Se establece el tipo de comparación que hay que hacer
      // Se necesita para castear los operandos y para poner el sufijo correcto de MAPL
      CompilerType operandTypes =
          left.getType().canPromoteTo(right.getType())
              ? left.getType().cast(right.getType())
              : right.getType().cast(left.getType());
      if (operandTypes.canPromoteTo(IntType.getInstance())) {
        operandTypes = operandTypes.cast(IntType.getInstance());
      }
      comparisonOperation.setOperandTypes(operandTypes);
    }

    return null;
  }

  public CompilerType visit(FieldAccess fieldAccess, CompilerType param) {
    super.visit(fieldAccess, param);

    CompilerType structType = fieldAccess.getStruct().getType();
    fieldAccess.setType(structType.dot(fieldAccess.getFieldName()));

    if (fieldAccess.getType().isError()) {
      if (!structType.allowsDot()) {
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(fieldAccess.getLine(), fieldAccess.getColumn()),
                    ErrorReason.INVALID_DOT));
      } else {
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(fieldAccess.getLine(), fieldAccess.getColumn()),
                    ErrorReason.NO_SUCH_FIELD));
      }
    }

    return null;
  }

  public CompilerType visit(FunctionInvocation functionInvocation, CompilerType param) {
    super.visit(functionInvocation, param);

    CompilerType functionInvocationType = functionInvocation.getVariable().getType();
    if (functionInvocationType == null) return null;
    // TODO: algo puede ser null?

    functionInvocation.setType(
        functionInvocationType.invocation(functionInvocation.getArguments()));

    if (!functionInvocationType.isCallable()) {
      if (functionInvocation.getVariable().getDefinition() != null) {
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(functionInvocation.getLine(), functionInvocation.getColumn()),
                    ErrorReason.INVALID_INVOCATION));
      }
      return null;
    }

    if (functionInvocation.getType().isError()) {
      if (((FunctionType) functionInvocationType).getParameters().size()
          != functionInvocation.getArguments().size()) {
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(functionInvocation.getLine(), functionInvocation.getColumn()),
                    ErrorReason.INVALID_ARGS));
        return null;
      }
      for (Expression argument : functionInvocation.getArguments()) {
        if (argument.getType().isError()) {
          ErrorManager.getInstance()
              .addError(
                  new Error(
                      new Location(argument.getLine(), argument.getColumn()),
                      ErrorReason.INVALID_ARGS));
        }
      }
    }

    return null;
  }

  public CompilerType visit(LogicOperation logicOperation, CompilerType param) {
    super.visit(logicOperation, param);

    Expression left = logicOperation.getLeftExpression();
    Expression right = logicOperation.getRightExpression();
    logicOperation.setType(left.getType().logical(right.getType()));

    if (logicOperation.getType() == null) {
      logicOperation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(logicOperation.getLine(), logicOperation.getColumn()),
                  ErrorReason.INVALID_LOGICAL));
    }

    return null;
  }

  public CompilerType visit(MinusOperation minusOperation, CompilerType param) {
    super.visit(minusOperation, param);
    if (!minusOperation.getExpression().getType().isArithmetic()) {
      minusOperation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(minusOperation.getLine(), minusOperation.getColumn()),
                  ErrorReason.INVALID_ARITHMETIC));
    } else {
      minusOperation.setType(
          // Casteo para evitar que sea resta de char
          minusOperation
              .getExpression()
              .getType()
              .arithmetic(minusOperation.getExpression().getType()));
    }
    return null;
  }

  public CompilerType visit(NotOperation notOperation, CompilerType param) {
    super.visit(notOperation, param);
    if (!notOperation.getExpression().getType().isLogical()) {
      notOperation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(notOperation.getLine(), notOperation.getColumn()),
                  ErrorReason.NOT_LOGICAL));
    } else {
      // siempre son tipo Int
      notOperation.setType(IntType.getInstance());
    }
    return null;
  }

  public CompilerType visit(Variable variable, CompilerType param) {
    super.visit(variable, param);

    if (variable.getDefinition() != null) {
      variable.setType(variable.getDefinition().getType());
    } else {
      variable.setType(ErrorType.getInstance());
    }

    return super.visit(variable, param);
  }
}
