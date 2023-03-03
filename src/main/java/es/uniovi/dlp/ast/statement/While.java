package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expressions.Expression;
import java.util.List;

public class While extends AbstractStatement {
  private Expression condition;
  private List<Statement> body;

  public While(int line, int column, Expression condition, List<Statement> body) {
    super(line, column);
    this.condition = condition;
    this.body = body;
  }
}
