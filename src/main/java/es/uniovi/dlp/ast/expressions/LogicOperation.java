package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class LogicOperation extends AbstractExpression {
  private String operator;
  private Expression leftExpression;
  private Expression rightExpression;

  public LogicOperation(int line, int column, Expression left, String operator, Expression right) {
    super(line, column);
    this.leftExpression = left;
    this.rightExpression = right;
    this.operator = operator;
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getLeftExpression() {
    return this.leftExpression;
  }

  public Expression getRightExpression() {
    return this.rightExpression;
  }
}
