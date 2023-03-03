package es.uniovi.dlp.ast.statement.substatements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statement.AbstractStatement;

public class ReturnStatement extends AbstractStatement {
  private Expression expression;

  public ReturnStatement(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }
}
