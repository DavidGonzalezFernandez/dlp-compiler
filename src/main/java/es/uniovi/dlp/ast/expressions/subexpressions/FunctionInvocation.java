package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.CompilerType;
import java.util.List;

public class FunctionInvocation extends AbstractExpression {
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
