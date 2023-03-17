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
  public CompilerType visit(Assignment a, CompilerType param) {
    if (!a.getLeftPart().getLValue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(a.getLeftPart().getLine(), a.getLeftPart().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));
    }

    return null;
  }

  public CompilerType visit(ReadStatement r, CompilerType param) {
    if (!r.getExpression().getLValue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(r.getExpression().getLine(), r.getExpression().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));
    }

    return null;
  }
}
