// Generated from E:/Projects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
package LCTlang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LCTParser}.
 */
public interface LCTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LCTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LCTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LCTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LCTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LCTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LCTParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LCTParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void enterReassignment(LCTParser.ReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void exitReassignment(LCTParser.ReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(LCTParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(LCTParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(LCTParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(LCTParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(LCTParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(LCTParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(LCTParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(LCTParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LCTParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LCTParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(LCTParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(LCTParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variablesExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariablesExpr(LCTParser.VariablesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variablesExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariablesExpr(LCTParser.VariablesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(LCTParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(LCTParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LCTParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LCTParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiDivExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiDivExpr(LCTParser.MultiDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiDivExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiDivExpr(LCTParser.MultiDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(LCTParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(LCTParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(LCTParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(LCTParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LCTParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LCTParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterNumberVariable(LCTParser.NumberVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitNumberVariable(LCTParser.NumberVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterStringVariable(LCTParser.StringVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitStringVariable(LCTParser.StringVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterIdVariable(LCTParser.IdVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitIdVariable(LCTParser.IdVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVariable(LCTParser.BooleanVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVariable(LCTParser.BooleanVariableContext ctx);
}