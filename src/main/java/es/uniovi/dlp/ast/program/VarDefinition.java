package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public class VarDefinition extends AbstractASTNode implements Definition {
  public VarDefinition(int line, int column) {
    super(line, column);
  }

  @Override
  public Type getType() {
    return null;
  }
}
