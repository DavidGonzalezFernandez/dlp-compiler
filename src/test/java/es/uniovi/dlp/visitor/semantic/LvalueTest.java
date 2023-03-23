package es.uniovi.dlp.visitor.semantic;

import static es.uniovi.dlp.TestHelpers.assertFoundErrors;
import static es.uniovi.dlp.TestHelpers.runCompiler;
import static org.junit.jupiter.api.Assertions.*;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LvalueTest {

  @Test
  void errorLvalueInRead() {
    runCompiler("examples/errors/lvalue/read.xana");
    assertFoundErrors(Arrays.asList(new Error(4, 8, ErrorReason.LVALUE_REQUIRED)));
  }

  @Test
  void errorLvalueAssignment() {
    runCompiler("examples/errors/lvalue/arithmetic.xana");
    assertFoundErrors(Arrays.asList(new Error(4, 5, ErrorReason.LVALUE_REQUIRED)));
  }

  @Test
  void correctLvalue() {
    runCompiler("examples/errors/valid_examples/lvalue.xana");
    assertFoundErrors(new ArrayList<>());
  }

  // ---

  @Test
  void errorTestPropio() {
    runCompiler("examples/errors/lvalue/test_propio.xana");
    assertFoundErrors(
        Arrays.asList(
            new Error(56, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(57, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(58, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(59, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(60, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(61, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(62, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(63, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(64, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(65, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(66, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(67, 5, ErrorReason.LVALUE_REQUIRED),
            new Error(70, 8, ErrorReason.LVALUE_REQUIRED),
            new Error(70, 25, ErrorReason.LVALUE_REQUIRED),
            new Error(70, 42, ErrorReason.LVALUE_REQUIRED),
            new Error(70, 59, ErrorReason.LVALUE_REQUIRED),
            new Error(71, 8, ErrorReason.LVALUE_REQUIRED),
            new Error(71, 26, ErrorReason.LVALUE_REQUIRED),
            new Error(71, 44, ErrorReason.LVALUE_REQUIRED),
            new Error(71, 49, ErrorReason.LVALUE_REQUIRED),
            new Error(71, 54, ErrorReason.LVALUE_REQUIRED),
            new Error(72, 8, ErrorReason.LVALUE_REQUIRED),
            new Error(72, 30, ErrorReason.LVALUE_REQUIRED),
            new Error(72, 39, ErrorReason.LVALUE_REQUIRED)));
  }

  // ---

  private static void assertFoundErrors(List<Error> errors) {
    var foundErrors = ErrorManager.getInstance().getErrors();
    assertIterableEquals(errors, foundErrors);
  }
}
