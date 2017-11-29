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
		NEWLINE=52, WS=53, COMMENTS=54;
	public static final int
		RULE_prog = 0, RULE_declaration_list = 1, RULE_declaration = 2, RULE_sets_declaration = 3, 
		RULE_puts_declaration = 4;
	public static final String[] ruleNames = {
		"prog", "declaration_list", "declaration", "sets_declaration", "puts_declaration"
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
		"TOKEN_STRING", "NEWLINE", "WS", "COMMENTS"
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
		public List<Declaration_listContext> declaration_list() {
			return getRuleContexts(Declaration_listContext.class);
		}
		public Declaration_listContext declaration_list(int i) {
			return getRuleContext(Declaration_listContext.class,i);
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				declaration_list();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << PUTS) | (1L << NEWLINE))) != 0) );
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

	public static class Declaration_listContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TclExprParser.NEWLINE, 0); }
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).enterDeclaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TclExprListener ) ((TclExprListener)listener).exitDeclaration_list(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration_list);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				declaration();
				setState(16);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Sets_declarationContext sets_declaration() {
			return getRuleContext(Sets_declarationContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(TclExprParser.TOKEN_PYC, 0); }
		public Puts_declarationContext puts_declaration() {
			return getRuleContext(Puts_declarationContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				sets_declaration();
				setState(22);
				match(TOKEN_PYC);
				}
				break;
			case PUTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				puts_declaration();
				setState(25);
				match(TOKEN_PYC);
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
		enterRule(_localctx, 6, RULE_sets_declaration);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(SET);
				setState(30);
				((Sets_declarationContext)_localctx).ID = match(ID);
				setState(31);
				((Sets_declarationContext)_localctx).TOKEN_INTEGER = match(TOKEN_INTEGER);
				memory.put((((Sets_declarationContext)_localctx).ID!=null?((Sets_declarationContext)_localctx).ID.getText():null), (((Sets_declarationContext)_localctx).TOKEN_INTEGER!=null?Integer.valueOf(((Sets_declarationContext)_localctx).TOKEN_INTEGER.getText()):0));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(SET);
				setState(34);
				((Sets_declarationContext)_localctx).ID = match(ID);
				setState(35);
				((Sets_declarationContext)_localctx).TOKEN_DOUBLE = match(TOKEN_DOUBLE);
				memory.put((((Sets_declarationContext)_localctx).ID!=null?((Sets_declarationContext)_localctx).ID.getText():null), Double.parseDouble((((Sets_declarationContext)_localctx).TOKEN_DOUBLE!=null?((Sets_declarationContext)_localctx).TOKEN_DOUBLE.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(SET);
				setState(38);
				((Sets_declarationContext)_localctx).ID = match(ID);
				setState(39);
				((Sets_declarationContext)_localctx).TOKEN_STRING = match(TOKEN_STRING);
				memory.put((((Sets_declarationContext)_localctx).ID!=null?((Sets_declarationContext)_localctx).ID.getText():null), (((Sets_declarationContext)_localctx).TOKEN_STRING!=null?((Sets_declarationContext)_localctx).TOKEN_STRING.getText():null));
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
		public TerminalNode PUTS() { return getToken(TclExprParser.PUTS, 0); }
		public TerminalNode TOKEN_INTEGER() { return getToken(TclExprParser.TOKEN_INTEGER, 0); }
		public TerminalNode TOKEN_DOUBLE() { return getToken(TclExprParser.TOKEN_DOUBLE, 0); }
		public TerminalNode TOKEN_STRING() { return getToken(TclExprParser.TOKEN_STRING, 0); }
		public TerminalNode TOKEN_DOLLAR() { return getToken(TclExprParser.TOKEN_DOLLAR, 0); }
		public TerminalNode ID() { return getToken(TclExprParser.ID, 0); }
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
		enterRule(_localctx, 8, RULE_puts_declaration);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(PUTS);
				setState(44);
				((Puts_declarationContext)_localctx).TOKEN_INTEGER = match(TOKEN_INTEGER);
				System.out.println((((Puts_declarationContext)_localctx).TOKEN_INTEGER!=null?((Puts_declarationContext)_localctx).TOKEN_INTEGER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(PUTS);
				setState(47);
				((Puts_declarationContext)_localctx).TOKEN_DOUBLE = match(TOKEN_DOUBLE);
				System.out.println((((Puts_declarationContext)_localctx).TOKEN_DOUBLE!=null?((Puts_declarationContext)_localctx).TOKEN_DOUBLE.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(PUTS);
				setState(50);
				((Puts_declarationContext)_localctx).TOKEN_STRING = match(TOKEN_STRING);
				System.out.println((((Puts_declarationContext)_localctx).TOKEN_STRING!=null?((Puts_declarationContext)_localctx).TOKEN_STRING.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(PUTS);
				setState(53);
				match(TOKEN_DOLLAR);
				setState(54);
				((Puts_declarationContext)_localctx).ID = match(ID);

				      Object x = memory.get((((Puts_declarationContext)_localctx).ID!=null?((Puts_declarationContext)_localctx).ID.getText():null));
				      if (x == null)
				        System.out.println("<" + (((Puts_declarationContext)_localctx).ID!=null?((Puts_declarationContext)_localctx).ID.getLine():0) + "," + ( (((Puts_declarationContext)_localctx).ID!=null?((Puts_declarationContext)_localctx).ID.getCharPositionInLine():0) + 1 ) + "> Error semantico: la variable '" + (((Puts_declarationContext)_localctx).ID!=null?((Puts_declarationContext)_localctx).ID.getText():null) + "' no ha sido declarada.");
				    
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38=\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3\5"+
		"\3\26\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6;\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2?\2\r\3\2\2\2\4\25\3"+
		"\2\2\2\6\35\3\2\2\2\b+\3\2\2\2\n:\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16"+
		"\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23"+
		"\7\66\2\2\23\26\3\2\2\2\24\26\7\66\2\2\25\21\3\2\2\2\25\24\3\2\2\2\26"+
		"\5\3\2\2\2\27\30\5\b\5\2\30\31\7\36\2\2\31\36\3\2\2\2\32\33\5\n\6\2\33"+
		"\34\7\36\2\2\34\36\3\2\2\2\35\27\3\2\2\2\35\32\3\2\2\2\36\7\3\2\2\2\37"+
		" \7\3\2\2 !\7\62\2\2!\"\7\64\2\2\",\b\5\1\2#$\7\3\2\2$%\7\62\2\2%&\7\63"+
		"\2\2&,\b\5\1\2\'(\7\3\2\2()\7\62\2\2)*\7\65\2\2*,\b\5\1\2+\37\3\2\2\2"+
		"+#\3\2\2\2+\'\3\2\2\2,\t\3\2\2\2-.\7\5\2\2./\7\64\2\2/;\b\6\1\2\60\61"+
		"\7\5\2\2\61\62\7\63\2\2\62;\b\6\1\2\63\64\7\5\2\2\64\65\7\65\2\2\65;\b"+
		"\6\1\2\66\67\7\5\2\2\678\7\35\2\289\7\62\2\29;\b\6\1\2:-\3\2\2\2:\60\3"+
		"\2\2\2:\63\3\2\2\2:\66\3\2\2\2;\13\3\2\2\2\7\17\25\35+:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}