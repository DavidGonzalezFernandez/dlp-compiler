package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.Visitor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StructType extends AbstractCompilerType {
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

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public CompilerType dot(String fieldName) {
    for (StructField structField : getFields()) {
      if (structField.getName().equals(fieldName)) return structField.getType();
    }

    return super.dot(fieldName);
  }

  public List<StructField> getFields() {
    return new ArrayList<>(this.fields);
  }

  @Override
  public int getNumberOfBytes() {
    int res = 0;
    for (StructField structField : this.getFields()) {
      int tmp = structField.getNumberOfBytes();
      assert tmp >= 0;
      res += tmp;
    }
    return res;
  }

  public StructField getStructFieldByName(String name) {
    for (StructField field : getFields()) {
      if (field.getName().equals(name)) {
        return field;
      }
    }
    return null;
  }

  @Override
  public boolean allowsDot() {
    return true;
  }

  @Override
  public String toString() {
    String res = "record(";

    if (fields.size() > 0) {
      res += fields.get(0).toString();
    }

    for (int i = 1; i < fields.size(); i++) {
      res += " x " + fields.get(i).toString();
    }

    res += ")";
    return res;
  }
}
