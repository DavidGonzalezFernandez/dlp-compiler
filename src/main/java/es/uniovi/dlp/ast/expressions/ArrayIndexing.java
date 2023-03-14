package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ArrayIndexing extends AbstractExpression {
  private Expression array;
  private Expression index;

  public ArrayIndexing(int line, int column, Expression array, Expression index) {
    super(line, column);
    this.array = array;
    this.index = index;
    super.setLValue(true);
  }

  @Override
  public CompilerType getType() {
    return null;
  }

  @Override
  public Object getValue() {
    return null;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
