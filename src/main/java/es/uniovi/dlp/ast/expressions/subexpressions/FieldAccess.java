package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.CompilerType;

public class FieldAccess extends AbstractExpression {
  private String fieldName;
  private Expression struct;

  public FieldAccess(int line, int column, Expression struct, String fieldName) {
    super(line, column);
    this.struct = struct;
    this.fieldName = fieldName;
  }

  @Override
  public CompilerType getType() {
    return null;
  }

  @Override
  public Object getValue() {
    return null;
  }
}
