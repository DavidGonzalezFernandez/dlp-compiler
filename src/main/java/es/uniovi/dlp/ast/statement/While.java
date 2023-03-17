package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement {
  private Expression condition;
  private List<Statement> body;

  public While(int line, int column, Expression condition, List<Statement> body) {
    super(line, column);

    if (body == null) throw new IllegalArgumentException("Body cannot be null");

    this.condition = condition;
    this.body = body;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getCondition() {
    return this.condition;
  }

  public List<Statement> getBody() {
    return new ArrayList<>(this.body);
  }
}
