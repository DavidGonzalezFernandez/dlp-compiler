package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ErrorType extends AbstractCompilerType {
  public static ErrorType myInstance = new ErrorType(0, 0);

  public static ErrorType getInstance() {
    return myInstance;
  }

  private ErrorType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }

  @Override
  public int getNumberOfBytes() {
    return 0;
  }

  @Override
  public boolean isError() {
    return true;
  }
}
