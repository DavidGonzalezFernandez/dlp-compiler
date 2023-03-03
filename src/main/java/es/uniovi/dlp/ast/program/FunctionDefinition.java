package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.CompilerType;

public class FunctionDefinition extends AbstractASTNode implements Definition {
  public FunctionDefinition(int line, int column) {
    super(line, column);
  }

  @Override
  public CompilerType getType() {
    return null;
  }
}
