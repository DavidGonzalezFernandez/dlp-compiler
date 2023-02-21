// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, UNARY_MINUS=4, ABRE_CORCHETE=5, CIERRA_CORCHETE=6, 
		DOT=7, AS=8, IF=9, PUTS=10, IN=11, IGUAL=12, ELSE=13, WHILE=14, MAIN=15, 
		RETURN=16, ABRE_PARENTESIS=17, CIERRA_PARENTESIS=18, DEF=19, DOS_PUNTOS=20, 
		DEFSTRUCT=21, COMMA=22, DO=23, END=24, OMMIT=25, LINE_COMMENT=26, MULTI_LINE_COMMENT=27, 
		INT_CONSTANT=28, REAL_CONSTANT=29, CHAR_CONSTANT=30, ID=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "UNARY_MINUS", "ABRE_CORCHETE", "CIERRA_CORCHETE", 
			"DOT", "AS", "IF", "PUTS", "IN", "IGUAL", "ELSE", "WHILE", "MAIN", "RETURN", 
			"ABRE_PARENTESIS", "CIERRA_PARENTESIS", "DEF", "DOS_PUNTOS", "DEFSTRUCT", 
			"COMMA", "DO", "END", "OMMIT", "LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'double'", "'char'", "'-'", "'['", "']'", "'.'", "'as'", 
			"'if'", "'puts'", "'in'", "'='", "'else'", "'while'", "'main'", "'return'", 
			"'('", "')'", "'def'", "'::'", "'defstruct'", "','", "'do'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "UNARY_MINUS", "ABRE_CORCHETE", "CIERRA_CORCHETE", 
			"DOT", "AS", "IF", "PUTS", "IN", "IGUAL", "ELSE", "WHILE", "MAIN", "RETURN", 
			"ABRE_PARENTESIS", "CIERRA_PARENTESIS", "DEF", "DOS_PUNTOS", "DEFSTRUCT", 
			"COMMA", "DO", "END", "OMMIT", "LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u0106\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u00a3\b\u0019\n"+
		"\u0019\f\u0019\u00a6\t\u0019\u0001\u0019\u0003\u0019\u00a9\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u00b2\b\u001a\n\u001a\f\u001a\u00b5\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0004\u001b\u00be\b\u001b\u000b\u001b\f\u001b\u00bf\u0001\u001c\u0004"+
		"\u001c\u00c3\b\u001c\u000b\u001c\f\u001c\u00c4\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u00c9\b\u001c\n\u001c\f\u001c\u00cc\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0004\u001c\u00d0\b\u001c\u000b\u001c\f\u001c\u00d1\u0003\u001c"+
		"\u00d4\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00d8\b\u001c\u0001"+
		"\u001c\u0004\u001c\u00db\b\u001c\u000b\u001c\f\u001c\u00dc\u0003\u001c"+
		"\u00df\b\u001c\u0001\u001c\u0004\u001c\u00e2\b\u001c\u000b\u001c\f\u001c"+
		"\u00e3\u0001\u001c\u0001\u001c\u0003\u001c\u00e8\b\u001c\u0001\u001c\u0004"+
		"\u001c\u00eb\b\u001c\u000b\u001c\f\u001c\u00ec\u0003\u001c\u00ef\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u00f5\b\u001d"+
		"\u000b\u001d\f\u001d\u00f6\u0001\u001d\u0003\u001d\u00fa\b\u001d\u0003"+
		"\u001d\u00fc\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0102\b\u001e\n\u001e\f\u001e\u0105\t\u001e\u0002\u00a4\u00b3\u0000"+
		"\u001f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f\u0001\u0000\b"+
		"\u0003\u0000\t\n\r\r  \u0002\u0001\n\n\r\r\u0001\u000009\u0002\u0000E"+
		"Eee\u0002\u0000++--\u0003\u0000nnrrtt\u0003\u0000AZ__az\u0004\u000009"+
		"AZ__az\u0117\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003"+
		"C\u0001\u0000\u0000\u0000\u0005J\u0001\u0000\u0000\u0000\u0007O\u0001"+
		"\u0000\u0000\u0000\tQ\u0001\u0000\u0000\u0000\u000bS\u0001\u0000\u0000"+
		"\u0000\rU\u0001\u0000\u0000\u0000\u000fW\u0001\u0000\u0000\u0000\u0011"+
		"Z\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015b\u0001"+
		"\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019g\u0001\u0000\u0000"+
		"\u0000\u001bl\u0001\u0000\u0000\u0000\u001dr\u0001\u0000\u0000\u0000\u001f"+
		"w\u0001\u0000\u0000\u0000!~\u0001\u0000\u0000\u0000#\u0080\u0001\u0000"+
		"\u0000\u0000%\u0082\u0001\u0000\u0000\u0000\'\u0086\u0001\u0000\u0000"+
		"\u0000)\u0089\u0001\u0000\u0000\u0000+\u0093\u0001\u0000\u0000\u0000-"+
		"\u0095\u0001\u0000\u0000\u0000/\u0098\u0001\u0000\u0000\u00001\u009c\u0001"+
		"\u0000\u0000\u00003\u00a0\u0001\u0000\u0000\u00005\u00ac\u0001\u0000\u0000"+
		"\u00007\u00bd\u0001\u0000\u0000\u00009\u00ee\u0001\u0000\u0000\u0000;"+
		"\u00f0\u0001\u0000\u0000\u0000=\u00ff\u0001\u0000\u0000\u0000?@\u0005"+
		"i\u0000\u0000@A\u0005n\u0000\u0000AB\u0005t\u0000\u0000B\u0002\u0001\u0000"+
		"\u0000\u0000CD\u0005d\u0000\u0000DE\u0005o\u0000\u0000EF\u0005u\u0000"+
		"\u0000FG\u0005b\u0000\u0000GH\u0005l\u0000\u0000HI\u0005e\u0000\u0000"+
		"I\u0004\u0001\u0000\u0000\u0000JK\u0005c\u0000\u0000KL\u0005h\u0000\u0000"+
		"LM\u0005a\u0000\u0000MN\u0005r\u0000\u0000N\u0006\u0001\u0000\u0000\u0000"+
		"OP\u0005-\u0000\u0000P\b\u0001\u0000\u0000\u0000QR\u0005[\u0000\u0000"+
		"R\n\u0001\u0000\u0000\u0000ST\u0005]\u0000\u0000T\f\u0001\u0000\u0000"+
		"\u0000UV\u0005.\u0000\u0000V\u000e\u0001\u0000\u0000\u0000WX\u0005a\u0000"+
		"\u0000XY\u0005s\u0000\u0000Y\u0010\u0001\u0000\u0000\u0000Z[\u0005i\u0000"+
		"\u0000[\\\u0005f\u0000\u0000\\\u0012\u0001\u0000\u0000\u0000]^\u0005p"+
		"\u0000\u0000^_\u0005u\u0000\u0000_`\u0005t\u0000\u0000`a\u0005s\u0000"+
		"\u0000a\u0014\u0001\u0000\u0000\u0000bc\u0005i\u0000\u0000cd\u0005n\u0000"+
		"\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0005=\u0000\u0000f\u0018\u0001"+
		"\u0000\u0000\u0000gh\u0005e\u0000\u0000hi\u0005l\u0000\u0000ij\u0005s"+
		"\u0000\u0000jk\u0005e\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005"+
		"w\u0000\u0000mn\u0005h\u0000\u0000no\u0005i\u0000\u0000op\u0005l\u0000"+
		"\u0000pq\u0005e\u0000\u0000q\u001c\u0001\u0000\u0000\u0000rs\u0005m\u0000"+
		"\u0000st\u0005a\u0000\u0000tu\u0005i\u0000\u0000uv\u0005n\u0000\u0000"+
		"v\u001e\u0001\u0000\u0000\u0000wx\u0005r\u0000\u0000xy\u0005e\u0000\u0000"+
		"yz\u0005t\u0000\u0000z{\u0005u\u0000\u0000{|\u0005r\u0000\u0000|}\u0005"+
		"n\u0000\u0000} \u0001\u0000\u0000\u0000~\u007f\u0005(\u0000\u0000\u007f"+
		"\"\u0001\u0000\u0000\u0000\u0080\u0081\u0005)\u0000\u0000\u0081$\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005d\u0000\u0000\u0083\u0084\u0005e\u0000"+
		"\u0000\u0084\u0085\u0005f\u0000\u0000\u0085&\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005:\u0000\u0000\u0087\u0088\u0005:\u0000\u0000\u0088(\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005d\u0000\u0000\u008a\u008b\u0005e\u0000"+
		"\u0000\u008b\u008c\u0005f\u0000\u0000\u008c\u008d\u0005s\u0000\u0000\u008d"+
		"\u008e\u0005t\u0000\u0000\u008e\u008f\u0005r\u0000\u0000\u008f\u0090\u0005"+
		"u\u0000\u0000\u0090\u0091\u0005c\u0000\u0000\u0091\u0092\u0005t\u0000"+
		"\u0000\u0092*\u0001\u0000\u0000\u0000\u0093\u0094\u0005,\u0000\u0000\u0094"+
		",\u0001\u0000\u0000\u0000\u0095\u0096\u0005d\u0000\u0000\u0096\u0097\u0005"+
		"o\u0000\u0000\u0097.\u0001\u0000\u0000\u0000\u0098\u0099\u0005e\u0000"+
		"\u0000\u0099\u009a\u0005n\u0000\u0000\u009a\u009b\u0005d\u0000\u0000\u009b"+
		"0\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0018\u0000\u0000\u009f2\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a4\u0005#\u0000\u0000\u00a1\u00a3\t\u0000"+
		"\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0007\u0001\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006\u0019"+
		"\u0000\u0000\u00ab4\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\"\u0000"+
		"\u0000\u00ad\u00ae\u0005\"\u0000\u0000\u00ae\u00af\u0005\"\u0000\u0000"+
		"\u00af\u00b3\u0001\u0000\u0000\u0000\u00b0\u00b2\t\u0000\u0000\u0000\u00b1"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005\"\u0000\u0000\u00b7\u00b8\u0005\"\u0000\u0000\u00b8\u00b9"+
		"\u0005\"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0006"+
		"\u001a\u0000\u0000\u00bb6\u0001\u0000\u0000\u0000\u00bc\u00be\u0007\u0002"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c08\u0001\u0000\u0000\u0000\u00c1\u00c3\u0007\u0002\u0000"+
		"\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00ca\u0005.\u0000\u0000"+
		"\u00c7\u00c9\u0007\u0002\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00d4\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005.\u0000\u0000\u00ce"+
		"\u00d0\u0007\u0002\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00d3\u00cd\u0001\u0000\u0000\u0000\u00d4"+
		"\u00de\u0001\u0000\u0000\u0000\u00d5\u00d7\u0007\u0003\u0000\u0000\u00d6"+
		"\u00d8\u0007\u0004\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0007\u0002\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de"+
		"\u00d5\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00ef\u0001\u0000\u0000\u0000\u00e0\u00e2\u0007\u0002\u0000\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0007\u0003\u0000\u0000\u00e6"+
		"\u00e8\u0007\u0004\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9"+
		"\u00eb\u0007\u0002\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee"+
		"\u00d3\u0001\u0000\u0000\u0000\u00ee\u00e1\u0001\u0000\u0000\u0000\u00ef"+
		":\u0001\u0000\u0000\u0000\u00f0\u00fb\u0005\'\u0000\u0000\u00f1\u00fc"+
		"\t\u0000\u0000\u0000\u00f2\u00f9\u0005\\\u0000\u0000\u00f3\u00f5\u0007"+
		"\u0002\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00fa\u0007"+
		"\u0005\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f1\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005\'\u0000\u0000\u00fe<\u0001\u0000"+
		"\u0000\u0000\u00ff\u0103\u0007\u0006\u0000\u0000\u0100\u0102\u0007\u0007"+
		"\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104>\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0014\u0000\u00a4\u00a8\u00b3\u00bf\u00c4\u00ca\u00d1\u00d3\u00d7"+
		"\u00dc\u00de\u00e3\u00e7\u00ec\u00ee\u00f6\u00f9\u00fb\u0103\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}