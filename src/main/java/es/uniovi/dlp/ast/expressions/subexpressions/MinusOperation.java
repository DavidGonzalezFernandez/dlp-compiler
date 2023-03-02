package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.Type;

public class MinusOperation extends AbstractExpression {
  private Expression expression;

  public MinusOperation(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }

  @Override
  public Type getType() {
    return null;
  } // TODO: pendiente de implementar

  @Override
  public Object getValue() {
    return null;
  } // TODO: pendiente de implementar
}
