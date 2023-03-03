package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.program.VarDefinition;
import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType {
  public List<VarDefinition> parameters;
  public CompilerType returnType;

  public FunctionType(
      int line, int column, List<VarDefinition> parameters, CompilerType returnType) {
    super(line, column);
    this.parameters = parameters;
    this.returnType = returnType;
  }

  public FunctionType(int line, int column, CompilerType returnType) {
    super(line, column);
    this.parameters = new ArrayList<>();
    this.returnType = returnType;
  }
}
