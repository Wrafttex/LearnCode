// Generated from E:/Projects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
package LCTlang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LCTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LCTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LCTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LCTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LCTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LCTParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#reassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignment(LCTParser.ReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(LCTParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(LCTParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LCTParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(LCTParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(LCTParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LCTParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(LCTParser.ConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variablesExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesExpr(LCTParser.VariablesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpr(LCTParser.PlusMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(LCTParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiDivExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiDivExpr(LCTParser.MultiDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(LCTParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(LCTParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LCTParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberVariable(LCTParser.NumberVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVariable(LCTParser.StringVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdVariable(LCTParser.IdVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanVariable}
	 * labeled alternative in {@link LCTParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariable(LCTParser.BooleanVariableContext ctx);
}