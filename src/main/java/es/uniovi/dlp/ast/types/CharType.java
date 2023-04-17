package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharType extends AbstractCompilerType {
  private static CharType myInstance = new CharType(0, 0);

  public static CharType getInstance() {
    return myInstance;
  }

  private CharType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public CompilerType arithmetic(CompilerType other) {
    if (other instanceof CharType || other instanceof IntType) return IntType.getInstance();
    if (other instanceof DoubleType) return other;
    return super.arithmetic(other);
  }

  @Override
  public int getNumberOfBytes() {
    return 1;
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
      // Los booleanos son int, así que devuelvo un int
      return IntType.getInstance();
    return super.comparison(other);
  }

  @Override
  public boolean isArithmetic() {
    return true;
  }

  @Override
  public boolean canPromoteTo(CompilerType other) {
    if (other instanceof CharType  ||  other instanceof DoubleType || other instanceof IntType) return true;

    return false;
  }
}
