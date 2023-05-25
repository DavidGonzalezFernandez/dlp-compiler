package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class DoubleType extends AbstractCompilerType {
  private static DoubleType myInstance = new DoubleType(0, 0);

  private DoubleType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public CompilerType arithmetic(CompilerType other) {
    if (other instanceof DoubleType || other instanceof IntType || other instanceof CharType)
      return DoubleType.getInstance();
    return super.arithmetic(other);
  }

  @Override
  public int getNumberOfBytes() {
    return 4;
  }

  public static DoubleType getInstance() {
    return myInstance;
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
      return IntType.getInstance();

    return super.comparison(other);
  }

  @Override
  public boolean isArithmetic() {
    return true;
  }

  @Override
  public boolean canPromoteTo(CompilerType other) {
    if (other instanceof DoubleType) {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "double";
  }

  @Override
  public CompilerType getIntermediateType(CompilerType toType) {
    if (toType instanceof IntType || toType instanceof CharType) return IntType.getInstance();

    return super.getIntermediateType(toType);
  }
}
