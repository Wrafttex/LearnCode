<<<<<<< HEAD
// Generated from C:/Users/PC/Desktop/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
=======
// Generated from E:/Projects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
>>>>>>> Loops
package LCTlang;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link LCTVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class LCTBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LCTVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProgram(LCTParser.ProgramContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStatement(LCTParser.StatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitAssignStatement(LCTParser.AssignStatementContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitAssignment(LCTParser.AssignmentContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitInvocationStatement(LCTParser.InvocationStatementContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitReassignment(LCTParser.ReassignmentContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitStatementList(LCTParser.StatementListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIDK(LCTParser.IDKContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAdditiveExpression(LCTParser.AdditiveExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPostIncrementExpression(LCTParser.PostIncrementExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPreDecrementExpression(LCTParser.PreDecrementExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPowerExpression(LCTParser.PowerExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPreIncrementExpression(LCTParser.PreIncrementExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAssignmentExpression(LCTParser.AssignmentExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNotExpression(LCTParser.NotExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPostDecrementExpression(LCTParser.PostDecrementExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMultiplicativeExpression(LCTParser.MultiplicativeExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdentifierExpression(LCTParser.IdentifierExpressionContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitOutput(LCTParser.OutputContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitShow(LCTParser.ShowContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitStatementBlock(LCTParser.StatementBlockContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitBlock(LCTParser.BlockContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFunctionBody(LCTParser.FunctionBodyContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitForStatement(LCTParser.ForStatementContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFunctionBlock(LCTParser.FunctionBlockContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitForCondition(LCTParser.ForConditionContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitIdentifier(LCTParser.IdentifierContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitIfStatement(LCTParser.IfStatementContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFunctionIdentifier(LCTParser.FunctionIdentifierContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitConditionBlock(LCTParser.ConditionBlockContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitArguments(LCTParser.ArgumentsContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitVariablesExpr(LCTParser.VariablesExprContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFunctionName(LCTParser.FunctionNameContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitPlusMinusExpr(LCTParser.PlusMinusExprContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitReturnStatement(LCTParser.ReturnStatementContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitOrExpr(LCTParser.OrExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMultiDivExpr(LCTParser.MultiDivExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRelationalExpr(LCTParser.RelationalExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEqualExpr(LCTParser.EqualExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAndExpr(LCTParser.AndExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNumberVariable(LCTParser.NumberVariableContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStringVariable(LCTParser.StringVariableContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdVariable(LCTParser.IdVariableContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBooleanVariable(LCTParser.BooleanVariableContext ctx) { return visitChildren(ctx); }
>>>>>>> Loops
}