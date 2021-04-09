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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Multi_comment=6, Single_comment=7, 
		Function=8, Break=9, For=10, If=11, Else=12, Square_root=13, OR=14, AND=15, 
		True=16, False=17, Return=18, Var=19, Print=20, End=21, Then=22, LeftParen=23, 
		RightParen=24, LeftBracket=25, RightBracket=26, LeftBrace=27, RightBrace=28, 
		Colon=29, Semicolon=30, Comma=31, Plus=32, Minus=33, Multiply=34, Divide=35, 
		Power=36, Modulo=37, LessThan=38, MoreThan=39, Assign=40, LessEqual=41, 
		MoreEqual=42, NotEqual=43, Not=44, Equal=45, String=46, Int=47, Float=48, 
		Identifier=49, Whitespace=50;
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
			null, "'++'", "'--'", "'test'", "'from'", "'to'", null, null, "'function'", 
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
			null, null, null, null, null, null, "Multi_comment", "Single_comment", 
			"Function", "Break", "For", "If", "Else", "Square_root", "OR", "AND", 
			"True", "False", "Return", "Var", "Print", "End", "Then", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Colon", "Semicolon", "Comma", "Plus", "Minus", "Multiply", "Divide", 
			"Power", "Modulo", "LessThan", "MoreThan", "Assign", "LessEqual", "MoreEqual", 
			"NotEqual", "Not", "Equal", "String", "Int", "Float", "Identifier", "Whitespace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u014c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\5\7\177\n\7\3\7\5\7\u0082\n\7\3\b\3\b\3\b\3\b\7\b"+
		"\u0088\n\b\f\b\16\b\u008b\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u0094\n"+
		"\t\f\t\16\t\u0097\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\7\60\u011d\n\60\f\60\16\60\u0120"+
		"\13\60\3\60\3\60\3\61\3\61\5\61\u0126\n\61\3\61\3\61\7\61\u012a\n\61\f"+
		"\61\16\61\u012d\13\61\5\61\u012f\n\61\3\62\7\62\u0132\n\62\f\62\16\62"+
		"\u0135\13\62\3\62\5\62\u0138\n\62\3\62\6\62\u013b\n\62\r\62\16\62\u013c"+
		"\3\63\3\63\7\63\u0141\n\63\f\63\16\63\u0144\13\63\3\64\6\64\u0147\n\64"+
		"\r\64\16\64\u0148\3\64\3\64\3\u0089\2\65\3\3\5\4\7\5\t\6\13\7\r\2\17\b"+
		"\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U"+
		"+W,Y-[.]/_\60a\61c\62e\63g\64\3\2\13\5\2\f\f\17\17~~\4\2\f\f$$\3\2\63"+
		";\3\2\62;\5\2\60\60\62\62;;\3\2\60\60\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u0157\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5l\3\2\2\2\7"+
		"o\3\2\2\2\tt\3\2\2\2\13y\3\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0091"+
		"\3\2\2\2\23\u009a\3\2\2\2\25\u00a3\3\2\2\2\27\u00a9\3\2\2\2\31\u00ae\3"+
		"\2\2\2\33\u00b1\3\2\2\2\35\u00b6\3\2\2\2\37\u00bb\3\2\2\2!\u00be\3\2\2"+
		"\2#\u00c2\3\2\2\2%\u00c7\3\2\2\2\'\u00cd\3\2\2\2)\u00d4\3\2\2\2+\u00d8"+
		"\3\2\2\2-\u00df\3\2\2\2/\u00e3\3\2\2\2\61\u00e8\3\2\2\2\63\u00ea\3\2\2"+
		"\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2\3\2\2\2=\u00f4"+
		"\3\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G"+
		"\u00fe\3\2\2\2I\u0100\3\2\2\2K\u0102\3\2\2\2M\u0104\3\2\2\2O\u0106\3\2"+
		"\2\2Q\u0108\3\2\2\2S\u010a\3\2\2\2U\u010c\3\2\2\2W\u010f\3\2\2\2Y\u0112"+
		"\3\2\2\2[\u0115\3\2\2\2]\u0117\3\2\2\2_\u011a\3\2\2\2a\u012e\3\2\2\2c"+
		"\u0133\3\2\2\2e\u013e\3\2\2\2g\u0146\3\2\2\2ij\7-\2\2jk\7-\2\2k\4\3\2"+
		"\2\2lm\7/\2\2mn\7/\2\2n\6\3\2\2\2op\7v\2\2pq\7g\2\2qr\7u\2\2rs\7v\2\2"+
		"s\b\3\2\2\2tu\7h\2\2uv\7t\2\2vw\7q\2\2wx\7o\2\2x\n\3\2\2\2yz\7v\2\2z{"+
		"\7q\2\2{\f\3\2\2\2|~\7\17\2\2}\177\7\f\2\2~}\3\2\2\2~\177\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080\u0082\7\f\2\2\u0081|\3\2\2\2\u0081\u0080\3\2\2\2"+
		"\u0082\16\3\2\2\2\u0083\u0084\7%\2\2\u0084\u0085\7/\2\2\u0085\u0089\3"+
		"\2\2\2\u0086\u0088\13\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008d\7/\2\2\u008d\u008e\7%\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\b\b\2\2\u0090\20\3\2\2\2\u0091\u0095\7%\2\2\u0092\u0094\n\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\t\2\2\u0099"+
		"\22\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7w\2\2\u009c\u009d\7p\2\2\u009d"+
		"\u009e\7e\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7q\2\2"+
		"\u00a1\u00a2\7p\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7"+
		"t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7m\2\2\u00a8\26"+
		"\3\2\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7r\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7h\2\2\u00b0"+
		"\32\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7u\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7s\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ba\7v\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\7Q\2\2\u00bc"+
		"\u00bd\7T\2\2\u00bd \3\2\2\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7P\2\2\u00c0"+
		"\u00c1\7F\2\2\u00c1\"\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7w\2\2\u00c5\u00c6\7g\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2"+
		"\u00cc&\3\2\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7v\2"+
		"\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7p\2\2\u00d3(\3\2"+
		"\2\2\u00d4\u00d5\7x\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7t\2\2\u00d7*\3"+
		"\2\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7v\2\2\u00db"+
		"\u00dc\7r\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7v\2\2\u00de,\3\2\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7f\2\2\u00e2.\3\2\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7p\2\2"+
		"\u00e7\60\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7+\2"+
		"\2\u00eb\64\3\2\2\2\u00ec\u00ed\7]\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7"+
		"_\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7}\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7\177"+
		"\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7<\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7=\2"+
		"\2\u00f7@\3\2\2\2\u00f8\u00f9\7.\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7-\2\2"+
		"\u00fbD\3\2\2\2\u00fc\u00fd\7/\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7,\2\2\u00ff"+
		"H\3\2\2\2\u0100\u0101\7\61\2\2\u0101J\3\2\2\2\u0102\u0103\7`\2\2\u0103"+
		"L\3\2\2\2\u0104\u0105\7\'\2\2\u0105N\3\2\2\2\u0106\u0107\7>\2\2\u0107"+
		"P\3\2\2\2\u0108\u0109\7@\2\2\u0109R\3\2\2\2\u010a\u010b\7?\2\2\u010bT"+
		"\3\2\2\2\u010c\u010d\7>\2\2\u010d\u010e\7?\2\2\u010eV\3\2\2\2\u010f\u0110"+
		"\7@\2\2\u0110\u0111\7?\2\2\u0111X\3\2\2\2\u0112\u0113\7#\2\2\u0113\u0114"+
		"\7?\2\2\u0114Z\3\2\2\2\u0115\u0116\7#\2\2\u0116\\\3\2\2\2\u0117\u0118"+
		"\7?\2\2\u0118\u0119\7?\2\2\u0119^\3\2\2\2\u011a\u011e\7$\2\2\u011b\u011d"+
		"\n\3\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7$"+
		"\2\2\u0122`\3\2\2\2\u0123\u012f\7\62\2\2\u0124\u0126\7/\2\2\u0125\u0124"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012b\t\4\2\2\u0128"+
		"\u012a\t\5\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0123\3\2\2\2\u012e\u0125\3\2\2\2\u012fb\3\2\2\2\u0130\u0132\t\6\2\2"+
		"\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\t\7\2\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\t\6"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013dd\3\2\2\2\u013e\u0142\t\b\2\2\u013f\u0141\t\t\2\2"+
		"\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143f\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\t\n\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\64\2\2\u014bh\3\2\2\2\20\2~\u0081"+
		"\u0089\u0095\u011e\u0125\u012b\u012e\u0133\u0137\u013c\u0142\u0148\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}