package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
  private Variable variable; // TODO: ¿por qué es una variable?
  private List<Expression> arguments;

  public FunctionInvocation(int line, int column, Variable variable, List<Expression> arguments) {
    super(line, column);
    this.variable = variable;
    this.arguments = arguments; // Siempre existe, pero puede estar vacío
    super.setLValue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Variable getVariable() {
    return this.variable;
  }

  public String getName() {
    return this.getVariable().getName();
  }

  public List<Expression> getArguments() {
    return new ArrayList<>(this.arguments);
  }
}
