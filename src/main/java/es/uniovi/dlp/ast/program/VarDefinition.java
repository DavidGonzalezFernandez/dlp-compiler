package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public class VarDefinition extends AbstractASTNode implements Definition {
  private Type type;
  private String name;

  public VarDefinition(int line, int column, Type type, String name) {
    super(line, column);
    this.type = type;
    this.name = name;
  }

  public VarDefinition(int line, int column, String name) {
    super(line, column);
    this.name = name;
  }

  public void setType(Type type) {
    this.type = type;
  }

  @Override
  public Type getType() {
    return this.type;
  }
}
