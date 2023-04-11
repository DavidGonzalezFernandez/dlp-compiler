package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ArrayType extends AbstractCompilerType {
  private int size;
  private CompilerType arrayOf;

  public ArrayType(int line, int column, int size, CompilerType typeOf) {
    super(line, column);
    this.size = size;
    this.arrayOf = typeOf;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public CompilerType indexing(CompilerType other) {
    if (other.isIndexable()) return this.arrayOf;
    return super.indexing(other);
  }

  public CompilerType getTypeOf() {
    return this.arrayOf;
  }

  @Override
  public boolean isArray() {
    return true;
  }

  @Override
  public int getNumberOfBytes() {
    return this.size * this.arrayOf.getNumberOfBytes();
  }
}
