package CodeWork.expression;

import CodeWork.CodeWorkBaseVisitor;
import CodeWork.CodeWorkParser;


import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends CodeWorkBaseVisitor {

    public List<String> semanticErrors; // to be accessed by the main application program

    @Override
    public Program visitProgram(CodeWorkParser.ProgramContext ctx) {
        Program prog = new Program();

        semanticErrors = new ArrayList<>();
        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors); // a helper visitor for transforming each subtree into a Expression object.
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount() - 1) {

            } else prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
        }

        return prog;
    }
}
