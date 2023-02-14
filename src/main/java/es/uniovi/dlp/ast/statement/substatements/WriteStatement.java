package es.uniovi.dlp.ast.statement.substatements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statement.AbstractStatement;

public class WriteStatement extends AbstractStatement {
  private Expression expression;

  public WriteStatement(int line, int column) {
    super(line, column);
  }
}
