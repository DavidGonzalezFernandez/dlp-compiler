package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.program.Definition;
import es.uniovi.dlp.ast.types.CompilerType;

public class Variable extends AbstractExpression {
  private String name;
  private Definition definition;

  public Variable(int line, int column, String name) {
    super(line, column);
    this.name = name;
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
