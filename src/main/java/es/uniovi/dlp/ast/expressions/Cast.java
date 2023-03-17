package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Cast extends AbstractExpression {
  private Expression expression;
  private CompilerType newType;

  public Cast(int line, int column, Expression expression, CompilerType newType) {
    super(line, column);
    this.expression = expression;
    this.newType = newType;
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getExpression() {
    return this.expression;
  }
}
