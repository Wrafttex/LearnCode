package LCTlang.Main;

import LCTlang.statements.StatementVisitor;
import LCTlang.LCTLexer;
import LCTlang.LCTParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.core.expression.S;
import org.matheclipse.core.interfaces.ISymbol;

public class LCTMain {
    public static void main(String[] args) {

       /* try {
            ExprEvaluator util = new ExprEvaluator();
            IExpr Result2 = util.eval("Solve(1+c==2,c)");
            System.out.println(Result2);
            System.out.println(util);
            IExpr eq = F.Equal(F.Plus(F.a, F.b));
            System.out.println(eq);
            IExpr eq1 = eq.replaceAll(F.Rule(F.a, F.integer(1)));
            System.out.println(eq1);
            eq1 = eq1.replaceAll(F.Rule(F.b, F.integer(2)));
            System.out.println(eq1);

            // Solve(1+2==c, c)
            IExpr result = util.eval(F.Solve(eq1, F.c));
            System.out.println(result);
            // print: {{c->3}}
            System.out.println(result.toString());

            IExpr eq2 = eq.replaceAll(F.Rule(F.a, F.integer(1)));
            eq2 = eq2.replaceAll(F.Rule(F.c, F.integer(3)));
            // Solve(1+b==3, b)
            result = util.evaluate(F.Solve(eq2, F.b));
            // print: {{b->2}}
            System.out.println(result.toString());
        }
        catch (SyntaxError e) { // fang lige MathException og alm. exceptions too lazy to write
            System.out.println(e.getMessage());
        }*/



        if (args.length != 1) {
            System.err.print("Usage: file name");
        } else {
            String fileName = args[0];
            LCTParser parser = getParser(fileName);

            // tell ANTLR to build a parse tree
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