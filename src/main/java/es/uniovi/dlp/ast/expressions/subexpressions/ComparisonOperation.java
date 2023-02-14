package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.Type;

public class ComparisonOperation extends AbstractExpression {
  private String operator;
  private Expression leftExpression;
  private Expression rightExpression;

  public ComparisonOperation(int line, int column) {
    super(line, column);
  }

  @Override
  public Type getType() {
    return null;
  }

  @Override
  public Object getValue() {
    return null;
  }
}
