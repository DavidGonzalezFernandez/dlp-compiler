// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.expressions.subexpressions.*;
import es.uniovi.dlp.ast.program.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.statement.substatements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.types.subtypes.*;
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
      RULE_assignment = 17,
      RULE_puts = 18,
      RULE_in = 19,
      RULE_return = 20,
      RULE_expression = 21,
      RULE_simple_value = 22;

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
        setState(50);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              setState(48);
              _errHandler.sync(this);
              switch (_input.LA(1)) {
                case ID:
                  {
                    setState(46);
                    var_def();
                  }
                  break;
                case DEF:
                  {
                    setState(47);
                    func_def();
                  }
                  break;
                default:
                  throw new NoViableAltException(this);
              }
            }
          }
          setState(52);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        }
        setState(53);
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
        setState(55);
        match(DEF);
        setState(56);
        match(MAIN);
        setState(57);
        match(ABRE_PARENTESIS);
        setState(58);
        match(CIERRA_PARENTESIS);
        setState(59);
        match(DO);
        setState(60);
        main_body();
        setState(61);
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
        setState(67);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
          {
            setState(65);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
              case 1:
                {
                  setState(63);
                  var_def();
                }
                break;
              case 2:
                {
                  setState(64);
                  statement();
                }
                break;
            }
          }
          setState(69);
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
        setState(70);
        func_heading();
        setState(71);
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
        setState(73);
        match(DEF);
        setState(74);
        match(ID);
        setState(75);
        match(ABRE_PARENTESIS);
        setState(76);
        param_list();
        setState(77);
        match(CIERRA_PARENTESIS);
        setState(78);
        match(DOS_PUNTOS);
        setState(81);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case T__0:
          case T__1:
          case T__2:
            {
              setState(79);
              simple_type();
            }
            break;
          case VOID:
            {
              setState(80);
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
        setState(83);
        match(DO);
        setState(88);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
          {
            setState(86);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
              case 1:
                {
                  setState(84);
                  var_def();
                }
                break;
              case 2:
                {
                  setState(85);
                  statement();
                }
                break;
            }
          }
          setState(90);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(91);
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
        setState(101);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ID) {
          {
            setState(93);
            var_def();
            setState(98);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
              {
                {
                  setState(94);
                  match(COMMA);
                  setState(95);
                  var_def();
                }
              }
              setState(100);
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
        setState(103);
        match(ID);
        setState(108);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(104);
              match(COMMA);
              setState(105);
              match(ID);
            }
          }
          setState(110);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(111);
        match(DOS_PUNTOS);
        setState(112);
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
    public Type myType;
    public Simple_typeContext simple_type;
    public Array_def_typeContext array_def_type;
    public Struct_def_typeContext struct_def_type;

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
      setState(123);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
        case T__1:
        case T__2:
          enterOuterAlt(_localctx, 1);
          {
            setState(114);
            ((Var_type_defContext) _localctx).simple_type = simple_type();
            ((Var_type_defContext) _localctx).myType =
                ((Var_type_defContext) _localctx).simple_type.myType;
          }
          break;
        case ABRE_CORCHETE:
          enterOuterAlt(_localctx, 2);
          {
            setState(117);
            ((Var_type_defContext) _localctx).array_def_type = array_def_type();
            ((Var_type_defContext) _localctx).myType =
                ((Var_type_defContext) _localctx).array_def_type.myType;
          }
          break;
        case DEFSTRUCT:
          enterOuterAlt(_localctx, 3);
          {
            setState(120);
            ((Var_type_defContext) _localctx).struct_def_type = struct_def_type();
            ((Var_type_defContext) _localctx).myType =
                ((Var_type_defContext) _localctx).struct_def_type.myType;
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
    public Type myType;
    public Token t;

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
    try {
      setState(131);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
          enterOuterAlt(_localctx, 1);
          {
            setState(125);
            ((Simple_typeContext) _localctx).t = match(T__0);
            ((Simple_typeContext) _localctx).myType =
                new IntType(
                    ((Simple_typeContext) _localctx).t.getLine(),
                    ((Simple_typeContext) _localctx).t.getCharPositionInLine() + 1);
          }
          break;
        case T__1:
          enterOuterAlt(_localctx, 2);
          {
            setState(127);
            ((Simple_typeContext) _localctx).t = match(T__1);
            ((Simple_typeContext) _localctx).myType =
                new DoubleType(
                    ((Simple_typeContext) _localctx).t.getLine(),
                    ((Simple_typeContext) _localctx).t.getCharPositionInLine() + 1);
          }
          break;
        case T__2:
          enterOuterAlt(_localctx, 3);
          {
            setState(129);
            ((Simple_typeContext) _localctx).t = match(T__2);
            ((Simple_typeContext) _localctx).myType =
                new CharType(
                    ((Simple_typeContext) _localctx).t.getLine(),
                    ((Simple_typeContext) _localctx).t.getCharPositionInLine() + 1);
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
  public static class Array_def_typeContext extends ParserRuleContext {
    public Type myType;
    public Token ABRE_CORCHETE;

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
        setState(133);
        ((Array_def_typeContext) _localctx).ABRE_CORCHETE = match(ABRE_CORCHETE);
        setState(134);
        match(INT_CONSTANT);
        setState(135);
        match(DOS_PUNTOS);
        setState(136);
        var_type_def();
        setState(137);
        match(CIERRA_CORCHETE);
        ((Array_def_typeContext) _localctx).myType =
            new ArrayType(
                ((Array_def_typeContext) _localctx).ABRE_CORCHETE.getLine(),
                ((Array_def_typeContext) _localctx).ABRE_CORCHETE.getCharPositionInLine() + 1);
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
    public Type myType;
    public Token DEFSTRUCT;

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
        setState(140);
        ((Struct_def_typeContext) _localctx).DEFSTRUCT = match(DEFSTRUCT);
        setState(141);
        match(DO);
        setState(145);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(142);
              var_def();
            }
          }
          setState(147);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(148);
        match(END);
        ((Struct_def_typeContext) _localctx).myType =
            new StructType(
                ((Struct_def_typeContext) _localctx).DEFSTRUCT.getLine(),
                ((Struct_def_typeContext) _localctx).DEFSTRUCT.getCharPositionInLine() + 1);
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
      setState(158);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(151);
            func_invocation();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(152);
            if_else();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(153);
            while_();
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(154);
            assignment();
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(155);
            puts();
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(156);
            in();
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(157);
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
        setState(160);
        match(ID);
        setState(161);
        match(ABRE_PARENTESIS);
        setState(162);
        argument_list();
        setState(163);
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
        setState(173);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((_la) & ~0x3f) == 0 && ((1L << _la) & 65970699173888L) != 0) {
          {
            setState(165);
            expression(0);
            setState(170);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
              {
                {
                  setState(166);
                  match(COMMA);
                  setState(167);
                  expression(0);
                }
              }
              setState(172);
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

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
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
        setState(175);
        match(IF);
        setState(176);
        expression(0);
        setState(177);
        match(DO);
        setState(181);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
          {
            {
              setState(178);
              statement();
            }
          }
          setState(183);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(191);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ELSE) {
          {
            setState(184);
            match(ELSE);
            setState(188);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
              {
                {
                  setState(185);
                  statement();
                }
              }
              setState(190);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        setState(193);
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

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
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
        setState(195);
        match(WHILE);
        setState(196);
        expression(0);
        setState(197);
        match(DO);
        setState(201);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980262187008L) != 0) {
          {
            {
              setState(198);
              statement();
            }
          }
          setState(203);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(204);
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
  public static class AssignmentContext extends ParserRuleContext {
    public ExpressionContext leftExp;
    public ExpressionContext rightExp;

    public TerminalNode IGUAL() {
      return getToken(XanaParser.IGUAL, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
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
    enterRule(_localctx, 34, RULE_assignment);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(206);
        ((AssignmentContext) _localctx).leftExp = expression(0);
        setState(207);
        match(IGUAL);
        setState(208);
        ((AssignmentContext) _localctx).rightExp = expression(0);
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
    enterRule(_localctx, 36, RULE_puts);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(210);
        match(PUTS);
        setState(211);
        expression(0);
        setState(216);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(212);
              match(COMMA);
              setState(213);
              expression(0);
            }
          }
          setState(218);
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
    enterRule(_localctx, 38, RULE_in);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(219);
        match(IN);
        setState(220);
        expression(0);
        setState(225);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(221);
              match(COMMA);
              setState(222);
              expression(0);
            }
          }
          setState(227);
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
    enterRule(_localctx, 40, RULE_return);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(228);
        match(RETURN);
        setState(230);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
          case 1:
            {
              setState(229);
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
    public ExpressionContext leftExpresion;
    public ExpressionContext rightExpression;

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
    int _startState = 42;
    enterRecursionRule(_localctx, 42, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(248);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
          case 1:
            {
              setState(233);
              simple_value();
            }
            break;
          case 2:
            {
              setState(234);
              match(ID);
            }
            break;
          case 3:
            {
              setState(235);
              func_invocation();
            }
            break;
          case 4:
            {
              setState(236);
              match(ABRE_PARENTESIS);
              setState(237);
              expression(0);
              setState(238);
              match(CIERRA_PARENTESIS);
            }
            break;
          case 5:
            {
              setState(240);
              match(ABRE_CORCHETE);
              setState(241);
              expression(0);
              setState(242);
              match(CIERRA_CORCHETE);
            }
            break;
          case 6:
            {
              setState(244);
              match(MINUS);
              setState(245);
              expression(6);
            }
            break;
          case 7:
            {
              setState(246);
              match(NOT);
              setState(247);
              expression(5);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(277);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(275);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                case 1:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(250);
                    if (!(precpred(_ctx, 8)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                    setState(251);
                    match(DOT);
                    setState(252);
                    expression(9);
                  }
                  break;
                case 2:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpresion = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(253);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(254);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(255);
                    ((ExpressionContext) _localctx).rightExpression = expression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpresion = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(256);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(257);
                    _la = _input.LA(1);
                    if (!(_la == T__6 || _la == MINUS)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(258);
                    ((ExpressionContext) _localctx).rightExpression = expression(4);
                  }
                  break;
                case 4:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpresion = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(259);
                    if (!(precpred(_ctx, 2)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                    setState(260);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(261);
                    ((ExpressionContext) _localctx).rightExpression = expression(3);
                  }
                  break;
                case 5:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpresion = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(262);
                    if (!(precpred(_ctx, 1)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                    setState(263);
                    _la = _input.LA(1);
                    if (!(_la == T__13 || _la == T__14)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(264);
                    ((ExpressionContext) _localctx).rightExpression = expression(2);
                  }
                  break;
                case 6:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(265);
                    if (!(precpred(_ctx, 9)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                    setState(266);
                    match(ABRE_CORCHETE);
                    setState(267);
                    expression(0);
                    setState(268);
                    match(CIERRA_CORCHETE);
                    {
                      setState(270);
                      _errHandler.sync(this);
                      switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                        case 1:
                          {
                            setState(269);
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
                    setState(272);
                    if (!(precpred(_ctx, 7)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                    setState(273);
                    match(AS);
                    setState(274);
                    simple_type();
                  }
                  break;
              }
            }
          }
          setState(279);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
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
    enterRule(_localctx, 44, RULE_simple_value);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(280);
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
      case 21:
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
      "\u0004\u0001-\u011b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
          + "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"
          + "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"
          + "\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"
          + "\n\u0000\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002"
          + "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"
          + "R\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005W\b\u0005\n\u0005"
          + "\f\u0005Z\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"
          + "\u0006\u0005\u0006a\b\u0006\n\u0006\f\u0006d\t\u0006\u0003\u0006f\b\u0006"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007k\b\u0007\n\u0007\f\u0007"
          + "n\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"
          + "\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b|\b\b\u0001\t"
          + "\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0084\b\t\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"
          + "\u000b\u0005\u000b\u0090\b\u000b\n\u000b\f\u000b\u0093\t\u000b\u0001\u000b"
          + "\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0003\f\u009f\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"
          + "\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a9\b\u000e\n\u000e\f\u000e"
          + "\u00ac\t\u000e\u0003\u000e\u00ae\b\u000e\u0001\u000f\u0001\u000f\u0001"
          + "\u000f\u0001\u000f\u0005\u000f\u00b4\b\u000f\n\u000f\f\u000f\u00b7\t\u000f"
          + "\u0001\u000f\u0001\u000f\u0005\u000f\u00bb\b\u000f\n\u000f\f\u000f\u00be"
          + "\t\u000f\u0003\u000f\u00c0\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"
          + "\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c8\b\u0010\n\u0010"
          + "\f\u0010\u00cb\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"
          + "\u0005\u0012\u00d7\b\u0012\n\u0012\f\u0012\u00da\t\u0012\u0001\u0013\u0001"
          + "\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00e0\b\u0013\n\u0013\f\u0013"
          + "\u00e3\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00e7\b\u0014\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f9\b\u0015\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"
          + "\u0015\u0001\u0015\u0003\u0015\u010f\b\u0015\u0001\u0015\u0001\u0015\u0001"
          + "\u0015\u0005\u0015\u0114\b\u0015\n\u0015\f\u0015\u0117\t\u0015\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0000\u0001*\u0017\u0000\u0002\u0004\u0006\b"
          + "\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"
          + "\u0005\u0001\u0000\u0004\u0006\u0002\u0000\u0007\u0007\u0010\u0010\u0001"
          + "\u0000\b\r\u0001\u0000\u000e\u000f\u0001\u0000*,\u012f\u00002\u0001\u0000"
          + "\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000"
          + "\u0006F\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nS\u0001\u0000"
          + "\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000\u0000"
          + "\u0010{\u0001\u0000\u0000\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014"
          + "\u0085\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018"
          + "\u009e\u0001\u0000\u0000\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c"
          + "\u00ad\u0001\u0000\u0000\u0000\u001e\u00af\u0001\u0000\u0000\u0000 \u00c3"
          + "\u0001\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000\u0000$\u00d2\u0001"
          + "\u0000\u0000\u0000&\u00db\u0001\u0000\u0000\u0000(\u00e4\u0001\u0000\u0000"
          + "\u0000*\u00f8\u0001\u0000\u0000\u0000,\u0118\u0001\u0000\u0000\u0000."
          + "1\u0003\u000e\u0007\u0000/1\u0003\u0006\u0003\u00000.\u0001\u0000\u0000"
          + "\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000"
          + "\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001"
          + "\u0000\u0000\u000056\u0003\u0002\u0001\u00006\u0001\u0001\u0000\u0000"
          + "\u000078\u0005\u001f\u0000\u000089\u0005 \u0000\u00009:\u0005\u0014\u0000"
          + "\u0000:;\u0005\u0015\u0000\u0000;<\u0005%\u0000\u0000<=\u0003\u0004\u0002"
          + "\u0000=>\u0005&\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?B\u0003\u000e"
          + "\u0007\u0000@B\u0003\u0018\f\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000"
          + "\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"
          + "\u0000\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"
          + "\u0000FG\u0003\b\u0004\u0000GH\u0003\n\u0005\u0000H\u0007\u0001\u0000"
          + "\u0000\u0000IJ\u0005\u001f\u0000\u0000JK\u0005-\u0000\u0000KL\u0005\u0014"
          + "\u0000\u0000LM\u0003\f\u0006\u0000MN\u0005\u0015\u0000\u0000NQ\u0005\""
          + "\u0000\u0000OR\u0003\u0012\t\u0000PR\u0005\u0016\u0000\u0000QO\u0001\u0000"
          + "\u0000\u0000QP\u0001\u0000\u0000\u0000R\t\u0001\u0000\u0000\u0000SX\u0005"
          + "%\u0000\u0000TW\u0003\u000e\u0007\u0000UW\u0003\u0018\f\u0000VT\u0001"
          + "\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"
          + "XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000"
          + "\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005&\u0000\u0000\\\u000b\u0001\u0000"
          + "\u0000\u0000]b\u0003\u000e\u0007\u0000^_\u0005$\u0000\u0000_a\u0003\u000e"
          + "\u0007\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"
          + "\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"
          + "db\u0001\u0000\u0000\u0000e]\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"
          + "\u0000f\r\u0001\u0000\u0000\u0000gl\u0005-\u0000\u0000hi\u0005$\u0000"
          + "\u0000ik\u0005-\u0000\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"
          + "\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000"
          + "\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005\"\u0000\u0000pq\u0003\u0010"
          + "\b\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0003\u0012\t\u0000st\u0006"
          + "\b\uffff\uffff\u0000t|\u0001\u0000\u0000\u0000uv\u0003\u0014\n\u0000v"
          + "w\u0006\b\uffff\uffff\u0000w|\u0001\u0000\u0000\u0000xy\u0003\u0016\u000b"
          + "\u0000yz\u0006\b\uffff\uffff\u0000z|\u0001\u0000\u0000\u0000{r\u0001\u0000"
          + "\u0000\u0000{u\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u0011"
          + "\u0001\u0000\u0000\u0000}~\u0005\u0001\u0000\u0000~\u0084\u0006\t\uffff"
          + "\uffff\u0000\u007f\u0080\u0005\u0002\u0000\u0000\u0080\u0084\u0006\t\uffff"
          + "\uffff\u0000\u0081\u0082\u0005\u0003\u0000\u0000\u0082\u0084\u0006\t\uffff"
          + "\uffff\u0000\u0083}\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000"
          + "\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0013\u0001\u0000\u0000"
          + "\u0000\u0085\u0086\u0005\u0012\u0000\u0000\u0086\u0087\u0005*\u0000\u0000"
          + "\u0087\u0088\u0005\"\u0000\u0000\u0088\u0089\u0003\u0010\b\u0000\u0089"
          + "\u008a\u0005\u0013\u0000\u0000\u008a\u008b\u0006\n\uffff\uffff\u0000\u008b"
          + "\u0015\u0001\u0000\u0000\u0000\u008c\u008d\u0005#\u0000\u0000\u008d\u0091"
          + "\u0005%\u0000\u0000\u008e\u0090\u0003\u000e\u0007\u0000\u008f\u008e\u0001"
          + "\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"
          + "\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001"
          + "\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005"
          + "&\u0000\u0000\u0095\u0096\u0006\u000b\uffff\uffff\u0000\u0096\u0017\u0001"
          + "\u0000\u0000\u0000\u0097\u009f\u0003\u001a\r\u0000\u0098\u009f\u0003\u001e"
          + "\u000f\u0000\u0099\u009f\u0003 \u0010\u0000\u009a\u009f\u0003\"\u0011"
          + "\u0000\u009b\u009f\u0003$\u0012\u0000\u009c\u009f\u0003&\u0013\u0000\u009d"
          + "\u009f\u0003(\u0014\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009e\u0098"
          + "\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000\u009e\u009a"
          + "\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e\u009c"
          + "\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u0019"
          + "\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005-\u0000\u0000\u00a1\u00a2\u0005"
          + "\u0014\u0000\u0000\u00a2\u00a3\u0003\u001c\u000e\u0000\u00a3\u00a4\u0005"
          + "\u0015\u0000\u0000\u00a4\u001b\u0001\u0000\u0000\u0000\u00a5\u00aa\u0003"
          + "*\u0015\u0000\u00a6\u00a7\u0005$\u0000\u0000\u00a7\u00a9\u0003*\u0015"
          + "\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000"
          + "\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"
          + "\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"
          + "\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"
          + "\u0000\u00ae\u001d\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0019\u0000"
          + "\u0000\u00b0\u00b1\u0003*\u0015\u0000\u00b1\u00b5\u0005%\u0000\u0000\u00b2"
          + "\u00b4\u0003\u0018\f\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7"
          + "\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"
          + "\u0001\u0000\u0000\u0000\u00b6\u00bf\u0001\u0000\u0000\u0000\u00b7\u00b5"
          + "\u0001\u0000\u0000\u0000\u00b8\u00bc\u0005\u001a\u0000\u0000\u00b9\u00bb"
          + "\u0003\u0018\f\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"
          + "\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"
          + "\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"
          + "\u0000\u0000\u0000\u00bf\u00b8\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"
          + "\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"
          + "&\u0000\u0000\u00c2\u001f\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u001b"
          + "\u0000\u0000\u00c4\u00c5\u0003*\u0015\u0000\u00c5\u00c9\u0005%\u0000\u0000"
          + "\u00c6\u00c8\u0003\u0018\f\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8"
          + "\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"
          + "\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb"
          + "\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005&\u0000\u0000\u00cd!\u0001"
          + "\u0000\u0000\u0000\u00ce\u00cf\u0003*\u0015\u0000\u00cf\u00d0\u0005\u001e"
          + "\u0000\u0000\u00d0\u00d1\u0003*\u0015\u0000\u00d1#\u0001\u0000\u0000\u0000"
          + "\u00d2\u00d3\u0005\u001c\u0000\u0000\u00d3\u00d8\u0003*\u0015\u0000\u00d4"
          + "\u00d5\u0005$\u0000\u0000\u00d5\u00d7\u0003*\u0015\u0000\u00d6\u00d4\u0001"
          + "\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"
          + "\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9%\u0001\u0000"
          + "\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001d"
          + "\u0000\u0000\u00dc\u00e1\u0003*\u0015\u0000\u00dd\u00de\u0005$\u0000\u0000"
          + "\u00de\u00e0\u0003*\u0015\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0"
          + "\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1"
          + "\u00e2\u0001\u0000\u0000\u0000\u00e2\'\u0001\u0000\u0000\u0000\u00e3\u00e1"
          + "\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005!\u0000\u0000\u00e5\u00e7\u0003"
          + "*\u0015\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"
          + "\u0000\u0000\u00e7)\u0001\u0000\u0000\u0000\u00e8\u00e9\u0006\u0015\uffff"
          + "\uffff\u0000\u00e9\u00f9\u0003,\u0016\u0000\u00ea\u00f9\u0005-\u0000\u0000"
          + "\u00eb\u00f9\u0003\u001a\r\u0000\u00ec\u00ed\u0005\u0014\u0000\u0000\u00ed"
          + "\u00ee\u0003*\u0015\u0000\u00ee\u00ef\u0005\u0015\u0000\u0000\u00ef\u00f9"
          + "\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0012\u0000\u0000\u00f1\u00f2"
          + "\u0003*\u0015\u0000\u00f2\u00f3\u0005\u0013\u0000\u0000\u00f3\u00f9\u0001"
          + "\u0000\u0000\u0000\u00f4\u00f5\u0005\u0010\u0000\u0000\u00f5\u00f9\u0003"
          + "*\u0015\u0006\u00f6\u00f7\u0005\u0011\u0000\u0000\u00f7\u00f9\u0003*\u0015"
          + "\u0005\u00f8\u00e8\u0001\u0000\u0000\u0000\u00f8\u00ea\u0001\u0000\u0000"
          + "\u0000\u00f8\u00eb\u0001\u0000\u0000\u0000\u00f8\u00ec\u0001\u0000\u0000"
          + "\u0000\u00f8\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000"
          + "\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u0115\u0001\u0000\u0000"
          + "\u0000\u00fa\u00fb\n\b\u0000\u0000\u00fb\u00fc\u0005\u0017\u0000\u0000"
          + "\u00fc\u0114\u0003*\u0015\t\u00fd\u00fe\n\u0004\u0000\u0000\u00fe\u00ff"
          + "\u0007\u0000\u0000\u0000\u00ff\u0114\u0003*\u0015\u0005\u0100\u0101\n"
          + "\u0003\u0000\u0000\u0101\u0102\u0007\u0001\u0000\u0000\u0102\u0114\u0003"
          + "*\u0015\u0004\u0103\u0104\n\u0002\u0000\u0000\u0104\u0105\u0007\u0002"
          + "\u0000\u0000\u0105\u0114\u0003*\u0015\u0003\u0106\u0107\n\u0001\u0000"
          + "\u0000\u0107\u0108\u0007\u0003\u0000\u0000\u0108\u0114\u0003*\u0015\u0002"
          + "\u0109\u010a\n\t\u0000\u0000\u010a\u010b\u0005\u0012\u0000\u0000\u010b"
          + "\u010c\u0003*\u0015\u0000\u010c\u010e\u0005\u0013\u0000\u0000\u010d\u010f"
          + "\u0003*\u0015\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001"
          + "\u0000\u0000\u0000\u010f\u0114\u0001\u0000\u0000\u0000\u0110\u0111\n\u0007"
          + "\u0000\u0000\u0111\u0112\u0005\u0018\u0000\u0000\u0112\u0114\u0003\u0012"
          + "\t\u0000\u0113\u00fa\u0001\u0000\u0000\u0000\u0113\u00fd\u0001\u0000\u0000"
          + "\u0000\u0113\u0100\u0001\u0000\u0000\u0000\u0113\u0103\u0001\u0000\u0000"
          + "\u0000\u0113\u0106\u0001\u0000\u0000\u0000\u0113\u0109\u0001\u0000\u0000"
          + "\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"
          + "\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"
          + "\u0000\u0116+\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"
          + "\u0118\u0119\u0007\u0004\u0000\u0000\u0119-\u0001\u0000\u0000\u0000\u001b"
          + "02ACQVXbel{\u0083\u0091\u009e\u00aa\u00ad\u00b5\u00bc\u00bf\u00c9\u00d8"
          + "\u00e1\u00e6\u00f8\u010e\u0113\u0115";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
