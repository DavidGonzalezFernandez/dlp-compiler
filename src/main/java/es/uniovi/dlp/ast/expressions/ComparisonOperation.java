package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.Visitor;

public class ComparisonOperation extends AbstractExpression {
  private String operator;
  private Expression leftExpression;
  private Expression rightExpression;
  private CompilerType operandTypes;

  public ComparisonOperation(
      int line, int column, Expression left, String operator, Expression right) {
    super(line, column);
    this.leftExpression = left;
    this.rightExpression = right;
    this.operator = operator;

    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getLeftExpression() {
    return this.leftExpression;
  }

  public Expression getRightExpression() {
    return this.rightExpression;
  }

  public String getOperator() {
    return this.operator;
  }

  public void setOperandTypes(CompilerType type) {
    this.operandTypes = type;
  }

  public CompilerType getOperandTypes() {
    return this.operandTypes;
  }
}
