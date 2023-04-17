package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definition.FunctionDefinition;
import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.ast.types.StructField;
import es.uniovi.dlp.ast.types.StructType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Integer> {
  private int globalVariablesTotalSize = 0;

  public Void visit(VarDefinition varDefinition, Integer param) {
    super.visit(varDefinition, param);

    if (varDefinition.getScope() == 0) {
      // Variable global
      assert globalVariablesTotalSize >= 0;
      assert varDefinition.getType().getNumberOfBytes() >= 0;

      varDefinition.setOffset(globalVariablesTotalSize);
      globalVariablesTotalSize += varDefinition.getType().getNumberOfBytes();
    } else {
      // Variable local
      if (param != null) {
        varDefinition.setOffset(param);
      }
    }

    return null;
  }

  public Void visit(FunctionDefinition functionDefinition, Integer param) {
    int localVariableOffset = 0;

    for (VarDefinition varDefinition : functionDefinition.getDefinitions()) {
      varDefinition.accept(this, -localVariableOffset);

      assert varDefinition.getType().getNumberOfBytes() >= 0;
      localVariableOffset += varDefinition.getType().getNumberOfBytes();
    }

    return null;
  }

  public Void visit(StructType structType, Integer param) {
    int localVariableOffset = 0;

    for (StructField structField : structType.getFields()) {
      structField.setOffset(localVariableOffset);

      assert structField.getType().getNumberOfBytes() >= 0;

      localVariableOffset += structField.getType().getNumberOfBytes();
    }
    return null;
  }

  public Void visit(StructField structField, Integer param) {
    // TODO: implement

    return null;
  }
}
