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
      "\u0004\u0000\u0007y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"
          + "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"
          + "\u0016\b\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0001\u0003\u0001\u001c"
          + "\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"
          + "\u0002\u0001\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001"
          + "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"
          + "\u0003\u0004\u00031\b\u0003\u000b\u0003\f\u00032\u0001\u0004\u0001\u0004"
          + "\u0005\u00047\b\u0004\n\u0004\f\u0004:\t\u0004\u0001\u0005\u0004\u0005"
          + "=\b\u0005\u000b\u0005\f\u0005>\u0001\u0005\u0001\u0005\u0005\u0005C\b"
          + "\u0005\n\u0005\f\u0005F\t\u0005\u0001\u0005\u0001\u0005\u0004\u0005J\b"
          + "\u0005\u000b\u0005\f\u0005K\u0003\u0005N\b\u0005\u0001\u0005\u0001\u0005"
          + "\u0003\u0005R\b\u0005\u0001\u0005\u0004\u0005U\b\u0005\u000b\u0005\f\u0005"
          + "V\u0003\u0005Y\b\u0005\u0001\u0005\u0004\u0005\\\b\u0005\u000b\u0005\f"
          + "\u0005]\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0005\u0004"
          + "\u0005e\b\u0005\u000b\u0005\f\u0005f\u0003\u0005i\b\u0005\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006o\b\u0006\u000b\u0006"
          + "\f\u0006p\u0001\u0006\u0003\u0006t\b\u0006\u0003\u0006v\b\u0006\u0001"
          + "\u0006\u0001\u0006\u0002\u0017&\u0000\u0007\u0001\u0001\u0003\u0002\u0005"
          + "\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000\b\u0003\u0000"
          + "\t\n\r\r  \u0002\u0001\n\n\r\r\u0001\u000009\u0003\u0000AZ__az\u0004\u0000"
          + "09AZ__az\u0002\u0000EEee\u0002\u0000++--\u0003\u0000nnrrtt\u008a\u0000"
          + "\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"
          + "\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"
          + "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"
          + "\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0003\u0013"
          + "\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u00070\u0001"
          + "\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000\u000bh\u0001\u0000\u0000"
          + "\u0000\rj\u0001\u0000\u0000\u0000\u000f\u0010\u0007\u0000\u0000\u0000"
          + "\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0006\u0000\u0000\u0000"
          + "\u0012\u0002\u0001\u0000\u0000\u0000\u0013\u0017\u0005#\u0000\u0000\u0014"
          + "\u0016\t\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019"
          + "\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0017\u0015"
          + "\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017"
          + "\u0001\u0000\u0000\u0000\u001a\u001c\u0007\u0001\u0000\u0000\u001b\u001a"
          + "\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e"
          + "\u0006\u0001\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005"
          + "\"\u0000\u0000 !\u0005\"\u0000\u0000!\"\u0005\"\u0000\u0000\"&\u0001\u0000"
          + "\u0000\u0000#%\t\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000"
          + "\u0000\u0000&\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\')\u0001"
          + "\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005\"\u0000\u0000*+\u0005"
          + "\"\u0000\u0000+,\u0005\"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0006"
          + "\u0002\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/1\u0007\u0002\u0000"
          + "\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000"
          + "\u0000\u000023\u0001\u0000\u0000\u00003\b\u0001\u0000\u0000\u000048\u0007"
          + "\u0003\u0000\u000057\u0007\u0004\u0000\u000065\u0001\u0000\u0000\u0000"
          + "7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"
          + "\u00009\n\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0007\u0002"
          + "\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001"
          + "\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"
          + "@D\u0005.\u0000\u0000AC\u0007\u0002\u0000\u0000BA\u0001\u0000\u0000\u0000"
          + "CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"
          + "\u0000EN\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0005.\u0000"
          + "\u0000HJ\u0007\u0002\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000"
          + "\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001"
          + "\u0000\u0000\u0000M<\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000"
          + "NX\u0001\u0000\u0000\u0000OQ\u0007\u0005\u0000\u0000PR\u0007\u0006\u0000"
          + "\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000"
          + "\u0000\u0000SU\u0007\u0002\u0000\u0000TS\u0001\u0000\u0000\u0000UV\u0001"
          + "\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"
          + "WY\u0001\u0000\u0000\u0000XO\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"
          + "\u0000Yi\u0001\u0000\u0000\u0000Z\\\u0007\u0002\u0000\u0000[Z\u0001\u0000"
          + "\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"
          + "\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0007\u0005\u0000\u0000"
          + "`b\u0007\u0006\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"
          + "\u0000bd\u0001\u0000\u0000\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000"
          + "\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"
          + "\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hM\u0001\u0000\u0000\u0000"
          + "h[\u0001\u0000\u0000\u0000i\f\u0001\u0000\u0000\u0000ju\u0005\'\u0000"
          + "\u0000kv\t\u0000\u0000\u0000ls\u0005\\\u0000\u0000mo\u0007\u0002\u0000"
          + "\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000"
          + "\u0000\u0000pq\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rt\u0007"
          + "\u0007\u0000\u0000sn\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"
          + "tv\u0001\u0000\u0000\u0000uk\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000"
          + "\u0000vw\u0001\u0000\u0000\u0000wx\u0005\'\u0000\u0000x\u000e\u0001\u0000"
          + "\u0000\u0000\u0014\u0000\u0017\u001b&28>DKMQVX]afhpsu\u0001\u0006\u0000"
          + "\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
