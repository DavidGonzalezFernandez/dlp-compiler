package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.subtypes.IntType;

public class IntLiteral extends AbstractExpression {
  private int value;
  private Type type;

  public IntLiteral(int line, int column, int value) {
    super(line, column);
    this.type = new IntType(line, column);
    this.value = value;
  }

  @Override
  public Type getType() {
    return this.type;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public Object getValue() {
    return this.value;
  }
}
