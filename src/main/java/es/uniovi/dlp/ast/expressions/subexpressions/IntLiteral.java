package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.subtypes.IntType;
import es.uniovi.dlp.parser.LexerHelper;

public class IntLiteral extends AbstractExpression {
  private int value;
  private CompilerType type;

  public IntLiteral(int line, int column, String value) {
    super(line, column);
    this.type = new IntType(line, column);
    this.value = LexerHelper.lexemeToInt(value);
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
