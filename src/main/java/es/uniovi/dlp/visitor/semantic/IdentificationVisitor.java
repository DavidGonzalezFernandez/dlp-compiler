package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definition.Definition;
import es.uniovi.dlp.ast.definition.FunctionDefinition;
import es.uniovi.dlp.ast.definition.VarDefinition;
import es.uniovi.dlp.ast.expressions.FunctionInvocation;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<CompilerType, CompilerType> {
  private SymbolTable symbolTable;

  public IdentificationVisitor() {
    this.symbolTable = new SymbolTable();
  }

  public CompilerType visit(FunctionDefinition functionDefinition, CompilerType param) {
    // Comprobar si la función ya está declarada
    if (!symbolTable.insert(functionDefinition)) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  functionDefinition.getLine(),
                  functionDefinition.getColumn(),
                  ErrorReason.FUNCTION_ALREADY_DECLARED));
      return null;
      // No recorro las variables de la función porque no es válida
    }

    this.symbolTable.set();
    super.visit(functionDefinition, param);
    symbolTable.reset();
    return null;
  }

  public CompilerType visit(VarDefinition varDefinition, CompilerType param) {
    if (!symbolTable.insert(varDefinition)) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  varDefinition.getLine(),
                  varDefinition.getColumn(),
                  ErrorReason.VARIABLE_ALREADY_DECLARED));
    }
    return super.visit(varDefinition, param);
  }

  public CompilerType visit(Variable variable, CompilerType param) {
    Definition definition = this.symbolTable.find(variable.getName());
    if (definition == null) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  variable.getLine(), variable.getColumn(), ErrorReason.VARIABLE_NOT_DECLARED));
      return super.visit(variable, param);
    }

    if (variable.getDefinition() == null) {
      variable.setDefinition(definition);
    }

    return super.visit(variable, param);
  }

  public CompilerType visit(FunctionInvocation functionInvocation, CompilerType param) {
    Definition definition = this.symbolTable.find(functionInvocation.getName());
    if (definition == null) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  functionInvocation.getLine(),
                  functionInvocation.getColumn(),
                  ErrorReason.FUNCTION_NOT_DECLARED));
      return null;
    }

    return super.visit(functionInvocation, param);
  }
}
