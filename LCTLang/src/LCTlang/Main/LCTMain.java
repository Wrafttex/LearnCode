package LCTlang.Main;

import LCTlang.statements.StatementVisitor;
import LCTlang.LCTLexer;
import LCTlang.LCTParser;
<<<<<<< Updated upstream
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
=======
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
>>>>>>> Stashed changes
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class LCTMain {
<<<<<<< Updated upstream
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.print("Usage: file name");
        } else {
            String fileName = args[0];
            LCTParser parser = getParser(fileName);

            // tell ANTLR to build a parse tree
=======
    public static void main(String[] args)
    {
        try{
            LCTLexer lexer = new LCTLexer((CharStream) new ANTLRFileStream("Tests/test.LCT"));
            LCTParser parser = new LCTParser(new CommonTokenStream(lexer));
>>>>>>> Stashed changes
            ParseTree tree = parser.program();


            // Create a visitor for converting the parse tree into Program/Expression object
            StatementVisitor Visitor = new StatementVisitor();
            Visitor.visit(tree);
        }
    }


        private static LCTParser getParser(String filename){
            LCTParser parser = null;
            try {
                CharStream input = CharStreams.fromFileName(filename);
                LCTLexer lexer = new LCTLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                parser = new LCTParser(tokens);
            } catch (Exception ex) {
                if (ex instanceof RuntimeException) {
                    System.out.println(ex.getMessage());
                } else if (ex instanceof IOException) {
                    ex.printStackTrace();
                }
            }
            return parser;
        }


}