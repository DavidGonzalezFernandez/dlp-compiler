package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.definition.Definition;
import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Variable extends AbstractExpression {
  private String name;
  private Definition definition;

  public Variable(int line, int column, String name) {
    super(line, column);
    this.name = name;
    super.setLValue(true);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public String getName() {
    return this.name;
  }

  public Definition getDefinition() {
    return this.definition;
  }

  public void setDefinition(Definition definition) {
    assert definition instanceof VarDefinition;
    assert this.name.equals(definition.getName());

    this.definition = definition;
  }
}
