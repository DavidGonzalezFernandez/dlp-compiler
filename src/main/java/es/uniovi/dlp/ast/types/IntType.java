package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntType extends AbstractCompilerType {
  private static IntType myInstance = new IntType(0, 0);

  private IntType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public static IntType getInstance() {
    return myInstance;
  }

  @Override
  public CompilerType arithmetic(CompilerType other) {
    if (other instanceof IntType || other instanceof CharType) return IntType.getInstance();
    if (other instanceof DoubleType) return other;
    return super.arithmetic(other);
  }

  @Override
  public CompilerType logical(CompilerType other) {
    if (other instanceof IntType) {
      return IntType.getInstance();
    }
    return super.logical(other);
  }

  @Override
  public int getNumberOfBytes() {
    throw new IllegalStateException("No implementado");
  }

  @Override
  public boolean isIndexable() {
    return true;
  }

  @Override
  public boolean isSimpleType() {
    return true;
  }

  @Override
  public CompilerType cast(CompilerType other) {
    if (other instanceof IntType || other instanceof DoubleType || other instanceof CharType)
      return other;
    return super.cast(other);
  }

  @Override
  public CompilerType comparison(CompilerType other) {
    if (other instanceof IntType || other instanceof DoubleType || other instanceof CharType)
      return this;
    return super.comparison(other);
  }

  @Override
  public boolean isArithmetic() {
    return true;
  }

  @Override
  public boolean isLogical() {
    return true;
  }

  @Override
  public boolean canPromoteTo(CompilerType other) {
    if (other instanceof DoubleType) return true;

    return false;
  }
}
