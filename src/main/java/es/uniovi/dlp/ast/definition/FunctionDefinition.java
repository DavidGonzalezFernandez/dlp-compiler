package es.uniovi.dlp.ast.definition;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition {
  private int scope;
  private String name;
  private FunctionType type;
  private List<VarDefinition> definitions;
  private List<Statement> statements;

  public FunctionDefinition(
      int line,
      int column,
      String name,
      FunctionType type,
      List<VarDefinition> definitions,
      List<Statement> statements) {
    super(line, column);
    this.name = name;
    this.type = type;
    this.definitions = definitions;
    this.statements = statements;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public CompilerType getType() {
    return this.type;
  }

  @Override
  public int getScope() {
    return this.scope;
  }

  @Override
  public void setScope(int scope) {
    this.scope = scope;
  }

  public List<Statement> getStatements() {
    return new ArrayList<>(this.statements);
  }

  public List<VarDefinition> getDefinitions() {
    return new ArrayList<>(this.definitions);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
