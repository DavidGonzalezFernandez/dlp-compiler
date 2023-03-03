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
      RULE_return_type = 6,
      RULE_param_list = 7,
      RULE_var_def = 8,
      RULE_var_type_def = 9,
      RULE_simple_type = 10,
      RULE_array_def_type = 11,
      RULE_struct_def_type = 12,
      RULE_statement = 13,
      RULE_func_invocation = 14,
      RULE_argument_list = 15,
      RULE_if_else = 16,
      RULE_while = 17,
      RULE_assignment = 18,
      RULE_puts = 19,
      RULE_in = 20,
      RULE_return_statement = 21,
      RULE_expression = 22,
      RULE_simple_constant = 23;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "main_def",
      "main_body",
      "func_def",
      "func_heading",
      "func_body",
      "return_type",
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
      "return_statement",
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
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
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

    public Return_typeContext return_type() {
      return getRuleContext(Return_typeContext.class, 0);
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
        setState(81);
        return_type();
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
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
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
  public static class Return_typeContext extends ParserRuleContext {
    public Simple_typeContext simple_type() {
      return getRuleContext(Simple_typeContext.class, 0);
    }

    public TerminalNode VOID() {
      return getToken(XanaParser.VOID, 0);
    }

    public Return_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_return_type;
    }
  }

  public final Return_typeContext return_type() throws RecognitionException {
    Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_return_type);
    try {
      setState(95);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
        case T__1:
        case T__2:
          enterOuterAlt(_localctx, 1);
          {
            setState(93);
            simple_type();
          }
          break;
        case VOID:
          enterOuterAlt(_localctx, 2);
          {
            setState(94);
            match(VOID);
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
    enterRule(_localctx, 14, RULE_param_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(105);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ID) {
          {
            setState(97);
            var_def();
            setState(102);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
              {
                {
                  setState(98);
                  match(COMMA);
                  setState(99);
                  var_def();
                }
              }
              setState(104);
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
    enterRule(_localctx, 16, RULE_var_def);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(107);
        ((Var_defContext) _localctx).v1 = match(ID);
        _localctx.ast.add(
            new VarDefinition(
                ((Var_defContext) _localctx).v1.getLine(),
                ((Var_defContext) _localctx).v1.getCharPositionInLine() + 1,
                (((Var_defContext) _localctx).v1 != null
                    ? ((Var_defContext) _localctx).v1.getText()
                    : null)));
        setState(114);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(109);
              match(COMMA);
              setState(110);
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
          setState(116);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(117);
        match(DOS_PUNTOS);
        setState(118);
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
    public CompilerType ast;
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
    enterRule(_localctx, 18, RULE_var_type_def);
    try {
      setState(130);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
        case T__1:
        case T__2:
          enterOuterAlt(_localctx, 1);
          {
            setState(121);
            ((Var_type_defContext) _localctx).simple_type = simple_type();
            ((Var_type_defContext) _localctx).ast =
                ((Var_type_defContext) _localctx).simple_type.ast;
          }
          break;
        case ABRE_CORCHETE:
          enterOuterAlt(_localctx, 2);
          {
            setState(124);
            ((Var_type_defContext) _localctx).array_def_type = array_def_type();
            ((Var_type_defContext) _localctx).ast =
                ((Var_type_defContext) _localctx).array_def_type.ast;
          }
          break;
        case DEFSTRUCT:
          enterOuterAlt(_localctx, 3);
          {
            setState(127);
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
    public CompilerType ast;
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
    enterRule(_localctx, 20, RULE_simple_type);
    try {
      setState(138);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
          enterOuterAlt(_localctx, 1);
          {
            setState(132);
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
            setState(134);
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
            setState(136);
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
    public ArrayType ast;
    public Token ABRE_CORCHETE;
    public Token INT_CONSTANT;
    public Var_type_defContext var_type_def;

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
    enterRule(_localctx, 22, RULE_array_def_type);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(140);
        ((Array_def_typeContext) _localctx).ABRE_CORCHETE = match(ABRE_CORCHETE);
        setState(141);
        ((Array_def_typeContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);
        setState(142);
        match(DOS_PUNTOS);
        setState(143);
        ((Array_def_typeContext) _localctx).var_type_def = var_type_def();
        setState(144);
        match(CIERRA_CORCHETE);
        ((Array_def_typeContext) _localctx).ast =
            new ArrayType(
                ((Array_def_typeContext) _localctx).ABRE_CORCHETE.getLine(),
                ((Array_def_typeContext) _localctx).ABRE_CORCHETE.getCharPositionInLine() + 1,
                Integer.parseInt(
                    (((Array_def_typeContext) _localctx).INT_CONSTANT != null
                        ? ((Array_def_typeContext) _localctx).INT_CONSTANT.getText()
                        : null)),
                ((Array_def_typeContext) _localctx).var_type_def.ast);
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
    public StructType ast;
    public List<StructField> definitions = new ArrayList<>();
    ;
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
    enterRule(_localctx, 24, RULE_struct_def_type);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(147);
        ((Struct_def_typeContext) _localctx).DEFSTRUCT = match(DEFSTRUCT);
        setState(148);
        match(DO);
        setState(152);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(149);
              var_def();
            }
          }
          setState(154);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(155);
        match(END);
        ((Struct_def_typeContext) _localctx).ast =
            new StructType(
                ((Struct_def_typeContext) _localctx).DEFSTRUCT.getLine(),
                ((Struct_def_typeContext) _localctx).DEFSTRUCT.getCharPositionInLine() + 1,
                _localctx.definitions);
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
    public List<Statement> ast = new ArrayList<>();
    ;
    public PutsContext puts;
    public InContext in;

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

    public Return_statementContext return_statement() {
      return getRuleContext(Return_statementContext.class, 0);
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
    enterRule(_localctx, 26, RULE_statement);
    try {
      setState(169);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(158);
            func_invocation();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(159);
            if_else();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(160);
            while_();
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(161);
            assignment();
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(162);
            ((StatementContext) _localctx).puts = puts();
            ((StatementContext) _localctx).ast = ((StatementContext) _localctx).puts.ast;
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(165);
            ((StatementContext) _localctx).in = in();
            ((StatementContext) _localctx).ast = ((StatementContext) _localctx).in.ast;
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(168);
            return_statement();
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
    public FunctionInvocation ast;
    public Token ID;
    public Argument_listContext argument_list;

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
    enterRule(_localctx, 28, RULE_func_invocation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(171);
        ((Func_invocationContext) _localctx).ID = match(ID);
        setState(172);
        match(ABRE_PARENTESIS);
        setState(173);
        ((Func_invocationContext) _localctx).argument_list = argument_list();
        setState(174);
        match(CIERRA_PARENTESIS);
        ((Func_invocationContext) _localctx).ast =
            new FunctionInvocation(
                ((Func_invocationContext) _localctx).ID.getLine(),
                ((Func_invocationContext) _localctx).ID.getCharPositionInLine() + 1,
                (((Func_invocationContext) _localctx).ID != null
                    ? ((Func_invocationContext) _localctx).ID.getText()
                    : null),
                ((Func_invocationContext) _localctx).argument_list.ast);
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
    public List<Expression> ast = new ArrayList<Expression>();
    ;
    public ExpressionContext expr1;
    public ExpressionContext expr2;

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
    enterRule(_localctx, 30, RULE_argument_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(188);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((_la) & ~0x3f) == 0 && ((1L << _la) & 65970698911744L) != 0) {
          {
            setState(177);
            ((Argument_listContext) _localctx).expr1 = expression(0);
            _localctx.ast.add(((Argument_listContext) _localctx).expr1.ast);
            setState(185);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
              {
                {
                  setState(179);
                  match(COMMA);
                  setState(180);
                  ((Argument_listContext) _localctx).expr2 = expression(0);
                  _localctx.ast.add(((Argument_listContext) _localctx).expr2.ast);
                }
              }
              setState(187);
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
    public StatementContext st1;
    public StatementContext st2;

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

    public TerminalNode ELSE() {
      return getToken(XanaParser.ELSE, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
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
    enterRule(_localctx, 32, RULE_if_else);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(190);
        match(IF);
        setState(191);
        expression(0);
        setState(192);
        match(DO);
        setState(196);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
          {
            {
              setState(193);
              ((If_elseContext) _localctx).st1 = statement();
            }
          }
          setState(198);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(206);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ELSE) {
          {
            setState(199);
            match(ELSE);
            setState(203);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
              {
                {
                  setState(200);
                  ((If_elseContext) _localctx).st2 = statement();
                }
              }
              setState(205);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        setState(208);
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
    enterRule(_localctx, 34, RULE_while);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(210);
        match(WHILE);
        setState(211);
        expression(0);
        setState(212);
        match(DO);
        setState(216);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65980261924864L) != 0) {
          {
            {
              setState(213);
              statement();
            }
          }
          setState(218);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(219);
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
    enterRule(_localctx, 36, RULE_assignment);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(221);
        ((AssignmentContext) _localctx).leftExp = expression(0);
        setState(222);
        match(IGUAL);
        setState(223);
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
    public List<Statement> ast = new ArrayList<Statement>();
    ;
    public ExpressionContext expr1;
    public ExpressionContext expr2;

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
        setState(225);
        match(PUTS);
        setState(226);
        ((PutsContext) _localctx).expr1 = expression(0);
        _localctx.ast.add(
            new WriteStatement(
                _localctx.start.getLine(),
                _localctx.start.getCharPositionInLine() + 1,
                ((PutsContext) _localctx).expr1.ast));
        setState(234);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(228);
              match(COMMA);
              setState(229);
              ((PutsContext) _localctx).expr2 = expression(0);
              _localctx.ast.add(
                  new WriteStatement(
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1,
                      ((PutsContext) _localctx).expr2.ast));
            }
          }
          setState(236);
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
    public List<Statement> ast = new ArrayList<Statement>();
    ;
    public ExpressionContext expr1;
    public ExpressionContext expr2;

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
        setState(237);
        match(IN);
        setState(238);
        ((InContext) _localctx).expr1 = expression(0);
        _localctx.ast.add(
            new ReadStatement(
                _localctx.start.getLine(),
                _localctx.start.getCharPositionInLine() + 1,
                ((InContext) _localctx).expr1.ast));
        setState(246);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(240);
              match(COMMA);
              setState(241);
              ((InContext) _localctx).expr2 = expression(0);
              _localctx.ast.add(
                  new ReadStatement(
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1,
                      ((InContext) _localctx).expr2.ast));
            }
          }
          setState(248);
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
  public static class Return_statementContext extends ParserRuleContext {
    public ReturnStatement ast;
    public Token RETURN;
    public ExpressionContext expression;

    public TerminalNode RETURN() {
      return getToken(XanaParser.RETURN, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Return_statementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_return_statement;
    }
  }

  public final Return_statementContext return_statement() throws RecognitionException {
    Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_return_statement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(249);
        ((Return_statementContext) _localctx).RETURN = match(RETURN);
        setState(250);
        ((Return_statementContext) _localctx).expression = expression(0);
        ((Return_statementContext) _localctx).ast =
            new ReturnStatement(
                ((Return_statementContext) _localctx).RETURN.getLine(),
                ((Return_statementContext) _localctx).RETURN.getCharPositionInLine() + 1,
                ((Return_statementContext) _localctx).expression.ast);
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
    public Expression ast;
    public ExpressionContext array;
    public ExpressionContext struct;
    public ExpressionContext expr;
    public ExpressionContext leftExpression;
    public ExpressionContext expression;
    public Token MINUS;
    public Token NOT;
    public Func_invocationContext func_invocation;
    public Token ID;
    public Simple_constantContext simple_constant;
    public Token op;
    public ExpressionContext rightExpression;
    public ExpressionContext index;
    public Token field;
    public Simple_typeContext new_type;

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

    public Func_invocationContext func_invocation() {
      return getRuleContext(Func_invocationContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public Simple_constantContext simple_constant() {
      return getRuleContext(Simple_constantContext.class, 0);
    }

    public TerminalNode ABRE_CORCHETE() {
      return getToken(XanaParser.ABRE_CORCHETE, 0);
    }

    public TerminalNode CIERRA_CORCHETE() {
      return getToken(XanaParser.CIERRA_CORCHETE, 0);
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
        setState(275);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
          case 1:
            {
              setState(254);
              match(ABRE_PARENTESIS);
              setState(255);
              ((ExpressionContext) _localctx).expression = expression(0);
              setState(256);
              match(CIERRA_PARENTESIS);
              ((ExpressionContext) _localctx).ast = ((ExpressionContext) _localctx).expression.ast;
            }
            break;
          case 2:
            {
              setState(259);
              ((ExpressionContext) _localctx).MINUS = match(MINUS);
              setState(260);
              ((ExpressionContext) _localctx).expression = expression(9);
              ((ExpressionContext) _localctx).ast =
                  new MinusOperation(
                      ((ExpressionContext) _localctx).MINUS.getLine(),
                      ((ExpressionContext) _localctx).MINUS.getCharPositionInLine() + 1,
                      ((ExpressionContext) _localctx).expression.ast);
            }
            break;
          case 3:
            {
              setState(263);
              ((ExpressionContext) _localctx).NOT = match(NOT);
              setState(264);
              ((ExpressionContext) _localctx).expression = expression(8);
              ((ExpressionContext) _localctx).ast =
                  new NotOperation(
                      ((ExpressionContext) _localctx).NOT.getLine(),
                      ((ExpressionContext) _localctx).NOT.getCharPositionInLine() + 1,
                      ((ExpressionContext) _localctx).expression.ast);
            }
            break;
          case 4:
            {
              setState(267);
              ((ExpressionContext) _localctx).func_invocation = func_invocation();
              ((ExpressionContext) _localctx).ast =
                  ((ExpressionContext) _localctx).func_invocation.ast;
            }
            break;
          case 5:
            {
              setState(270);
              ((ExpressionContext) _localctx).ID = match(ID);
              ((ExpressionContext) _localctx).ast =
                  new Variable(
                      ((ExpressionContext) _localctx).ID.getLine(),
                      ((ExpressionContext) _localctx).ID.getCharPositionInLine() + 1,
                      (((ExpressionContext) _localctx).ID != null
                          ? ((ExpressionContext) _localctx).ID.getText()
                          : null));
            }
            break;
          case 6:
            {
              setState(272);
              ((ExpressionContext) _localctx).simple_constant = simple_constant();
              ((ExpressionContext) _localctx).ast =
                  ((ExpressionContext) _localctx).simple_constant.ast;
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(314);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(312);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                case 1:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpression = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(277);
                    if (!(precpred(_ctx, 7)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                    setState(278);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(279);
                    ((ExpressionContext) _localctx).rightExpression =
                        ((ExpressionContext) _localctx).expression = expression(8);
                    ((ExpressionContext) _localctx).ast =
                        new ArithmeticOperation(
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1,
                            ((ExpressionContext) _localctx).leftExpression.ast,
                            (((ExpressionContext) _localctx).op != null
                                ? ((ExpressionContext) _localctx).op.getText()
                                : null),
                            ((ExpressionContext) _localctx).rightExpression.ast);
                  }
                  break;
                case 2:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpression = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(282);
                    if (!(precpred(_ctx, 6)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                    setState(283);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__6 || _la == MINUS)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(284);
                    ((ExpressionContext) _localctx).rightExpression =
                        ((ExpressionContext) _localctx).expression = expression(7);
                    ((ExpressionContext) _localctx).ast =
                        new ArithmeticOperation(
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1,
                            ((ExpressionContext) _localctx).leftExpression.ast,
                            (((ExpressionContext) _localctx).op != null
                                ? ((ExpressionContext) _localctx).op.getText()
                                : null),
                            ((ExpressionContext) _localctx).rightExpression.ast);
                  }
                  break;
                case 3:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpression = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(287);
                    if (!(precpred(_ctx, 5)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                    setState(288);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(289);
                    ((ExpressionContext) _localctx).rightExpression =
                        ((ExpressionContext) _localctx).expression = expression(6);
                    ((ExpressionContext) _localctx).ast =
                        new ComparisonOperation(
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1,
                            ((ExpressionContext) _localctx).leftExpression.ast,
                            (((ExpressionContext) _localctx).op != null
                                ? ((ExpressionContext) _localctx).op.getText()
                                : null),
                            ((ExpressionContext) _localctx).rightExpression.ast);
                  }
                  break;
                case 4:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.leftExpression = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(292);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(293);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__13 || _la == T__14)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(294);
                    ((ExpressionContext) _localctx).rightExpression =
                        ((ExpressionContext) _localctx).expression = expression(5);
                    ((ExpressionContext) _localctx).ast =
                        new LogicOperation(
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1,
                            ((ExpressionContext) _localctx).leftExpression.ast,
                            (((ExpressionContext) _localctx).op != null
                                ? ((ExpressionContext) _localctx).op.getText()
                                : null),
                            ((ExpressionContext) _localctx).rightExpression.ast);
                  }
                  break;
                case 5:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.array = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(297);
                    if (!(precpred(_ctx, 12)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                    setState(298);
                    match(ABRE_CORCHETE);
                    setState(299);
                    ((ExpressionContext) _localctx).index =
                        ((ExpressionContext) _localctx).expression = expression(0);
                    setState(300);
                    match(CIERRA_CORCHETE);
                    ((ExpressionContext) _localctx).ast =
                        new ArrayIndexing(
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1,
                            ((ExpressionContext) _localctx).array.ast,
                            ((ExpressionContext) _localctx).index.ast);
                  }
                  break;
                case 6:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.struct = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(303);
                    if (!(precpred(_ctx, 11)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                    setState(304);
                    match(DOT);
                    setState(305);
                    ((ExpressionContext) _localctx).field = match(ID);
                    ((ExpressionContext) _localctx).ast =
                        new FieldAccess(
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1,
                            ((ExpressionContext) _localctx).struct.ast,
                            (((ExpressionContext) _localctx).field != null
                                ? ((ExpressionContext) _localctx).field.getText()
                                : null));
                  }
                  break;
                case 7:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.expr = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(307);
                    if (!(precpred(_ctx, 10)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                    setState(308);
                    match(AS);
                    setState(309);
                    ((ExpressionContext) _localctx).new_type = simple_type();
                    ((ExpressionContext) _localctx).ast =
                        new Cast(
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1,
                            ((ExpressionContext) _localctx).expr.ast,
                            ((ExpressionContext) _localctx).new_type.ast);
                  }
                  break;
              }
            }
          }
          setState(316);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
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
    enterRule(_localctx, 46, RULE_simple_constant);
    try {
      setState(323);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case INT_CONSTANT:
          enterOuterAlt(_localctx, 1);
          {
            setState(317);
            ((Simple_constantContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);
            ((Simple_constantContext) _localctx).ast =
                new IntLiteral(
                    ((Simple_constantContext) _localctx).INT_CONSTANT.getLine(),
                    ((Simple_constantContext) _localctx).INT_CONSTANT.getCharPositionInLine() + 1,
                    Integer.parseInt(
                        (((Simple_constantContext) _localctx).INT_CONSTANT != null
                            ? ((Simple_constantContext) _localctx).INT_CONSTANT.getText()
                            : null)));
          }
          break;
        case CHAR_CONSTANT:
          enterOuterAlt(_localctx, 2);
          {
            setState(319);
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
            setState(321);
            ((Simple_constantContext) _localctx).REAL_CONSTANT = match(REAL_CONSTANT);
            ((Simple_constantContext) _localctx).ast =
                new DoubleLiteral(
                    ((Simple_constantContext) _localctx).REAL_CONSTANT.getLine(),
                    ((Simple_constantContext) _localctx).REAL_CONSTANT.getCharPositionInLine() + 1,
                    Double.parseDouble(
                        (((Simple_constantContext) _localctx).REAL_CONSTANT != null
                            ? ((Simple_constantContext) _localctx).REAL_CONSTANT.getText()
                            : null)));
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
      case 22:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 7);
      case 1:
        return precpred(_ctx, 6);
      case 2:
        return precpred(_ctx, 5);
      case 3:
        return precpred(_ctx, 4);
      case 4:
        return precpred(_ctx, 12);
      case 5:
        return precpred(_ctx, 11);
      case 6:
        return precpred(_ctx, 10);
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u0001-\u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
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
          + "\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005W\b\u0005"
          + "\n\u0005\f\u0005Z\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"
          + "\u0003\u0006`\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"
          + "e\b\u0007\n\u0007\f\u0007h\t\u0007\u0003\u0007j\b\u0007\u0001\b\u0001"
          + "\b\u0001\b\u0001\b\u0001\b\u0005\bq\b\b\n\b\f\bt\t\b\u0001\b\u0001\b\u0001"
          + "\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"
          + "\t\u0001\t\u0003\t\u0083\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0003\n\u008b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"
          + "\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0097\b"
          + "\f\n\f\f\f\u009a\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"
          + "\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00aa"
          + "\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"
          + "\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"
          + "\u000f\u0005\u000f\u00b8\b\u000f\n\u000f\f\u000f\u00bb\t\u000f\u0003\u000f"
          + "\u00bd\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"
          + "\u00c3\b\u0010\n\u0010\f\u0010\u00c6\t\u0010\u0001\u0010\u0001\u0010\u0005"
          + "\u0010\u00ca\b\u0010\n\u0010\f\u0010\u00cd\t\u0010\u0003\u0010\u00cf\b"
          + "\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"
          + "\u0011\u0005\u0011\u00d7\b\u0011\n\u0011\f\u0011\u00da\t\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"
          + "\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"
          + "\u0005\u0013\u00e9\b\u0013\n\u0013\f\u0013\u00ec\t\u0013\u0001\u0014\u0001"
          + "\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"
          + "\u0014\u00f5\b\u0014\n\u0014\f\u0014\u00f8\t\u0014\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0003\u0016\u0114\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0016\u0005\u0016\u0139\b\u0016\n\u0016\f\u0016\u013c\t\u0016\u0001"
          + "\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"
          + "\u0017\u0144\b\u0017\u0001\u0017\u0000\u0001,\u0018\u0000\u0002\u0004"
          + "\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""
          + "$&(*,.\u0000\u0004\u0001\u0000\u0004\u0006\u0002\u0000\u0007\u0007\u0010"
          + "\u0010\u0001\u0000\b\r\u0001\u0000\u000e\u000f\u0158\u00004\u0001\u0000"
          + "\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000"
          + "\u0006H\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\nS\u0001\u0000"
          + "\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000"
          + "\u0010k\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014"
          + "\u008a\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018"
          + "\u0093\u0001\u0000\u0000\u0000\u001a\u00a9\u0001\u0000\u0000\u0000\u001c"
          + "\u00ab\u0001\u0000\u0000\u0000\u001e\u00bc\u0001\u0000\u0000\u0000 \u00be"
          + "\u0001\u0000\u0000\u0000\"\u00d2\u0001\u0000\u0000\u0000$\u00dd\u0001"
          + "\u0000\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000(\u00ed\u0001\u0000\u0000"
          + "\u0000*\u00f9\u0001\u0000\u0000\u0000,\u0113\u0001\u0000\u0000\u0000."
          + "\u0143\u0001\u0000\u0000\u000003\u0003\u0010\b\u000013\u0003\u0006\u0003"
          + "\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000"
          + "\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001"
          + "\u0000\u0000\u000064\u0001\u0000\u0000\u000078\u0003\u0002\u0001\u0000"
          + "8\u0001\u0001\u0000\u0000\u00009:\u0005\u001f\u0000\u0000:;\u0005 \u0000"
          + "\u0000;<\u0005\u0014\u0000\u0000<=\u0005\u0015\u0000\u0000=>\u0005%\u0000"
          + "\u0000>?\u0003\u0004\u0002\u0000?@\u0005&\u0000\u0000@\u0003\u0001\u0000"
          + "\u0000\u0000AD\u0003\u0010\b\u0000BD\u0003\u001a\r\u0000CA\u0001\u0000"
          + "\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"
          + "\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000"
          + "\u0000GE\u0001\u0000\u0000\u0000HI\u0003\b\u0004\u0000IJ\u0003\n\u0005"
          + "\u0000J\u0007\u0001\u0000\u0000\u0000KL\u0005\u001f\u0000\u0000LM\u0005"
          + "-\u0000\u0000MN\u0005\u0014\u0000\u0000NO\u0003\u000e\u0007\u0000OP\u0005"
          + "\u0015\u0000\u0000PQ\u0005\"\u0000\u0000QR\u0003\f\u0006\u0000R\t\u0001"
          + "\u0000\u0000\u0000SX\u0005%\u0000\u0000TW\u0003\u0010\b\u0000UW\u0003"
          + "\u001a\r\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001"
          + "\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"
          + "Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005&\u0000\u0000"
          + "\\\u000b\u0001\u0000\u0000\u0000]`\u0003\u0014\n\u0000^`\u0005\u0016\u0000"
          + "\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`\r\u0001\u0000"
          + "\u0000\u0000af\u0003\u0010\b\u0000bc\u0005$\u0000\u0000ce\u0003\u0010"
          + "\b\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"
          + "\u0000\u0000fg\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001"
          + "\u0000\u0000\u0000ia\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"
          + "j\u000f\u0001\u0000\u0000\u0000kl\u0005-\u0000\u0000lr\u0006\b\uffff\uffff"
          + "\u0000mn\u0005$\u0000\u0000no\u0005-\u0000\u0000oq\u0006\b\uffff\uffff"
          + "\u0000pm\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000"
          + "\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001"
          + "\u0000\u0000\u0000uv\u0005\"\u0000\u0000vw\u0003\u0012\t\u0000wx\u0006"
          + "\b\uffff\uffff\u0000x\u0011\u0001\u0000\u0000\u0000yz\u0003\u0014\n\u0000"
          + "z{\u0006\t\uffff\uffff\u0000{\u0083\u0001\u0000\u0000\u0000|}\u0003\u0016"
          + "\u000b\u0000}~\u0006\t\uffff\uffff\u0000~\u0083\u0001\u0000\u0000\u0000"
          + "\u007f\u0080\u0003\u0018\f\u0000\u0080\u0081\u0006\t\uffff\uffff\u0000"
          + "\u0081\u0083\u0001\u0000\u0000\u0000\u0082y\u0001\u0000\u0000\u0000\u0082"
          + "|\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0083\u0013"
          + "\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u008b"
          + "\u0006\n\uffff\uffff\u0000\u0086\u0087\u0005\u0002\u0000\u0000\u0087\u008b"
          + "\u0006\n\uffff\uffff\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089\u008b"
          + "\u0006\n\uffff\uffff\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0086"
          + "\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0015"
          + "\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0012\u0000\u0000\u008d\u008e"
          + "\u0005*\u0000\u0000\u008e\u008f\u0005\"\u0000\u0000\u008f\u0090\u0003"
          + "\u0012\t\u0000\u0090\u0091\u0005\u0013\u0000\u0000\u0091\u0092\u0006\u000b"
          + "\uffff\uffff\u0000\u0092\u0017\u0001\u0000\u0000\u0000\u0093\u0094\u0005"
          + "#\u0000\u0000\u0094\u0098\u0005%\u0000\u0000\u0095\u0097\u0003\u0010\b"
          + "\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"
          + "\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"
          + "\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"
          + "\u0000\u009b\u009c\u0005&\u0000\u0000\u009c\u009d\u0006\f\uffff\uffff"
          + "\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u00aa\u0003\u001c\u000e"
          + "\u0000\u009f\u00aa\u0003 \u0010\u0000\u00a0\u00aa\u0003\"\u0011\u0000"
          + "\u00a1\u00aa\u0003$\u0012\u0000\u00a2\u00a3\u0003&\u0013\u0000\u00a3\u00a4"
          + "\u0006\r\uffff\uffff\u0000\u00a4\u00aa\u0001\u0000\u0000\u0000\u00a5\u00a6"
          + "\u0003(\u0014\u0000\u00a6\u00a7\u0006\r\uffff\uffff\u0000\u00a7\u00aa"
          + "\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003*\u0015\u0000\u00a9\u009e\u0001"
          + "\u0000\u0000\u0000\u00a9\u009f\u0001\u0000\u0000\u0000\u00a9\u00a0\u0001"
          + "\u0000\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9\u00a2\u0001"
          + "\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001"
          + "\u0000\u0000\u0000\u00aa\u001b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"
          + "-\u0000\u0000\u00ac\u00ad\u0005\u0014\u0000\u0000\u00ad\u00ae\u0003\u001e"
          + "\u000f\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\u00b0\u0006\u000e"
          + "\uffff\uffff\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003"
          + ",\u0016\u0000\u00b2\u00b9\u0006\u000f\uffff\uffff\u0000\u00b3\u00b4\u0005"
          + "$\u0000\u0000\u00b4\u00b5\u0003,\u0016\u0000\u00b5\u00b6\u0006\u000f\uffff"
          + "\uffff\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000"
          + "\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"
          + "\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"
          + "\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00b1\u0001\u0000"
          + "\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u001f\u0001\u0000"
          + "\u0000\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf\u00c0\u0003,\u0016"
          + "\u0000\u00c0\u00c4\u0005%\u0000\u0000\u00c1\u00c3\u0003\u001a\r\u0000"
          + "\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000"
          + "\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"
          + "\u00c5\u00ce\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000"
          + "\u00c7\u00cb\u0005\u001a\u0000\u0000\u00c8\u00ca\u0003\u001a\r\u0000\u00c9"
          + "\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"
          + "\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"
          + "\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"
          + "\u00c7\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"
          + "\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1!\u0001"
          + "\u0000\u0000\u0000\u00d2\u00d3\u0005\u001b\u0000\u0000\u00d3\u00d4\u0003"
          + ",\u0016\u0000\u00d4\u00d8\u0005%\u0000\u0000\u00d5\u00d7\u0003\u001a\r"
          + "\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000"
          + "\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"
          + "\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"
          + "\u0000\u00db\u00dc\u0005&\u0000\u0000\u00dc#\u0001\u0000\u0000\u0000\u00dd"
          + "\u00de\u0003,\u0016\u0000\u00de\u00df\u0005\u001e\u0000\u0000\u00df\u00e0"
          + "\u0003,\u0016\u0000\u00e0%\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u001c"
          + "\u0000\u0000\u00e2\u00e3\u0003,\u0016\u0000\u00e3\u00ea\u0006\u0013\uffff"
          + "\uffff\u0000\u00e4\u00e5\u0005$\u0000\u0000\u00e5\u00e6\u0003,\u0016\u0000"
          + "\u00e6\u00e7\u0006\u0013\uffff\uffff\u0000\u00e7\u00e9\u0001\u0000\u0000"
          + "\u0000\u00e8\u00e4\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"
          + "\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"
          + "\u0000\u00eb\'\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"
          + "\u00ed\u00ee\u0005\u001d\u0000\u0000\u00ee\u00ef\u0003,\u0016\u0000\u00ef"
          + "\u00f6\u0006\u0014\uffff\uffff\u0000\u00f0\u00f1\u0005$\u0000\u0000\u00f1"
          + "\u00f2\u0003,\u0016\u0000\u00f2\u00f3\u0006\u0014\uffff\uffff\u0000\u00f3"
          + "\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f5"
          + "\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6"
          + "\u00f7\u0001\u0000\u0000\u0000\u00f7)\u0001\u0000\u0000\u0000\u00f8\u00f6"
          + "\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005!\u0000\u0000\u00fa\u00fb\u0003"
          + ",\u0016\u0000\u00fb\u00fc\u0006\u0015\uffff\uffff\u0000\u00fc+\u0001\u0000"
          + "\u0000\u0000\u00fd\u00fe\u0006\u0016\uffff\uffff\u0000\u00fe\u00ff\u0005"
          + "\u0014\u0000\u0000\u00ff\u0100\u0003,\u0016\u0000\u0100\u0101\u0005\u0015"
          + "\u0000\u0000\u0101\u0102\u0006\u0016\uffff\uffff\u0000\u0102\u0114\u0001"
          + "\u0000\u0000\u0000\u0103\u0104\u0005\u0010\u0000\u0000\u0104\u0105\u0003"
          + ",\u0016\t\u0105\u0106\u0006\u0016\uffff\uffff\u0000\u0106\u0114\u0001"
          + "\u0000\u0000\u0000\u0107\u0108\u0005\u0011\u0000\u0000\u0108\u0109\u0003"
          + ",\u0016\b\u0109\u010a\u0006\u0016\uffff\uffff\u0000\u010a\u0114\u0001"
          + "\u0000\u0000\u0000\u010b\u010c\u0003\u001c\u000e\u0000\u010c\u010d\u0006"
          + "\u0016\uffff\uffff\u0000\u010d\u0114\u0001\u0000\u0000\u0000\u010e\u010f"
          + "\u0005-\u0000\u0000\u010f\u0114\u0006\u0016\uffff\uffff\u0000\u0110\u0111"
          + "\u0003.\u0017\u0000\u0111\u0112\u0006\u0016\uffff\uffff\u0000\u0112\u0114"
          + "\u0001\u0000\u0000\u0000\u0113\u00fd\u0001\u0000\u0000\u0000\u0113\u0103"
          + "\u0001\u0000\u0000\u0000\u0113\u0107\u0001\u0000\u0000\u0000\u0113\u010b"
          + "\u0001\u0000\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u0110"
          + "\u0001\u0000\u0000\u0000\u0114\u013a\u0001\u0000\u0000\u0000\u0115\u0116"
          + "\n\u0007\u0000\u0000\u0116\u0117\u0007\u0000\u0000\u0000\u0117\u0118\u0003"
          + ",\u0016\b\u0118\u0119\u0006\u0016\uffff\uffff\u0000\u0119\u0139\u0001"
          + "\u0000\u0000\u0000\u011a\u011b\n\u0006\u0000\u0000\u011b\u011c\u0007\u0001"
          + "\u0000\u0000\u011c\u011d\u0003,\u0016\u0007\u011d\u011e\u0006\u0016\uffff"
          + "\uffff\u0000\u011e\u0139\u0001\u0000\u0000\u0000\u011f\u0120\n\u0005\u0000"
          + "\u0000\u0120\u0121\u0007\u0002\u0000\u0000\u0121\u0122\u0003,\u0016\u0006"
          + "\u0122\u0123\u0006\u0016\uffff\uffff\u0000\u0123\u0139\u0001\u0000\u0000"
          + "\u0000\u0124\u0125\n\u0004\u0000\u0000\u0125\u0126\u0007\u0003\u0000\u0000"
          + "\u0126\u0127\u0003,\u0016\u0005\u0127\u0128\u0006\u0016\uffff\uffff\u0000"
          + "\u0128\u0139\u0001\u0000\u0000\u0000\u0129\u012a\n\f\u0000\u0000\u012a"
          + "\u012b\u0005\u0012\u0000\u0000\u012b\u012c\u0003,\u0016\u0000\u012c\u012d"
          + "\u0005\u0013\u0000\u0000\u012d\u012e\u0006\u0016\uffff\uffff\u0000\u012e"
          + "\u0139\u0001\u0000\u0000\u0000\u012f\u0130\n\u000b\u0000\u0000\u0130\u0131"
          + "\u0005\u0017\u0000\u0000\u0131\u0132\u0005-\u0000\u0000\u0132\u0139\u0006"
          + "\u0016\uffff\uffff\u0000\u0133\u0134\n\n\u0000\u0000\u0134\u0135\u0005"
          + "\u0018\u0000\u0000\u0135\u0136\u0003\u0014\n\u0000\u0136\u0137\u0006\u0016"
          + "\uffff\uffff\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0115\u0001"
          + "\u0000\u0000\u0000\u0138\u011a\u0001\u0000\u0000\u0000\u0138\u011f\u0001"
          + "\u0000\u0000\u0000\u0138\u0124\u0001\u0000\u0000\u0000\u0138\u0129\u0001"
          + "\u0000\u0000\u0000\u0138\u012f\u0001\u0000\u0000\u0000\u0138\u0133\u0001"
          + "\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001"
          + "\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b-\u0001\u0000"
          + "\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013e\u0005*\u0000"
          + "\u0000\u013e\u0144\u0006\u0017\uffff\uffff\u0000\u013f\u0140\u0005,\u0000"
          + "\u0000\u0140\u0144\u0006\u0017\uffff\uffff\u0000\u0141\u0142\u0005+\u0000"
          + "\u0000\u0142\u0144\u0006\u0017\uffff\uffff\u0000\u0143\u013d\u0001\u0000"
          + "\u0000\u0000\u0143\u013f\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"
          + "\u0000\u0000\u0144/\u0001\u0000\u0000\u0000\u001a24CEVX_fir\u0082\u008a"
          + "\u0098\u00a9\u00b9\u00bc\u00c4\u00cb\u00ce\u00d8\u00ea\u00f6\u0113\u0138"
          + "\u013a\u0143";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
