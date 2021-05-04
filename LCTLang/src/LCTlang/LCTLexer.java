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
		Var=15, Print=16, End=17, Then=18, Solve=19, LeftParen=20, RightParen=21, 
		LeftBracket=22, RightBracket=23, LeftBrace=24, RightBrace=25, Colon=26, 
		Semicolon=27, Comma=28, Plus=29, Minus=30, Multiply=31, Divide=32, Power=33, 
		Modulo=34, LessThan=35, MoreThan=36, Assign=37, LessEqual=38, MoreEqual=39, 
		NotEqual=40, Not=41, Equal=42, Increment=43, Decrement=44, True=45, False=46, 
		String=47, Int=48, Float=49, Identifier=50, BLOK_COMMENT=51, LINE_COMMENT=52, 
		Whitespace=53;
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
			"Var", "Print", "End", "Then", "Solve", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Colon", "Semicolon", "Comma", 
			"Plus", "Minus", "Multiply", "Divide", "Power", "Modulo", "LessThan", 
			"MoreThan", "Assign", "LessEqual", "MoreEqual", "NotEqual", "Not", "Equal", 
			"Increment", "Decrement", "True", "False", "String", "Int", "Float", 
			"Identifier", "BLOK_COMMENT", "LINE_COMMENT", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'intersection'", "'times'", null, null, "'function'", "'break'", 
			"'for'", "'loop'", "'if'", "'else'", "'sqrt'", "'OR'", "'AND'", "'return'", 
			"'var'", "'output'", "'end'", "'then'", "'solve'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "':'", "';'", "','", "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'%'", "'<'", "'>'", "'='", "'<='", "'>='", "'!='", "'!'", "'=='", 
			"'++'", "'--'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Multi_comment", "Single_comment", "Function", "Break", 
			"For", "Loop", "If", "Else", "Square_root", "OR", "AND", "Return", "Var", 
			"Print", "End", "Then", "Solve", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Colon", "Semicolon", "Comma", 
			"Plus", "Minus", "Multiply", "Divide", "Power", "Modulo", "LessThan", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0173\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0085\n\4\3\4\5"+
		"\4\u0088\n\4\3\5\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u0133\n\61"+
		"\f\61\16\61\u0136\13\61\3\61\3\61\3\62\6\62\u013b\n\62\r\62\16\62\u013c"+
		"\3\63\7\63\u0140\n\63\f\63\16\63\u0143\13\63\3\63\5\63\u0146\n\63\3\63"+
		"\6\63\u0149\n\63\r\63\16\63\u014a\3\64\3\64\7\64\u014f\n\64\f\64\16\64"+
		"\u0152\13\64\3\65\3\65\3\65\3\65\7\65\u0158\n\65\f\65\16\65\u015b\13\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0166\n\66\f\66\16"+
		"\66\u0169\13\66\3\66\3\66\3\67\6\67\u016e\n\67\r\67\16\67\u016f\3\67\3"+
		"\67\4\u008f\u0159\28\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67\3\2\n\5\2\f\f\17\17~~\4\2\f\f$$\3\2\62;\3\2\60\60"+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u017e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5"+
		"|\3\2\2\2\7\u0087\3\2\2\2\t\u0089\3\2\2\2\13\u0097\3\2\2\2\r\u00a0\3\2"+
		"\2\2\17\u00a9\3\2\2\2\21\u00af\3\2\2\2\23\u00b3\3\2\2\2\25\u00b8\3\2\2"+
		"\2\27\u00bb\3\2\2\2\31\u00c0\3\2\2\2\33\u00c5\3\2\2\2\35\u00c8\3\2\2\2"+
		"\37\u00cc\3\2\2\2!\u00d3\3\2\2\2#\u00d7\3\2\2\2%\u00de\3\2\2\2\'\u00e2"+
		"\3\2\2\2)\u00e7\3\2\2\2+\u00ed\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61"+
		"\u00f3\3\2\2\2\63\u00f5\3\2\2\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00fb"+
		"\3\2\2\2;\u00fd\3\2\2\2=\u00ff\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C"+
		"\u0105\3\2\2\2E\u0107\3\2\2\2G\u0109\3\2\2\2I\u010b\3\2\2\2K\u010d\3\2"+
		"\2\2M\u010f\3\2\2\2O\u0111\3\2\2\2Q\u0114\3\2\2\2S\u0117\3\2\2\2U\u011a"+
		"\3\2\2\2W\u011c\3\2\2\2Y\u011f\3\2\2\2[\u0122\3\2\2\2]\u0125\3\2\2\2_"+
		"\u012a\3\2\2\2a\u0130\3\2\2\2c\u013a\3\2\2\2e\u0145\3\2\2\2g\u014c\3\2"+
		"\2\2i\u0153\3\2\2\2k\u0161\3\2\2\2m\u016d\3\2\2\2op\7k\2\2pq\7p\2\2qr"+
		"\7v\2\2rs\7g\2\2st\7t\2\2tu\7u\2\2uv\7g\2\2vw\7e\2\2wx\7v\2\2xy\7k\2\2"+
		"yz\7q\2\2z{\7p\2\2{\4\3\2\2\2|}\7v\2\2}~\7k\2\2~\177\7o\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7u\2\2\u0081\6\3\2\2\2\u0082\u0084\7\17\2\2\u0083"+
		"\u0085\7\f\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0088\7\f\2\2\u0087\u0082\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\b\3\2\2\2\u0089\u008a\7%\2\2\u008a\u008b\7/\2\2\u008b\u008f\3\2\2\2\u008c"+
		"\u008e\13\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\7/\2\2\u0093\u0094\7%\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\5\2"+
		"\2\u0096\n\3\2\2\2\u0097\u009b\7%\2\2\u0098\u009a\n\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\b\6\2\2\u009f\f\3\2\2\2"+
		"\u00a0\u00a1\7h\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4"+
		"\7e\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\16\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7m\2\2\u00ae\20\3\2\2\2\u00af"+
		"\u00b0\7h\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7t\2\2\u00b2\22\3\2\2\2\u00b3"+
		"\u00b4\7n\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7r\2\2"+
		"\u00b7\24\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba\26\3\2\2"+
		"\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\30\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7s\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7v\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7Q\2\2\u00c6\u00c7"+
		"\7T\2\2\u00c7\34\3\2\2\2\u00c8\u00c9\7C\2\2\u00c9\u00ca\7P\2\2\u00ca\u00cb"+
		"\7F\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7p\2\2\u00d2"+
		" \3\2\2\2\u00d3\u00d4\7x\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\"\3\2\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\u00db\7r\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7v\2\2\u00dd$\3\2\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1&\3\2\2\2\u00e2"+
		"\u00e3\7v\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7p\2\2"+
		"\u00e6(\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7n\2"+
		"\2\u00ea\u00eb\7x\2\2\u00eb\u00ec\7g\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7"+
		"*\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7+\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7]"+
		"\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7_\2\2\u00f4\62\3\2\2\2\u00f5\u00f6"+
		"\7}\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\7\177\2\2\u00f8\66\3\2\2\2\u00f9"+
		"\u00fa\7<\2\2\u00fa8\3\2\2\2\u00fb\u00fc\7=\2\2\u00fc:\3\2\2\2\u00fd\u00fe"+
		"\7.\2\2\u00fe<\3\2\2\2\u00ff\u0100\7-\2\2\u0100>\3\2\2\2\u0101\u0102\7"+
		"/\2\2\u0102@\3\2\2\2\u0103\u0104\7,\2\2\u0104B\3\2\2\2\u0105\u0106\7\61"+
		"\2\2\u0106D\3\2\2\2\u0107\u0108\7`\2\2\u0108F\3\2\2\2\u0109\u010a\7\'"+
		"\2\2\u010aH\3\2\2\2\u010b\u010c\7>\2\2\u010cJ\3\2\2\2\u010d\u010e\7@\2"+
		"\2\u010eL\3\2\2\2\u010f\u0110\7?\2\2\u0110N\3\2\2\2\u0111\u0112\7>\2\2"+
		"\u0112\u0113\7?\2\2\u0113P\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116\7?\2"+
		"\2\u0116R\3\2\2\2\u0117\u0118\7#\2\2\u0118\u0119\7?\2\2\u0119T\3\2\2\2"+
		"\u011a\u011b\7#\2\2\u011bV\3\2\2\2\u011c\u011d\7?\2\2\u011d\u011e\7?\2"+
		"\2\u011eX\3\2\2\2\u011f\u0120\7-\2\2\u0120\u0121\7-\2\2\u0121Z\3\2\2\2"+
		"\u0122\u0123\7/\2\2\u0123\u0124\7/\2\2\u0124\\\3\2\2\2\u0125\u0126\7v"+
		"\2\2\u0126\u0127\7t\2\2\u0127\u0128\7w\2\2\u0128\u0129\7g\2\2\u0129^\3"+
		"\2\2\2\u012a\u012b\7h\2\2\u012b\u012c\7c\2\2\u012c\u012d\7n\2\2\u012d"+
		"\u012e\7u\2\2\u012e\u012f\7g\2\2\u012f`\3\2\2\2\u0130\u0134\7$\2\2\u0131"+
		"\u0133\n\3\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0138\7$\2\2\u0138b\3\2\2\2\u0139\u013b\t\4\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013dd\3\2\2\2"+
		"\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0146\t\5\2\2\u0145\u0141\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0149\t\4\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014bf\3\2\2\2\u014c\u0150\t\6\2\2"+
		"\u014d\u014f\t\7\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151h\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0154\7\61\2\2\u0154\u0155\7,\2\2\u0155\u0159\3\2\2\2\u0156\u0158\13"+
		"\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u015a\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7,"+
		"\2\2\u015d\u015e\7\61\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\65\2\2\u0160"+
		"j\3\2\2\2\u0161\u0162\7\61\2\2\u0162\u0163\7\61\2\2\u0163\u0167\3\2\2"+
		"\2\u0164\u0166\n\b\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016b\b\66\2\2\u016bl\3\2\2\2\u016c\u016e\t\t\2\2\u016d\u016c\3\2\2\2"+
		"\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0172\b\67\2\2\u0172n\3\2\2\2\20\2\u0084\u0087\u008f\u009b"+
		"\u0134\u013c\u0141\u0145\u014a\u0150\u0159\u0167\u016f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}