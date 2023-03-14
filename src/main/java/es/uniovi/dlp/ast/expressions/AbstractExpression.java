package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.CompilerType;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
  private boolean lValue;
  public AbstractExpression(int line, int column) {
    super(line, column);
  }

  @Override
  public abstract CompilerType getType();

  @Override
  public abstract Object getValue();

  public boolean getLValue() {
    return this.lValue;
  }

  protected void setLValue(boolean lValue) {
    this.lValue = lValue;
  }
}
