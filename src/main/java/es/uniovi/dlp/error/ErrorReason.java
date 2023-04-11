package es.uniovi.dlp.error;

public enum ErrorReason {
  FIELD_ALREADY_DECLARED("Field already declared in struct"),
  LVALUE_REQUIRED("LValue is required"),
  VARIABLE_ALREADY_DECLARED("Variable had already been declared in the scope"),
  FUNCTION_ALREADY_DECLARED("Function had already been declared in the scope"),
  FUNCTION_NOT_DECLARED("Function has not been declared yet"),
  VARIABLE_NOT_DECLARED("Variable had not been declared yet"),
  INVALID_INDEX_EXPRESSION("The expression cannot be used as an index"),
  INVALID_INDEXING("This type does not allow for indexing"),
  INVALID_CAST("This type cannot be cast"),
  INVALID_ARITHMETIC("Cannot perform arithmetic operation with the given type/s"),
  NOT_LOGICAL("This expression cannot be used as a boolean value"),
  INVALID_LOGICAL("Cannot perform logical operation with the given type/s"),
  INVALID_COMPARISON("Cannot perform comparison operation with the given types"),
  NO_SUCH_FIELD("The field is not declared in the struct"),
  INVALID_DOT("This type does not support dot operation"),
  INCOMPATIBLE_TYPES("The types are incompatible"),
  INVALID_RETURN_TYPE("The value being returned does not match the expected return type"),
  INVALID_ARGS("The given arguments do not match the expected arguments"),
  INVALID_INVOCATION("This expression cannot be invoked");
  ;

  private final String message;

  ErrorReason(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
