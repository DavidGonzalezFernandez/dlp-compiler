package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class VoidType extends AbstractCompilerType {
  public VoidType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public int getNumberOfBytes() {
    return 0;
  }

  @Override
  public String toString() {
    return "";
  }
}
