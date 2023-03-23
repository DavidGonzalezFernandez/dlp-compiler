package es.uniovi.dlp.error;

public enum ErrorReason {
  FIELD_ALREADY_DECLARED("Field already declared in struct"),
  LVALUE_REQUIRED("LValue is required"),
  VARIABLE_ALREADY_DECLARED("Variable had already been declared in the scope"),
  FUNCTION_ALREADY_DECLARED("Function had already been declared in the scope"),
  FUNCTION_NOT_DECLARED("Function has not been declared yet"),
  VARIABLE_NOT_DECLARED("Variable had not been declared yet");
  ;

  private final String message;

  ErrorReason(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
