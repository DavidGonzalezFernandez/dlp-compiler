package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class IfElse extends AbstractStatement {
  private Expression condition;
  private List<Statement> ifBody;
  private List<Statement> elseBody;

  public IfElse(
      int line,
      int column,
      Expression condition,
      List<Statement> ifBody,
      List<Statement> elseBody) {
    super(line, column);
    this.condition = condition;
    this.ifBody = ifBody;
    this.elseBody = elseBody;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
