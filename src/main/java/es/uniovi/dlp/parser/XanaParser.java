// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaParser extends Parser {
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
  public static final int RULE_program = 0,
      RULE_main_def = 1,
      RULE_main_body = 2,
      RULE_func_def = 3,
      RULE_func_heading = 4,
      RULE_func_body = 5,
      RULE_param_list = 6,
      RULE_var_def = 7,
      RULE_var_type_def = 8,
      RULE_simple_type = 9,
      RULE_array_def_type = 10,
      RULE_struct_def_type = 11,
      RULE_statement = 12,
      RULE_func_invocation = 13,
      RULE_argument_list = 14,
      RULE_if_else = 15,
      RULE_while = 16,
      RULE_condition = 17,
      RULE_assignment = 18,
      RULE_puts = 19,
      RULE_in = 20,
      RULE_return = 21,
      RULE_expression = 22,
      RULE_simple_value = 23;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "main_def",
      "main_body",
      "func_def",
      "func_heading",
      "func_body",
      "param_list",
      "var_def",
      "var_type_def",
      "simple_type",
      "array_def_type",
      "struct_def_type",
      "statement",
      "func_invocation",
      "argument_list",
      "if_else",
      "while",
      "condition",
      "assignment",
      "puts",
      "in",
      "return",
      "expression",
      "simple_value"
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

  @Override
  public String getGrammarFileName() {
    return "java-escape";
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
  public ATN getATN() {
    return _ATN;
  }

  public XanaParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ProgramContext extends ParserRuleContext {
    public Main_defContext main_def() {
      return getRuleContext(Main_defContext.class, 0);
    }

    public List<Var_defContext> var_def() {
      return getRuleContexts(Var_defContext.class);
    }

    public Var_defContext var_def(int i) {
      return getRuleContext(Var_defContext.class, i);
    }

    public List<Func_defContext> func_def() {
      return getRuleContexts(Func_defContext.class);
    }

    public Func_defContext func_def(int i) {
      return getRuleContext(Func_defContext.class, i);
    }

    public ProgramContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_program;
    }
  }

  public final ProgramContext program() throws RecognitionException {
    ProgramContext _localctx = new ProgramContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_program);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(52);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              setState(50);
              _errHandler.sync(this);
              switch (_input.LA(1)) {
                case ID:
                  {
                    setState(48);
                    var_def();
                  }
                  break;
                case DEF:
                  {
                    setState(49);
                    func_def();
                  }
                  break;
                default:
                  throw new NoViableAltException(this);
              }
            }
          }
          setState(54);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        }
        setState(55);
        main_def();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Main_defContext extends ParserRuleContext {
    public TerminalNode DEF() {
      return getToken(XanaParser.DEF, 0);
    }

    public TerminalNode MAIN() {
      return getToken(XanaParser.MAIN, 0);
    }

    public TerminalNode ABRE_PARENTESIS() {
      return getToken(XanaParser.ABRE_PARENTESIS, 0);
    }

    public TerminalNode CIERRA_PARENTESIS() {
      return getToken(XanaParser.CIERRA_PARENTESIS, 0);
    }

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public Main_bodyContext main_body() {
      return getRuleContext(Main_bodyContext.class, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public Main_defContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_main_def;
    }
  }

  public final Main_defContext main_def() throws RecognitionException {
    Main_defContext _localctx = new Main_defContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_main_def);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(57);
        match(DEF);
        setState(58);
        match(MAIN);
        setState(59);
        match(ABRE_PARENTESIS);
        setState(60);
        match(CIERRA_PARENTESIS);
        setState(61);
        match(DO);
        setState(62);
        main_body();
        setState(63);
        match(END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Main_bodyContext extends ParserRuleContext {
    public List<Var_defContext> var_def() {
      return getRuleContexts(Var_defContext.class);
    }

    public Var_defContext var_def(int i) {
      return getRuleContext(Var_defContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public Main_bodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_main_body;
    }
  }

  public final Main_bodyContext main_body() throws RecognitionException {
    Main_bodyContext _localctx = new Main_bodyContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_main_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(69);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
          {
            setState(67);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
              case 1:
                {
                  setState(65);
                  var_def();
                }
                break;
              case 2:
                {
                  setState(66);
                  statement();
                }
                break;
            }
          }
          setState(71);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_defContext extends ParserRuleContext {
    public Func_headingContext func_heading() {
      return getRuleContext(Func_headingContext.class, 0);
    }

    public Func_bodyContext func_body() {
      return getRuleContext(Func_bodyContext.class, 0);
    }

    public Func_defContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_def;
    }
  }

  public final Func_defContext func_def() throws RecognitionException {
    Func_defContext _localctx = new Func_defContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_func_def);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(72);
        func_heading();
        setState(73);
        func_body();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_headingContext extends ParserRuleContext {
    public TerminalNode DEF() {
      return getToken(XanaParser.DEF, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public TerminalNode ABRE_PARENTESIS() {
      return getToken(XanaParser.ABRE_PARENTESIS, 0);
    }

    public Param_listContext param_list() {
      return getRuleContext(Param_listContext.class, 0);
    }

    public TerminalNode CIERRA_PARENTESIS() {
      return getToken(XanaParser.CIERRA_PARENTESIS, 0);
    }

    public TerminalNode DOS_PUNTOS() {
      return getToken(XanaParser.DOS_PUNTOS, 0);
    }

    public Simple_typeContext simple_type() {
      return getRuleContext(Simple_typeContext.class, 0);
    }

    public TerminalNode VOID() {
      return getToken(XanaParser.VOID, 0);
    }

    public Func_headingContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_heading;
    }
  }

  public final Func_headingContext func_heading() throws RecognitionException {
    Func_headingContext _localctx = new Func_headingContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_func_heading);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(75);
        match(DEF);
        setState(76);
        match(ID);
        setState(77);
        match(ABRE_PARENTESIS);
        setState(78);
        param_list();
        setState(79);
        match(CIERRA_PARENTESIS);
        setState(80);
        match(DOS_PUNTOS);
        setState(83);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case T__0:
          case T__1:
          case T__2:
            {
              setState(81);
              simple_type();
            }
            break;
          case VOID:
            {
              setState(82);
              match(VOID);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_bodyContext extends ParserRuleContext {
    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<Var_defContext> var_def() {
      return getRuleContexts(Var_defContext.class);
    }

    public Var_defContext var_def(int i) {
      return getRuleContext(Var_defContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public Func_bodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_body;
    }
  }

  public final Func_bodyContext func_body() throws RecognitionException {
    Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_func_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(85);
        match(DO);
        setState(90);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
          {
            setState(88);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
              case 1:
                {
                  setState(86);
                  var_def();
                }
                break;
              case 2:
                {
                  setState(87);
                  statement();
                }
                break;
            }
          }
          setState(92);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(93);
        match(END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Param_listContext extends ParserRuleContext {
    public List<Var_defContext> var_def() {
      return getRuleContexts(Var_defContext.class);
    }

    public Var_defContext var_def(int i) {
      return getRuleContext(Var_defContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(XanaParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(XanaParser.COMMA, i);
    }

    public Param_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_param_list;
    }
  }

  public final Param_listContext param_list() throws RecognitionException {
    Param_listContext _localctx = new Param_listContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_param_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(103);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ID) {
          {
            setState(95);
            var_def();
            setState(100);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
              {
                {
                  setState(96);
                  match(COMMA);
                  setState(97);
                  var_def();
                }
              }
              setState(102);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Var_defContext extends ParserRuleContext {
    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public TerminalNode DOS_PUNTOS() {
      return getToken(XanaParser.DOS_PUNTOS, 0);
    }

    public Var_type_defContext var_type_def() {
      return getRuleContext(Var_type_defContext.class, 0);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(XanaParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(XanaParser.COMMA, i);
    }

    public Var_defContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_var_def;
    }
  }

  public final Var_defContext var_def() throws RecognitionException {
    Var_defContext _localctx = new Var_defContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_var_def);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(105);
        match(ID);
        setState(110);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(106);
              match(COMMA);
              setState(107);
              match(ID);
            }
          }
          setState(112);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(113);
        match(DOS_PUNTOS);
        setState(114);
        var_type_def();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Var_type_defContext extends ParserRuleContext {
    public Simple_typeContext simple_type() {
      return getRuleContext(Simple_typeContext.class, 0);
    }

    public Array_def_typeContext array_def_type() {
      return getRuleContext(Array_def_typeContext.class, 0);
    }

    public Struct_def_typeContext struct_def_type() {
      return getRuleContext(Struct_def_typeContext.class, 0);
    }

    public Var_type_defContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_var_type_def;
    }
  }

  public final Var_type_defContext var_type_def() throws RecognitionException {
    Var_type_defContext _localctx = new Var_type_defContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_var_type_def);
    try {
      setState(119);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
        case T__1:
        case T__2:
          enterOuterAlt(_localctx, 1);
          {
            setState(116);
            simple_type();
          }
          break;
        case ABRE_CORCHETE:
          enterOuterAlt(_localctx, 2);
          {
            setState(117);
            array_def_type();
          }
          break;
        case DEFSTRUCT:
          enterOuterAlt(_localctx, 3);
          {
            setState(118);
            struct_def_type();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Simple_typeContext extends ParserRuleContext {
    public Simple_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_simple_type;
    }
  }

  public final Simple_typeContext simple_type() throws RecognitionException {
    Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_simple_type);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(121);
        _la = _input.LA(1);
        if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Array_def_typeContext extends ParserRuleContext {
    public TerminalNode ABRE_CORCHETE() {
      return getToken(XanaParser.ABRE_CORCHETE, 0);
    }

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TerminalNode DOS_PUNTOS() {
      return getToken(XanaParser.DOS_PUNTOS, 0);
    }

    public Var_type_defContext var_type_def() {
      return getRuleContext(Var_type_defContext.class, 0);
    }

    public TerminalNode CIERRA_CORCHETE() {
      return getToken(XanaParser.CIERRA_CORCHETE, 0);
    }

    public Array_def_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_array_def_type;
    }
  }

  public final Array_def_typeContext array_def_type() throws RecognitionException {
    Array_def_typeContext _localctx = new Array_def_typeContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_array_def_type);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(123);
        match(ABRE_CORCHETE);
        setState(124);
        match(INT_CONSTANT);
        setState(125);
        match(DOS_PUNTOS);
        setState(126);
        var_type_def();
        setState(127);
        match(CIERRA_CORCHETE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Struct_def_typeContext extends ParserRuleContext {
    public TerminalNode DEFSTRUCT() {
      return getToken(XanaParser.DEFSTRUCT, 0);
    }

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<Var_defContext> var_def() {
      return getRuleContexts(Var_defContext.class);
    }

    public Var_defContext var_def(int i) {
      return getRuleContext(Var_defContext.class, i);
    }

    public Struct_def_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_struct_def_type;
    }
  }

  public final Struct_def_typeContext struct_def_type() throws RecognitionException {
    Struct_def_typeContext _localctx = new Struct_def_typeContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_struct_def_type);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(129);
        match(DEFSTRUCT);
        setState(130);
        match(DO);
        setState(134);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(131);
              var_def();
            }
          }
          setState(136);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(137);
        match(END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class StatementContext extends ParserRuleContext {
    public Func_invocationContext func_invocation() {
      return getRuleContext(Func_invocationContext.class, 0);
    }

    public If_elseContext if_else() {
      return getRuleContext(If_elseContext.class, 0);
    }

    public WhileContext while_() {
      return getRuleContext(WhileContext.class, 0);
    }

    public AssignmentContext assignment() {
      return getRuleContext(AssignmentContext.class, 0);
    }

    public PutsContext puts() {
      return getRuleContext(PutsContext.class, 0);
    }

    public InContext in() {
      return getRuleContext(InContext.class, 0);
    }

    public ReturnContext return_() {
      return getRuleContext(ReturnContext.class, 0);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }
  }

  public final StatementContext statement() throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_statement);
    try {
      setState(146);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(139);
            func_invocation();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(140);
            if_else();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(141);
            while_();
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(142);
            assignment();
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(143);
            puts();
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(144);
            in();
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(145);
            return_();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_invocationContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public TerminalNode ABRE_PARENTESIS() {
      return getToken(XanaParser.ABRE_PARENTESIS, 0);
    }

    public Argument_listContext argument_list() {
      return getRuleContext(Argument_listContext.class, 0);
    }

    public TerminalNode CIERRA_PARENTESIS() {
      return getToken(XanaParser.CIERRA_PARENTESIS, 0);
    }

    public Func_invocationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_invocation;
    }
  }

  public final Func_invocationContext func_invocation() throws RecognitionException {
    Func_invocationContext _localctx = new Func_invocationContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_func_invocation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(148);
        match(ID);
        setState(149);
        match(ABRE_PARENTESIS);
        setState(150);
        argument_list();
        setState(151);
        match(CIERRA_PARENTESIS);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Argument_listContext extends ParserRuleContext {
    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(XanaParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(XanaParser.COMMA, i);
    }

    public Argument_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_argument_list;
    }
  }

  public final Argument_listContext argument_list() throws RecognitionException {
    Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_argument_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(161);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((_la) & ~0x3f) == 0 && ((1L << _la) & 65970699173888L) != 0) {
          {
            setState(153);
            expression(0);
            setState(158);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
              {
                {
                  setState(154);
                  match(COMMA);
                  setState(155);
                  expression(0);
                }
              }
              setState(160);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class If_elseContext extends ParserRuleContext {
    public TerminalNode IF() {
      return getToken(XanaParser.IF, 0);
    }

    public ConditionContext condition() {
      return getRuleContext(ConditionContext.class, 0);
    }

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public TerminalNode ELSE() {
      return getToken(XanaParser.ELSE, 0);
    }

    public If_elseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_if_else;
    }
  }

  public final If_elseContext if_else() throws RecognitionException {
    If_elseContext _localctx = new If_elseContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_if_else);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(163);
        match(IF);
        setState(164);
        condition();
        setState(165);
        match(DO);
        setState(169);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
          {
            {
              setState(166);
              statement();
            }
          }
          setState(171);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(179);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ELSE) {
          {
            setState(172);
            match(ELSE);
            setState(176);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
              {
                {
                  setState(173);
                  statement();
                }
              }
              setState(178);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        setState(181);
        match(END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class WhileContext extends ParserRuleContext {
    public TerminalNode WHILE() {
      return getToken(XanaParser.WHILE, 0);
    }

    public ConditionContext condition() {
      return getRuleContext(ConditionContext.class, 0);
    }

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public WhileContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_while;
    }
  }

  public final WhileContext while_() throws RecognitionException {
    WhileContext _localctx = new WhileContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_while);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(183);
        match(WHILE);
        setState(184);
        condition();
        setState(185);
        match(DO);
        setState(189);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
          {
            {
              setState(186);
              statement();
            }
          }
          setState(191);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(192);
        match(END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ConditionContext extends ParserRuleContext {
    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public ConditionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_condition;
    }
  }

  public final ConditionContext condition() throws RecognitionException {
    ConditionContext _localctx = new ConditionContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_condition);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(194);
        expression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AssignmentContext extends ParserRuleContext {
    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode IGUAL() {
      return getToken(XanaParser.IGUAL, 0);
    }

    public AssignmentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignment;
    }
  }

  public final AssignmentContext assignment() throws RecognitionException {
    AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_assignment);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(196);
        expression(0);
        setState(197);
        match(IGUAL);
        {
          setState(198);
          expression(0);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PutsContext extends ParserRuleContext {
    public TerminalNode PUTS() {
      return getToken(XanaParser.PUTS, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(XanaParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(XanaParser.COMMA, i);
    }

    public PutsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_puts;
    }
  }

  public final PutsContext puts() throws RecognitionException {
    PutsContext _localctx = new PutsContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_puts);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(200);
        match(PUTS);
        setState(201);
        expression(0);
        setState(206);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(202);
              match(COMMA);
              setState(203);
              expression(0);
            }
          }
          setState(208);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class InContext extends ParserRuleContext {
    public TerminalNode IN() {
      return getToken(XanaParser.IN, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(XanaParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(XanaParser.COMMA, i);
    }

    public InContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_in;
    }
  }

  public final InContext in() throws RecognitionException {
    InContext _localctx = new InContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_in);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(209);
        match(IN);
        setState(210);
        expression(0);
        setState(215);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(211);
              match(COMMA);
              setState(212);
              expression(0);
            }
          }
          setState(217);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ReturnContext extends ParserRuleContext {
    public TerminalNode RETURN() {
      return getToken(XanaParser.RETURN, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public ReturnContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_return;
    }
  }

  public final ReturnContext return_() throws RecognitionException {
    ReturnContext _localctx = new ReturnContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_return);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(218);
        match(RETURN);
        setState(220);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
          case 1:
            {
              setState(219);
              expression(0);
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionContext extends ParserRuleContext {
    public Simple_valueContext simple_value() {
      return getRuleContext(Simple_valueContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public Func_invocationContext func_invocation() {
      return getRuleContext(Func_invocationContext.class, 0);
    }

    public TerminalNode ABRE_PARENTESIS() {
      return getToken(XanaParser.ABRE_PARENTESIS, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode CIERRA_PARENTESIS() {
      return getToken(XanaParser.CIERRA_PARENTESIS, 0);
    }

    public TerminalNode ABRE_CORCHETE() {
      return getToken(XanaParser.ABRE_CORCHETE, 0);
    }

    public TerminalNode CIERRA_CORCHETE() {
      return getToken(XanaParser.CIERRA_CORCHETE, 0);
    }

    public TerminalNode MINUS() {
      return getToken(XanaParser.MINUS, 0);
    }

    public TerminalNode NOT() {
      return getToken(XanaParser.NOT, 0);
    }

    public TerminalNode DOT() {
      return getToken(XanaParser.DOT, 0);
    }

    public TerminalNode AS() {
      return getToken(XanaParser.AS, 0);
    }

    public Simple_typeContext simple_type() {
      return getRuleContext(Simple_typeContext.class, 0);
    }

    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression;
    }
  }

  public final ExpressionContext expression() throws RecognitionException {
    return expression(0);
  }

  private ExpressionContext expression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
    ExpressionContext _prevctx = _localctx;
    int _startState = 44;
    enterRecursionRule(_localctx, 44, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(238);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
          case 1:
            {
              setState(223);
              simple_value();
            }
            break;
          case 2:
            {
              setState(224);
              match(ID);
            }
            break;
          case 3:
            {
              setState(225);
              func_invocation();
            }
            break;
          case 4:
            {
              setState(226);
              match(ABRE_PARENTESIS);
              setState(227);
              expression(0);
              setState(228);
              match(CIERRA_PARENTESIS);
            }
            break;
          case 5:
            {
              setState(230);
              match(ABRE_CORCHETE);
              setState(231);
              expression(0);
              setState(232);
              match(CIERRA_CORCHETE);
            }
            break;
          case 6:
            {
              setState(234);
              match(MINUS);
              setState(235);
              expression(6);
            }
            break;
          case 7:
            {
              setState(236);
              match(NOT);
              setState(237);
              expression(5);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(267);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(265);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                case 1:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(240);
                    if (!(precpred(_ctx, 8)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                    setState(241);
                    match(DOT);
                    setState(242);
                    expression(9);
                  }
                  break;
                case 2:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(243);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(244);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(245);
                    expression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(246);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(247);
                    _la = _input.LA(1);
                    if (!(_la == T__6 || _la == MINUS)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(248);
                    expression(4);
                  }
                  break;
                case 4:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(249);
                    if (!(precpred(_ctx, 2)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                    setState(250);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(251);
                    expression(3);
                  }
                  break;
                case 5:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(252);
                    if (!(precpred(_ctx, 1)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                    setState(253);
                    _la = _input.LA(1);
                    if (!(_la == T__13 || _la == T__14)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(254);
                    expression(2);
                  }
                  break;
                case 6:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(255);
                    if (!(precpred(_ctx, 9)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                    setState(256);
                    match(ABRE_CORCHETE);
                    setState(257);
                    expression(0);
                    setState(258);
                    match(CIERRA_CORCHETE);
                    {
                      setState(260);
                      _errHandler.sync(this);
                      switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                        case 1:
                          {
                            setState(259);
                            expression(0);
                          }
                          break;
                      }
                    }
                  }
                  break;
                case 7:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(262);
                    if (!(precpred(_ctx, 7)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                    setState(263);
                    match(AS);
                    setState(264);
                    simple_type();
                  }
                  break;
              }
            }
          }
          setState(269);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Simple_valueContext extends ParserRuleContext {
    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TerminalNode CHAR_CONSTANT() {
      return getToken(XanaParser.CHAR_CONSTANT, 0);
    }

    public TerminalNode REAL_CONSTANT() {
      return getToken(XanaParser.REAL_CONSTANT, 0);
    }

    public Simple_valueContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_simple_value;
    }
  }

  public final Simple_valueContext simple_value() throws RecognitionException {
    Simple_valueContext _localctx = new Simple_valueContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_simple_value);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(270);
        _la = _input.LA(1);
        if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 22:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 8);
      case 1:
        return precpred(_ctx, 4);
      case 2:
        return precpred(_ctx, 3);
      case 3:
        return precpred(_ctx, 2);
      case 4:
        return precpred(_ctx, 1);
      case 5:
        return precpred(_ctx, 9);
      case 6:
        return precpred(_ctx, 7);
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u0001-\u0111\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
          + "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"
          + "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"
          + "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"
          + "\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002"
          + "\n\u0002\f\u0002G\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"
          + "\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0005\u0005Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0001\u0005\u0001\u0005"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006c\b\u0006\n\u0006\f\u0006"
          + "f\t\u0006\u0003\u0006h\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"
          + "\u0007m\b\u0007\n\u0007\f\u0007p\t\u0007\u0001\u0007\u0001\u0007\u0001"
          + "\u0007\u0001\b\u0001\b\u0001\b\u0003\bx\b\b\u0001\t\u0001\t\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"
          + "\u0005\u000b\u0085\b\u000b\n\u000b\f\u000b\u0088\t\u000b\u0001\u000b\u0001"
          + "\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"
          + "\u0093\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"
          + "\u0001\u000e\u0005\u000e\u009d\b\u000e\n\u000e\f\u000e\u00a0\t\u000e\u0003"
          + "\u000e\u00a2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"
          + "\u000f\u00a8\b\u000f\n\u000f\f\u000f\u00ab\t\u000f\u0001\u000f\u0001\u000f"
          + "\u0005\u000f\u00af\b\u000f\n\u000f\f\u000f\u00b2\t\u000f\u0003\u000f\u00b4"
          + "\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"
          + "\u0010\u0005\u0010\u00bc\b\u0010\n\u0010\f\u0010\u00bf\t\u0010\u0001\u0010"
          + "\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"
          + "\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"
          + "\u00cd\b\u0013\n\u0013\f\u0013\u00d0\t\u0013\u0001\u0014\u0001\u0014\u0001"
          + "\u0014\u0001\u0014\u0005\u0014\u00d6\b\u0014\n\u0014\f\u0014\u00d9\t\u0014"
          + "\u0001\u0015\u0001\u0015\u0003\u0015\u00dd\b\u0015\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0003\u0016\u00ef\b\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0003\u0016\u0105\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"
          + "\u010a\b\u0016\n\u0016\f\u0016\u010d\t\u0016\u0001\u0017\u0001\u0017\u0001"
          + "\u0017\u0000\u0001,\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"
          + "\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0006\u0001\u0000"
          + "\u0001\u0003\u0001\u0000\u0004\u0006\u0002\u0000\u0007\u0007\u0010\u0010"
          + "\u0001\u0000\b\r\u0001\u0000\u000e\u000f\u0001\u0000*,\u0122\u00004\u0001"
          + "\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000"
          + "\u0000\u0006H\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\nU\u0001"
          + "\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000"
          + "\u0000\u0010w\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014"
          + "{\u0001\u0000\u0000\u0000\u0016\u0081\u0001\u0000\u0000\u0000\u0018\u0092"
          + "\u0001\u0000\u0000\u0000\u001a\u0094\u0001\u0000\u0000\u0000\u001c\u00a1"
          + "\u0001\u0000\u0000\u0000\u001e\u00a3\u0001\u0000\u0000\u0000 \u00b7\u0001"
          + "\u0000\u0000\u0000\"\u00c2\u0001\u0000\u0000\u0000$\u00c4\u0001\u0000"
          + "\u0000\u0000&\u00c8\u0001\u0000\u0000\u0000(\u00d1\u0001\u0000\u0000\u0000"
          + "*\u00da\u0001\u0000\u0000\u0000,\u00ee\u0001\u0000\u0000\u0000.\u010e"
          + "\u0001\u0000\u0000\u000003\u0003\u000e\u0007\u000013\u0003\u0006\u0003"
          + "\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000"
          + "\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001"
          + "\u0000\u0000\u000064\u0001\u0000\u0000\u000078\u0003\u0002\u0001\u0000"
          + "8\u0001\u0001\u0000\u0000\u00009:\u0005\u001f\u0000\u0000:;\u0005 \u0000"
          + "\u0000;<\u0005\u0014\u0000\u0000<=\u0005\u0015\u0000\u0000=>\u0005%\u0000"
          + "\u0000>?\u0003\u0004\u0002\u0000?@\u0005&\u0000\u0000@\u0003\u0001\u0000"
          + "\u0000\u0000AD\u0003\u000e\u0007\u0000BD\u0003\u0018\f\u0000CA\u0001\u0000"
          + "\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"
          + "\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000"
          + "\u0000GE\u0001\u0000\u0000\u0000HI\u0003\b\u0004\u0000IJ\u0003\n\u0005"
          + "\u0000J\u0007\u0001\u0000\u0000\u0000KL\u0005\u001f\u0000\u0000LM\u0005"
          + "-\u0000\u0000MN\u0005\u0014\u0000\u0000NO\u0003\f\u0006\u0000OP\u0005"
          + "\u0015\u0000\u0000PS\u0005\"\u0000\u0000QT\u0003\u0012\t\u0000RT\u0005"
          + "\u0016\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"
          + "T\t\u0001\u0000\u0000\u0000UZ\u0005%\u0000\u0000VY\u0003\u000e\u0007\u0000"
          + "WY\u0003\u0018\f\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000"
          + "Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"
          + "\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005&\u0000"
          + "\u0000^\u000b\u0001\u0000\u0000\u0000_d\u0003\u000e\u0007\u0000`a\u0005"
          + "$\u0000\u0000ac\u0003\u000e\u0007\u0000b`\u0001\u0000\u0000\u0000cf\u0001"
          + "\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"
          + "eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000g_\u0001\u0000\u0000"
          + "\u0000gh\u0001\u0000\u0000\u0000h\r\u0001\u0000\u0000\u0000in\u0005-\u0000"
          + "\u0000jk\u0005$\u0000\u0000km\u0005-\u0000\u0000lj\u0001\u0000\u0000\u0000"
          + "mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"
          + "\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\"\u0000"
          + "\u0000rs\u0003\u0010\b\u0000s\u000f\u0001\u0000\u0000\u0000tx\u0003\u0012"
          + "\t\u0000ux\u0003\u0014\n\u0000vx\u0003\u0016\u000b\u0000wt\u0001\u0000"
          + "\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0011"
          + "\u0001\u0000\u0000\u0000yz\u0007\u0000\u0000\u0000z\u0013\u0001\u0000"
          + "\u0000\u0000{|\u0005\u0012\u0000\u0000|}\u0005*\u0000\u0000}~\u0005\""
          + "\u0000\u0000~\u007f\u0003\u0010\b\u0000\u007f\u0080\u0005\u0013\u0000"
          + "\u0000\u0080\u0015\u0001\u0000\u0000\u0000\u0081\u0082\u0005#\u0000\u0000"
          + "\u0082\u0086\u0005%\u0000\u0000\u0083\u0085\u0003\u000e\u0007\u0000\u0084"
          + "\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"
          + "\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"
          + "\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"
          + "\u008a\u0005&\u0000\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u0093"
          + "\u0003\u001a\r\u0000\u008c\u0093\u0003\u001e\u000f\u0000\u008d\u0093\u0003"
          + " \u0010\u0000\u008e\u0093\u0003$\u0012\u0000\u008f\u0093\u0003&\u0013"
          + "\u0000\u0090\u0093\u0003(\u0014\u0000\u0091\u0093\u0003*\u0015\u0000\u0092"
          + "\u008b\u0001\u0000\u0000\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092"
          + "\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092"
          + "\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"
          + "\u0091\u0001\u0000\u0000\u0000\u0093\u0019\u0001\u0000\u0000\u0000\u0094"
          + "\u0095\u0005-\u0000\u0000\u0095\u0096\u0005\u0014\u0000\u0000\u0096\u0097"
          + "\u0003\u001c\u000e\u0000\u0097\u0098\u0005\u0015\u0000\u0000\u0098\u001b"
          + "\u0001\u0000\u0000\u0000\u0099\u009e\u0003,\u0016\u0000\u009a\u009b\u0005"
          + "$\u0000\u0000\u009b\u009d\u0003,\u0016\u0000\u009c\u009a\u0001\u0000\u0000"
          + "\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"
          + "\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000"
          + "\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u0099\u0001\u0000\u0000"
          + "\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u001d\u0001\u0000\u0000"
          + "\u0000\u00a3\u00a4\u0005\u0019\u0000\u0000\u00a4\u00a5\u0003\"\u0011\u0000"
          + "\u00a5\u00a9\u0005%\u0000\u0000\u00a6\u00a8\u0003\u0018\f\u0000\u00a7"
          + "\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9"
          + "\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"
          + "\u00b3\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"
          + "\u00b0\u0005\u001a\u0000\u0000\u00ad\u00af\u0003\u0018\f\u0000\u00ae\u00ad"
          + "\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"
          + "\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4"
          + "\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00ac"
          + "\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"
          + "\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005&\u0000\u0000\u00b6\u001f\u0001"
          + "\u0000\u0000\u0000\u00b7\u00b8\u0005\u001b\u0000\u0000\u00b8\u00b9\u0003"
          + "\"\u0011\u0000\u00b9\u00bd\u0005%\u0000\u0000\u00ba\u00bc\u0003\u0018"
          + "\f\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"
          + "\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"
          + "\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"
          + "\u0000\u00c0\u00c1\u0005&\u0000\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2"
          + "\u00c3\u0003,\u0016\u0000\u00c3#\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"
          + ",\u0016\u0000\u00c5\u00c6\u0005\u001e\u0000\u0000\u00c6\u00c7\u0003,\u0016"
          + "\u0000\u00c7%\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u001c\u0000\u0000"
          + "\u00c9\u00ce\u0003,\u0016\u0000\u00ca\u00cb\u0005$\u0000\u0000\u00cb\u00cd"
          + "\u0003,\u0016\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001"
          + "\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"
          + "\u0000\u0000\u0000\u00cf\'\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"
          + "\u0000\u0000\u00d1\u00d2\u0005\u001d\u0000\u0000\u00d2\u00d7\u0003,\u0016"
          + "\u0000\u00d3\u00d4\u0005$\u0000\u0000\u00d4\u00d6\u0003,\u0016\u0000\u00d5"
          + "\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7"
          + "\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"
          + ")\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dc"
          + "\u0005!\u0000\u0000\u00db\u00dd\u0003,\u0016\u0000\u00dc\u00db\u0001\u0000"
          + "\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd+\u0001\u0000\u0000"
          + "\u0000\u00de\u00df\u0006\u0016\uffff\uffff\u0000\u00df\u00ef\u0003.\u0017"
          + "\u0000\u00e0\u00ef\u0005-\u0000\u0000\u00e1\u00ef\u0003\u001a\r\u0000"
          + "\u00e2\u00e3\u0005\u0014\u0000\u0000\u00e3\u00e4\u0003,\u0016\u0000\u00e4"
          + "\u00e5\u0005\u0015\u0000\u0000\u00e5\u00ef\u0001\u0000\u0000\u0000\u00e6"
          + "\u00e7\u0005\u0012\u0000\u0000\u00e7\u00e8\u0003,\u0016\u0000\u00e8\u00e9"
          + "\u0005\u0013\u0000\u0000\u00e9\u00ef\u0001\u0000\u0000\u0000\u00ea\u00eb"
          + "\u0005\u0010\u0000\u0000\u00eb\u00ef\u0003,\u0016\u0006\u00ec\u00ed\u0005"
          + "\u0011\u0000\u0000\u00ed\u00ef\u0003,\u0016\u0005\u00ee\u00de\u0001\u0000"
          + "\u0000\u0000\u00ee\u00e0\u0001\u0000\u0000\u0000\u00ee\u00e1\u0001\u0000"
          + "\u0000\u0000\u00ee\u00e2\u0001\u0000\u0000\u0000\u00ee\u00e6\u0001\u0000"
          + "\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"
          + "\u0000\u0000\u00ef\u010b\u0001\u0000\u0000\u0000\u00f0\u00f1\n\b\u0000"
          + "\u0000\u00f1\u00f2\u0005\u0017\u0000\u0000\u00f2\u010a\u0003,\u0016\t"
          + "\u00f3\u00f4\n\u0004\u0000\u0000\u00f4\u00f5\u0007\u0001\u0000\u0000\u00f5"
          + "\u010a\u0003,\u0016\u0005\u00f6\u00f7\n\u0003\u0000\u0000\u00f7\u00f8"
          + "\u0007\u0002\u0000\u0000\u00f8\u010a\u0003,\u0016\u0004\u00f9\u00fa\n"
          + "\u0002\u0000\u0000\u00fa\u00fb\u0007\u0003\u0000\u0000\u00fb\u010a\u0003"
          + ",\u0016\u0003\u00fc\u00fd\n\u0001\u0000\u0000\u00fd\u00fe\u0007\u0004"
          + "\u0000\u0000\u00fe\u010a\u0003,\u0016\u0002\u00ff\u0100\n\t\u0000\u0000"
          + "\u0100\u0101\u0005\u0012\u0000\u0000\u0101\u0102\u0003,\u0016\u0000\u0102"
          + "\u0104\u0005\u0013\u0000\u0000\u0103\u0105\u0003,\u0016\u0000\u0104\u0103"
          + "\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u010a"
          + "\u0001\u0000\u0000\u0000\u0106\u0107\n\u0007\u0000\u0000\u0107\u0108\u0005"
          + "\u0018\u0000\u0000\u0108\u010a\u0003\u0012\t\u0000\u0109\u00f0\u0001\u0000"
          + "\u0000\u0000\u0109\u00f3\u0001\u0000\u0000\u0000\u0109\u00f6\u0001\u0000"
          + "\u0000\u0000\u0109\u00f9\u0001\u0000\u0000\u0000\u0109\u00fc\u0001\u0000"
          + "\u0000\u0000\u0109\u00ff\u0001\u0000\u0000\u0000\u0109\u0106\u0001\u0000"
          + "\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"
          + "\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c-\u0001\u0000\u0000"
          + "\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0007\u0005\u0000"
          + "\u0000\u010f/\u0001\u0000\u0000\u0000\u001a24CESXZdgnw\u0086\u0092\u009e"
          + "\u00a1\u00a9\u00b0\u00b3\u00bd\u00ce\u00d7\u00dc\u00ee\u0104\u0109\u010b";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
