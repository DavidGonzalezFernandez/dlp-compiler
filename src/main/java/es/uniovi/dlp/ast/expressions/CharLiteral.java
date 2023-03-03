package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.parser.LexerHelper;

public class CharLiteral extends AbstractExpression {
  private char value;
  private CompilerType type;

  public CharLiteral(int line, int column, String value) {
    super(line, column);
    this.type = new CharType(line, column);
  }

  private void setValue(String value) {
    this.value = LexerHelper.lexemeToChar(value);
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
