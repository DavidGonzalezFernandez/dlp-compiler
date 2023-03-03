package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;

public class ReturnStatement extends AbstractStatement {
  private Expression expression;

  public ReturnStatement(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }
}
