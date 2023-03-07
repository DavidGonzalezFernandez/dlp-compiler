package es.uniovi.dlp.ast.types;

public class ArrayType extends AbstractType {
  private int size;
  private CompilerType type;

  public ArrayType(int line, int column, int size, CompilerType type) {
    super(line, column);
    this.size = size;
    this.type = type;
  }

  public ArrayType setSize(int size) {
    this.size = size;
    return this;
  }

  public ArrayType setType() {
    this.type = type;
    return this;
  }
}