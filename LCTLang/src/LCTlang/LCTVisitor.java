// Generated from C:/Users/Nobody/Documents/aau/4/project/LearnCode-branch3/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link LCTParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(LCTParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#reassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignment(LCTParser.ReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#solve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolve(LCTParser.SolveContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(LCTParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#log10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog10(LCTParser.Log10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LCTParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(LCTParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpr(LCTParser.PreDecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(LCTParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(LCTParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpr(LCTParser.PostIncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpr(LCTParser.PreIncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(LCTParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(LCTParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(LCTParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpr(LCTParser.PostDecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(LCTParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(LCTParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberVariable(LCTParser.NumberVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierVariable(LCTParser.IdentifierVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVariable(LCTParser.StringVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariable(LCTParser.BooleanVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LCTParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LCTParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(LCTParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(LCTParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(LCTParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(LCTParser.StatementBlockContext ctx);
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
}