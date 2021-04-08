package CodeWork.expression;

import CodeWork.CodeWorkBaseVisitor;
import CodeWork.CodeWorkParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;


public class AntlrToExpression extends CodeWorkBaseVisitor<Expression> {

    private List<String> vars; //stores all the variables declared in the program so far
    private List<String> semanticErrors; //1. duplicate declaration 2. reference to undeclared variable

    public AntlrToExpression(List<String> semanticErrors) {
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Expression visitDeclaration(CodeWorkParser.DeclarationContext ctx) {

        //ID() is a method generated to correspond to the token ID in the CodeWork.g4 grammar

        Token idToken = ctx.ID().getSymbol(); // equivilant to: ctx.getChild(0).getSymbol();
        String id = ctx.getChild(0).getText();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " allready declared (" + line + ", " + column + ")");
        } else {
            vars.add(id);
        }
        String type = ctx.getChild(2).getText();
        int value = Integer.parseInt(ctx.NUM().getText());
        return new VariableDeclaration(id, type, value);
    }

    @Override
    public Expression visitMultiplication(CodeWorkParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0)); //recursively visiting the left subtree of the current multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override
    public Expression visitAddition(CodeWorkParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0)); //recursively visiting the left subtree of the current multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Addition(left, right);
    }

    @Override
    public Expression visitVariable(CodeWorkParser.VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id = ctx.getChild(0).getText();
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variable" + id + " not declared (" + line + ", " + column + ")");
        }
        return new Variable(id);
    }

    @Override
    public Expression visitNumber(CodeWorkParser.NumberContext ctx) {

        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }
}

