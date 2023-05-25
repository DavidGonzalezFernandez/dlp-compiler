package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractCompilerType {
  public List<VarDefinition> parameters;
  public CompilerType returnType;

  public FunctionType(
      int line, int column, List<VarDefinition> parameters, CompilerType returnType) {
    super(line, column);
    this.parameters = parameters;
    this.returnType = returnType;
  }

  public FunctionType(int line, int column, CompilerType returnType) {
    this(line, column, new ArrayList<VarDefinition>(), returnType);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public List<VarDefinition> getParameters() {
    return new ArrayList<>(this.parameters);
  }

  public CompilerType getReturnType() {
    return this.returnType;
  }

  @Override
  public int getNumberOfBytes() {
    return 0;
  }

  @Override
  public boolean isCallable() {
    return true;
  }

  @Override
  public CompilerType invocation(List<Expression> arguments) {
    if (this.parameters.size() != arguments.size()) {
      return super.invocation(arguments);
    }

    boolean isCompletelyValid = true;

    for (int i = 0; i < this.parameters.size(); i++) {
      CompilerType paramType = this.parameters.get(i).getType();
      CompilerType argType = arguments.get(i).getType();
      if (!argType.canPromoteTo(paramType)) {
        arguments.get(i).setType(ErrorType.getInstance());
        isCompletelyValid = false;
      }
    }

    return isCompletelyValid ? this.returnType : super.invocation(arguments);
  }
}
