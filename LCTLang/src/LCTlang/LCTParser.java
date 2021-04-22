// Generated from C:/Users/Nobody/Documents/aau/4/project/LearnCode-branch3/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Multi_comment=6, Single_comment=7, 
		Function=8, Break=9, For=10, If=11, Else=12, Square_root=13, OR=14, AND=15, 
		True=16, False=17, Return=18, Var=19, Log10=20, Print=21, Solve=22, End=23, 
		Then=24, LeftParen=25, RightParen=26, LeftBracket=27, RightBracket=28, 
		LeftBrace=29, RightBrace=30, Colon=31, Semicolon=32, Comma=33, Plus=34, 
		Minus=35, Multiply=36, Divide=37, Power=38, Modulo=39, LessThan=40, MoreThan=41, 
		Assign=42, LessEqual=43, MoreEqual=44, NotEqual=45, Not=46, Equal=47, 
		String=48, Int=49, Float=50, Identifier=51, Whitespace=52;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignStatement = 2, RULE_reassignment = 3, 
		RULE_solve = 4, RULE_output = 5, RULE_log10 = 6, RULE_expr = 7, RULE_variable = 8, 
		RULE_functionDeclaration = 9, RULE_functionCall = 10, RULE_identifier = 11, 
		RULE_arguments = 12, RULE_functionName = 13, RULE_returnStatement = 14, 
		RULE_statementBlock = 15, RULE_forStatement = 16, RULE_forCondition = 17, 
		RULE_ifStatement = 18, RULE_conditionBlock = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignStatement", "reassignment", "solve", "output", 
			"log10", "expr", "variable", "functionDeclaration", "functionCall", "identifier", 
			"arguments", "functionName", "returnStatement", "statementBlock", "forStatement", 
			"forCondition", "ifStatement", "conditionBlock"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Function) | (1L << For) | (1L << If) | (1L << Return) | (1L << Var) | (1L << Log10) | (1L << Print) | (1L << Solve) | (1L << Identifier))) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
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
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ReassignmentContext reassignment() {
			return getRuleContext(ReassignmentContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SolveContext solve() {
			return getRuleContext(SolveContext.class,0);
		}
		public Log10Context log10() {
			return getRuleContext(Log10Context.class,0);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				assignStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				reassignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				output();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(54);
				solve();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(55);
				log10();
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

	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(LCTParser.Var, 0); }
		public TerminalNode Identifier() { return getToken(LCTParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(LCTParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignStatement);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(Var);
				setState(59);
				match(Identifier);
				setState(60);
				match(Assign);
				setState(61);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(Var);
				setState(63);
				match(Identifier);
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

	public static class ReassignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LCTParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(LCTParser.Assign, 0); }
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
			setState(66);
			match(Identifier);
			setState(67);
			match(Assign);
			setState(68);
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

	public static class SolveContext extends ParserRuleContext {
		public TerminalNode Solve() { return getToken(LCTParser.Solve, 0); }
		public TerminalNode LeftParen() { return getToken(LCTParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LCTParser.RightParen, 0); }
		public SolveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterSolve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitSolve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitSolve(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolveContext solve() throws RecognitionException {
		SolveContext _localctx = new SolveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_solve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Solve);
			setState(71);
			match(LeftParen);
			setState(72);
			expr(0);
			setState(73);
			match(RightParen);
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
		public TerminalNode Print() { return getToken(LCTParser.Print, 0); }
		public TerminalNode LeftParen() { return getToken(LCTParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LCTParser.RightParen, 0); }
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
		enterRule(_localctx, 10, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(Print);
			setState(76);
			match(LeftParen);
			setState(77);
			expr(0);
			setState(78);
			match(RightParen);
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

	public static class Log10Context extends ParserRuleContext {
		public TerminalNode Log10() { return getToken(LCTParser.Log10, 0); }
		public TerminalNode LeftParen() { return getToken(LCTParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LCTParser.RightParen, 0); }
		public Log10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterLog10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitLog10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitLog10(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log10Context log10() throws RecognitionException {
		Log10Context _localctx = new Log10Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_log10);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Log10);
			setState(81);
			match(LeftParen);
			setState(82);
			expr(0);
			setState(83);
			match(RightParen);
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
	public static class EqualExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Equal() { return getToken(LCTParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(LCTParser.NotEqual, 0); }
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
	public static class PreDecrementExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreDecrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterPreDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitPreDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitPreDecrementExpr(this);
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
		public TerminalNode LessEqual() { return getToken(LCTParser.LessEqual, 0); }
		public TerminalNode MoreEqual() { return getToken(LCTParser.MoreEqual, 0); }
		public TerminalNode LessThan() { return getToken(LCTParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(LCTParser.MoreThan, 0); }
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
	public static class PostIncrementExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostIncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterPostIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitPostIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitPostIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncrementExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreIncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterPreIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitPreIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitPreIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Power() { return getToken(LCTParser.Power, 0); }
		public PowerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitPowerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(LCTParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(LCTParser.Divide, 0); }
		public TerminalNode Modulo() { return getToken(LCTParser.Modulo, 0); }
		public MultiplicativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Plus() { return getToken(LCTParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(LCTParser.Minus, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecrementExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostDecrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterPostDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitPostDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitPostDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExprContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode Not() { return getToken(LCTParser.Not, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitNotExpr(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
			case String:
			case Int:
			case Float:
			case Identifier:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				variable();
				}
				break;
			case T__0:
				{
				_localctx = new PreIncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__0);
				setState(88);
				expr(10);
				}
				break;
			case T__1:
				{
				_localctx = new PreDecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(T__1);
				setState(90);
				expr(9);
				}
				break;
			case Not:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(Not);
				setState(92);
				expr(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(96);
						((PowerExprContext)_localctx).op = match(Power);
						setState(97);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(99);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessEqual) | (1L << MoreEqual))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(102);
						((MultiplicativeExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulo))) != 0)) ) {
							((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(108);
						((EqualExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NotEqual || _la==Equal) ) {
							((EqualExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(111);
						match(AND);
						setState(112);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(114);
						match(OR);
						setState(115);
						expr(2);
						}
						break;
					case 8:
						{
						_localctx = new PostIncrementExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(117);
						match(T__0);
						}
						break;
					case 9:
						{
						_localctx = new PostDecrementExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(119);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberVariableContext extends VariableContext {
		public TerminalNode Int() { return getToken(LCTParser.Int, 0); }
		public TerminalNode Float() { return getToken(LCTParser.Float, 0); }
		public NumberVariableContext(VariableContext ctx) { copyFrom(ctx); }
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
	public static class BooleanVariableContext extends VariableContext {
		public TerminalNode True() { return getToken(LCTParser.True, 0); }
		public TerminalNode False() { return getToken(LCTParser.False, 0); }
		public BooleanVariableContext(VariableContext ctx) { copyFrom(ctx); }
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
	public static class IdentifierVariableContext extends VariableContext {
		public TerminalNode Identifier() { return getToken(LCTParser.Identifier, 0); }
		public IdentifierVariableContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterIdentifierVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitIdentifierVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitIdentifierVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringVariableContext extends VariableContext {
		public TerminalNode String() { return getToken(LCTParser.String, 0); }
		public StringVariableContext(VariableContext ctx) { copyFrom(ctx); }
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

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(_la==Int || _la==Float) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Identifier:
				_localctx = new IdentifierVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(Identifier);
				}
				break;
			case String:
				_localctx = new StringVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(String);
				}
				break;
			case True:
			case False:
				_localctx = new BooleanVariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==True || _la==False) ) {
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(LCTParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(LCTParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(LCTParser.RightParen, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(Function);
			setState(132);
			identifier();
			setState(133);
			match(LeftParen);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << True) | (1L << False) | (1L << Not) | (1L << String) | (1L << Int) | (1L << Float) | (1L << Identifier))) != 0)) {
				{
				setState(134);
				arguments();
				}
			}

			setState(137);
			match(RightParen);
			setState(138);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(LCTParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(LCTParser.RightParen, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			identifier();
			setState(141);
			match(LeftParen);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << True) | (1L << False) | (1L << Not) | (1L << String) | (1L << Int) | (1L << Float) | (1L << Identifier))) != 0)) {
				{
				setState(142);
				arguments();
				}
			}

			setState(145);
			match(RightParen);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LCTParser.Identifier, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(Identifier);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				functionName();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LCTParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LCTParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			expr(0);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(152);
				match(Comma);
				setState(153);
				expr(0);
				}
				}
				setState(158);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__2);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(LCTParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(LCTParser.Semicolon, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCTListener ) ((LCTListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCTVisitor ) return ((LCTVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Return);
			setState(162);
			expr(0);
			setState(163);
			match(Semicolon);
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
		public TerminalNode End() { return getToken(LCTParser.End, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 30, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				statement();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Function) | (1L << For) | (1L << If) | (1L << Return) | (1L << Var) | (1L << Log10) | (1L << Print) | (1L << Solve) | (1L << Identifier))) != 0) );
			setState(170);
			match(End);
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
		public TerminalNode For() { return getToken(LCTParser.For, 0); }
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
		enterRule(_localctx, 32, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(For);
			setState(173);
			forCondition();
			setState(174);
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
		public ExprContext startExpr;
		public Token range;
		public ExprContext endExpr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 34, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((ForConditionContext)_localctx).iterator = expr(0);
			setState(177);
			match(T__3);
			setState(178);
			((ForConditionContext)_localctx).startExpr = expr(0);
			setState(179);
			((ForConditionContext)_localctx).range = match(T__4);
			setState(180);
			((ForConditionContext)_localctx).endExpr = expr(0);
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
		public List<TerminalNode> If() { return getTokens(LCTParser.If); }
		public TerminalNode If(int i) {
			return getToken(LCTParser.If, i);
		}
		public List<ConditionBlockContext> conditionBlock() {
			return getRuleContexts(ConditionBlockContext.class);
		}
		public ConditionBlockContext conditionBlock(int i) {
			return getRuleContext(ConditionBlockContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(LCTParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(LCTParser.Else, i);
		}
		public TerminalNode Then() { return getToken(LCTParser.Then, 0); }
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
		enterRule(_localctx, 36, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(If);
			setState(183);
			conditionBlock();
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					match(Else);
					setState(185);
					match(If);
					setState(186);
					conditionBlock();
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(192);
				match(Else);
				setState(193);
				match(Then);
				setState(194);
				statementBlock();
				}
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
		public TerminalNode LeftParen() { return getToken(LCTParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LCTParser.RightParen, 0); }
		public TerminalNode Then() { return getToken(LCTParser.Then, 0); }
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
		enterRule(_localctx, 38, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LeftParen);
			setState(198);
			expr(0);
			setState(199);
			match(RightParen);
			setState(200);
			match(Then);
			setState(201);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\n\3\n\3\n\3\n\5\n\u0084\n\n\3\13\3"+
		"\13\3\13\3\13\5\13\u008a\n\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0092\n\f"+
		"\3\f\3\f\3\r\3\r\5\r\u0098\n\r\3\16\3\16\3\16\7\16\u009d\n\16\f\16\16"+
		"\16\u00a0\13\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\6\21\u00a9\n\21\r\21"+
		"\16\21\u00aa\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\7\24\u00be\n\24\f\24\16\24\u00c1\13\24\3"+
		"\24\3\24\3\24\5\24\u00c6\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\2\3\20"+
		"\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\4\2*+-.\4\2&\'))"+
		"\3\2$%\4\2//\61\61\3\2\63\64\3\2\22\23\2\u00da\2-\3\2\2\2\4:\3\2\2\2\6"+
		"B\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2\fM\3\2\2\2\16R\3\2\2\2\20_\3\2\2\2\22"+
		"\u0083\3\2\2\2\24\u0085\3\2\2\2\26\u008e\3\2\2\2\30\u0097\3\2\2\2\32\u0099"+
		"\3\2\2\2\34\u00a1\3\2\2\2\36\u00a3\3\2\2\2 \u00a8\3\2\2\2\"\u00ae\3\2"+
		"\2\2$\u00b2\3\2\2\2&\u00b8\3\2\2\2(\u00c7\3\2\2\2*,\5\4\3\2+*\3\2\2\2"+
		",/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60;\5\6\4\2\61;\5"+
		"\b\5\2\62;\5\f\7\2\63;\5\36\20\2\64;\5&\24\2\65;\5\"\22\2\66;\5\24\13"+
		"\2\67;\5\26\f\28;\5\n\6\29;\5\16\b\2:\60\3\2\2\2:\61\3\2\2\2:\62\3\2\2"+
		"\2:\63\3\2\2\2:\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2"+
		"\2:9\3\2\2\2;\5\3\2\2\2<=\7\25\2\2=>\7\65\2\2>?\7,\2\2?C\5\20\t\2@A\7"+
		"\25\2\2AC\7\65\2\2B<\3\2\2\2B@\3\2\2\2C\7\3\2\2\2DE\7\65\2\2EF\7,\2\2"+
		"FG\5\20\t\2G\t\3\2\2\2HI\7\30\2\2IJ\7\33\2\2JK\5\20\t\2KL\7\34\2\2L\13"+
		"\3\2\2\2MN\7\27\2\2NO\7\33\2\2OP\5\20\t\2PQ\7\34\2\2Q\r\3\2\2\2RS\7\26"+
		"\2\2ST\7\33\2\2TU\5\20\t\2UV\7\34\2\2V\17\3\2\2\2WX\b\t\1\2X`\5\22\n\2"+
		"YZ\7\3\2\2Z`\5\20\t\f[\\\7\4\2\2\\`\5\20\t\13]^\7\60\2\2^`\5\20\t\n_W"+
		"\3\2\2\2_Y\3\2\2\2_[\3\2\2\2_]\3\2\2\2`|\3\2\2\2ab\f\t\2\2bc\7(\2\2c{"+
		"\5\20\t\nde\f\b\2\2ef\t\2\2\2f{\5\20\t\tgh\f\7\2\2hi\t\3\2\2i{\5\20\t"+
		"\bjk\f\6\2\2kl\t\4\2\2l{\5\20\t\7mn\f\5\2\2no\t\5\2\2o{\5\20\t\6pq\f\4"+
		"\2\2qr\7\21\2\2r{\5\20\t\5st\f\3\2\2tu\7\20\2\2u{\5\20\t\4vw\f\16\2\2"+
		"w{\7\3\2\2xy\f\r\2\2y{\7\4\2\2za\3\2\2\2zd\3\2\2\2zg\3\2\2\2zj\3\2\2\2"+
		"zm\3\2\2\2zp\3\2\2\2zs\3\2\2\2zv\3\2\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\21\3\2\2\2~|\3\2\2\2\177\u0084\t\6\2\2\u0080\u0084\7\65\2"+
		"\2\u0081\u0084\7\62\2\2\u0082\u0084\t\7\2\2\u0083\177\3\2\2\2\u0083\u0080"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\23\3\2\2\2\u0085"+
		"\u0086\7\n\2\2\u0086\u0087\5\30\r\2\u0087\u0089\7\33\2\2\u0088\u008a\5"+
		"\32\16\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\7\34\2\2\u008c\u008d\5 \21\2\u008d\25\3\2\2\2\u008e\u008f\5\30"+
		"\r\2\u008f\u0091\7\33\2\2\u0090\u0092\5\32\16\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\34\2\2\u0094\27\3\2\2"+
		"\2\u0095\u0098\7\65\2\2\u0096\u0098\5\34\17\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\31\3\2\2\2\u0099\u009e\5\20\t\2\u009a\u009b\7#\2"+
		"\2\u009b\u009d\5\20\t\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\33\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\u00a2\7\5\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5"+
		"\5\20\t\2\u00a5\u00a6\7\"\2\2\u00a6\37\3\2\2\2\u00a7\u00a9\5\4\3\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad!\3\2\2\2\u00ae\u00af"+
		"\7\f\2\2\u00af\u00b0\5$\23\2\u00b0\u00b1\5 \21\2\u00b1#\3\2\2\2\u00b2"+
		"\u00b3\5\20\t\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6\7"+
		"\7\2\2\u00b6\u00b7\5\20\t\2\u00b7%\3\2\2\2\u00b8\u00b9\7\r\2\2\u00b9\u00bf"+
		"\5(\25\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\7\r\2\2\u00bc\u00be\5(\25\2"+
		"\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c5\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\16\2\2"+
		"\u00c3\u00c4\7\32\2\2\u00c4\u00c6\5 \21\2\u00c5\u00c2\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\'\3\2\2\2\u00c7\u00c8\7\33\2\2\u00c8\u00c9\5\20\t\2\u00c9"+
		"\u00ca\7\34\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00cc\5 \21\2\u00cc)\3\2\2"+
		"\2\20-:B_z|\u0083\u0089\u0091\u0097\u009e\u00aa\u00bf\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}