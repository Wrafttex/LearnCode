// Generated from E:/Projects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
package LCTlang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LCTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PLUS=7, MINUS=8, MULTIPLICATION=9, 
		DIVISION=10, EQUAL=11, NOTEQUAL=12, GREATEREQUAL=13, LESSEQUAL=14, AND=15, 
		OR=16, GREATERTHAN=17, LESSTHAN=18, ASSIGN=19, TRUE=20, FALSE=21, FOR=22, 
		PRINT=23, VAR=24, IF=25, ELSE=26, ID=27, INT=28, FLOAT=29, STRING=30, 
		COMMENT=31, SPACE=32;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_reassignment = 3, 
		RULE_output = 4, RULE_statementBlock = 5, RULE_block = 6, RULE_forStatement = 7, 
		RULE_forCondition = 8, RULE_ifStatement = 9, RULE_conditionBlock = 10, 
		RULE_expr = 11, RULE_variables = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "reassignment", "output", "statementBlock", 
			"block", "forStatement", "forCondition", "ifStatement", "conditionBlock", 
			"expr", "variables"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'from'", "'to'", "'('", "')'", "'+'", "'-'", "'*'", 
			"'/'", "'=='", "'!='", "'>='", "'<='", "'&&'", "'||'", "'>'", "'<'", 
			"'='", "'true'", "'false'", "'loop'", "'output'", "'var'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "EQUAL", "NOTEQUAL", "GREATEREQUAL", "LESSEQUAL", "AND", 
			"OR", "GREATERTHAN", "LESSTHAN", "ASSIGN", "TRUE", "FALSE", "FOR", "PRINT", 
			"VAR", "IF", "ELSE", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE"
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

	@Override
	public String getGrammarFileName() { return "LCT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LCTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << PRINT) | (1L << VAR) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReassignmentContext reassignment() {
			return getRuleContext(ReassignmentContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				assignment();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				reassignment();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				output();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				forStatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LCTParser.VAR, 0); }
		public TerminalNode ID() { return getToken(LCTParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LCTParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(VAR);
			setState(40);
			match(ID);
			setState(41);
			match(ASSIGN);
			setState(42);
			expr(0);
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

	public static class ReassignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LCTParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LCTParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitReassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitReassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReassignmentContext reassignment() throws RecognitionException {
		ReassignmentContext _localctx = new ReassignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ID);
			setState(45);
			match(ASSIGN);
			setState(46);
			expr(0);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LCTParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PRINT);
			setState(49);
			expr(0);
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

	public static class StatementBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementBlock);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__0);
				setState(52);
				block();
				setState(53);
				match(T__1);
				}
				break;
			case FOR:
			case PRINT:
			case VAR:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				statement();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << PRINT) | (1L << VAR) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LCTParser.FOR, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(FOR);
			setState(65);
			forCondition();
			setState(66);
			statementBlock();
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

	public static class ForConditionContext extends ParserRuleContext {
		public ExprContext iterator;
		public Token startExpr;
		public Token range;
		public Token endExpr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(LCTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LCTParser.INT, i);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((ForConditionContext)_localctx).iterator = expr(0);
			setState(69);
			match(T__2);
			setState(70);
			((ForConditionContext)_localctx).startExpr = match(INT);
			setState(71);
			((ForConditionContext)_localctx).range = match(T__3);
			setState(72);
			((ForConditionContext)_localctx).endExpr = match(INT);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(LCTParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(LCTParser.IF, i);
		}
		public List<ConditionBlockContext> conditionBlock() {
			return getRuleContexts(ConditionBlockContext.class);
		}
		public ConditionBlockContext conditionBlock(int i) {
			return getRuleContext(ConditionBlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(LCTParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(LCTParser.ELSE, i);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IF);
			setState(75);
			conditionBlock();
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(ELSE);
					setState(77);
					match(IF);
					setState(78);
					conditionBlock();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(84);
				match(ELSE);
				setState(85);
				statementBlock();
				}
				break;
			}
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

	public static class ConditionBlockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterConditionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitConditionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitConditionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBlockContext conditionBlock() throws RecognitionException {
		ConditionBlockContext _localctx = new ConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
			setState(89);
			expr(0);
			setState(90);
			match(T__5);
			setState(91);
			statementBlock();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariablesExprContext extends ExprContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterVariablesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitVariablesExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitVariablesExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LCTParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LCTParser.MINUS, 0); }
		public PlusMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterPlusMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitPlusMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitPlusMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LCTParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(LCTParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(LCTParser.DIVISION, 0); }
		public MultiDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterMultiDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitMultiDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitMultiDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESSEQUAL() { return getToken(LCTParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(LCTParser.GREATEREQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(LCTParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(LCTParser.GREATERTHAN, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(LCTParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(LCTParser.NOTEQUAL, 0); }
		public EqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LCTParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VariablesExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(94);
			variables();
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultiDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(97);
						((MultiDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICATION || _la==DIVISION) ) {
							((MultiDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(100);
						((PlusMinusExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(103);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATEREQUAL) | (1L << LESSEQUAL) | (1L << GREATERTHAN) | (1L << LESSTHAN))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(106);
						((EqualExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((EqualExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(109);
						match(AND);
						setState(110);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(112);
						match(OR);
						setState(113);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(118);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	 
		public VariablesContext() { }
		public void copyFrom(VariablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringVariableContext extends VariablesContext {
		public TerminalNode STRING() { return getToken(LCTParser.STRING, 0); }
		public StringVariableContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterStringVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitStringVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitStringVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberVariableContext extends VariablesContext {
		public TerminalNode INT() { return getToken(LCTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LCTParser.FLOAT, 0); }
		public NumberVariableContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterNumberVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitNumberVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitNumberVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVariableContext extends VariablesContext {
		public TerminalNode TRUE() { return getToken(LCTParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LCTParser.FALSE, 0); }
		public BooleanVariableContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterBooleanVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitBooleanVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitBooleanVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdVariableContext extends VariablesContext {
		public TerminalNode ID() { return getToken(LCTParser.ID, 0); }
		public IdVariableContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterIdVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitIdVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitIdVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variables);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				_localctx = new NumberVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				_localctx = new StringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(STRING);
				}
				break;
			case ID:
				_localctx = new IdVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(ID);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanVariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7;\n\7\3\b\7\b>\n\b\f\b\16\bA\13\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13R\n\13\f\13\16"+
		"\13U\13\13\3\13\3\13\5\13Y\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"u\n\r\f\r\16\rx\13\r\3\16\3\16\3\16\3\16\5\16~\n\16\3\16\2\3\30\17\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\2\b\3\2\13\f\3\2\t\n\4\2\17\20\23\24\3\2"+
		"\r\16\3\2\36\37\3\2\26\27\2\u0084\2\37\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2"+
		"\b.\3\2\2\2\n\62\3\2\2\2\f:\3\2\2\2\16?\3\2\2\2\20B\3\2\2\2\22F\3\2\2"+
		"\2\24L\3\2\2\2\26Z\3\2\2\2\30_\3\2\2\2\32}\3\2\2\2\34\36\5\4\3\2\35\34"+
		"\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2"+
		"\"(\5\6\4\2#(\5\b\5\2$(\5\n\6\2%(\5\24\13\2&(\5\20\t\2\'\"\3\2\2\2\'#"+
		"\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7\32\2\2*+\7\35"+
		"\2\2+,\7\25\2\2,-\5\30\r\2-\7\3\2\2\2./\7\35\2\2/\60\7\25\2\2\60\61\5"+
		"\30\r\2\61\t\3\2\2\2\62\63\7\31\2\2\63\64\5\30\r\2\64\13\3\2\2\2\65\66"+
		"\7\3\2\2\66\67\5\16\b\2\678\7\4\2\28;\3\2\2\29;\5\4\3\2:\65\3\2\2\2:9"+
		"\3\2\2\2;\r\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@\17\3\2\2\2A?\3\2\2\2BC\7\30\2\2CD\5\22\n\2DE\5\f\7\2E\21\3\2\2\2FG\5"+
		"\30\r\2GH\7\5\2\2HI\7\36\2\2IJ\7\6\2\2JK\7\36\2\2K\23\3\2\2\2LM\7\33\2"+
		"\2MS\5\26\f\2NO\7\34\2\2OP\7\33\2\2PR\5\26\f\2QN\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2TX\3\2\2\2US\3\2\2\2VW\7\34\2\2WY\5\f\7\2XV\3\2\2\2XY"+
		"\3\2\2\2Y\25\3\2\2\2Z[\7\7\2\2[\\\5\30\r\2\\]\7\b\2\2]^\5\f\7\2^\27\3"+
		"\2\2\2_`\b\r\1\2`a\5\32\16\2av\3\2\2\2bc\f\b\2\2cd\t\2\2\2du\5\30\r\t"+
		"ef\f\7\2\2fg\t\3\2\2gu\5\30\r\bhi\f\6\2\2ij\t\4\2\2ju\5\30\r\7kl\f\5\2"+
		"\2lm\t\5\2\2mu\5\30\r\6no\f\4\2\2op\7\21\2\2pu\5\30\r\5qr\f\3\2\2rs\7"+
		"\22\2\2su\5\30\r\4tb\3\2\2\2te\3\2\2\2th\3\2\2\2tk\3\2\2\2tn\3\2\2\2t"+
		"q\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\31\3\2\2\2xv\3\2\2\2y~\t\6\2"+
		"\2z~\7 \2\2{~\7\35\2\2|~\t\7\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2"+
		"\2~\33\3\2\2\2\13\37\':?SXtv}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}