package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.CompilerType;

public interface Expression extends ASTNode {
  public CompilerType getType();

  public Object getValue();

  public boolean getLValue();
}
