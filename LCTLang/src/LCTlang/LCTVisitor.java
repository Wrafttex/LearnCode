// Generated from C:/Users/PC/Desktop/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link LCTParser#invocationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocationStatement(LCTParser.InvocationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(LCTParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDK}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDK(LCTParser.IDKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(LCTParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(LCTParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(LCTParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(LCTParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(LCTParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(LCTParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(LCTParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(LCTParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(LCTParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(LCTParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(LCTParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(LCTParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(LCTParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LCTParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(LCTParser.FunctionIdentifierContext ctx);
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
}