// Generated from C:/Users/Nobody/Documents/aau/4/project/LearnCode-branch3/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Multi_comment=6, Single_comment=7, 
		Function=8, Break=9, For=10, If=11, Else=12, Square_root=13, OR=14, AND=15, 
		True=16, False=17, Return=18, Var=19, Log10=20, Print=21, Solve=22, End=23, 
		Then=24, LeftParen=25, RightParen=26, LeftBracket=27, RightBracket=28, 
		LeftBrace=29, RightBrace=30, Colon=31, Semicolon=32, Comma=33, Plus=34, 
		Minus=35, Multiply=36, Divide=37, Power=38, Modulo=39, LessThan=40, MoreThan=41, 
		Assign=42, LessEqual=43, MoreEqual=44, NotEqual=45, Not=46, Equal=47, 
		String=48, Int=49, Float=50, Identifier=51, Whitespace=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "Newline", "Multi_comment", "Single_comment", 
			"Function", "Break", "For", "If", "Else", "Square_root", "OR", "AND", 
			"True", "False", "Return", "Var", "Log10", "Print", "Solve", "End", "Then", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Colon", "Semicolon", "Comma", "Plus", "Minus", "Multiply", 
			"Divide", "Power", "Modulo", "LessThan", "MoreThan", "Assign", "LessEqual", 
			"MoreEqual", "NotEqual", "Not", "Equal", "String", "Int", "Float", "Identifier", 
			"Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", "'test'", "'from'", "'to'", null, null, "'function'", 
			"'break'", "'loop'", "'if'", "'else'", "'sqrt'", "'OR'", "'AND'", "'true'", 
			"'false'", "'return'", "'var'", "'log10'", "'output'", "'solve'", "'end'", 
			"'then'", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "';'", "','", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'<'", "'>'", "'='", "'<='", 
			"'>='", "'!='", "'!'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "Multi_comment", "Single_comment", 
			"Function", "Break", "For", "If", "Else", "Square_root", "OR", "AND", 
			"True", "False", "Return", "Var", "Log10", "Print", "Solve", "End", "Then", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Colon", "Semicolon", "Comma", "Plus", "Minus", "Multiply", 
			"Divide", "Power", "Modulo", "LessThan", "MoreThan", "Assign", "LessEqual", 
			"MoreEqual", "NotEqual", "Not", "Equal", "String", "Int", "Float", "Identifier", 
			"Whitespace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u015c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7\u0083\n\7\3\7\5\7\u0086\n"+
		"\7\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\7\62\u012d\n\62\f\62"+
		"\16\62\u0130\13\62\3\62\3\62\3\63\3\63\5\63\u0136\n\63\3\63\3\63\7\63"+
		"\u013a\n\63\f\63\16\63\u013d\13\63\5\63\u013f\n\63\3\64\7\64\u0142\n\64"+
		"\f\64\16\64\u0145\13\64\3\64\5\64\u0148\n\64\3\64\6\64\u014b\n\64\r\64"+
		"\16\64\u014c\3\65\3\65\7\65\u0151\n\65\f\65\16\65\u0154\13\65\3\66\6\66"+
		"\u0157\n\66\r\66\16\66\u0158\3\66\3\66\3\u008d\2\67\3\3\5\4\7\5\t\6\13"+
		"\7\r\2\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'"+
		"\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66\3\2\13\5\2\f\f\17\17"+
		"~~\4\2\f\f$$\3\2\63;\3\2\62;\5\2\60\60\62\62;;\3\2\60\60\5\2C\\aac|\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0167\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5p\3\2\2\2\7s\3\2\2\2\tx\3\2\2\2\13}\3"+
		"\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0095\3\2\2\2\23\u009e\3\2"+
		"\2\2\25\u00a7\3\2\2\2\27\u00ad\3\2\2\2\31\u00b2\3\2\2\2\33\u00b5\3\2\2"+
		"\2\35\u00ba\3\2\2\2\37\u00bf\3\2\2\2!\u00c2\3\2\2\2#\u00c6\3\2\2\2%\u00cb"+
		"\3\2\2\2\'\u00d1\3\2\2\2)\u00d8\3\2\2\2+\u00dc\3\2\2\2-\u00e2\3\2\2\2"+
		"/\u00e9\3\2\2\2\61\u00ef\3\2\2\2\63\u00f3\3\2\2\2\65\u00f8\3\2\2\2\67"+
		"\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2"+
		"\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E\u0108\3\2\2\2G\u010a\3\2\2\2I\u010c"+
		"\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2\2\2Q\u0114\3\2\2\2S"+
		"\u0116\3\2\2\2U\u0118\3\2\2\2W\u011a\3\2\2\2Y\u011c\3\2\2\2[\u011f\3\2"+
		"\2\2]\u0122\3\2\2\2_\u0125\3\2\2\2a\u0127\3\2\2\2c\u012a\3\2\2\2e\u013e"+
		"\3\2\2\2g\u0143\3\2\2\2i\u014e\3\2\2\2k\u0156\3\2\2\2mn\7-\2\2no\7-\2"+
		"\2o\4\3\2\2\2pq\7/\2\2qr\7/\2\2r\6\3\2\2\2st\7v\2\2tu\7g\2\2uv\7u\2\2"+
		"vw\7v\2\2w\b\3\2\2\2xy\7h\2\2yz\7t\2\2z{\7q\2\2{|\7o\2\2|\n\3\2\2\2}~"+
		"\7v\2\2~\177\7q\2\2\177\f\3\2\2\2\u0080\u0082\7\17\2\2\u0081\u0083\7\f"+
		"\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0086\7\f\2\2\u0085\u0080\3\2\2\2\u0085\u0084\3\2\2\2\u0086\16\3\2\2"+
		"\2\u0087\u0088\7%\2\2\u0088\u0089\7/\2\2\u0089\u008d\3\2\2\2\u008a\u008c"+
		"\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"+
		"\7/\2\2\u0091\u0092\7%\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\b\2\2\u0094"+
		"\20\3\2\2\2\u0095\u0099\7%\2\2\u0096\u0098\n\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\b\t\2\2\u009d\22\3\2\2\2\u009e"+
		"\u009f\7h\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7e\2\2"+
		"\u00a2\u00a3\7v\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7m\2\2\u00ac\26\3\2\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7r\2\2\u00b1"+
		"\30\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4\32\3\2\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2"+
		"\u00b9\34\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7s\2\2\u00bc\u00bd\7"+
		"t\2\2\u00bd\u00be\7v\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7Q\2\2\u00c0\u00c1"+
		"\7T\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5"+
		"\7F\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9"+
		"\7w\2\2\u00c9\u00ca\7g\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"&\3\2\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7v\2\2\u00d4"+
		"\u00d5\7w\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7p\2\2\u00d7(\3\2\2\2\u00d8"+
		"\u00d9\7x\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7t\2\2\u00db*\3\2\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7i\2\2\u00df\u00e0\7\63\2"+
		"\2\u00e0\u00e1\7\62\2\2\u00e1,\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7w\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7w\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7x\2\2\u00ed\u00ee\7g\2\2\u00ee\60\3\2\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7f\2\2\u00f2\62\3\2\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7p\2\2"+
		"\u00f7\64\3\2\2\2\u00f8\u00f9\7*\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7+\2"+
		"\2\u00fb8\3\2\2\2\u00fc\u00fd\7]\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7_\2\2"+
		"\u00ff<\3\2\2\2\u0100\u0101\7}\2\2\u0101>\3\2\2\2\u0102\u0103\7\177\2"+
		"\2\u0103@\3\2\2\2\u0104\u0105\7<\2\2\u0105B\3\2\2\2\u0106\u0107\7=\2\2"+
		"\u0107D\3\2\2\2\u0108\u0109\7.\2\2\u0109F\3\2\2\2\u010a\u010b\7-\2\2\u010b"+
		"H\3\2\2\2\u010c\u010d\7/\2\2\u010dJ\3\2\2\2\u010e\u010f\7,\2\2\u010fL"+
		"\3\2\2\2\u0110\u0111\7\61\2\2\u0111N\3\2\2\2\u0112\u0113\7`\2\2\u0113"+
		"P\3\2\2\2\u0114\u0115\7\'\2\2\u0115R\3\2\2\2\u0116\u0117\7>\2\2\u0117"+
		"T\3\2\2\2\u0118\u0119\7@\2\2\u0119V\3\2\2\2\u011a\u011b\7?\2\2\u011bX"+
		"\3\2\2\2\u011c\u011d\7>\2\2\u011d\u011e\7?\2\2\u011eZ\3\2\2\2\u011f\u0120"+
		"\7@\2\2\u0120\u0121\7?\2\2\u0121\\\3\2\2\2\u0122\u0123\7#\2\2\u0123\u0124"+
		"\7?\2\2\u0124^\3\2\2\2\u0125\u0126\7#\2\2\u0126`\3\2\2\2\u0127\u0128\7"+
		"?\2\2\u0128\u0129\7?\2\2\u0129b\3\2\2\2\u012a\u012e\7$\2\2\u012b\u012d"+
		"\n\3\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7$"+
		"\2\2\u0132d\3\2\2\2\u0133\u013f\7\62\2\2\u0134\u0136\7/\2\2\u0135\u0134"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013b\t\4\2\2\u0138"+
		"\u013a\t\5\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0133\3\2\2\2\u013e\u0135\3\2\2\2\u013ff\3\2\2\2\u0140\u0142\t\6\2\2"+
		"\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\t\7\2\2\u0147"+
		"\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\t\6"+
		"\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014dh\3\2\2\2\u014e\u0152\t\b\2\2\u014f\u0151\t\t\2\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153j\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\t\n\2\2\u0156"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\66\2\2\u015bl\3\2\2\2\20\2\u0082"+
		"\u0085\u008d\u0099\u012e\u0135\u013b\u013e\u0143\u0147\u014c\u0152\u0158"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}