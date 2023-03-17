package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;

public interface Expression extends ASTNode {
  public boolean getLValue();

  public void setLValue(boolean lValue);
}
