package es.uniovi.dlp.ast.types;

public class StructField extends AbstractType {
  private String name;
  private CompilerType type;

  public StructField(int line, int column, String name, CompilerType type) {
    super(line, column);
    this.name = name;
    this.type = type;
  }
}
