package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Assignment extends AbstractStatement {
  private Expression leftPart;
  private Expression value;

  public Assignment(int line, int column, Expression leftPart, Expression value) {
    super(line, column);
    this.leftPart = leftPart;
    this.value = value;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getValue() {
    return this.value;
  }

  public Expression getLeftPart() {
    return this.leftPart;
  }
}
