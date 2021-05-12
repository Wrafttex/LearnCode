// Generated from E:/Projects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
package LCTlang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LCTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Multi_comment=3, Single_comment=4, Function=5, Break=6, 
		For=7, Loop=8, If=9, Else=10, Square_root=11, OR=12, AND=13, Return=14, 
		Var=15, Output=16, End=17, Then=18, Solve=19, Times=20, LeftParen=21, 
		RightParen=22, LeftBracket=23, RightBracket=24, LeftBrace=25, RightBrace=26, 
		Colon=27, Semicolon=28, Comma=29, Plus=30, Minus=31, Multiply=32, Divide=33, 
		Power=34, Modulo=35, LessThan=36, MoreThan=37, Assign=38, LessEqual=39, 
		MoreEqual=40, NotEqual=41, Not=42, Equal=43, Increment=44, Decrement=45, 
		True=46, False=47, String=48, Int=49, Float=50, Identifier=51, BLOK_COMMENT=52, 
		LINE_COMMENT=53, Whitespace=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Newline", "Multi_comment", "Single_comment", "Function", 
			"Break", "For", "Loop", "If", "Else", "Square_root", "OR", "AND", "Return", 
			"Var", "Output", "End", "Then", "Solve", "Times", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Colon", "Semicolon", 
			"Comma", "Plus", "Minus", "Multiply", "Divide", "Power", "Modulo", "LessThan", 
			"MoreThan", "Assign", "LessEqual", "MoreEqual", "NotEqual", "Not", "Equal", 
			"Increment", "Decrement", "True", "False", "String", "Int", "Float", 
			"Identifier", "BLOK_COMMENT", "LINE_COMMENT", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'intersection'", "'log10'", null, null, "'function'", "'break'", 
			"'for'", "'loop'", "'if'", "'else'", "'sqrt'", "'OR'", "'AND'", "'return'", 
			"'var'", "'output'", "'end'", "'then'", "'solve'", "'times'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "':'", "';'", "','", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'%'", "'<'", "'>'", "'='", "'<='", "'>='", "'!='", 
			"'!'", "'=='", "'++'", "'--'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Multi_comment", "Single_comment", "Function", "Break", 
			"For", "Loop", "If", "Else", "Square_root", "OR", "AND", "Return", "Var", 
			"Output", "End", "Then", "Solve", "Times", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Colon", "Semicolon", 
			"Comma", "Plus", "Minus", "Multiply", "Divide", "Power", "Modulo", "LessThan", 
			"MoreThan", "Assign", "LessEqual", "MoreEqual", "NotEqual", "Not", "Equal", 
			"Increment", "Decrement", "True", "False", "String", "Int", "Float", 
			"Identifier", "BLOK_COMMENT", "LINE_COMMENT", "Whitespace"
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


	public LCTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LCT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u017b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0087\n\4\3"+
		"\4\5\4\u008a\n\4\3\5\3\5\3\5\3\5\7\5\u0090\n\5\f\5\16\5\u0093\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u009c\n\6\f\6\16\6\u009f\13\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\7\62\u013b\n\62\f\62\16\62\u013e\13\62\3\62\3"+
		"\62\3\63\6\63\u0143\n\63\r\63\16\63\u0144\3\64\7\64\u0148\n\64\f\64\16"+
		"\64\u014b\13\64\3\64\5\64\u014e\n\64\3\64\6\64\u0151\n\64\r\64\16\64\u0152"+
		"\3\65\3\65\7\65\u0157\n\65\f\65\16\65\u015a\13\65\3\66\3\66\3\66\3\66"+
		"\7\66\u0160\n\66\f\66\16\66\u0163\13\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\7\67\u016e\n\67\f\67\16\67\u0171\13\67\3\67\3\67\38\6"+
		"8\u0176\n8\r8\168\u0177\38\38\4\u0091\u0161\29\3\3\5\4\7\2\t\5\13\6\r"+
		"\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)"+
		"\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'"+
		"O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8\3\2\n\5\2\f\f\17\17"+
		"~~\4\2\f\f$$\3\2\62;\3\2\60\60\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u0186\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5~\3\2\2\2\7\u0089\3\2\2\2\t\u008b"+
		"\3\2\2\2\13\u0099\3\2\2\2\r\u00a2\3\2\2\2\17\u00ab\3\2\2\2\21\u00b1\3"+
		"\2\2\2\23\u00b5\3\2\2\2\25\u00ba\3\2\2\2\27\u00bd\3\2\2\2\31\u00c2\3\2"+
		"\2\2\33\u00c7\3\2\2\2\35\u00ca\3\2\2\2\37\u00ce\3\2\2\2!\u00d5\3\2\2\2"+
		"#\u00d9\3\2\2\2%\u00e0\3\2\2\2\'\u00e4\3\2\2\2)\u00e9\3\2\2\2+\u00ef\3"+
		"\2\2\2-\u00f5\3\2\2\2/\u00f7\3\2\2\2\61\u00f9\3\2\2\2\63\u00fb\3\2\2\2"+
		"\65\u00fd\3\2\2\2\67\u00ff\3\2\2\29\u0101\3\2\2\2;\u0103\3\2\2\2=\u0105"+
		"\3\2\2\2?\u0107\3\2\2\2A\u0109\3\2\2\2C\u010b\3\2\2\2E\u010d\3\2\2\2G"+
		"\u010f\3\2\2\2I\u0111\3\2\2\2K\u0113\3\2\2\2M\u0115\3\2\2\2O\u0117\3\2"+
		"\2\2Q\u0119\3\2\2\2S\u011c\3\2\2\2U\u011f\3\2\2\2W\u0122\3\2\2\2Y\u0124"+
		"\3\2\2\2[\u0127\3\2\2\2]\u012a\3\2\2\2_\u012d\3\2\2\2a\u0132\3\2\2\2c"+
		"\u0138\3\2\2\2e\u0142\3\2\2\2g\u014d\3\2\2\2i\u0154\3\2\2\2k\u015b\3\2"+
		"\2\2m\u0169\3\2\2\2o\u0175\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2tu\7g\2\2"+
		"uv\7t\2\2vw\7u\2\2wx\7g\2\2xy\7e\2\2yz\7v\2\2z{\7k\2\2{|\7q\2\2|}\7p\2"+
		"\2}\4\3\2\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7i\2\2\u0081\u0082"+
		"\7\63\2\2\u0082\u0083\7\62\2\2\u0083\6\3\2\2\2\u0084\u0086\7\17\2\2\u0085"+
		"\u0087\7\f\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u008a\7\f\2\2\u0089\u0084\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\b\3\2\2\2\u008b\u008c\7%\2\2\u008c\u008d\7/\2\2\u008d\u0091\3\2\2\2\u008e"+
		"\u0090\13\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7/\2\2\u0095\u0096\7%\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\5\2"+
		"\2\u0098\n\3\2\2\2\u0099\u009d\7%\2\2\u009a\u009c\n\2\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\6\2\2\u00a1\f\3\2\2\2"+
		"\u00a2\u00a3\7h\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6"+
		"\7e\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7q\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7m\2\2\u00b0\20\3\2\2\2\u00b1"+
		"\u00b2\7h\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2\2\u00b4\22\3\2\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7r\2\2"+
		"\u00b9\24\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7h\2\2\u00bc\26\3\2\2"+
		"\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7s\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7v\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00c9"+
		"\7T\2\2\u00c9\34\3\2\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd"+
		"\7F\2\2\u00cd\36\3\2\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1"+
		"\7v\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		" \3\2\2\2\u00d5\u00d6\7x\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7t\2\2\u00d8"+
		"\"\3\2\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7v\2\2\u00dc"+
		"\u00dd\7r\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7v\2\2\u00df$\3\2\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7f\2\2\u00e3&\3\2\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7p\2\2"+
		"\u00e8(\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7n\2"+
		"\2\u00ec\u00ed\7x\2\2\u00ed\u00ee\7g\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7"+
		"v\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7u\2\2\u00f4,\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6.\3\2\2\2\u00f7\u00f8\7"+
		"+\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\7]\2\2\u00fa\62\3\2\2\2\u00fb\u00fc"+
		"\7_\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\7}\2\2\u00fe\66\3\2\2\2\u00ff\u0100"+
		"\7\177\2\2\u01008\3\2\2\2\u0101\u0102\7<\2\2\u0102:\3\2\2\2\u0103\u0104"+
		"\7=\2\2\u0104<\3\2\2\2\u0105\u0106\7.\2\2\u0106>\3\2\2\2\u0107\u0108\7"+
		"-\2\2\u0108@\3\2\2\2\u0109\u010a\7/\2\2\u010aB\3\2\2\2\u010b\u010c\7,"+
		"\2\2\u010cD\3\2\2\2\u010d\u010e\7\61\2\2\u010eF\3\2\2\2\u010f\u0110\7"+
		"`\2\2\u0110H\3\2\2\2\u0111\u0112\7\'\2\2\u0112J\3\2\2\2\u0113\u0114\7"+
		">\2\2\u0114L\3\2\2\2\u0115\u0116\7@\2\2\u0116N\3\2\2\2\u0117\u0118\7?"+
		"\2\2\u0118P\3\2\2\2\u0119\u011a\7>\2\2\u011a\u011b\7?\2\2\u011bR\3\2\2"+
		"\2\u011c\u011d\7@\2\2\u011d\u011e\7?\2\2\u011eT\3\2\2\2\u011f\u0120\7"+
		"#\2\2\u0120\u0121\7?\2\2\u0121V\3\2\2\2\u0122\u0123\7#\2\2\u0123X\3\2"+
		"\2\2\u0124\u0125\7?\2\2\u0125\u0126\7?\2\2\u0126Z\3\2\2\2\u0127\u0128"+
		"\7-\2\2\u0128\u0129\7-\2\2\u0129\\\3\2\2\2\u012a\u012b\7/\2\2\u012b\u012c"+
		"\7/\2\2\u012c^\3\2\2\2\u012d\u012e\7v\2\2\u012e\u012f\7t\2\2\u012f\u0130"+
		"\7w\2\2\u0130\u0131\7g\2\2\u0131`\3\2\2\2\u0132\u0133\7h\2\2\u0133\u0134"+
		"\7c\2\2\u0134\u0135\7n\2\2\u0135\u0136\7u\2\2\u0136\u0137\7g\2\2\u0137"+
		"b\3\2\2\2\u0138\u013c\7$\2\2\u0139\u013b\n\3\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7$\2\2\u0140d\3\2\2\2\u0141\u0143"+
		"\t\4\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145f\3\2\2\2\u0146\u0148\t\4\2\2\u0147\u0146\3\2\2\2"+
		"\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\t\5\2\2\u014d\u0149\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0151\t\4\2\2\u0150\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"h\3\2\2\2\u0154\u0158\t\6\2\2\u0155\u0157\t\7\2\2\u0156\u0155\3\2\2\2"+
		"\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159j\3"+
		"\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7,\2\2\u015d"+
		"\u0161\3\2\2\2\u015e\u0160\13\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3"+
		"\2\2\2\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\7,\2\2\u0165\u0166\7\61\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0168\b\66\2\2\u0168l\3\2\2\2\u0169\u016a\7\61\2\2\u016a\u016b"+
		"\7\61\2\2\u016b\u016f\3\2\2\2\u016c\u016e\n\b\2\2\u016d\u016c\3\2\2\2"+
		"\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\b\67\2\2\u0173n\3\2\2\2\u0174"+
		"\u0176\t\t\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b8\2\2\u017a"+
		"p\3\2\2\2\20\2\u0086\u0089\u0091\u009d\u013c\u0144\u0149\u014d\u0152\u0158"+
		"\u0161\u016f\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}