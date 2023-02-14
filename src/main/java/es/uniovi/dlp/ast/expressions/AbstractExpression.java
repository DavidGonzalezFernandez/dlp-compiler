package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
  public AbstractExpression(int line, int column) {
    super(line, column);
  }

  @Override
  public abstract Type getType();

  @Override
  public abstract Object getValue();
}
