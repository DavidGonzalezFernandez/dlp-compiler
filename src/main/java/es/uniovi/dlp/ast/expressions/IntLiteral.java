package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.parser.LexerHelper;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntLiteral extends AbstractExpression {
  private int value;
  private CompilerType type;

  public IntLiteral(int line, int column, String value) {
    super(line, column);
    this.type = new IntType(line, column);
    this.value = LexerHelper.lexemeToInt(value);
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
