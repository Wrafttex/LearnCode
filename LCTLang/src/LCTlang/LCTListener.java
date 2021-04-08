<<<<<<< HEAD
// Generated from C:/Users/PC/Desktop/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
=======
// Generated from E:/Projects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
>>>>>>> Loops
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
<<<<<<< HEAD
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
=======
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
>>>>>>> Loops
	/**
	 * Enter a parse tree produced by {@link LCTParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(LCTParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#statementBlock}.
	 * @param ctx the parse tree
	 */
<<<<<<< HEAD
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
=======
	void exitStatementBlock(LCTParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LCTParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LCTParser.BlockContext ctx);
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
>>>>>>> Loops
}