// Generated from C:/UnityProjects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link LCTParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(LCTParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(LCTParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#invocationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocationStmt(LCTParser.InvocationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LCTParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LCTParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(LCTParser.ShowContext ctx);
}