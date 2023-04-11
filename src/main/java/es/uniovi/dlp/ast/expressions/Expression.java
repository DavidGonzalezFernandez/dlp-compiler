package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.CompilerType;

public interface Expression extends ASTNode {
  public boolean getLValue();

  public void setLValue(boolean lValue);

  public void setType(CompilerType type);

  public CompilerType getType();
}
