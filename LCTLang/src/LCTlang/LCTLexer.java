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
		T__0=1, T__1=2, T__2=3, T__3=4, Multi_comment=5, Single_comment=6, Function=7, 
		Break=8, For=9, If=10, Else=11, Square_root=12, OR=13, AND=14, True=15, 
		False=16, Return=17, Var=18, Print=19, End=20, Then=21, LeftParen=22, 
		RightParen=23, LeftBracket=24, RightBracket=25, LeftBrace=26, RightBrace=27, 
		Colon=28, Semicolon=29, Comma=30, Plus=31, Minus=32, Multiply=33, Divide=34, 
		Power=35, Modulo=36, LessThan=37, MoreThan=38, Assign=39, LessEqual=40, 
		MoreEqual=41, NotEqual=42, Not=43, Equal=44, String=45, Int=46, Float=47, 
		Identifier=48, Whitespace=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Newline", "Multi_comment", "Single_comment", 
			"Function", "Break", "For", "If", "Else", "Square_root", "OR", "AND", 
			"True", "False", "Return", "Var", "Print", "End", "Then", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Colon", "Semicolon", "Comma", "Plus", "Minus", "Multiply", "Divide", 
			"Power", "Modulo", "LessThan", "MoreThan", "Assign", "LessEqual", "MoreEqual", 
			"NotEqual", "Not", "Equal", "String", "Int", "Float", "Identifier", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", "'test'", "'times'", null, null, "'function'", 
			"'break'", "'loop'", "'if'", "'else'", "'sqrt'", "'OR'", "'AND'", "'true'", 
			"'false'", "'return'", "'var'", "'output'", "'end'", "'then'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "':'", "';'", "','", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'%'", "'<'", "'>'", "'='", "'<='", "'>='", "'!='", 
			"'!'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Multi_comment", "Single_comment", "Function", 
			"Break", "For", "If", "Else", "Square_root", "OR", "AND", "True", "False", 
			"Return", "Var", "Print", "End", "Then", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Colon", "Semicolon", "Comma", 
			"Plus", "Minus", "Multiply", "Divide", "Power", "Modulo", "LessThan", 
			"MoreThan", "Assign", "LessEqual", "MoreEqual", "NotEqual", "Not", "Equal", 
			"String", "Int", "Float", "Identifier", "Whitespace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\5\6{\n\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u0090\n\b\f\b\16\b\u0093\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3."+
		"\3/\3/\7/\u0119\n/\f/\16/\u011c\13/\3/\3/\3\60\3\60\5\60\u0122\n\60\3"+
		"\60\3\60\7\60\u0126\n\60\f\60\16\60\u0129\13\60\5\60\u012b\n\60\3\61\7"+
		"\61\u012e\n\61\f\61\16\61\u0131\13\61\3\61\5\61\u0134\n\61\3\61\6\61\u0137"+
		"\n\61\r\61\16\61\u0138\3\62\3\62\7\62\u013d\n\62\f\62\16\62\u0140\13\62"+
		"\3\63\6\63\u0143\n\63\r\63\16\63\u0144\3\63\3\63\3\u0085\2\64\3\3\5\4"+
		"\7\5\t\6\13\2\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21"+
		"#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!"+
		"C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63\3\2\13\5\2\f\f\17\17~~"+
		"\4\2\f\f$$\3\2\63;\3\2\62;\5\2\60\60\62\62;;\3\2\60\60\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0153\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5j\3\2"+
		"\2\2\7m\3\2\2\2\tr\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u008d\3\2\2\2"+
		"\21\u0096\3\2\2\2\23\u009f\3\2\2\2\25\u00a5\3\2\2\2\27\u00aa\3\2\2\2\31"+
		"\u00ad\3\2\2\2\33\u00b2\3\2\2\2\35\u00b7\3\2\2\2\37\u00ba\3\2\2\2!\u00be"+
		"\3\2\2\2#\u00c3\3\2\2\2%\u00c9\3\2\2\2\'\u00d0\3\2\2\2)\u00d4\3\2\2\2"+
		"+\u00db\3\2\2\2-\u00df\3\2\2\2/\u00e4\3\2\2\2\61\u00e6\3\2\2\2\63\u00e8"+
		"\3\2\2\2\65\u00ea\3\2\2\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f0\3\2\2"+
		"\2=\u00f2\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C\u00f8\3\2\2\2E\u00fa"+
		"\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K\u0100\3\2\2\2M\u0102\3\2\2\2O"+
		"\u0104\3\2\2\2Q\u0106\3\2\2\2S\u0108\3\2\2\2U\u010b\3\2\2\2W\u010e\3\2"+
		"\2\2Y\u0111\3\2\2\2[\u0113\3\2\2\2]\u0116\3\2\2\2_\u012a\3\2\2\2a\u012f"+
		"\3\2\2\2c\u013a\3\2\2\2e\u0142\3\2\2\2gh\7-\2\2hi\7-\2\2i\4\3\2\2\2jk"+
		"\7/\2\2kl\7/\2\2l\6\3\2\2\2mn\7v\2\2no\7g\2\2op\7u\2\2pq\7v\2\2q\b\3\2"+
		"\2\2rs\7v\2\2st\7k\2\2tu\7o\2\2uv\7g\2\2vw\7u\2\2w\n\3\2\2\2xz\7\17\2"+
		"\2y{\7\f\2\2zy\3\2\2\2z{\3\2\2\2{~\3\2\2\2|~\7\f\2\2}x\3\2\2\2}|\3\2\2"+
		"\2~\f\3\2\2\2\177\u0080\7%\2\2\u0080\u0081\7/\2\2\u0081\u0085\3\2\2\2"+
		"\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7/\2\2\u0089\u008a\7%\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\7\2"+
		"\2\u008c\16\3\2\2\2\u008d\u0091\7%\2\2\u008e\u0090\n\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\b\b\2\2\u0095\20\3\2\2"+
		"\2\u0096\u0097\7h\2\2\u0097\u0098\7w\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7e\2\2\u009a\u009b\7v\2\2\u009b\u009c\7k\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7p\2\2\u009e\22\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7m\2\2\u00a4\24\3\2\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7r\2\2"+
		"\u00a9\26\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac\30\3\2\2"+
		"\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7s\2\2\u00b4\u00b5"+
		"\7t\2\2\u00b5\u00b6\7v\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7Q\2\2\u00b8\u00b9"+
		"\7T\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7P\2\2\u00bc\u00bd"+
		"\7F\2\2\u00bd \3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7w\2\2\u00c1\u00c2\7g\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"$\3\2\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\u00cd\7w\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7p\2\2\u00cf&\3\2\2\2\u00d0"+
		"\u00d1\7x\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3(\3\2\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7r\2\2"+
		"\u00d8\u00d9\7w\2\2\u00d9\u00da\7v\2\2\u00da*\3\2\2\2\u00db\u00dc\7g\2"+
		"\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7f\2\2\u00de,\3\2\2\2\u00df\u00e0\7"+
		"v\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3."+
		"\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5\60\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7"+
		"\62\3\2\2\2\u00e8\u00e9\7]\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7_\2\2\u00eb"+
		"\66\3\2\2\2\u00ec\u00ed\7}\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7\177\2\2\u00ef"+
		":\3\2\2\2\u00f0\u00f1\7<\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3>"+
		"\3\2\2\2\u00f4\u00f5\7.\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7B\3"+
		"\2\2\2\u00f8\u00f9\7/\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7,\2\2\u00fbF\3\2"+
		"\2\2\u00fc\u00fd\7\61\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7`\2\2\u00ffJ\3\2"+
		"\2\2\u0100\u0101\7\'\2\2\u0101L\3\2\2\2\u0102\u0103\7>\2\2\u0103N\3\2"+
		"\2\2\u0104\u0105\7@\2\2\u0105P\3\2\2\2\u0106\u0107\7?\2\2\u0107R\3\2\2"+
		"\2\u0108\u0109\7>\2\2\u0109\u010a\7?\2\2\u010aT\3\2\2\2\u010b\u010c\7"+
		"@\2\2\u010c\u010d\7?\2\2\u010dV\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0110"+
		"\7?\2\2\u0110X\3\2\2\2\u0111\u0112\7#\2\2\u0112Z\3\2\2\2\u0113\u0114\7"+
		"?\2\2\u0114\u0115\7?\2\2\u0115\\\3\2\2\2\u0116\u011a\7$\2\2\u0117\u0119"+
		"\n\3\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7$"+
		"\2\2\u011e^\3\2\2\2\u011f\u012b\7\62\2\2\u0120\u0122\7/\2\2\u0121\u0120"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0127\t\4\2\2\u0124"+
		"\u0126\t\5\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u011f\3\2\2\2\u012a\u0121\3\2\2\2\u012b`\3\2\2\2\u012c\u012e\t\6\2\2"+
		"\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\t\7\2\2\u0133"+
		"\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\t\6"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139b\3\2\2\2\u013a\u013e\t\b\2\2\u013b\u013d\t\t\2\2"+
		"\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013fd\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\t\n\2\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b\63\2\2\u0147f\3\2\2\2\20\2z}\u0085"+
		"\u0091\u011a\u0121\u0127\u012a\u012f\u0133\u0138\u013e\u0144\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}