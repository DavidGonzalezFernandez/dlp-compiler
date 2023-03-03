package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;

public class Cast extends AbstractExpression {
  private Expression expression;
  private CompilerType newType;

  public Cast(int line, int column, Expression expression, CompilerType newType) {
    super(line, column);
    this.expression = expression;
    this.newType = newType;
  }

  @Override
  public CompilerType getType() {
    return null;
  }

  @Override
  public Object getValue() {
    return null;
  }
}
