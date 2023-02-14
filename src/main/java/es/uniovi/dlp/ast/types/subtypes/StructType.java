package es.uniovi.dlp.ast.types.subtypes;

import es.uniovi.dlp.ast.types.AbstractType;
import java.util.List;

public class StructType extends AbstractType {
  private List<StructField> fields;

  public StructType(int line, int column) {
    super(line, column);
  }
}
