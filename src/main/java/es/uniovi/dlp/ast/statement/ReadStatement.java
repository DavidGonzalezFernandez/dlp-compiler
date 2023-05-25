package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class ReadStatement extends AbstractStatement {
  private Expression expression;

  public ReadStatement(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }

  public Expression getExpression() {
    return this.expression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
