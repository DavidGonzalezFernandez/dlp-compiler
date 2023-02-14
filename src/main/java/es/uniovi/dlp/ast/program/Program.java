package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import java.util.List;

// El programa es un nodo porque es el nodo más alto en el árbol
public class Program extends AbstractASTNode {
  private List<Definition> definitions;

  public Program(int line, int column) {
    super(line, column);
  }
}
