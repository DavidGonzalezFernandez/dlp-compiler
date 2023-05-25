package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class StructField implements ASTNode {
  private int line, column;
  private String name;
  private CompilerType type;
  private int offset;

  public StructField(int line, int column, String name, CompilerType type) {
    assert line >= 0;
    assert column >= 0;

    this.line = line;
    this.column = column;
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public int getLine() {
    return this.line;
  }

  @Override
  public int getColumn() {
    return this.column;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public CompilerType getType() {
    return this.type;
  }

  public int getNumberOfBytes() {
    return this.type.getNumberOfBytes();
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getOffset() {
    return this.offset;
  }

  @Override
  public String toString() {
    return "(" + name + " x " + type.toString() + ")";
  }
}
