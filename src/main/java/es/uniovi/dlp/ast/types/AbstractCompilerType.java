package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractCompilerType extends AbstractASTNode implements CompilerType {
  public AbstractCompilerType(int line, int column) {
    super(line, column);
  }
}
