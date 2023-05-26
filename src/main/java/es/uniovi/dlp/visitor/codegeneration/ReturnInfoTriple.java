package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.types.CompilerType;

public class ReturnInfoTriple {
  private int localBytes, paramBytes, returnBytes;
  private CompilerType expectedTypeToReturn;

  public ReturnInfoTriple() {}

  public ReturnInfoTriple(int localBytes, int paramBytes, int returnBytes) {
    this.localBytes = localBytes;
    this.paramBytes = paramBytes;
    this.returnBytes = returnBytes;
  }

  public ReturnInfoTriple setLocalBytes(int localBytes) {
    this.localBytes = localBytes;
    return this;
  }

  public ReturnInfoTriple setParamBytes(int paramBytes) {
    this.paramBytes = paramBytes;
    return this;
  }

  public ReturnInfoTriple setReturnBytes(int returnBytes) {
    this.returnBytes = returnBytes;
    return this;
  }

  public ReturnInfoTriple setExpectedTypeToReturn(CompilerType expectedTypeToReturn) {
    this.expectedTypeToReturn = expectedTypeToReturn;
    return this;
  }

  public int getLocalBytes() {
    return this.localBytes;
  }

  public int getParamBytes() {
    return this.paramBytes;
  }

  public int getReturnBytes() {
    return this.returnBytes;
  }

  public CompilerType getExpectedTypeToReturn() {
    return this.expectedTypeToReturn;
  }
}
