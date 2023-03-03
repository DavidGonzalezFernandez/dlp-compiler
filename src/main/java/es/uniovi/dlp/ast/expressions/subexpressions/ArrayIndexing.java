package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.CompilerType;

public class ArrayIndexing extends AbstractExpression {
  private Expression array;
  private Expression index;

  public ArrayIndexing(int line, int column, Expression array, Expression index) {
    super(line, column);
    this.array = array;
    this.index = index;
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
