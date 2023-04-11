package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import java.util.List;

public abstract class AbstractCompilerType extends AbstractASTNode implements CompilerType {
  public AbstractCompilerType(int line, int column) {
    super(line, column);
  }

  @Override
  public CompilerType arithmetic(CompilerType other) {
    if (other instanceof ErrorType) {
      return other;
    }
    return null;
  }

  @Override
  public CompilerType logical(CompilerType other) {
    if (other instanceof ErrorType) {
      return other;
    }
    return null;
  }

  @Override
  public CompilerType indexing(CompilerType other) {
    if (other instanceof ErrorType) {
      return other;
    }
    return null;
  }

  @Override
  public CompilerType dot(String other) {
    return ErrorType.getInstance();
  }

  @Override
  public CompilerType cast(CompilerType other) {
    if (other instanceof ErrorType) {
      return other;
    }
    return null;
  }

  @Override
  public CompilerType comparison(CompilerType other) {
    if (other instanceof ErrorType) {
      return other;
    }
    return null;
  }

  @Override
  public CompilerType invocation(List<Expression> arguments) {
    return ErrorType.getInstance();
  }

  @Override
  public boolean isIndexable() {
    return false;
  }

  @Override
  public boolean isArray() {
    return false;
  }

  @Override
  public boolean allowsDot() {
    return false;
  }

  @Override
  public boolean isSimpleType() {
    return false;
  }

  @Override
  public boolean isArithmetic() {
    return false;
  }

  @Override
  public boolean isError() {
    return false;
  }

  @Override
  public boolean isLogical() {
    return false;
  }

  @Override
  public boolean isCallable() {
    return false;
  }

  @Override
  public boolean canPromoteTo(CompilerType other) {
    return false;
  }
}
