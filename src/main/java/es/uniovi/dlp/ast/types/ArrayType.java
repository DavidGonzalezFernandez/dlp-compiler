package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ArrayType extends AbstractCompilerType {
  private int size;
  private CompilerType type;

  public ArrayType(int line, int column, int size, CompilerType type) {
    super(line, column);
    this.size = size;
    this.type = type;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public CompilerType getType() {
    return this.type;
  }
}
