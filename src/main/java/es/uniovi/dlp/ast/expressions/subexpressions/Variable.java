package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.types.CompilerType;

public class Variable extends AbstractExpression {
  private String name;
  private VarDefinition definition;

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
