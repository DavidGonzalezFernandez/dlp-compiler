package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.parser.LexerHelper;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleLiteral extends AbstractExpression {
  private double value;
  private CompilerType type;

  public DoubleLiteral(int line, int column, String value) {
    super(line, column);
    this.type = new DoubleType(line, column);
    this.value = LexerHelper.lexemeToReal(value);
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
