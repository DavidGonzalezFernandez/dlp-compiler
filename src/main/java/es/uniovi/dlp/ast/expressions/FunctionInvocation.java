package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
  private Expression name;
  private List<Expression> arguments;

  public FunctionInvocation(int line, int column, Expression name, List<Expression> arguments) {
    super(line, column);
    this.name = name;
    this.arguments = arguments; // Siempre existe, pero puede estar vacío
    super.setLValue(false);
  }

  @Override
  public CompilerType getType() {
    return null;
  }

  @Override
  public Object getValue() {
    return null;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
