package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definition.Definition;
import java.util.*;

public class SymbolTable {
  private int scope = 0;
  private List<Map<String, Definition>> table;

  public SymbolTable() {
    this.scope = 0;
    this.table = new ArrayList<>();
    this.table.add(new HashMap<>());
  }

  public void set() {
    assert this.scope >= 0;
    assert this.table.size() > 0;
    assert this.scope+1 == this.table.size();

    this.scope++;
    table.add(new HashMap<String, Definition>());

    assert this.scope > 0;
    assert this.table.size() > 0;
    assert this.scope+1 == this.table.size();
  }

  public void reset() {
    if (this.scope == 0) {
      throw new IllegalStateException("No se puede hacer reset en el primer scope");
    }
    assert this.table.size() > 1;
    assert this.scope+1 == this.table.size();

    this.scope--;
    this.table.remove(this.table.size()-1);

    // Postcondition
    assert this.scope >= 0;
    assert this.table.size() > 0;
    assert this.scope+1 == this.table.size();
  }

  /**
   * Inserta una definición en la tabla de símbolos
   * @param definition la definición a añadir
   * @return true si se ha añadido, false si no
   */
  public boolean insert(Definition definition) {
    assert this.table.size() > 0;
    assert this.scope+1 == this.table.size();

    if (findInCurrentScope(definition.getName()) != null)
      return false;

    this.table.get(scope).put(definition.getName(), definition);
    definition.setScope(this.scope);

    assert this.scope+1 == this.table.size();

    return true;
  }

  public Definition find(String id) {
    for (int index=this.scope; index>=0 ; index--) {
      var definition = table.get(index).get(id);
      if (definition != null)
        return definition;
    }
    return null;
  }

  public Definition findInCurrentScope(String id) {
    return table.get(this.scope).get(id);
  }
}
