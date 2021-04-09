package LCTlang.Main;

import LCTlang.statements.StatementVisitor;
import LCTlang.LCTLexer;
import LCTlang.LCTParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class LCTMain {
    public static void main(String[] args)
    {
        try{
            LCTLexer lexer = new LCTLexer(new ANTLRFileStream("Tests/test.LCT"));
            LCTParser parser = new LCTParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            StatementVisitor visitor = new StatementVisitor();
            visitor.visit(tree);
        } catch (Exception ex) {
            if (ex instanceof RuntimeException) {
                System.out.println(ex.getMessage());
            } else if (ex instanceof IOException){
                ex.printStackTrace();
            }
        }
    }
}