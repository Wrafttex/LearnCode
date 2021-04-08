package Main;

import CodeWork.CodeWorkLexer;
import CodeWork.CodeWorkParser;
import CodeWork.expression.AntlrToProgram;
import CodeWork.expression.ExpressionProcessor;
import CodeWork.expression.Program;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class CodeWorkMain {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.print("Usage: file name");
        } else {
            String fileName = args[0];
            CodeWorkParser parser = getParser(fileName);

            // tell ANTLR to build a parse tree
            // parse from the start symbol 'prog'
            ParseTree antlrAST = parser.prog();

            // Create a visitor for converting the parse tree into Program/Expression object
            AntlrToProgram progVisitor = new AntlrToProgram();
            Program prog = (Program) progVisitor.visit(antlrAST);

            if (progVisitor.semanticErrors.isEmpty()) {
                ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
                for (String evaluation : ep.getEvaluationResults()) {
                    System.out.println(evaluation);
                }
            } else {
                for (String err : progVisitor.semanticErrors) {
                    System.out.println(err);
                }
            }


        }
    }

    private static CodeWorkParser getParser(String filename) {
        CodeWorkParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(filename);
            CodeWorkLexer lexer = new CodeWorkLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new CodeWorkParser(tokens);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser;
    }

}
