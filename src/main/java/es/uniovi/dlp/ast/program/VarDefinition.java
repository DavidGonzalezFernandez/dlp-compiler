package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.CompilerType;

public class VarDefinition extends AbstractASTNode implements Definition {
  private CompilerType type;
  private String name;

  public VarDefinition(int line, int column, CompilerType type, String name) {
    super(line, column);
    this.type = type;
    this.name = name;
  }

  public VarDefinition(int line, int column, String name) {
    super(line, column);
    this.name = name;
  }

  public void setType(CompilerType type) {
    this.type = type;
  }

  @Override
  public CompilerType getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }
}
