package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

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
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getStruct() {
    return this.struct;
  }

  public String getFieldName() {
    return this.fieldName;
  }
}
