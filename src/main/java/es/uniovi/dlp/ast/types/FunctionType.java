package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.visitor.AbstractVisitor;

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

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
