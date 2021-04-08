package LCTlang;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

<<<<<<< HEAD
public class LCTMain
{
    public static void main(String[] args) {
        try {
            CharStream input = (CharStream) new ANTLRFileStream("Tests/test.LCT");
            LCTLexer lexer = new LCTLexer(input);
=======
public class LCTMain {
    public static void main(String[] args)
    {
        try{
            LCTLexer lexer = new LCTLexer(new ANTLRFileStream("Tests/test.LCT"));
>>>>>>> Loops
            LCTParser parser = new LCTParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            LCTCustomBaseVisitor visitor = new LCTCustomBaseVisitor();
            visitor.visit(tree);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}