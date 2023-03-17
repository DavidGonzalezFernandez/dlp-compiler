package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ReturnStatement extends AbstractStatement {
  private Expression expression;

  public ReturnStatement(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
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
