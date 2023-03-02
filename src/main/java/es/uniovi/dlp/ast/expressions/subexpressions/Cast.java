package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.Type;

public class Cast extends AbstractExpression {
  private Expression expression;
  private Type newType;

  public Cast(int line, int column, Expression expression, Type newType) {
    super(line, column);
    this.expression = expression;
    this.newType = newType;
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
