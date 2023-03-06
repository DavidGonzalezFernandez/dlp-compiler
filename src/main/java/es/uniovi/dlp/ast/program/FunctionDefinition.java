package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.FunctionType;

import javax.lang.model.type.NullType;
import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition {
  private String name;
  private FunctionType functionType;
  private List<Object>
      body; // hago una única lista para poder mantener el orden de las definiciones y los
  // statements

  public FunctionDefinition(
      int line, int column, String name, FunctionType functionType, List<Object> body) {
    super(line, column);
    this.name = name;
    this.functionType = functionType;
    this.body = body;
  }

  @Override
  public CompilerType getType() {
    return null;
  }
}
