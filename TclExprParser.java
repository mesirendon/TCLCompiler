// Generated from TclExpr.g4 by ANTLR 4.7

  import java.util.*;
  import java.lang.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TclExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SET=1, GETS=2, PUTS=3, EXPR=4, IF=5, THEN=6, ELSEIF=7, ELSE=8, SWITCH=9, 
		DEFAULT=10, WHILE=11, CONTINUE=12, BREAK=13, INCR=14, FOR=15, SIZE=16, 
		EXISTS=17, ARRAY=18, PROC=19, RETURN=20, STDIN=21, CASE=22, TOKEN_IGUAL_STR=23, 
		TOKEN_DIFF_STR=24, TOKEN_LLAVE_IZQ=25, TOKEN_LLAVE_DER=26, TOKEN_DOLLAR=27, 
		TOKEN_PYC=28, TOKEN_COR_IZQ=29, TOKEN_COR_DER=30, TOKEN_PAR_IZQ=31, TOKEN_PAR_DER=32, 
		TOKEN_MAYOR=33, TOKEN_MENOR=34, TOKEN_MAYOR_IGUAL=35, TOKEN_MENOR_IGUAL=36, 
		TOKEN_IGUAL_NUM=37, TOKEN_DIFF_NUM=38, TOKEN_AND=39, TOKEN_OR=40, TOKEN_NOT=41, 
		TOKEN_MAS=42, TOKEN_MENOS=43, TOKEN_MUL=44, TOKEN_DIV=45, TOKEN_MOD=46, 
		TOKEN_POT=47, ID=48, TOKEN_DOUBLE=49, TOKEN_INTEGER=50, TOKEN_STRING=51, 
		NEWLINE=52, COMMENTS=53, WS=54;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_execution_list = 2, RULE_exprs = 3, 
		RULE_sets_declaration = 4, RULE_puts_declaration = 5, RULE_expression = 6, 
		RULE_term = 7, RULE_factor = 8, RULE_pow = 9, RULE_elem = 10, RULE_number = 11;
	public static final String[] ruleNames = {
		"prog", "declaration", "execution_list", "exprs", "sets_declaration", 
		"puts_declaration", "expression", "term", "factor", "pow", "elem", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'set'", "'gets'", "'puts'", "'expr'", "'if'", "'then'", "'elseif'", 
		"'else'", "'switch'", "'default'", "'while'", "'continue'", "'break'", 
		"'incr'", "'for'", "'size'", "'exists'", "'array'", "'proc'", "'return'", 
		"'stdin'", "'case'", "'eq'", "'ne'", "'{'", "'}'", "'$'", "';'", "'['", 
		"']'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", 
		"'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SET", "GETS", "PUTS", "EXPR", "IF", "THEN", "ELSEIF", "ELSE", "SWITCH", 
		"DEFAULT", "WHILE", "CONTINUE", "BREAK", "INCR", "FOR", "SIZE", "EXISTS", 
		"ARRAY", "PROC", "RETURN", "STDIN", "CASE", "TOKEN_IGUAL_STR", "TOKEN_DIFF_STR", 
		"TOKEN_LLAVE_IZQ", "TOKEN_LLAVE_DER", "TOKEN_DOLLAR", "TOKEN_PYC", "TOKEN_COR_IZQ", 
		"TOKEN_COR_DER", "TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_MAYOR", "TOKEN_MENOR", 
		"TOKEN_MAYOR_IGUAL", "TOKEN_MENOR_IGUAL", "TOKEN_IGUAL_NUM", "TOKEN_DIFF_NUM", 
		"TOKEN_AND", "TOKEN_OR", "TOKEN_NOT", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", 
		"TOKEN_DIV", "TOKEN_MOD", "TOKEN_POT", "ID", "TOKEN_DOUBLE", "TOKEN_INTEGER", 
		"TOKEN_STRING", "NEWLINE", "COMMENTS", "WS"
	};
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

	@Override
	public String getGrammarFileName() { return "TclExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  Map<String, Object> memory = new HashMap<String, Object>();

	public TclExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				declaration();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << PUTS) | (1L << TOKEN_COR_IZQ) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Sets_declarationContext sets_declaration() {
			return getRuleContext(Sets_declarationContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(TclExprParser.TOKEN_PYC, 0); }
		public TerminalNode NEWLINE() { return getToken(TclExprParser.NEWLINE, 0); }
		public Puts_declarationContext puts_declaration() {
			return getRuleContext(Puts_declarationContext.class,0);
		}
		public TerminalNode TOKEN_COR_IZQ() { return getToken(TclExprParser.TOKEN_COR_IZQ, 0); }
		public Execution_listContext execution_list() {
			return getRuleContext(Execution_listContext.class,0);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(TclExprParser.TOKEN_COR_DER, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				sets_declaration();
				setState(30);
				match(TOKEN_PYC);
				setState(31);
				match(NEWLINE);
				}
				break;
			case PUTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				puts_declaration();
				setState(34);
				match(TOKEN_PYC);
				setState(35);
				match(NEWLINE);
				}
				break;
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(TOKEN_COR_IZQ);
				setState(38);
				execution_list();
				setState(39);
				match(TOKEN_COR_DER);
				setState(40);
				match(TOKEN_PYC);
				setState(41);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execution_listContext extends ParserRuleContext {
		public Double v;
		public ExprsContext exprs;
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public Execution_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterExecution_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitExecution_list(this);
		}
	}

	public final Execution_listContext execution_list() throws RecognitionException {
		Execution_listContext _localctx = new Execution_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_execution_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			((Execution_listContext)_localctx).exprs = exprs();
			((Execution_listContext)_localctx).v =  ((Execution_listContext)_localctx).exprs.v;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public Double v;
		public ExpressionContext expression;
		public TerminalNode EXPR() { return getToken(TclExprParser.EXPR, 0); }
		public TerminalNode TOKEN_LLAVE_IZQ() { return getToken(TclExprParser.TOKEN_LLAVE_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOKEN_LLAVE_DER() { return getToken(TclExprParser.TOKEN_LLAVE_DER, 0); }
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(EXPR);
			setState(50);
			match(TOKEN_LLAVE_IZQ);
			setState(51);
			((ExprsContext)_localctx).expression = expression(0);
			setState(52);
			match(TOKEN_LLAVE_DER);
			((ExprsContext)_localctx).v =  ((ExprsContext)_localctx).expression.v;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sets_declarationContext extends ParserRuleContext {
		public Token ID;
		public Token TOKEN_INTEGER;
		public Token TOKEN_DOUBLE;
		public Token TOKEN_STRING;
		public TerminalNode SET() { return getToken(TclExprParser.SET, 0); }
		public TerminalNode ID() { return getToken(TclExprParser.ID, 0); }
		public TerminalNode TOKEN_INTEGER() { return getToken(TclExprParser.TOKEN_INTEGER, 0); }
		public TerminalNode TOKEN_DOUBLE() { return getToken(TclExprParser.TOKEN_DOUBLE, 0); }
		public TerminalNode TOKEN_STRING() { return getToken(TclExprParser.TOKEN_STRING, 0); }
		public Sets_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sets_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterSets_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitSets_declaration(this);
		}
	}

	public final Sets_declarationContext sets_declaration() throws RecognitionException {
		Sets_declarationContext _localctx = new Sets_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sets_declaration);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(SET);
				setState(56);
				((Sets_declarationContext)_localctx).ID = match(ID);
				setState(57);
				((Sets_declarationContext)_localctx).TOKEN_INTEGER = match(TOKEN_INTEGER);
				memory.put((((Sets_declarationContext)_localctx).ID!=null?((Sets_declarationContext)_localctx).ID.getText():null), (((Sets_declarationContext)_localctx).TOKEN_INTEGER!=null?Integer.valueOf(((Sets_declarationContext)_localctx).TOKEN_INTEGER.getText()):0));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(SET);
				setState(60);
				((Sets_declarationContext)_localctx).ID = match(ID);
				setState(61);
				((Sets_declarationContext)_localctx).TOKEN_DOUBLE = match(TOKEN_DOUBLE);
				memory.put((((Sets_declarationContext)_localctx).ID!=null?((Sets_declarationContext)_localctx).ID.getText():null), Double.parseDouble((((Sets_declarationContext)_localctx).TOKEN_DOUBLE!=null?((Sets_declarationContext)_localctx).TOKEN_DOUBLE.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(SET);
				setState(64);
				((Sets_declarationContext)_localctx).ID = match(ID);
				setState(65);
				((Sets_declarationContext)_localctx).TOKEN_STRING = match(TOKEN_STRING);
				memory.put((((Sets_declarationContext)_localctx).ID!=null?((Sets_declarationContext)_localctx).ID.getText():null), (((Sets_declarationContext)_localctx).TOKEN_STRING!=null?((Sets_declarationContext)_localctx).TOKEN_STRING.getText():null).replaceAll("\"", ""));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Puts_declarationContext extends ParserRuleContext {
		public Token TOKEN_INTEGER;
		public Token TOKEN_DOUBLE;
		public Token TOKEN_STRING;
		public Token ID;
		public Execution_listContext execution_list;
		public TerminalNode PUTS() { return getToken(TclExprParser.PUTS, 0); }
		public TerminalNode TOKEN_INTEGER() { return getToken(TclExprParser.TOKEN_INTEGER, 0); }
		public TerminalNode TOKEN_DOUBLE() { return getToken(TclExprParser.TOKEN_DOUBLE, 0); }
		public TerminalNode TOKEN_STRING() { return getToken(TclExprParser.TOKEN_STRING, 0); }
		public TerminalNode TOKEN_DOLLAR() { return getToken(TclExprParser.TOKEN_DOLLAR, 0); }
		public TerminalNode ID() { return getToken(TclExprParser.ID, 0); }
		public TerminalNode TOKEN_COR_IZQ() { return getToken(TclExprParser.TOKEN_COR_IZQ, 0); }
		public Execution_listContext execution_list() {
			return getRuleContext(Execution_listContext.class,0);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(TclExprParser.TOKEN_COR_DER, 0); }
		public Puts_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterPuts_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitPuts_declaration(this);
		}
	}

	public final Puts_declarationContext puts_declaration() throws RecognitionException {
		Puts_declarationContext _localctx = new Puts_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_puts_declaration);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(PUTS);
				setState(70);
				((Puts_declarationContext)_localctx).TOKEN_INTEGER = match(TOKEN_INTEGER);
				System.out.println((((Puts_declarationContext)_localctx).TOKEN_INTEGER!=null?((Puts_declarationContext)_localctx).TOKEN_INTEGER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(PUTS);
				setState(73);
				((Puts_declarationContext)_localctx).TOKEN_DOUBLE = match(TOKEN_DOUBLE);
				System.out.println((((Puts_declarationContext)_localctx).TOKEN_DOUBLE!=null?((Puts_declarationContext)_localctx).TOKEN_DOUBLE.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(PUTS);
				setState(76);
				((Puts_declarationContext)_localctx).TOKEN_STRING = match(TOKEN_STRING);
				System.out.println((((Puts_declarationContext)_localctx).TOKEN_STRING!=null?((Puts_declarationContext)_localctx).TOKEN_STRING.getText():null).replaceAll("\"", ""));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(PUTS);
				setState(79);
				match(TOKEN_DOLLAR);
				setState(80);
				((Puts_declarationContext)_localctx).ID = match(ID);

				      Object x = memory.get((((Puts_declarationContext)_localctx).ID!=null?((Puts_declarationContext)_localctx).ID.getText():null));
				      if (x == null) {
				        System.out.println("<" + (((Puts_declarationContext)_localctx).ID!=null?((Puts_declarationContext)_localctx).ID.getLine():0) + "," + ( (((Puts_declarationContext)_localctx).ID!=null?((Puts_declarationContext)_localctx).ID.getCharPositionInLine():0) + 1 ) + "> Error semantico: la variable '" + (((Puts_declarationContext)_localctx).ID!=null?((Puts_declarationContext)_localctx).ID.getText():null) + "' no ha sido declarada.");
				        System.exit(0);
				      }
				      else
				        System.out.println(x);
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(PUTS);
				setState(83);
				match(TOKEN_COR_IZQ);
				setState(84);
				((Puts_declarationContext)_localctx).execution_list = execution_list();
				setState(85);
				match(TOKEN_COR_DER);
				System.out.println(((Puts_declarationContext)_localctx).execution_list.v);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Double v;
		public ExpressionContext a;
		public TermContext term;
		public TermContext b;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode TOKEN_MAS() { return getToken(TclExprParser.TOKEN_MAS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOKEN_MENOS() { return getToken(TclExprParser.TOKEN_MENOS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitExpression(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			((ExpressionContext)_localctx).term = term(0);
			 ((ExpressionContext)_localctx).v =  ((ExpressionContext)_localctx).term.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(95);
						match(TOKEN_MAS);
						setState(96);
						((ExpressionContext)_localctx).b = ((ExpressionContext)_localctx).term = term(0);
						 ((ExpressionContext)_localctx).v =  ((ExpressionContext)_localctx).a.v + ((ExpressionContext)_localctx).b.v; 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						match(TOKEN_MENOS);
						setState(101);
						((ExpressionContext)_localctx).b = ((ExpressionContext)_localctx).term = term(0);
						 ((ExpressionContext)_localctx).v =  ((ExpressionContext)_localctx).a.v - ((ExpressionContext)_localctx).b.v; 
						}
						break;
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Double v;
		public TermContext a;
		public FactorContext factor;
		public FactorContext b;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode TOKEN_MUL() { return getToken(TclExprParser.TOKEN_MUL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode TOKEN_DIV() { return getToken(TclExprParser.TOKEN_DIV, 0); }
		public TerminalNode TOKEN_MOD() { return getToken(TclExprParser.TOKEN_MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			((TermContext)_localctx).factor = factor();
			 ((TermContext)_localctx).v =  ((TermContext)_localctx).factor.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(114);
						match(TOKEN_MUL);
						setState(115);
						((TermContext)_localctx).b = ((TermContext)_localctx).factor = factor();
						 ((TermContext)_localctx).v =  ((TermContext)_localctx).a.v * ((TermContext)_localctx).b.v; 
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(118);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(119);
						match(TOKEN_DIV);
						setState(120);
						((TermContext)_localctx).b = ((TermContext)_localctx).factor = factor();
						 ((TermContext)_localctx).v =  ((TermContext)_localctx).a.v / ((TermContext)_localctx).b.v; 
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(123);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(124);
						match(TOKEN_MOD);
						setState(125);
						((TermContext)_localctx).b = ((TermContext)_localctx).factor = factor();
						 ((TermContext)_localctx).v =  ((TermContext)_localctx).a.v % ((TermContext)_localctx).b.v; 
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Double v;
		public PowContext a;
		public FactorContext b;
		public PowContext pow;
		public TerminalNode TOKEN_POT() { return getToken(TclExprParser.TOKEN_POT, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((FactorContext)_localctx).a = pow();
				setState(134);
				match(TOKEN_POT);
				setState(135);
				((FactorContext)_localctx).b = factor();
				 ((FactorContext)_localctx).v =  Math.pow(((FactorContext)_localctx).a.v, ((FactorContext)_localctx).b.v); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				((FactorContext)_localctx).pow = pow();
				 ((FactorContext)_localctx).v =  ((FactorContext)_localctx).pow.v; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowContext extends ParserRuleContext {
		public Double v;
		public PowContext a;
		public ElemContext elem;
		public TerminalNode TOKEN_MENOS() { return getToken(TclExprParser.TOKEN_MENOS, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode TOKEN_NOT() { return getToken(TclExprParser.TOKEN_NOT, 0); }
		public ElemContext elem() {
			return getRuleContext(ElemContext.class,0);
		}
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitPow(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pow);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(TOKEN_MENOS);
				setState(144);
				((PowContext)_localctx).a = pow();
				 ((PowContext)_localctx).v =  -((PowContext)_localctx).a.v; 
				}
				break;
			case TOKEN_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(TOKEN_NOT);
				setState(148);
				((PowContext)_localctx).a = pow();
				 ((PowContext)_localctx).v =  (((PowContext)_localctx).a.v == 0) ? 1.0 : 0.0; 
				}
				break;
			case TOKEN_DOLLAR:
			case TOKEN_PAR_IZQ:
			case TOKEN_DOUBLE:
			case TOKEN_INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				((PowContext)_localctx).elem = elem();
				 ((PowContext)_localctx).v =  ((PowContext)_localctx).elem.v; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElemContext extends ParserRuleContext {
		public Double v;
		public NumberContext number;
		public Token ID;
		public ExpressionContext expression;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TOKEN_DOLLAR() { return getToken(TclExprParser.TOKEN_DOLLAR, 0); }
		public TerminalNode ID() { return getToken(TclExprParser.ID, 0); }
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TclExprParser.TOKEN_PAR_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(TclExprParser.TOKEN_PAR_DER, 0); }
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitElem(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elem);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_DOUBLE:
			case TOKEN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				((ElemContext)_localctx).number = number();
				((ElemContext)_localctx).v =  ((ElemContext)_localctx).number.v;
				}
				break;
			case TOKEN_DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(TOKEN_DOLLAR);
				setState(160);
				((ElemContext)_localctx).ID = match(ID);

				      Object x = memory.get((((ElemContext)_localctx).ID!=null?((ElemContext)_localctx).ID.getText():null));
				      if (x == null)
				        System.out.println("<" + (((ElemContext)_localctx).ID!=null?((ElemContext)_localctx).ID.getLine():0) + "," + ( (((ElemContext)_localctx).ID!=null?((ElemContext)_localctx).ID.getCharPositionInLine():0) + 1 ) + "> Error semantico: la variable '" + (((ElemContext)_localctx).ID!=null?((ElemContext)_localctx).ID.getText():null) + "' no ha sido declarada.");
				      else if (x instanceof Integer)
				        ((ElemContext)_localctx).v =  (Integer) x + 0.0;
				      else if (x instanceof Double)
				        ((ElemContext)_localctx).v =  (Double) x;
				      else {
				        System.out.println("<" + (((ElemContext)_localctx).ID!=null?((ElemContext)_localctx).ID.getLine():0) + "," + ( (((ElemContext)_localctx).ID!=null?((ElemContext)_localctx).ID.getCharPositionInLine():0) + 1 ) + "> Error semantico: Tipos de datos incompatibles. Se esperaba tipo double, integer. Se encontro tipo string");
				        System.exit(0);
				      }
				    
				}
				break;
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(TOKEN_PAR_IZQ);
				setState(163);
				((ElemContext)_localctx).expression = expression(0);
				setState(164);
				match(TOKEN_PAR_DER);
				 ((ElemContext)_localctx).v =  ((ElemContext)_localctx).expression.v; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public Double v;
		public Token TOKEN_INTEGER;
		public Token TOKEN_DOUBLE;
		public TerminalNode TOKEN_INTEGER() { return getToken(TclExprParser.TOKEN_INTEGER, 0); }
		public TerminalNode TOKEN_DOUBLE() { return getToken(TclExprParser.TOKEN_DOUBLE, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((NumberContext)_localctx).TOKEN_INTEGER = match(TOKEN_INTEGER);
				((NumberContext)_localctx).v =  Double.parseDouble((((NumberContext)_localctx).TOKEN_INTEGER!=null?((NumberContext)_localctx).TOKEN_INTEGER.getText():null));
				}
				break;
			case TOKEN_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((NumberContext)_localctx).TOKEN_DOUBLE = match(TOKEN_DOUBLE);
				((NumberContext)_localctx).v =  Double.parseDouble((((NumberContext)_localctx).TOKEN_DOUBLE!=null?((NumberContext)_localctx).TOKEN_DOUBLE.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 7:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6F\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0083\n\t\f\t\16\t\u0086\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\3\r\3\r\5\r\u00b0\n\r\3\r\2\4"+
		"\16\20\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00ba\2\33\3\2\2\2\4.\3"+
		"\2\2\2\6\60\3\2\2\2\b\63\3\2\2\2\nE\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20"+
		"o\3\2\2\2\22\u008f\3\2\2\2\24\u009c\3\2\2\2\26\u00a9\3\2\2\2\30\u00af"+
		"\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\3\3\2\2\2\37 \5\n\6\2 !\7\36\2\2!\"\7\66\2\2\"/\3\2\2\2#$"+
		"\5\f\7\2$%\7\36\2\2%&\7\66\2\2&/\3\2\2\2\'(\7\37\2\2()\5\6\4\2)*\7 \2"+
		"\2*+\7\36\2\2+,\7\66\2\2,/\3\2\2\2-/\7\66\2\2.\37\3\2\2\2.#\3\2\2\2.\'"+
		"\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61\5\b\5\2\61\62\b\4\1\2\62\7\3\2\2\2"+
		"\63\64\7\6\2\2\64\65\7\33\2\2\65\66\5\16\b\2\66\67\7\34\2\2\678\b\5\1"+
		"\28\t\3\2\2\29:\7\3\2\2:;\7\62\2\2;<\7\64\2\2<F\b\6\1\2=>\7\3\2\2>?\7"+
		"\62\2\2?@\7\63\2\2@F\b\6\1\2AB\7\3\2\2BC\7\62\2\2CD\7\65\2\2DF\b\6\1\2"+
		"E9\3\2\2\2E=\3\2\2\2EA\3\2\2\2F\13\3\2\2\2GH\7\5\2\2HI\7\64\2\2I[\b\7"+
		"\1\2JK\7\5\2\2KL\7\63\2\2L[\b\7\1\2MN\7\5\2\2NO\7\65\2\2O[\b\7\1\2PQ\7"+
		"\5\2\2QR\7\35\2\2RS\7\62\2\2S[\b\7\1\2TU\7\5\2\2UV\7\37\2\2VW\5\6\4\2"+
		"WX\7 \2\2XY\b\7\1\2Y[\3\2\2\2ZG\3\2\2\2ZJ\3\2\2\2ZM\3\2\2\2ZP\3\2\2\2"+
		"ZT\3\2\2\2[\r\3\2\2\2\\]\b\b\1\2]^\5\20\t\2^_\b\b\1\2_l\3\2\2\2`a\f\5"+
		"\2\2ab\7,\2\2bc\5\20\t\2cd\b\b\1\2dk\3\2\2\2ef\f\4\2\2fg\7-\2\2gh\5\20"+
		"\t\2hi\b\b\1\2ik\3\2\2\2j`\3\2\2\2je\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2m\17\3\2\2\2nl\3\2\2\2op\b\t\1\2pq\5\22\n\2qr\b\t\1\2r\u0084\3\2\2"+
		"\2st\f\6\2\2tu\7.\2\2uv\5\22\n\2vw\b\t\1\2w\u0083\3\2\2\2xy\f\5\2\2yz"+
		"\7/\2\2z{\5\22\n\2{|\b\t\1\2|\u0083\3\2\2\2}~\f\4\2\2~\177\7\60\2\2\177"+
		"\u0080\5\22\n\2\u0080\u0081\b\t\1\2\u0081\u0083\3\2\2\2\u0082s\3\2\2\2"+
		"\u0082x\3\2\2\2\u0082}\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\21\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\5\24\13\2\u0088\u0089\7\61\2\2\u0089\u008a\5\22\n\2\u008a\u008b\b\n\1"+
		"\2\u008b\u0090\3\2\2\2\u008c\u008d\5\24\13\2\u008d\u008e\b\n\1\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u008c\3\2\2\2\u0090\23\3\2\2"+
		"\2\u0091\u0092\7-\2\2\u0092\u0093\5\24\13\2\u0093\u0094\b\13\1\2\u0094"+
		"\u009d\3\2\2\2\u0095\u0096\7+\2\2\u0096\u0097\5\24\13\2\u0097\u0098\b"+
		"\13\1\2\u0098\u009d\3\2\2\2\u0099\u009a\5\26\f\2\u009a\u009b\b\13\1\2"+
		"\u009b\u009d\3\2\2\2\u009c\u0091\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0099"+
		"\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\5\30\r\2\u009f\u00a0\b\f\1\2\u00a0"+
		"\u00aa\3\2\2\2\u00a1\u00a2\7\35\2\2\u00a2\u00a3\7\62\2\2\u00a3\u00aa\b"+
		"\f\1\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7\"\2\2\u00a7"+
		"\u00a8\b\f\1\2\u00a8\u00aa\3\2\2\2\u00a9\u009e\3\2\2\2\u00a9\u00a1\3\2"+
		"\2\2\u00a9\u00a4\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\7\64\2\2\u00ac\u00b0"+
		"\b\r\1\2\u00ad\u00ae\7\63\2\2\u00ae\u00b0\b\r\1\2\u00af\u00ab\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00b0\31\3\2\2\2\16\35.EZjl\u0082\u0084\u008f\u009c"+
		"\u00a9\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}