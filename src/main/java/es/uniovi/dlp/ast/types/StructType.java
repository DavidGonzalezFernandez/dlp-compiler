package es.uniovi.dlp.ast.types;

import java.util.List;

public class StructType extends AbstractType {
  private List<StructField> fields;

  public StructType(int line, int column, List<StructField> fields) {
    super(line, column);
    this.fields = fields;
  }
}
