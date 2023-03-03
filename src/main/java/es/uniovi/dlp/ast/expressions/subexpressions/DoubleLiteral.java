package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.subtypes.DoubleType;

public class DoubleLiteral extends AbstractExpression {
  private double value;
  private CompilerType type;

  public DoubleLiteral(int line, int column, double value) {
    super(line, column);
    this.type = new DoubleType(line, column);
    this.value = value;
  }

  public void setChar(char value) {
    this.value = value;
  }

  @Override
  public CompilerType getType() {
    return this.type;
  }

  @Override
  public Object getValue() {
    return this.value;
  }
}
