package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.CompilerType;

public class ComparisonOperation extends AbstractExpression {
  private String operator;
  private Expression leftExpression;
  private Expression rightExpression;

  public ComparisonOperation(
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
