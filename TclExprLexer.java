// Generated from TclExpr.g4 by ANTLR 4.7

  import java.util.*;
  import java.lang.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TclExprLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SET", "GETS", "PUTS", "EXPR", "IF", "THEN", "ELSEIF", "ELSE", "SWITCH", 
		"DEFAULT", "WHILE", "CONTINUE", "BREAK", "INCR", "FOR", "SIZE", "EXISTS", 
		"ARRAY", "PROC", "RETURN", "STDIN", "CASE", "TOKEN_IGUAL_STR", "TOKEN_DIFF_STR", 
		"TOKEN_LLAVE_IZQ", "TOKEN_LLAVE_DER", "TOKEN_DOLLAR", "TOKEN_PYC", "TOKEN_COR_IZQ", 
		"TOKEN_COR_DER", "TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_MAYOR", "TOKEN_MENOR", 
		"TOKEN_MAYOR_IGUAL", "TOKEN_MENOR_IGUAL", "TOKEN_IGUAL_NUM", "TOKEN_DIFF_NUM", 
		"TOKEN_AND", "TOKEN_OR", "TOKEN_NOT", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", 
		"TOKEN_DIV", "TOKEN_MOD", "TOKEN_POT", "ID", "TOKEN_DOUBLE", "TOKEN_INTEGER", 
		"TOKEN_STRING", "NEWLINE", "COMMENTS", "WS"
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


	public TclExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TclExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0168\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\7\61"+
		"\u012a\n\61\f\61\16\61\u012d\13\61\3\61\7\61\u0130\n\61\f\61\16\61\u0133"+
		"\13\61\5\61\u0135\n\61\3\62\6\62\u0138\n\62\r\62\16\62\u0139\3\62\3\62"+
		"\6\62\u013e\n\62\r\62\16\62\u013f\3\63\6\63\u0143\n\63\r\63\16\63\u0144"+
		"\3\64\3\64\6\64\u0149\n\64\r\64\16\64\u014a\3\64\3\64\3\65\5\65\u0150"+
		"\n\65\3\65\3\65\3\66\3\66\7\66\u0156\n\66\f\66\16\66\u0159\13\66\3\66"+
		"\5\66\u015c\n\66\3\66\3\66\3\66\3\66\3\67\6\67\u0163\n\67\r\67\16\67\u0164"+
		"\3\67\3\67\4\u014a\u0157\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8\3\2\5\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\2\u0172"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\3o\3\2\2\2\5s\3\2\2\2\7x\3\2\2\2\t}\3\2\2\2\13\u0082\3\2\2\2\r\u0085"+
		"\3\2\2\2\17\u008a\3\2\2\2\21\u0091\3\2\2\2\23\u0096\3\2\2\2\25\u009d\3"+
		"\2\2\2\27\u00a5\3\2\2\2\31\u00ab\3\2\2\2\33\u00b4\3\2\2\2\35\u00ba\3\2"+
		"\2\2\37\u00bf\3\2\2\2!\u00c3\3\2\2\2#\u00c8\3\2\2\2%\u00cf\3\2\2\2\'\u00d5"+
		"\3\2\2\2)\u00da\3\2\2\2+\u00e1\3\2\2\2-\u00e7\3\2\2\2/\u00ec\3\2\2\2\61"+
		"\u00ef\3\2\2\2\63\u00f2\3\2\2\2\65\u00f4\3\2\2\2\67\u00f6\3\2\2\29\u00f8"+
		"\3\2\2\2;\u00fa\3\2\2\2=\u00fc\3\2\2\2?\u00fe\3\2\2\2A\u0100\3\2\2\2C"+
		"\u0102\3\2\2\2E\u0104\3\2\2\2G\u0106\3\2\2\2I\u0109\3\2\2\2K\u010c\3\2"+
		"\2\2M\u010f\3\2\2\2O\u0112\3\2\2\2Q\u0115\3\2\2\2S\u0118\3\2\2\2U\u011a"+
		"\3\2\2\2W\u011c\3\2\2\2Y\u011e\3\2\2\2[\u0120\3\2\2\2]\u0122\3\2\2\2_"+
		"\u0124\3\2\2\2a\u0127\3\2\2\2c\u0137\3\2\2\2e\u0142\3\2\2\2g\u0146\3\2"+
		"\2\2i\u014f\3\2\2\2k\u0153\3\2\2\2m\u0162\3\2\2\2op\7u\2\2pq\7g\2\2qr"+
		"\7v\2\2r\4\3\2\2\2st\7i\2\2tu\7g\2\2uv\7v\2\2vw\7u\2\2w\6\3\2\2\2xy\7"+
		"r\2\2yz\7w\2\2z{\7v\2\2{|\7u\2\2|\b\3\2\2\2}~\7g\2\2~\177\7z\2\2\177\u0080"+
		"\7r\2\2\u0080\u0081\7t\2\2\u0081\n\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7h\2\2\u0084\f\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087\7j\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7p\2\2\u0089\16\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7n\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e\u008f\7k\2\2\u008f"+
		"\u0090\7h\2\2\u0090\20\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\22\3\2\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0098\7y\2\2\u0098\u0099\7k\2\2\u0099\u009a\7v\2\2\u009a\u009b\7e\2\2"+
		"\u009b\u009c\7j\2\2\u009c\24\3\2\2\2\u009d\u009e\7f\2\2\u009e\u009f\7"+
		"g\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3"+
		"\7n\2\2\u00a3\u00a4\7v\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7"+
		"\7j\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\30\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7w\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7"+
		"t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7m\2\2\u00b9\34"+
		"\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7e\2\2\u00bd"+
		"\u00be\7t\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2 \3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7|\2\2\u00c6\u00c7\7g\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7z\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7v\2\2"+
		"\u00cd\u00ce\7u\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7t\2"+
		"\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7{\2\2\u00d4&\3\2"+
		"\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9"+
		"\7e\2\2\u00d9(\3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7p\2\2\u00e0"+
		"*\3\2\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7f\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb.\3\2\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7s\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\62\3\2\2\2\u00f2\u00f3\7}\2\2\u00f3\64\3\2\2\2\u00f4"+
		"\u00f5\7\177\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7&\2\2\u00f78\3\2\2\2\u00f8"+
		"\u00f9\7=\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7]\2\2\u00fb<\3\2\2\2\u00fc\u00fd"+
		"\7_\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7*\2\2\u00ff@\3\2\2\2\u0100\u0101\7"+
		"+\2\2\u0101B\3\2\2\2\u0102\u0103\7@\2\2\u0103D\3\2\2\2\u0104\u0105\7>"+
		"\2\2\u0105F\3\2\2\2\u0106\u0107\7@\2\2\u0107\u0108\7?\2\2\u0108H\3\2\2"+
		"\2\u0109\u010a\7>\2\2\u010a\u010b\7?\2\2\u010bJ\3\2\2\2\u010c\u010d\7"+
		"?\2\2\u010d\u010e\7?\2\2\u010eL\3\2\2\2\u010f\u0110\7#\2\2\u0110\u0111"+
		"\7?\2\2\u0111N\3\2\2\2\u0112\u0113\7(\2\2\u0113\u0114\7(\2\2\u0114P\3"+
		"\2\2\2\u0115\u0116\7~\2\2\u0116\u0117\7~\2\2\u0117R\3\2\2\2\u0118\u0119"+
		"\7#\2\2\u0119T\3\2\2\2\u011a\u011b\7-\2\2\u011bV\3\2\2\2\u011c\u011d\7"+
		"/\2\2\u011dX\3\2\2\2\u011e\u011f\7,\2\2\u011fZ\3\2\2\2\u0120\u0121\7\61"+
		"\2\2\u0121\\\3\2\2\2\u0122\u0123\7\'\2\2\u0123^\3\2\2\2\u0124\u0125\7"+
		",\2\2\u0125\u0126\7,\2\2\u0126`\3\2\2\2\u0127\u012b\t\2\2\2\u0128\u012a"+
		"\t\2\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u0134\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\t\3"+
		"\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0131\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135b\3\2\2\2\u0136\u0138\t\3\2\2\u0137\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\7\60\2\2\u013c\u013e\t\3\2\2\u013d\u013c\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"d\3\2\2\2\u0141\u0143\t\3\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145f\3\2\2\2\u0146\u0148\7"+
		"$\2\2\u0147\u0149\13\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7$"+
		"\2\2\u014dh\3\2\2\2\u014e\u0150\7\17\2\2\u014f\u014e\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7\f\2\2\u0152j\3\2\2\2\u0153"+
		"\u0157\7%\2\2\u0154\u0156\13\2\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015c\7\17\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\f\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\b\66\2\2\u0160l\3\2\2\2\u0161\u0163\t\4\2\2\u0162\u0161\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\b\67\2\2\u0167n\3\2\2\2\16\2\u012b\u0131\u0134\u0139"+
		"\u013f\u0144\u014a\u014f\u0157\u015b\u0164\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}