package es.uniovi.dlp.ast.definition;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition {
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
  public CompilerType getType() {
    return null;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
