package es.uniovi.dlp.ast.statement.substatements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statement.AbstractStatement;

public class Assignment extends AbstractStatement {
  private Expression leftPart;
  private Expression value;

  public Assignment(int line, int column) {
    super(line, column);
  }
}
