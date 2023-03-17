package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class NotOperation extends AbstractExpression {
  private Expression expression;

  public NotOperation(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getExpression() {
    return this.expression;
  }
}
