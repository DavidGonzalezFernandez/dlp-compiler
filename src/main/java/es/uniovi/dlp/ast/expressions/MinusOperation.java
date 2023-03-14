package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class MinusOperation extends AbstractExpression {
  private Expression expression;

  public MinusOperation(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
    super.setLValue(false);
  }

  @Override
  public CompilerType getType() {
    return null;
  } // TODO: pendiente de implementar

  @Override
  public Object getValue() {
    return null;
  } // TODO: pendiente de implementar

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
