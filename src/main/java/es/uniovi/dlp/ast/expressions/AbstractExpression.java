package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
  private boolean lValue;

  public AbstractExpression(int line, int column) {
    super(line, column);
  }

  @Override
  public boolean getLValue() {
    return this.lValue;
  }

  @Override
  public void setLValue(boolean lValue) {
    this.lValue = lValue;
  }
}
