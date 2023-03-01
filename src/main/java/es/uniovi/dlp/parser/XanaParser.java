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
import java.util.ArrayList;
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
      RULE_simple_constant = 22;

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
      "simple_constant"
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
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
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
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
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
    public List<VarDefinition> ast = new ArrayList<VarDefinition>();
    ;
    public Token v1;
    public Token v2;
    public Var_type_defContext var_type_def;

    public TerminalNode DOS_PUNTOS() {
      return getToken(XanaParser.DOS_PUNTOS, 0);
    }

    public Var_type_defContext var_type_def() {
      return getRuleContext(Var_type_defContext.class, 0);
    }

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
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
        ((Var_defContext) _localctx).v1 = match(ID);
        _localctx.ast.add(
            new VarDefinition(
                ((Var_defContext) _localctx).v1.getLine(),
                ((Var_defContext) _localctx).v1.getCharPositionInLine() + 1,
                (((Var_defContext) _localctx).v1 != null
                    ? ((Var_defContext) _localctx).v1.getText()
                    : null)));
        setState(110);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(105);
              match(COMMA);
              setState(106);
              ((Var_defContext) _localctx).v2 = match(ID);
              _localctx.ast.add(
                  new VarDefinition(
                      ((Var_defContext) _localctx).v2.getLine(),
                      ((Var_defContext) _localctx).v2.getCharPositionInLine() + 1,
                      (((Var_defContext) _localctx).v2 != null
                          ? ((Var_defContext) _localctx).v2.getText()
                          : null)));
            }
          }
          setState(112);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(113);
        match(DOS_PUNTOS);
        setState(114);
        ((Var_defContext) _localctx).var_type_def = var_type_def();
        for (VarDefinition v : _localctx.ast)
          v.setType(((Var_defContext) _localctx).var_type_def.ast);
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
    public Type ast;
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
      setState(126);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
        case T__1:
        case T__2:
          enterOuterAlt(_localctx, 1);
          {
            setState(117);
            ((Var_type_defContext) _localctx).simple_type = simple_type();
            ((Var_type_defContext) _localctx).ast =
                ((Var_type_defContext) _localctx).simple_type.ast;
          }
          break;
        case ABRE_CORCHETE:
          enterOuterAlt(_localctx, 2);
          {
            setState(120);
            ((Var_type_defContext) _localctx).array_def_type = array_def_type();
            ((Var_type_defContext) _localctx).ast =
                ((Var_type_defContext) _localctx).array_def_type.ast;
          }
          break;
        case DEFSTRUCT:
          enterOuterAlt(_localctx, 3);
          {
            setState(123);
            ((Var_type_defContext) _localctx).struct_def_type = struct_def_type();
            ((Var_type_defContext) _localctx).ast =
                ((Var_type_defContext) _localctx).struct_def_type.ast;
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
    public Type ast;
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
      setState(134);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
          enterOuterAlt(_localctx, 1);
          {
            setState(128);
            ((Simple_typeContext) _localctx).t = match(T__0);
            ((Simple_typeContext) _localctx).ast =
                new IntType(
                    ((Simple_typeContext) _localctx).t.getLine(),
                    ((Simple_typeContext) _localctx).t.getCharPositionInLine() + 1);
          }
          break;
        case T__1:
          enterOuterAlt(_localctx, 2);
          {
            setState(130);
            ((Simple_typeContext) _localctx).t = match(T__1);
            ((Simple_typeContext) _localctx).ast =
                new DoubleType(
                    ((Simple_typeContext) _localctx).t.getLine(),
                    ((Simple_typeContext) _localctx).t.getCharPositionInLine() + 1);
          }
          break;
        case T__2:
          enterOuterAlt(_localctx, 3);
          {
            setState(132);
            ((Simple_typeContext) _localctx).t = match(T__2);
            ((Simple_typeContext) _localctx).ast =
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
    public Type ast;
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
        setState(136);
        ((Array_def_typeContext) _localctx).ABRE_CORCHETE = match(ABRE_CORCHETE);
        setState(137);
        match(INT_CONSTANT);
        setState(138);
        match(DOS_PUNTOS);
        setState(139);
        var_type_def();
        setState(140);
        match(CIERRA_CORCHETE);
        ((Array_def_typeContext) _localctx).ast =
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
    public Type ast;
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
        setState(143);
        ((Struct_def_typeContext) _localctx).DEFSTRUCT = match(DEFSTRUCT);
        setState(144);
        match(DO);
        setState(148);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(145);
              var_def();
            }
          }
          setState(150);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(151);
        match(END);
        ((Struct_def_typeContext) _localctx).ast =
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
      setState(161);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(154);
            func_invocation();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(155);
            if_else();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(156);
            while_();
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(157);
            assignment();
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(158);
            puts();
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(159);
            in();
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(160);
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
        setState(163);
        match(ID);
        setState(164);
        match(ABRE_PARENTESIS);
        setState(165);
        argument_list();
        setState(166);
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
        setState(176);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((_la) & ~0x3f) == 0 && ((1L << _la) & 65970698911744L) != 0) {
          {
            setState(168);
            expression(0);
            setState(173);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
              {
                {
                  setState(169);
                  match(COMMA);
                  setState(170);
                  expression(0);
                }
              }
              setState(175);
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
        setState(178);
        match(IF);
        setState(179);
        expression(0);
        setState(180);
        match(DO);
        setState(184);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
          {
            {
              setState(181);
              statement();
            }
          }
          setState(186);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(194);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ELSE) {
          {
            setState(187);
            match(ELSE);
            setState(191);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
              {
                {
                  setState(188);
                  statement();
                }
              }
              setState(193);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        setState(196);
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
        setState(198);
        match(WHILE);
        setState(199);
        expression(0);
        setState(200);
        match(DO);
        setState(204);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
          {
            {
              setState(201);
              statement();
            }
          }
          setState(206);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(207);
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
        setState(209);
        ((AssignmentContext) _localctx).leftExp = expression(0);
        setState(210);
        match(IGUAL);
        setState(211);
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
        setState(213);
        match(PUTS);
        setState(214);
        expression(0);
        setState(219);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(215);
              match(COMMA);
              setState(216);
              expression(0);
            }
          }
          setState(221);
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
        setState(222);
        match(IN);
        setState(223);
        expression(0);
        setState(228);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(224);
              match(COMMA);
              setState(225);
              expression(0);
            }
          }
          setState(230);
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
        setState(231);
        match(RETURN);
        setState(233);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
          case 1:
            {
              setState(232);
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
    public Token op;
    public ExpressionContext rightExpression;

    public Simple_constantContext simple_constant() {
      return getRuleContext(Simple_constantContext.class, 0);
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

    public TerminalNode MINUS() {
      return getToken(XanaParser.MINUS, 0);
    }

    public TerminalNode NOT() {
      return getToken(XanaParser.NOT, 0);
    }

    public TerminalNode DOT() {
      return getToken(XanaParser.DOT, 0);
    }

    public TerminalNode ABRE_CORCHETE() {
      return getToken(XanaParser.ABRE_CORCHETE, 0);
    }

    public TerminalNode CIERRA_CORCHETE() {
      return getToken(XanaParser.CIERRA_CORCHETE, 0);
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
        setState(247);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
          case 1:
            {
              setState(236);
              simple_constant();
            }
            break;
          case 2:
            {
              setState(237);
              match(ID);
            }
            break;
          case 3:
            {
              setState(238);
              func_invocation();
            }
            break;
          case 4:
            {
              setState(239);
              match(ABRE_PARENTESIS);
              setState(240);
              expression(0);
              setState(241);
              match(CIERRA_PARENTESIS);
            }
            break;
          case 5:
            {
              setState(243);
              match(MINUS);
              setState(244);
              expression(6);
            }
            break;
          case 6:
            {
              setState(245);
              match(NOT);
              setState(246);
              expression(5);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(276);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(274);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                case 1:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(249);
                    if (!(precpred(_ctx, 8)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                    setState(250);
                    match(DOT);
                    setState(251);
                    expression(9);
                  }
                  break;
                case 2:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpresion = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(252);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(253);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(254);
                    ((ExpressionContext) _localctx).rightExpression = expression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpresion = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(255);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(256);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__6 || _la == MINUS)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(257);
                    ((ExpressionContext) _localctx).rightExpression = expression(4);
                  }
                  break;
                case 4:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpresion = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(258);
                    if (!(precpred(_ctx, 2)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                    setState(259);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(260);
                    ((ExpressionContext) _localctx).rightExpression = expression(3);
                  }
                  break;
                case 5:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpresion = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(261);
                    if (!(precpred(_ctx, 1)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                    setState(262);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__13 || _la == T__14)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(263);
                    ((ExpressionContext) _localctx).rightExpression = expression(2);
                  }
                  break;
                case 6:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(264);
                    if (!(precpred(_ctx, 9)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                    setState(265);
                    match(ABRE_CORCHETE);
                    setState(266);
                    expression(0);
                    setState(267);
                    match(CIERRA_CORCHETE);
                    {
                      setState(269);
                      _errHandler.sync(this);
                      switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                        case 1:
                          {
                            setState(268);
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
                    setState(271);
                    if (!(precpred(_ctx, 7)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                    setState(272);
                    match(AS);
                    setState(273);
                    simple_type();
                  }
                  break;
              }
            }
          }
          setState(278);
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
  public static class Simple_constantContext extends ParserRuleContext {
    public Expression ast;
    public Token INT_CONSTANT;
    public Token CHAR_CONSTANT;
    public Token REAL_CONSTANT;

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TerminalNode CHAR_CONSTANT() {
      return getToken(XanaParser.CHAR_CONSTANT, 0);
    }

    public TerminalNode REAL_CONSTANT() {
      return getToken(XanaParser.REAL_CONSTANT, 0);
    }

    public Simple_constantContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_simple_constant;
    }
  }

  public final Simple_constantContext simple_constant() throws RecognitionException {
    Simple_constantContext _localctx = new Simple_constantContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_simple_constant);
    try {
      setState(285);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case INT_CONSTANT:
          enterOuterAlt(_localctx, 1);
          {
            setState(279);
            ((Simple_constantContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);
            ((Simple_constantContext) _localctx).ast =
                new IntLiteral(
                    ((Simple_constantContext) _localctx).INT_CONSTANT.getLine(),
                    ((Simple_constantContext) _localctx).INT_CONSTANT.getCharPositionInLine() + 1);
          }
          break;
        case CHAR_CONSTANT:
          enterOuterAlt(_localctx, 2);
          {
            setState(281);
            ((Simple_constantContext) _localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
            ((Simple_constantContext) _localctx).ast =
                new CharLiteral(
                    ((Simple_constantContext) _localctx).CHAR_CONSTANT.getLine(),
                    ((Simple_constantContext) _localctx).CHAR_CONSTANT.getCharPositionInLine() + 1);
          }
          break;
        case REAL_CONSTANT:
          enterOuterAlt(_localctx, 3);
          {
            setState(283);
            ((Simple_constantContext) _localctx).REAL_CONSTANT = match(REAL_CONSTANT);
            ((Simple_constantContext) _localctx).ast =
                new DoubleLiteral(
                    ((Simple_constantContext) _localctx).REAL_CONSTANT.getLine(),
                    ((Simple_constantContext) _localctx).REAL_CONSTANT.getCharPositionInLine() + 1);
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
      "\u0004\u0001-\u0120\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
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
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"
          + "m\b\u0007\n\u0007\f\u0007p\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"
          + "\b\u0001\b\u0003\b\u007f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"
          + "\t\u0003\t\u0087\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0093\b\u000b\n\u000b"
          + "\f\u000b\u0096\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a2\b\f\u0001\r\u0001"
          + "\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"
          + "\u00ac\b\u000e\n\u000e\f\u000e\u00af\t\u000e\u0003\u000e\u00b1\b\u000e"
          + "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b7\b\u000f"
          + "\n\u000f\f\u000f\u00ba\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00be"
          + "\b\u000f\n\u000f\f\u000f\u00c1\t\u000f\u0003\u000f\u00c3\b\u000f\u0001"
          + "\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"
          + "\u0010\u00cb\b\u0010\n\u0010\f\u0010\u00ce\t\u0010\u0001\u0010\u0001\u0010"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"
          + "\u0001\u0012\u0001\u0012\u0005\u0012\u00da\b\u0012\n\u0012\f\u0012\u00dd"
          + "\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00e3"
          + "\b\u0013\n\u0013\f\u0013\u00e6\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014"
          + "\u00ea\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0003\u0015\u00f8\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"
          + "\u010e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0113\b"
          + "\u0015\n\u0015\f\u0015\u0116\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u011e\b\u0016\u0001\u0016"
          + "\u0000\u0001*\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"
          + "\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0004\u0001\u0000\u0004\u0006"
          + "\u0002\u0000\u0007\u0007\u0010\u0010\u0001\u0000\b\r\u0001\u0000\u000e"
          + "\u000f\u0135\u00002\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000"
          + "\u0004C\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bI\u0001"
          + "\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000"
          + "\u000eg\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u0086"
          + "\u0001\u0000\u0000\u0000\u0014\u0088\u0001\u0000\u0000\u0000\u0016\u008f"
          + "\u0001\u0000\u0000\u0000\u0018\u00a1\u0001\u0000\u0000\u0000\u001a\u00a3"
          + "\u0001\u0000\u0000\u0000\u001c\u00b0\u0001\u0000\u0000\u0000\u001e\u00b2"
          + "\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000\u0000\u0000\"\u00d1\u0001"
          + "\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000&\u00de\u0001\u0000\u0000"
          + "\u0000(\u00e7\u0001\u0000\u0000\u0000*\u00f7\u0001\u0000\u0000\u0000,"
          + "\u011d\u0001\u0000\u0000\u0000.1\u0003\u000e\u0007\u0000/1\u0003\u0006"
          + "\u0003\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u000014\u0001"
          + "\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"
          + "35\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0003\u0002\u0001"
          + "\u00006\u0001\u0001\u0000\u0000\u000078\u0005\u001f\u0000\u000089\u0005"
          + " \u0000\u00009:\u0005\u0014\u0000\u0000:;\u0005\u0015\u0000\u0000;<\u0005"
          + "%\u0000\u0000<=\u0003\u0004\u0002\u0000=>\u0005&\u0000\u0000>\u0003\u0001"
          + "\u0000\u0000\u0000?B\u0003\u000e\u0007\u0000@B\u0003\u0018\f\u0000A?\u0001"
          + "\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"
          + "CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0005\u0001\u0000"
          + "\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0003\b\u0004\u0000GH\u0003\n"
          + "\u0005\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u001f\u0000\u0000"
          + "JK\u0005-\u0000\u0000KL\u0005\u0014\u0000\u0000LM\u0003\f\u0006\u0000"
          + "MN\u0005\u0015\u0000\u0000NQ\u0005\"\u0000\u0000OR\u0003\u0012\t\u0000"
          + "PR\u0005\u0016\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000"
          + "\u0000R\t\u0001\u0000\u0000\u0000SX\u0005%\u0000\u0000TW\u0003\u000e\u0007"
          + "\u0000UW\u0003\u0018\f\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"
          + "\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"
          + "\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005"
          + "&\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]b\u0003\u000e\u0007\u0000"
          + "^_\u0005$\u0000\u0000_a\u0003\u000e\u0007\u0000`^\u0001\u0000\u0000\u0000"
          + "ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"
          + "\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000e]\u0001\u0000"
          + "\u0000\u0000ef\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0005"
          + "-\u0000\u0000hn\u0006\u0007\uffff\uffff\u0000ij\u0005$\u0000\u0000jk\u0005"
          + "-\u0000\u0000km\u0006\u0007\uffff\uffff\u0000li\u0001\u0000\u0000\u0000"
          + "mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"
          + "\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\"\u0000"
          + "\u0000rs\u0003\u0010\b\u0000st\u0006\u0007\uffff\uffff\u0000t\u000f\u0001"
          + "\u0000\u0000\u0000uv\u0003\u0012\t\u0000vw\u0006\b\uffff\uffff\u0000w"
          + "\u007f\u0001\u0000\u0000\u0000xy\u0003\u0014\n\u0000yz\u0006\b\uffff\uffff"
          + "\u0000z\u007f\u0001\u0000\u0000\u0000{|\u0003\u0016\u000b\u0000|}\u0006"
          + "\b\uffff\uffff\u0000}\u007f\u0001\u0000\u0000\u0000~u\u0001\u0000\u0000"
          + "\u0000~x\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000\u007f\u0011"
          + "\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0001\u0000\u0000\u0081\u0087"
          + "\u0006\t\uffff\uffff\u0000\u0082\u0083\u0005\u0002\u0000\u0000\u0083\u0087"
          + "\u0006\t\uffff\uffff\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0087"
          + "\u0006\t\uffff\uffff\u0000\u0086\u0080\u0001\u0000\u0000\u0000\u0086\u0082"
          + "\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0013"
          + "\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0012\u0000\u0000\u0089\u008a"
          + "\u0005*\u0000\u0000\u008a\u008b\u0005\"\u0000\u0000\u008b\u008c\u0003"
          + "\u0010\b\u0000\u008c\u008d\u0005\u0013\u0000\u0000\u008d\u008e\u0006\n"
          + "\uffff\uffff\u0000\u008e\u0015\u0001\u0000\u0000\u0000\u008f\u0090\u0005"
          + "#\u0000\u0000\u0090\u0094\u0005%\u0000\u0000\u0091\u0093\u0003\u000e\u0007"
          + "\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"
          + "\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"
          + "\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"
          + "\u0000\u0097\u0098\u0005&\u0000\u0000\u0098\u0099\u0006\u000b\uffff\uffff"
          + "\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u00a2\u0003\u001a\r\u0000"
          + "\u009b\u00a2\u0003\u001e\u000f\u0000\u009c\u00a2\u0003 \u0010\u0000\u009d"
          + "\u00a2\u0003\"\u0011\u0000\u009e\u00a2\u0003$\u0012\u0000\u009f\u00a2"
          + "\u0003&\u0013\u0000\u00a0\u00a2\u0003(\u0014\u0000\u00a1\u009a\u0001\u0000"
          + "\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000"
          + "\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000"
          + "\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000"
          + "\u0000\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005-\u0000"
          + "\u0000\u00a4\u00a5\u0005\u0014\u0000\u0000\u00a5\u00a6\u0003\u001c\u000e"
          + "\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u001b\u0001\u0000\u0000"
          + "\u0000\u00a8\u00ad\u0003*\u0015\u0000\u00a9\u00aa\u0005$\u0000\u0000\u00aa"
          + "\u00ac\u0003*\u0015\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af"
          + "\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"
          + "\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad"
          + "\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000\u00b0\u00b1"
          + "\u0001\u0000\u0000\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b3"
          + "\u0005\u0019\u0000\u0000\u00b3\u00b4\u0003*\u0015\u0000\u00b4\u00b8\u0005"
          + "%\u0000\u0000\u00b5\u00b7\u0003\u0018\f\u0000\u00b6\u00b5\u0001\u0000"
          + "\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"
          + "\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00c2\u0001\u0000"
          + "\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bf\u0005\u001a"
          + "\u0000\u0000\u00bc\u00be\u0003\u0018\f\u0000\u00bd\u00bc\u0001\u0000\u0000"
          + "\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"
          + "\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"
          + "\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000"
          + "\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"
          + "\u0000\u00c4\u00c5\u0005&\u0000\u0000\u00c5\u001f\u0001\u0000\u0000\u0000"
          + "\u00c6\u00c7\u0005\u001b\u0000\u0000\u00c7\u00c8\u0003*\u0015\u0000\u00c8"
          + "\u00cc\u0005%\u0000\u0000\u00c9\u00cb\u0003\u0018\f\u0000\u00ca\u00c9"
          + "\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca"
          + "\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf"
          + "\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0"
          + "\u0005&\u0000\u0000\u00d0!\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003*"
          + "\u0015\u0000\u00d2\u00d3\u0005\u001e\u0000\u0000\u00d3\u00d4\u0003*\u0015"
          + "\u0000\u00d4#\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u001c\u0000\u0000"
          + "\u00d6\u00db\u0003*\u0015\u0000\u00d7\u00d8\u0005$\u0000\u0000\u00d8\u00da"
          + "\u0003*\u0015\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd\u0001"
          + "\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"
          + "\u0000\u0000\u0000\u00dc%\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"
          + "\u0000\u0000\u00de\u00df\u0005\u001d\u0000\u0000\u00df\u00e4\u0003*\u0015"
          + "\u0000\u00e0\u00e1\u0005$\u0000\u0000\u00e1\u00e3\u0003*\u0015\u0000\u00e2"
          + "\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4"
          + "\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"
          + "\'\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e9"
          + "\u0005!\u0000\u0000\u00e8\u00ea\u0003*\u0015\u0000\u00e9\u00e8\u0001\u0000"
          + "\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea)\u0001\u0000\u0000"
          + "\u0000\u00eb\u00ec\u0006\u0015\uffff\uffff\u0000\u00ec\u00f8\u0003,\u0016"
          + "\u0000\u00ed\u00f8\u0005-\u0000\u0000\u00ee\u00f8\u0003\u001a\r\u0000"
          + "\u00ef\u00f0\u0005\u0014\u0000\u0000\u00f0\u00f1\u0003*\u0015\u0000\u00f1"
          + "\u00f2\u0005\u0015\u0000\u0000\u00f2\u00f8\u0001\u0000\u0000\u0000\u00f3"
          + "\u00f4\u0005\u0010\u0000\u0000\u00f4\u00f8\u0003*\u0015\u0006\u00f5\u00f6"
          + "\u0005\u0011\u0000\u0000\u00f6\u00f8\u0003*\u0015\u0005\u00f7\u00eb\u0001"
          + "\u0000\u0000\u0000\u00f7\u00ed\u0001\u0000\u0000\u0000\u00f7\u00ee\u0001"
          + "\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001"
          + "\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u0114\u0001"
          + "\u0000\u0000\u0000\u00f9\u00fa\n\b\u0000\u0000\u00fa\u00fb\u0005\u0017"
          + "\u0000\u0000\u00fb\u0113\u0003*\u0015\t\u00fc\u00fd\n\u0004\u0000\u0000"
          + "\u00fd\u00fe\u0007\u0000\u0000\u0000\u00fe\u0113\u0003*\u0015\u0005\u00ff"
          + "\u0100\n\u0003\u0000\u0000\u0100\u0101\u0007\u0001\u0000\u0000\u0101\u0113"
          + "\u0003*\u0015\u0004\u0102\u0103\n\u0002\u0000\u0000\u0103\u0104\u0007"
          + "\u0002\u0000\u0000\u0104\u0113\u0003*\u0015\u0003\u0105\u0106\n\u0001"
          + "\u0000\u0000\u0106\u0107\u0007\u0003\u0000\u0000\u0107\u0113\u0003*\u0015"
          + "\u0002\u0108\u0109\n\t\u0000\u0000\u0109\u010a\u0005\u0012\u0000\u0000"
          + "\u010a\u010b\u0003*\u0015\u0000\u010b\u010d\u0005\u0013\u0000\u0000\u010c"
          + "\u010e\u0003*\u0015\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e"
          + "\u0001\u0000\u0000\u0000\u010e\u0113\u0001\u0000\u0000\u0000\u010f\u0110"
          + "\n\u0007\u0000\u0000\u0110\u0111\u0005\u0018\u0000\u0000\u0111\u0113\u0003"
          + "\u0012\t\u0000\u0112\u00f9\u0001\u0000\u0000\u0000\u0112\u00fc\u0001\u0000"
          + "\u0000\u0000\u0112\u00ff\u0001\u0000\u0000\u0000\u0112\u0102\u0001\u0000"
          + "\u0000\u0000\u0112\u0105\u0001\u0000\u0000\u0000\u0112\u0108\u0001\u0000"
          + "\u0000\u0000\u0112\u010f\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"
          + "\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"
          + "\u0000\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"
          + "\u0000\u0117\u0118\u0005*\u0000\u0000\u0118\u011e\u0006\u0016\uffff\uffff"
          + "\u0000\u0119\u011a\u0005,\u0000\u0000\u011a\u011e\u0006\u0016\uffff\uffff"
          + "\u0000\u011b\u011c\u0005+\u0000\u0000\u011c\u011e\u0006\u0016\uffff\uffff"
          + "\u0000\u011d\u0117\u0001\u0000\u0000\u0000\u011d\u0119\u0001\u0000\u0000"
          + "\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e-\u0001\u0000\u0000\u0000"
          + "\u001c02ACQVXben~\u0086\u0094\u00a1\u00ad\u00b0\u00b8\u00bf\u00c2\u00cc"
          + "\u00db\u00e4\u00e9\u00f7\u010d\u0112\u0114\u011d";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
