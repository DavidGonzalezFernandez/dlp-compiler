package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.statement.ReadStatement;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<CompilerType, CompilerType> {
  public CompilerType visit(Assignment assignment, CompilerType param) {
    if (!assignment.getLeftPart().getLValue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(
                      assignment.getLeftPart().getLine(), assignment.getLeftPart().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));
    }

    return super.visit(assignment, param);
  }

  public CompilerType visit(ReadStatement readStatement, CompilerType param) {
    if (!readStatement.getExpression().getLValue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(
                      readStatement.getExpression().getLine(),
                      readStatement.getExpression().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));
    }

    return super.visit(readStatement, param);
  }
}
