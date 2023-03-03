package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;

public class ReadStatement extends AbstractStatement {
  private Expression expression;

  public ReadStatement(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }
}
