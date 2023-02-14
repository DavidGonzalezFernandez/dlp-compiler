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
    if (lexeme == null) return Character.MIN_VALUE;

    if (lexeme == "\n") return '\n';
    if (lexeme == "\t") return '\t';
    if (lexeme == "\r") return '\r';

    if (lexeme.length() == 1) {
      return lexeme.charAt(0);
    } else {
      return (char) Integer.parseInt(lexeme.substring(1));
    }
  }
}
