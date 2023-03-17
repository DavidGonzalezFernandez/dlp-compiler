package es.uniovi.dlp.ast.definition;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.CompilerType;

public interface Definition extends ASTNode {
  public String getName();

  public CompilerType getType();
}
