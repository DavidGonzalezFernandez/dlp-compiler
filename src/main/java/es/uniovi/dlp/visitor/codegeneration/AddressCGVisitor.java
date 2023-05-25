package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.ast.expressions.ArrayIndexing;
import es.uniovi.dlp.ast.expressions.FieldAccess;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.StructType;

public class AddressCGVisitor extends CGAbstractVisitor<Void, Void> {
  private CodeGenerator codeGenerator;
  private ValueCGVisitor valueCGVisitor;

  public AddressCGVisitor(CodeGenerator codeGenerator) {
    this.codeGenerator = codeGenerator;
  }

  public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
    this.valueCGVisitor = valueCGVisitor;
  }

  @Override
  public Void visit(ArrayIndexing arrayIndexing, Void param) {
    // push the address of array
    arrayIndexing.getArray().accept(this, param);

    // push the value of index
    arrayIndexing.getIndex().accept(valueCGVisitor, param);

    // push the numberOfBytes of the type
    codeGenerator.pushi(arrayIndexing.getType().getNumberOfBytes());

    // Multiply numberOfBytes * index
    codeGenerator.muli();

    // Add result of multiplication + address of array
    codeGenerator.addi();

    return null;
  }

  @Override
  public Void visit(FieldAccess fieldAccess, Void param) {
    // address of struct
    fieldAccess.getStruct().accept(this, param);

    // address of field
    int offset =
        ((StructType) fieldAccess.getStruct().getType())
            .getStructFieldByName(fieldAccess.getFieldName())
            .getOffset();
    codeGenerator.pushi(offset);
    codeGenerator.addi();

    return null;
  }

  @Override
  public Void visit(Variable variable, Void param) {
    int offset = ((VarDefinition) variable.getDefinition()).getOffset();

    if (variable.getDefinition().getScope() == 0) {
      // Variable global
      codeGenerator.pusha(offset);
    } else {
      codeGenerator.push_bp();
      codeGenerator.pushi(offset);
      codeGenerator.addi();
    }

    return null;
  }
}
