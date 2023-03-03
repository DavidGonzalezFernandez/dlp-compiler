package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.subtypes.CharType;

public class CharLiteral extends AbstractExpression {
  private char value;
  private CompilerType type;

  public CharLiteral(int line, int column) {
    super(line, column);
    this.type = new CharType(line, column);
  }

  public void setValue(char value) {
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
