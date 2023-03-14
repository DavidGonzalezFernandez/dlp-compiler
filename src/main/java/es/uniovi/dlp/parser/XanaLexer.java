// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definition.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.types.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int T__0 = 1,
      T__1 = 2,
      T__2 = 3,
      T__3 = 4,
      T__4 = 5,
      T__5 = 6,
      T__6 = 7,
      T__7 = 8,
      T__8 = 9,
      T__9 = 10,
      T__10 = 11,
      T__11 = 12,
      T__12 = 13,
      T__13 = 14,
      T__14 = 15,
      MINUS = 16,
      NOT = 17,
      ABRE_CORCHETE = 18,
      CIERRA_CORCHETE = 19,
      ABRE_PARENTESIS = 20,
      CIERRA_PARENTESIS = 21,
      VOID = 22,
      DOT = 23,
      AS = 24,
      IF = 25,
      ELSE = 26,
      WHILE = 27,
      PUTS = 28,
      IN = 29,
      IGUAL = 30,
      DEF = 31,
      MAIN = 32,
      RETURN = 33,
      DOS_PUNTOS = 34,
      DEFSTRUCT = 35,
      COMMA = 36,
      DO = 37,
      END = 38,
      OMMIT = 39,
      LINE_COMMENT = 40,
      MULTI_LINE_COMMENT = 41,
      INT_CONSTANT = 42,
      REAL_CONSTANT = 43,
      CHAR_CONSTANT = 44,
      ID = 45;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
      "T__0",
      "T__1",
      "T__2",
      "T__3",
      "T__4",
      "T__5",
      "T__6",
      "T__7",
      "T__8",
      "T__9",
      "T__10",
      "T__11",
      "T__12",
      "T__13",
      "T__14",
      "MINUS",
      "NOT",
      "ABRE_CORCHETE",
      "CIERRA_CORCHETE",
      "ABRE_PARENTESIS",
      "CIERRA_PARENTESIS",
      "VOID",
      "DOT",
      "AS",
      "IF",
      "ELSE",
      "WHILE",
      "PUTS",
      "IN",
      "IGUAL",
      "DEF",
      "MAIN",
      "RETURN",
      "DOS_PUNTOS",
      "DEFSTRUCT",
      "COMMA",
      "DO",
      "END",
      "OMMIT",
      "LINE_COMMENT",
      "MULTI_LINE_COMMENT",
      "INT_CONSTANT",
      "REAL_CONSTANT",
      "CHAR_CONSTANT",
      "ID"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null,
      "'int'",
      "'double'",
      "'char'",
      "'*'",
      "'/'",
      "'%'",
      "'+'",
      "'>'",
      "'>='",
      "'<'",
      "'<='",
      "'!='",
      "'=='",
      "'&&'",
      "'||'",
      "'-'",
      "'!'",
      "'['",
      "']'",
      "'('",
      "')'",
      "'void'",
      "'.'",
      "'as'",
      "'if'",
      "'else'",
      "'while'",
      "'puts'",
      "'in'",
      "'='",
      "'def'",
      "'main'",
      "'return'",
      "'::'",
      "'defstruct'",
      "','",
      "'do'",
      "'end'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      "MINUS",
      "NOT",
      "ABRE_CORCHETE",
      "CIERRA_CORCHETE",
      "ABRE_PARENTESIS",
      "CIERRA_PARENTESIS",
      "VOID",
      "DOT",
      "AS",
      "IF",
      "ELSE",
      "WHILE",
      "PUTS",
      "IN",
      "IGUAL",
      "DEF",
      "MAIN",
      "RETURN",
      "DOS_PUNTOS",
      "DEFSTRUCT",
      "COMMA",
      "DO",
      "END",
      "OMMIT",
      "LINE_COMMENT",
      "MULTI_LINE_COMMENT",
      "INT_CONSTANT",
      "REAL_CONSTANT",
      "CHAR_CONSTANT",
      "ID"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated public static final String[] tokenNames;

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override
  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  public XanaLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @Override
  public String getGrammarFileName() {
    return "Xana.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
      "\u0004\u0000-\u0147\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"
          + "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"
          + "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"
          + "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"
          + "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"
          + "\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"
          + "\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"
          + "\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"
          + "\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"
          + "!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"
          + "&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"
          + "+\u0002,\u0007,\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"
          + "\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"
          + "\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"
          + "\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"
          + "\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"
          + "\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"
          + "\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"
          + "\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"
          + "\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"
          + "\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"
          + "\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"
          + "\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"
          + "\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"
          + "\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"
          + " \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""
          + "\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"
          + "%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0005"
          + "\'\u00e4\b\'\n\'\f\'\u00e7\t\'\u0001\'\u0003\'\u00ea\b\'\u0001\'\u0001"
          + "\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u00f3\b(\n(\f(\u00f6\t(\u0001"
          + "(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0004)\u00ff\b)\u000b)\f)"
          + "\u0100\u0001*\u0004*\u0104\b*\u000b*\f*\u0105\u0001*\u0001*\u0005*\u010a"
          + "\b*\n*\f*\u010d\t*\u0001*\u0001*\u0004*\u0111\b*\u000b*\f*\u0112\u0003"
          + "*\u0115\b*\u0001*\u0001*\u0003*\u0119\b*\u0001*\u0004*\u011c\b*\u000b"
          + "*\f*\u011d\u0003*\u0120\b*\u0001*\u0004*\u0123\b*\u000b*\f*\u0124\u0001"
          + "*\u0001*\u0003*\u0129\b*\u0001*\u0004*\u012c\b*\u000b*\f*\u012d\u0003"
          + "*\u0130\b*\u0001+\u0001+\u0001+\u0001+\u0004+\u0136\b+\u000b+\f+\u0137"
          + "\u0001+\u0003+\u013b\b+\u0003+\u013d\b+\u0001+\u0001+\u0001,\u0001,\u0005"
          + ",\u0143\b,\n,\f,\u0146\t,\u0002\u00e5\u00f4\u0000-\u0001\u0001\u0003\u0002"
          + "\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"
          + "\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"
          + "#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"
          + "7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-\u0001\u0000"
          + "\b\u0003\u0000\t\n\r\r  \u0002\u0001\n\n\r\r\u0001\u000009\u0002\u0000"
          + "EEee\u0002\u0000++--\u0003\u0000nnrrtt\u0003\u0000AZ__az\u0004\u00000"
          + "9AZ__az\u0158\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"
          + "\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"
          + "\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"
          + "\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"
          + "\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"
          + "\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"
          + "\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"
          + "\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"
          + "\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"
          + "\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"
          + "\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"
          + "\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"
          + "3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"
          + "\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"
          + "\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"
          + "A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"
          + "\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"
          + "\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"
          + "O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"
          + "\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"
          + "\u0000\u0000Y\u0001\u0000\u0000\u0000\u0001[\u0001\u0000\u0000\u0000\u0003"
          + "_\u0001\u0000\u0000\u0000\u0005f\u0001\u0000\u0000\u0000\u0007k\u0001"
          + "\u0000\u0000\u0000\tm\u0001\u0000\u0000\u0000\u000bo\u0001\u0000\u0000"
          + "\u0000\rq\u0001\u0000\u0000\u0000\u000fs\u0001\u0000\u0000\u0000\u0011"
          + "u\u0001\u0000\u0000\u0000\u0013x\u0001\u0000\u0000\u0000\u0015z\u0001"
          + "\u0000\u0000\u0000\u0017}\u0001\u0000\u0000\u0000\u0019\u0080\u0001\u0000"
          + "\u0000\u0000\u001b\u0083\u0001\u0000\u0000\u0000\u001d\u0086\u0001\u0000"
          + "\u0000\u0000\u001f\u0089\u0001\u0000\u0000\u0000!\u008b\u0001\u0000\u0000"
          + "\u0000#\u008d\u0001\u0000\u0000\u0000%\u008f\u0001\u0000\u0000\u0000\'"
          + "\u0091\u0001\u0000\u0000\u0000)\u0093\u0001\u0000\u0000\u0000+\u0095\u0001"
          + "\u0000\u0000\u0000-\u009a\u0001\u0000\u0000\u0000/\u009c\u0001\u0000\u0000"
          + "\u00001\u009f\u0001\u0000\u0000\u00003\u00a2\u0001\u0000\u0000\u00005"
          + "\u00a7\u0001\u0000\u0000\u00007\u00ad\u0001\u0000\u0000\u00009\u00b2\u0001"
          + "\u0000\u0000\u0000;\u00b5\u0001\u0000\u0000\u0000=\u00b7\u0001\u0000\u0000"
          + "\u0000?\u00bb\u0001\u0000\u0000\u0000A\u00c0\u0001\u0000\u0000\u0000C"
          + "\u00c7\u0001\u0000\u0000\u0000E\u00ca\u0001\u0000\u0000\u0000G\u00d4\u0001"
          + "\u0000\u0000\u0000I\u00d6\u0001\u0000\u0000\u0000K\u00d9\u0001\u0000\u0000"
          + "\u0000M\u00dd\u0001\u0000\u0000\u0000O\u00e1\u0001\u0000\u0000\u0000Q"
          + "\u00ed\u0001\u0000\u0000\u0000S\u00fe\u0001\u0000\u0000\u0000U\u012f\u0001"
          + "\u0000\u0000\u0000W\u0131\u0001\u0000\u0000\u0000Y\u0140\u0001\u0000\u0000"
          + "\u0000[\\\u0005i\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005t\u0000\u0000"
          + "^\u0002\u0001\u0000\u0000\u0000_`\u0005d\u0000\u0000`a\u0005o\u0000\u0000"
          + "ab\u0005u\u0000\u0000bc\u0005b\u0000\u0000cd\u0005l\u0000\u0000de\u0005"
          + "e\u0000\u0000e\u0004\u0001\u0000\u0000\u0000fg\u0005c\u0000\u0000gh\u0005"
          + "h\u0000\u0000hi\u0005a\u0000\u0000ij\u0005r\u0000\u0000j\u0006\u0001\u0000"
          + "\u0000\u0000kl\u0005*\u0000\u0000l\b\u0001\u0000\u0000\u0000mn\u0005/"
          + "\u0000\u0000n\n\u0001\u0000\u0000\u0000op\u0005%\u0000\u0000p\f\u0001"
          + "\u0000\u0000\u0000qr\u0005+\u0000\u0000r\u000e\u0001\u0000\u0000\u0000"
          + "st\u0005>\u0000\u0000t\u0010\u0001\u0000\u0000\u0000uv\u0005>\u0000\u0000"
          + "vw\u0005=\u0000\u0000w\u0012\u0001\u0000\u0000\u0000xy\u0005<\u0000\u0000"
          + "y\u0014\u0001\u0000\u0000\u0000z{\u0005<\u0000\u0000{|\u0005=\u0000\u0000"
          + "|\u0016\u0001\u0000\u0000\u0000}~\u0005!\u0000\u0000~\u007f\u0005=\u0000"
          + "\u0000\u007f\u0018\u0001\u0000\u0000\u0000\u0080\u0081\u0005=\u0000\u0000"
          + "\u0081\u0082\u0005=\u0000\u0000\u0082\u001a\u0001\u0000\u0000\u0000\u0083"
          + "\u0084\u0005&\u0000\u0000\u0084\u0085\u0005&\u0000\u0000\u0085\u001c\u0001"
          + "\u0000\u0000\u0000\u0086\u0087\u0005|\u0000\u0000\u0087\u0088\u0005|\u0000"
          + "\u0000\u0088\u001e\u0001\u0000\u0000\u0000\u0089\u008a\u0005-\u0000\u0000"
          + "\u008a \u0001\u0000\u0000\u0000\u008b\u008c\u0005!\u0000\u0000\u008c\""
          + "\u0001\u0000\u0000\u0000\u008d\u008e\u0005[\u0000\u0000\u008e$\u0001\u0000"
          + "\u0000\u0000\u008f\u0090\u0005]\u0000\u0000\u0090&\u0001\u0000\u0000\u0000"
          + "\u0091\u0092\u0005(\u0000\u0000\u0092(\u0001\u0000\u0000\u0000\u0093\u0094"
          + "\u0005)\u0000\u0000\u0094*\u0001\u0000\u0000\u0000\u0095\u0096\u0005v"
          + "\u0000\u0000\u0096\u0097\u0005o\u0000\u0000\u0097\u0098\u0005i\u0000\u0000"
          + "\u0098\u0099\u0005d\u0000\u0000\u0099,\u0001\u0000\u0000\u0000\u009a\u009b"
          + "\u0005.\u0000\u0000\u009b.\u0001\u0000\u0000\u0000\u009c\u009d\u0005a"
          + "\u0000\u0000\u009d\u009e\u0005s\u0000\u0000\u009e0\u0001\u0000\u0000\u0000"
          + "\u009f\u00a0\u0005i\u0000\u0000\u00a0\u00a1\u0005f\u0000\u0000\u00a12"
          + "\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u00a4\u0005"
          + "l\u0000\u0000\u00a4\u00a5\u0005s\u0000\u0000\u00a5\u00a6\u0005e\u0000"
          + "\u0000\u00a64\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005w\u0000\u0000\u00a8"
          + "\u00a9\u0005h\u0000\u0000\u00a9\u00aa\u0005i\u0000\u0000\u00aa\u00ab\u0005"
          + "l\u0000\u0000\u00ab\u00ac\u0005e\u0000\u0000\u00ac6\u0001\u0000\u0000"
          + "\u0000\u00ad\u00ae\u0005p\u0000\u0000\u00ae\u00af\u0005u\u0000\u0000\u00af"
          + "\u00b0\u0005t\u0000\u0000\u00b0\u00b1\u0005s\u0000\u0000\u00b18\u0001"
          + "\u0000\u0000\u0000\u00b2\u00b3\u0005i\u0000\u0000\u00b3\u00b4\u0005n\u0000"
          + "\u0000\u00b4:\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005=\u0000\u0000\u00b6"
          + "<\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005d\u0000\u0000\u00b8\u00b9\u0005"
          + "e\u0000\u0000\u00b9\u00ba\u0005f\u0000\u0000\u00ba>\u0001\u0000\u0000"
          + "\u0000\u00bb\u00bc\u0005m\u0000\u0000\u00bc\u00bd\u0005a\u0000\u0000\u00bd"
          + "\u00be\u0005i\u0000\u0000\u00be\u00bf\u0005n\u0000\u0000\u00bf@\u0001"
          + "\u0000\u0000\u0000\u00c0\u00c1\u0005r\u0000\u0000\u00c1\u00c2\u0005e\u0000"
          + "\u0000\u00c2\u00c3\u0005t\u0000\u0000\u00c3\u00c4\u0005u\u0000\u0000\u00c4"
          + "\u00c5\u0005r\u0000\u0000\u00c5\u00c6\u0005n\u0000\u0000\u00c6B\u0001"
          + "\u0000\u0000\u0000\u00c7\u00c8\u0005:\u0000\u0000\u00c8\u00c9\u0005:\u0000"
          + "\u0000\u00c9D\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005d\u0000\u0000\u00cb"
          + "\u00cc\u0005e\u0000\u0000\u00cc\u00cd\u0005f\u0000\u0000\u00cd\u00ce\u0005"
          + "s\u0000\u0000\u00ce\u00cf\u0005t\u0000\u0000\u00cf\u00d0\u0005r\u0000"
          + "\u0000\u00d0\u00d1\u0005u\u0000\u0000\u00d1\u00d2\u0005c\u0000\u0000\u00d2"
          + "\u00d3\u0005t\u0000\u0000\u00d3F\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"
          + ",\u0000\u0000\u00d5H\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005d\u0000"
          + "\u0000\u00d7\u00d8\u0005o\u0000\u0000\u00d8J\u0001\u0000\u0000\u0000\u00d9"
          + "\u00da\u0005e\u0000\u0000\u00da\u00db\u0005n\u0000\u0000\u00db\u00dc\u0005"
          + "d\u0000\u0000\u00dcL\u0001\u0000\u0000\u0000\u00dd\u00de\u0007\u0000\u0000"
          + "\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0006&\u0000\u0000"
          + "\u00e0N\u0001\u0000\u0000\u0000\u00e1\u00e5\u0005#\u0000\u0000\u00e2\u00e4"
          + "\t\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"
          + "\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"
          + "\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"
          + "\u0000\u0000\u0000\u00e8\u00ea\u0007\u0001\u0000\u0000\u00e9\u00e8\u0001"
          + "\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006"
          + "\'\u0000\u0000\u00ecP\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\"\u0000"
          + "\u0000\u00ee\u00ef\u0005\"\u0000\u0000\u00ef\u00f0\u0005\"\u0000\u0000"
          + "\u00f0\u00f4\u0001\u0000\u0000\u0000\u00f1\u00f3\t\u0000\u0000\u0000\u00f2"
          + "\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4"
          + "\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5"
          + "\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7"
          + "\u00f8\u0005\"\u0000\u0000\u00f8\u00f9\u0005\"\u0000\u0000\u00f9\u00fa"
          + "\u0005\"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0006"
          + "(\u0000\u0000\u00fcR\u0001\u0000\u0000\u0000\u00fd\u00ff\u0007\u0002\u0000"
          + "\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"
          + "\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"
          + "\u0000\u0101T\u0001\u0000\u0000\u0000\u0102\u0104\u0007\u0002\u0000\u0000"
          + "\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"
          + "\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"
          + "\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010b\u0005.\u0000\u0000\u0108"
          + "\u010a\u0007\u0002\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a"
          + "\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"
          + "\u010c\u0001\u0000\u0000\u0000\u010c\u0115\u0001\u0000\u0000\u0000\u010d"
          + "\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0005.\u0000\u0000\u010f\u0111"
          + "\u0007\u0002\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112"
          + "\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113"
          + "\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0103"
          + "\u0001\u0000\u0000\u0000\u0114\u010e\u0001\u0000\u0000\u0000\u0115\u011f"
          + "\u0001\u0000\u0000\u0000\u0116\u0118\u0007\u0003\u0000\u0000\u0117\u0119"
          + "\u0007\u0004\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119"
          + "\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u011c"
          + "\u0007\u0002\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011d"
          + "\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e"
          + "\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0116"
          + "\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0130"
          + "\u0001\u0000\u0000\u0000\u0121\u0123\u0007\u0002\u0000\u0000\u0122\u0121"
          + "\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0122"
          + "\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126"
          + "\u0001\u0000\u0000\u0000\u0126\u0128\u0007\u0003\u0000\u0000\u0127\u0129"
          + "\u0007\u0004\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129"
          + "\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u012c"
          + "\u0007\u0002\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012d"
          + "\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e"
          + "\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0114"
          + "\u0001\u0000\u0000\u0000\u012f\u0122\u0001\u0000\u0000\u0000\u0130V\u0001"
          + "\u0000\u0000\u0000\u0131\u013c\u0005\'\u0000\u0000\u0132\u013d\t\u0000"
          + "\u0000\u0000\u0133\u013a\u0005\\\u0000\u0000\u0134\u0136\u0007\u0002\u0000"
          + "\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"
          + "\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"
          + "\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u013b\u0007\u0005\u0000"
          + "\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000"
          + "\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0132\u0001\u0000\u0000"
          + "\u0000\u013c\u0133\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"
          + "\u0000\u013e\u013f\u0005\'\u0000\u0000\u013fX\u0001\u0000\u0000\u0000"
          + "\u0140\u0144\u0007\u0006\u0000\u0000\u0141\u0143\u0007\u0007\u0000\u0000"
          + "\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000"
          + "\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"
          + "\u0145Z\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0014"
          + "\u0000\u00e5\u00e9\u00f4\u0100\u0105\u010b\u0112\u0114\u0118\u011d\u011f"
          + "\u0124\u0128\u012d\u012f\u0137\u013a\u013c\u0144\u0001\u0006\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
