package es.uniovi.dlp.ast.definition;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public interface Definition extends ASTNode {
  public CompilerType getType();

}
