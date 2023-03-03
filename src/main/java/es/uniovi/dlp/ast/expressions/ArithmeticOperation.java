package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;

public class ArithmeticOperation extends AbstractExpression {
  private String operator;
  private Expression leftExpression;
  private Expression rightExpression;

  public ArithmeticOperation(
      int line, int column, Expression left, String operator, Expression right) {
    super(line, column);
    this.leftExpression = left;
    this.rightExpression = right;
    this.operator = operator;
  }

  @Override
  public CompilerType getType() {
    return null;
  }

  @Override
  public Object getValue() {
    return null;
  }
}
