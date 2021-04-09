package LCTlang.functions;

import LCTlang.LCTBaseVisitor;
import LCTlang.LCTParser;
import LCTlang.Value;
import com.sun.source.tree.Scope;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

public class FunctionVisitor extends LCTBaseVisitor<Object> {
    private final Map<String, Value> memory = new HashMap<String, Value>();

    @Override public Object visitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx) {
        String funcName = ctx.getChild(2).getText();

        return visitChildren(ctx);
    }



    @Override public Object visitIdentifier(LCTParser.IdentifierContext ctx) { return visitChildren(ctx); }

    @Override public Object visitArguments(LCTParser.ArgumentsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFunctionName(LCTParser.FunctionNameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReturnStatement(LCTParser.ReturnStatementContext ctx) { return visitChildren(ctx); }
}
