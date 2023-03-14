package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class FieldAccess extends AbstractExpression {
  private String fieldName;
  private Expression struct;

  public FieldAccess(int line, int column, Expression struct, String fieldName) {
    super(line, column);
    this.struct = struct;
    this.fieldName = fieldName;
    super.setLValue(true);
  }

  @Override
  public CompilerType getType() {
    return null;
  }

  @Override
  public Object getValue() {
    return null;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
