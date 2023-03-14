package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import java.util.HashSet;
import java.util.List;

public class StructType extends AbstractType {
  private List<StructField> fields;

  public StructType(int line, int column, List<StructField> fields) {
    super(line, column);
    checkDuplicateRecordFieldNames(fields);
    this.fields = fields;
  }

  private void checkDuplicateRecordFieldNames(List<StructField> fields) {
    HashSet<String> names = new HashSet<>();
    for (StructField field : fields) {
      if (!names.add(field.getName())) {
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(field.getLine(), field.getColumn()),
                    ErrorReason.FIELD_ALREADY_DECLARED));
      }
    }
  }
}
