package es.uniovi.dlp.parser;

public class LexerHelper {
  public static int lexemeToInt(String lexeme) {
    try {
      return Integer.parseInt(lexeme);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static double lexemeToReal(String lexeme) {
    try {
      return Double.parseDouble(lexeme);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static char lexemeToChar(String lexeme) {
    if (lexeme == null) throw new IllegalArgumentException();

    if (lexeme.length() == 3) {
      return lexeme.charAt(1);
    }

    if ('\\' == lexeme.charAt(1)) {
      switch (lexeme.charAt(2)) {
        case 'n':
          return '\n';
        case 't':
          return '\t';
        case 'r':
          return '\r';
      }
      return (char) Integer.parseInt(lexeme.substring(2, lexeme.length() - 1));
    }
    throw new IllegalArgumentException();
  }
}
