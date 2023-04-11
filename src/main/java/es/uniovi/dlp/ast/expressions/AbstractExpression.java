package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.CompilerType;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
  private CompilerType type;
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

  @Override
  public void setType(CompilerType type) {
    this.type = type;
  }

  @Override
  public CompilerType getType() {
    return this.type;
  }
}
