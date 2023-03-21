package es.uniovi.dlp.error;

import java.util.ArrayList;
import java.util.List;

public class ErrorManager {
  private static final ErrorManager instance = new ErrorManager();

  private final List<Error> errors = new ArrayList<>();

  private ErrorManager() {}

  public static ErrorManager getInstance() {
    return instance;
  }

  public void clearErrors() {
    errors.clear();
  }

  public List<Error> getErrors() {
    return new ArrayList<>(this.errors);
  }

  public boolean hasErrors() {
    return !this.errors.isEmpty();
  }

  public void addError(Error newError) {
    if (newError == null) throw new IllegalArgumentException("Error cannot be null");
    this.errors.add(newError);

  }
}
