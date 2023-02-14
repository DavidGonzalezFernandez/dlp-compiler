// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

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
  public static final int OMMIT = 1,
      LINE_COMMENT = 2,
      MULTI_LINE_COMMENT = 3,
      INT_CONSTANT = 4,
      ID = 5,
      REAL_CONSTANT = 6,
      CHAR_CONSTANT = 7;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
      "OMMIT",
      "LINE_COMMENT",
      "MULTI_LINE_COMMENT",
      "INT_CONSTANT",
      "ID",
      "REAL_CONSTANT",
      "CHAR_CONSTANT"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {};
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      "OMMIT",
      "LINE_COMMENT",
      "MULTI_LINE_COMMENT",
      "INT_CONSTANT",
      "ID",
      "REAL_CONSTANT",
      "CHAR_CONSTANT"
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
      "\u0004\u0000\u0007[\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"
          + "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001"
          + "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"
          + "\u0003\u0004\u0003*\b\u0003\u000b\u0003\f\u0003+\u0001\u0004\u0001\u0004"
          + "\u0005\u00040\b\u0004\n\u0004\f\u00043\t\u0004\u0001\u0005\u0005\u0005"
          + "6\b\u0005\n\u0005\f\u00059\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005"
          + "=\b\u0005\n\u0005\f\u0005@\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005"
          + "D\b\u0005\u0001\u0005\u0004\u0005G\b\u0005\u000b\u0005\f\u0005H\u0003"
          + "\u0005K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"
          + "\u0006Q\b\u0006\u000b\u0006\f\u0006R\u0001\u0006\u0003\u0006V\b\u0006"
          + "\u0003\u0006X\b\u0006\u0001\u0006\u0001\u0006\u0001\u001f\u0000\u0007"
          + "\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"
          + "\u0007\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0001\u0000\n\n\u0001\u0000"
          + "09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000EEee\u0002\u0000+"
          + "+--\u0003\u0000nnrrtte\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"
          + "\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"
          + "\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"
          + "\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000"
          + "\u0000\u0000\u0003\u0013\u0001\u0000\u0000\u0000\u0005\u0018\u0001\u0000"
          + "\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000"
          + "\u000b7\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000f\u0010"
          + "\u0007\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012"
          + "\u0006\u0000\u0000\u0000\u0012\u0002\u0001\u0000\u0000\u0000\u0013\u0014"
          + "\u0005#\u0000\u0000\u0014\u0015\b\u0001\u0000\u0000\u0015\u0016\u0001"
          + "\u0000\u0000\u0000\u0016\u0017\u0006\u0001\u0000\u0000\u0017\u0004\u0001"
          + "\u0000\u0000\u0000\u0018\u0019\u0005\"\u0000\u0000\u0019\u001a\u0005\""
          + "\u0000\u0000\u001a\u001b\u0005\"\u0000\u0000\u001b\u001f\u0001\u0000\u0000"
          + "\u0000\u001c\u001e\t\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000"
          + "\u001e!\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000\u001f\u001d"
          + "\u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"
          + "\u0000\u0000\"#\u0005\"\u0000\u0000#$\u0005\"\u0000\u0000$%\u0005\"\u0000"
          + "\u0000%&\u0001\u0000\u0000\u0000&\'\u0006\u0002\u0000\u0000\'\u0006\u0001"
          + "\u0000\u0000\u0000(*\u0007\u0002\u0000\u0000)(\u0001\u0000\u0000\u0000"
          + "*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"
          + "\u0000,\b\u0001\u0000\u0000\u0000-1\u0007\u0003\u0000\u0000.0\u0007\u0004"
          + "\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001"
          + "\u0000\u0000\u000012\u0001\u0000\u0000\u00002\n\u0001\u0000\u0000\u0000"
          + "31\u0001\u0000\u0000\u000046\u0007\u0002\u0000\u000054\u0001\u0000\u0000"
          + "\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"
          + "\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:>\u0005"
          + ".\u0000\u0000;=\u0007\u0002\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001"
          + "\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"
          + "?J\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AC\u0007\u0005\u0000"
          + "\u0000BD\u0007\u0006\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000"
          + "\u0000\u0000DF\u0001\u0000\u0000\u0000EG\u0007\u0002\u0000\u0000FE\u0001"
          + "\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"
          + "HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JA\u0001\u0000\u0000"
          + "\u0000JK\u0001\u0000\u0000\u0000K\f\u0001\u0000\u0000\u0000LW\u0005\'"
          + "\u0000\u0000MX\t\u0000\u0000\u0000NU\u0005\\\u0000\u0000OQ\u0007\u0002"
          + "\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001"
          + "\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"
          + "TV\u0007\u0007\u0000\u0000UP\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000"
          + "\u0000VX\u0001\u0000\u0000\u0000WM\u0001\u0000\u0000\u0000WN\u0001\u0000"
          + "\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\'\u0000\u0000Z\u000e\u0001"
          + "\u0000\u0000\u0000\f\u0000\u001f+17>CHJRUW\u0001\u0006\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
