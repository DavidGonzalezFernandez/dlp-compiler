package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.parser.LexerHelper;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharLiteral extends AbstractExpression {
  private char value;

  public CharLiteral(int line, int column, String value) {
    super(line, column);
    super.setType(CharType.getInstance());
    this.value = LexerHelper.lexemeToChar(value);
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public void setType(CompilerType type) {
    /*
    if (!(type instanceof CharType)) {
      throw new IllegalArgumentException("El tipo tiene que ser CharType");
    }
     */
    super.setType(type);
  }
}
