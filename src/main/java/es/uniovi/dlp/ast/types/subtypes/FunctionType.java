package es.uniovi.dlp.ast.types.subtypes;

import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.types.AbstractType;
import es.uniovi.dlp.ast.types.CompilerType;
import java.util.List;

public class FunctionType extends AbstractType {
  public List<VarDefinition> params;
  public CompilerType returnType;

  public FunctionType(int line, int column) {
    super(line, column);
  }
}
