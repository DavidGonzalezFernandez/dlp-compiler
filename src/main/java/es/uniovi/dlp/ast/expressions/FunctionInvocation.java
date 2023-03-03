package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.ast.types.CompilerType;
import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
  private String name;
  private List<Expression> arguments;

  public FunctionInvocation(int line, int column, String name, List<Expression> arguments) {
    super(line, column);
    this.name = name;
    this.arguments = arguments; // Siempre existe, pero puede estar vacío
  }

  @Override
  public CompilerType getType() {
    return null;
  }

  @Override
  public Object getValue() {
    return null;
  }
}
