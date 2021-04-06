// Generated from C:/Users/PC/Desktop/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link LCTParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(LCTParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(LCTParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#invocationStatement}.
	 * @param ctx the parse tree
	 */
	void enterInvocationStatement(LCTParser.InvocationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#invocationStatement}.
	 * @param ctx the parse tree
	 */
	void exitInvocationStatement(LCTParser.InvocationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(LCTParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(LCTParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDK}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIDK(LCTParser.IDKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDK}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIDK(LCTParser.IDKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(LCTParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(LCTParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(LCTParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(LCTParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(LCTParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(LCTParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(LCTParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(LCTParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(LCTParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(LCTParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(LCTParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(LCTParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(LCTParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(LCTParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(LCTParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(LCTParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(LCTParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(LCTParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(LCTParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link LCTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(LCTParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(LCTParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(LCTParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(LCTParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(LCTParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(LCTParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(LCTParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LCTParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LCTParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(LCTParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(LCTParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(LCTParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(LCTParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(LCTParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(LCTParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LCTParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LCTParser.ReturnStatementContext ctx);
}