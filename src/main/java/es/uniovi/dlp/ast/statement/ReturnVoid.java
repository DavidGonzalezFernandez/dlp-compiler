package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ReturnVoid extends AbstractStatement {
  public ReturnVoid(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
