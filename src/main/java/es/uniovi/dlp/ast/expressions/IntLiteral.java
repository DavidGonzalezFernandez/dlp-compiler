package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.parser.LexerHelper;
import es.uniovi.dlp.visitor.Visitor;

public class IntLiteral extends AbstractExpression {
  private int value;

  public IntLiteral(int line, int column, String value) {
    super(line, column);
    super.setType(IntType.getInstance());
    this.value = LexerHelper.lexemeToInt(value);
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public int getValue() {
    return this.value;
  }

  @Override
  public void setType(CompilerType type) {
    /*
    if (!(type instanceof IntType)) {
      throw new IllegalArgumentException("El tipo tiene que ser IntTyle");
    }
     */
    super.setType(type);
  }
}
