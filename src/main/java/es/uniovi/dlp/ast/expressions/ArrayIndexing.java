package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

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
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getArray() {
    return this.array;
  }

  public Expression getIndex() {
    return this.index;
  }
}
