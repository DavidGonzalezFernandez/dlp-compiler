package es.uniovi.dlp.ast.definition;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class VarDefinition extends AbstractASTNode implements Definition {
  private CompilerType type;
  private String name;

  private int scope;

  public VarDefinition(int line, int column, CompilerType type, String name) {
    super(line, column);
    this.type = type;
    this.name = name;
  }

  public VarDefinition(int line, int column, String name, CompilerType type) {
    this(line, column, type, name);
  }

  public VarDefinition(int line, int column, String name) {
    super(line, column);
    this.name = name;
  }

  public void setType(CompilerType type) {
    this.type = type;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public CompilerType getType() {
    return this.type;
  }

  @Override
  public int getScope() {
    return this.scope;
  }

  @Override
  public void setScope(int scope) {
    this.scope = scope;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
