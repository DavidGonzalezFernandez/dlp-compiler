package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructField extends AbstractType {
  private String name;
  private CompilerType type;

  public StructField(int line, int column, String name, CompilerType type) {
    super(line, column);
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
