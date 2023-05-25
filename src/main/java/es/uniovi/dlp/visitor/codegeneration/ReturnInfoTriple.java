package es.uniovi.dlp.visitor.codegeneration;

public class ReturnInfoTriple {
  private int localBytes, paramBytes, returnBytes;

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

  public int getLocalBytes() {
    return this.localBytes;
  }

  public int getParamBytes() {
    return this.paramBytes;
  }

  public int getReturnBytes() {
    return this.returnBytes;
  }
}
