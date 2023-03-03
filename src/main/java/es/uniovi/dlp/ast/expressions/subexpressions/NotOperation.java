package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.CompilerType;

public class NotOperation extends AbstractExpression {
  private Expression expression;

  public NotOperation(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }

  @Override
  public CompilerType getType() {
    return null;
  } // TODO: pendiente de implementar

  @Override
  public Object getValue() {
    return null;
  } // TODO: pendiente de implementar
}
