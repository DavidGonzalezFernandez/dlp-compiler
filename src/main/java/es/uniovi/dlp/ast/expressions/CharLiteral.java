package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.parser.LexerHelper;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharLiteral extends AbstractExpression {
  private char value;
  private CompilerType type;

  public CharLiteral(int line, int column, String value) {
    super(line, column);
    this.type = new CharType(line, column);
    this.value = LexerHelper.lexemeToChar(value);
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
