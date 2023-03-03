package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;

public class WriteStatement extends AbstractStatement {
  private Expression expression;

  public WriteStatement(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }
}
