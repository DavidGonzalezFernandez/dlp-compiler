package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;

public class Assignment extends AbstractStatement {
  private Expression leftPart;
  private Expression value;

  public Assignment(int line, int column, Expression leftPart, Expression value) {
    super(line, column);
    this.leftPart = leftPart;
    this.value = value;
  }
}
