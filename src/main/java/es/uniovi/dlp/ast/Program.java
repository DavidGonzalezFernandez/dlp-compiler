package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.definition.Definition;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

// El programa es un nodo porque es el nodo más alto en el árbol
public class Program extends AbstractASTNode {
  private List<Definition> definitions;

  public Program(int line, int column, List<Definition> definitions) {
    super(line, column);
    this.definitions = definitions;
  }

  public List<Definition> getDefinitions() {
    return new ArrayList<Definition>(this.definitions);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
