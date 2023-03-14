package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class WriteStatement extends AbstractStatement {
  private Expression expression;

  public WriteStatement(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
