// Generated from C:/Users/PC/Desktop/CodeWork/src/CodeWork\CodeWork.g4 by ANTLR 4.9.1
package CodeWork;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodeWorkParser}.
 */
public interface CodeWorkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link CodeWorkParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CodeWorkParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link CodeWorkParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CodeWorkParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link CodeWorkParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CodeWorkParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link CodeWorkParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CodeWorkParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CodeWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(CodeWorkParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CodeWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(CodeWorkParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CodeWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(CodeWorkParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CodeWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(CodeWorkParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CodeWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CodeWorkParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CodeWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CodeWorkParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CodeWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CodeWorkParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CodeWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CodeWorkParser.NumberContext ctx);
}