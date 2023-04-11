package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.parser.LexerHelper;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleLiteral extends AbstractExpression {
  private double value;

  public DoubleLiteral(int line, int column, String value) {
    super(line, column);
    super.setType(DoubleType.getInstance());
    this.value = LexerHelper.lexemeToReal(value);
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
    if (!(type instanceof DoubleType)) {
      throw new IllegalArgumentException("El tipo tiene que ser DoubleType");
    }
     */
    super.setType(type);
  }
}
