// Generated from C:/UnityProjects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link LCTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LCTParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LCTParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(LCTParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(LCTParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#invocationStmt}.
	 * @param ctx the parse tree
	 */
	void enterInvocationStmt(LCTParser.InvocationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#invocationStmt}.
	 * @param ctx the parse tree
	 */
	void exitInvocationStmt(LCTParser.InvocationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LCTParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LCTParser.ExprContext ctx);
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
}