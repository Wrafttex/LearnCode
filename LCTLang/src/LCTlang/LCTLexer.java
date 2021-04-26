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
		Identifier=48, BLOk_COMMENT=49, LINE_COMMENT=50, Whitespace=51;
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
			"NotEqual", "Not", "Equal", "String", "Int", "Float", "Identifier", "BLOk_COMMENT", 
			"LINE_COMMENT", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'intersection'", "'times'", "'++'", "'--'", null, null, "'function'", 
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
			"String", "Int", "Float", "Identifier", "BLOk_COMMENT", "LINE_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\5\6\u0087\n\6\3"+
		"\6\5\6\u008a\n\6\3\7\3\7\3\7\3\7\7\7\u0090\n\7\f\7\16\7\u0093\13\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\7/"+
		"\u0125\n/\f/\16/\u0128\13/\3/\3/\3\60\6\60\u012d\n\60\r\60\16\60\u012e"+
		"\3\61\7\61\u0132\n\61\f\61\16\61\u0135\13\61\3\61\5\61\u0138\n\61\3\61"+
		"\6\61\u013b\n\61\r\61\16\61\u013c\3\62\3\62\7\62\u0141\n\62\f\62\16\62"+
		"\u0144\13\62\3\63\3\63\3\63\3\63\7\63\u014a\n\63\f\63\16\63\u014d\13\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0158\n\64\f\64\16"+
		"\64\u015b\13\64\3\64\3\64\3\65\6\65\u0160\n\65\r\65\16\65\u0161\3\65\3"+
		"\65\4\u0091\u014b\2\66\3\3\5\4\7\5\t\6\13\2\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65\3\2\n\5\2\f\f\17\17~~\4\2\f\f$$\3\2\62;\3\2\60\60\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0170\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5x\3\2\2\2\7~\3\2\2\2\t\u0081\3"+
		"\2\2\2\13\u0089\3\2\2\2\r\u008b\3\2\2\2\17\u0099\3\2\2\2\21\u00a2\3\2"+
		"\2\2\23\u00ab\3\2\2\2\25\u00b1\3\2\2\2\27\u00b6\3\2\2\2\31\u00b9\3\2\2"+
		"\2\33\u00be\3\2\2\2\35\u00c3\3\2\2\2\37\u00c6\3\2\2\2!\u00ca\3\2\2\2#"+
		"\u00cf\3\2\2\2%\u00d5\3\2\2\2\'\u00dc\3\2\2\2)\u00e0\3\2\2\2+\u00e7\3"+
		"\2\2\2-\u00eb\3\2\2\2/\u00f0\3\2\2\2\61\u00f2\3\2\2\2\63\u00f4\3\2\2\2"+
		"\65\u00f6\3\2\2\2\67\u00f8\3\2\2\29\u00fa\3\2\2\2;\u00fc\3\2\2\2=\u00fe"+
		"\3\2\2\2?\u0100\3\2\2\2A\u0102\3\2\2\2C\u0104\3\2\2\2E\u0106\3\2\2\2G"+
		"\u0108\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2\2\2O\u0110\3\2"+
		"\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0117\3\2\2\2W\u011a\3\2\2\2Y\u011d"+
		"\3\2\2\2[\u011f\3\2\2\2]\u0122\3\2\2\2_\u012c\3\2\2\2a\u0137\3\2\2\2c"+
		"\u013e\3\2\2\2e\u0145\3\2\2\2g\u0153\3\2\2\2i\u015f\3\2\2\2kl\7k\2\2l"+
		"m\7p\2\2mn\7v\2\2no\7g\2\2op\7t\2\2pq\7u\2\2qr\7g\2\2rs\7e\2\2st\7v\2"+
		"\2tu\7k\2\2uv\7q\2\2vw\7p\2\2w\4\3\2\2\2xy\7v\2\2yz\7k\2\2z{\7o\2\2{|"+
		"\7g\2\2|}\7u\2\2}\6\3\2\2\2~\177\7-\2\2\177\u0080\7-\2\2\u0080\b\3\2\2"+
		"\2\u0081\u0082\7/\2\2\u0082\u0083\7/\2\2\u0083\n\3\2\2\2\u0084\u0086\7"+
		"\17\2\2\u0085\u0087\7\f\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u008a\7\f\2\2\u0089\u0084\3\2\2\2\u0089\u0088\3\2"+
		"\2\2\u008a\f\3\2\2\2\u008b\u008c\7%\2\2\u008c\u008d\7/\2\2\u008d\u0091"+
		"\3\2\2\2\u008e\u0090\13\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0095\7/\2\2\u0095\u0096\7%\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\b\7\2\2\u0098\16\3\2\2\2\u0099\u009d\7%\2\2\u009a\u009c\n\2\2\2"+
		"\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\b\2\2\u00a1"+
		"\20\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\u00a6\7e\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7q\2\2"+
		"\u00a9\u00aa\7p\2\2\u00aa\22\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7"+
		"t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7m\2\2\u00b0\24"+
		"\3\2\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\u00b5\7r\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7h\2\2\u00b8"+
		"\30\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7s\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7v\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7Q\2\2\u00c4"+
		"\u00c5\7T\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7P\2\2\u00c8"+
		"\u00c9\7F\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7w\2\2\u00cd\u00ce\7g\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4$\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7v\2"+
		"\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2\u00db&\3\2"+
		"\2\2\u00dc\u00dd\7x\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7t\2\2\u00df(\3"+
		"\2\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		"\u00e4\7r\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7v\2\2\u00e6*\3\2\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7f\2\2\u00ea,\3\2\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7p\2\2"+
		"\u00ef.\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\7+\2\2"+
		"\u00f3\62\3\2\2\2\u00f4\u00f5\7]\2\2\u00f5\64\3\2\2\2\u00f6\u00f7\7_\2"+
		"\2\u00f7\66\3\2\2\2\u00f8\u00f9\7}\2\2\u00f98\3\2\2\2\u00fa\u00fb\7\177"+
		"\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7<\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7=\2"+
		"\2\u00ff>\3\2\2\2\u0100\u0101\7.\2\2\u0101@\3\2\2\2\u0102\u0103\7-\2\2"+
		"\u0103B\3\2\2\2\u0104\u0105\7/\2\2\u0105D\3\2\2\2\u0106\u0107\7,\2\2\u0107"+
		"F\3\2\2\2\u0108\u0109\7\61\2\2\u0109H\3\2\2\2\u010a\u010b\7`\2\2\u010b"+
		"J\3\2\2\2\u010c\u010d\7\'\2\2\u010dL\3\2\2\2\u010e\u010f\7>\2\2\u010f"+
		"N\3\2\2\2\u0110\u0111\7@\2\2\u0111P\3\2\2\2\u0112\u0113\7?\2\2\u0113R"+
		"\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116\7?\2\2\u0116T\3\2\2\2\u0117\u0118"+
		"\7@\2\2\u0118\u0119\7?\2\2\u0119V\3\2\2\2\u011a\u011b\7#\2\2\u011b\u011c"+
		"\7?\2\2\u011cX\3\2\2\2\u011d\u011e\7#\2\2\u011eZ\3\2\2\2\u011f\u0120\7"+
		"?\2\2\u0120\u0121\7?\2\2\u0121\\\3\2\2\2\u0122\u0126\7$\2\2\u0123\u0125"+
		"\n\3\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7$"+
		"\2\2\u012a^\3\2\2\2\u012b\u012d\t\4\2\2\u012c\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f`\3\2\2\2\u0130"+
		"\u0132\t\4\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0138\t\5\2\2\u0137\u0133\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u013b\t\4\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013db\3\2\2\2\u013e\u0142\t\6\2\2"+
		"\u013f\u0141\t\7\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143d\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0146\7\61\2\2\u0146\u0147\7,\2\2\u0147\u014b\3\2\2\2\u0148\u014a\13"+
		"\2\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7,"+
		"\2\2\u014f\u0150\7\61\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b\63\2\2\u0152"+
		"f\3\2\2\2\u0153\u0154\7\61\2\2\u0154\u0155\7\61\2\2\u0155\u0159\3\2\2"+
		"\2\u0156\u0158\n\b\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\b\64\2\2\u015dh\3\2\2\2\u015e\u0160\t\t\2\2\u015f\u015e\3\2\2\2"+
		"\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\b\65\2\2\u0164j\3\2\2\2\20\2\u0086\u0089\u0091\u009d"+
		"\u0126\u012e\u0133\u0137\u013c\u0142\u014b\u0159\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}