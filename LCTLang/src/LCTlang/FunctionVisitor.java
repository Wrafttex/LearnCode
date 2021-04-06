package LCTlang;

public class FunctionVisitor extends LCTBaseVisitor<Object> {

    @Override public Object visitStatement(LCTParser.StatementContext ctx) { return visitChildren(ctx); }

    @Override public Object visitStatementList(LCTParser.StatementListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        return visitChildren(ctx);
    }

    @Override public Object visitFunctionBody(LCTParser.FunctionBodyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFunctionBlock(LCTParser.FunctionBlockContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIdentifier(LCTParser.IdentifierContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFunctionIdentifier(LCTParser.FunctionIdentifierContext ctx) { return visitChildren(ctx); }

    @Override public Object visitArguments(LCTParser.ArgumentsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFunctionName(LCTParser.FunctionNameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReturnStatement(LCTParser.ReturnStatementContext ctx) { return visitChildren(ctx); }
}
