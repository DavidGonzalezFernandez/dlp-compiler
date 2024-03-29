package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class IntType extends AbstractCompilerType {
  private static IntType myInstance = new IntType(0, 0);

  private IntType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
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
    return 2;
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
    if (other instanceof IntType || other instanceof CharType || other instanceof DoubleType)
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
    if (other instanceof IntType || other instanceof DoubleType) return true;

    return false;
  }

  @Override
  public String toString() {
    return "int";
  }

  @Override
  public CompilerType getIntermediateType(CompilerType toType) {
    if (toType instanceof DoubleType) return DoubleType.getInstance();
    if (toType instanceof CharType) return CharType.getInstance();

    return super.getIntermediateType(toType);
  }
}
