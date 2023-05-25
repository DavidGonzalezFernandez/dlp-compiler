package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;
import java.util.ArrayList;
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

    if (ifBody == null) throw new IllegalArgumentException("IfBody cannot be null");
    if (elseBody == null) throw new IllegalArgumentException("ElseBody cannot be null");

    this.condition = condition;
    this.ifBody = ifBody;
    this.elseBody = elseBody;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      Visitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getCondition() {
    return this.condition;
  }

  public List<Statement> getIfBody() {
    return new ArrayList<>(this.ifBody);
  }

  public List<Statement> getElseBody() {
    return new ArrayList<>(this.elseBody);
  }
}
