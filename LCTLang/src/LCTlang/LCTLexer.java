// Generated from LCT.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMMA=3, VAR=4, INT=5, STRING=6, ID=7, WS=8, ADDITION=9, 
		SUBTRACTION=10, MULTIPLICATION=11, DIVISION=12, LPAREN=13, RPAREN=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "COMMA", "VAR", "INT", "STRING", "ID", "WS", "ADDITION", 
			"SUBTRACTION", "MULTIPLICATION", "DIVISION", "LPAREN", "RPAREN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'show'", "','", "'var'", null, null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMA", "VAR", "INT", "STRING", "ID", "WS", "ADDITION", 
			"SUBTRACTION", "MULTIPLICATION", "DIVISION", "LPAREN", "RPAREN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20T\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\6\6.\n\6\r\6\16\6/\3\7\3\7\7\7\64\n\7\f\7\16"+
		"\7\67\13\7\3\7\3\7\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\t\6\tC\n\t\r\t\16"+
		"\tD\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\2\2"+
		"\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\3\2\7\3\2\62;\4\2\f\f$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\2W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7"+
		"&\3\2\2\2\t(\3\2\2\2\13-\3\2\2\2\r\61\3\2\2\2\17:\3\2\2\2\21B\3\2\2\2"+
		"\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35R\3\2\2"+
		"\2\37 \7?\2\2 \4\3\2\2\2!\"\7u\2\2\"#\7j\2\2#$\7q\2\2$%\7y\2\2%\6\3\2"+
		"\2\2&\'\7.\2\2\'\b\3\2\2\2()\7x\2\2)*\7c\2\2*+\7t\2\2+\n\3\2\2\2,.\t\2"+
		"\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\f\3\2\2\2\61\65\7$\2"+
		"\2\62\64\n\3\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\668\3\2\2\2\67\65\3\2\2\289\7$\2\29\16\3\2\2\2:>\t\4\2\2;=\t\5\2\2"+
		"<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\20\3\2\2\2@>\3\2\2\2AC\t\6\2"+
		"\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\b\t\2\2G\22\3\2"+
		"\2\2HI\7-\2\2I\24\3\2\2\2JK\7/\2\2K\26\3\2\2\2LM\7,\2\2M\30\3\2\2\2NO"+
		"\7\61\2\2O\32\3\2\2\2PQ\7*\2\2Q\34\3\2\2\2RS\7+\2\2S\36\3\2\2\2\7\2/\65"+
		">D\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}