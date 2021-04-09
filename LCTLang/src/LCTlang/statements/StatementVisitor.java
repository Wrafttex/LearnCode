package LCTlang.statements;

import LCTlang.LCTBaseVisitor;
import LCTlang.LCTParser;
import LCTlang.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class StatementVisitor extends LCTBaseVisitor<Value>
{
    private final Map<String, Value> memory = new HashMap<String, Value>();

/* Start of all Statements
*  Start of all Statements
*  Start of all Statements*/
    @Override public Value visitAssignStatement(LCTParser.AssignStatementContext ctx)
    {
        if (ctx.getText().contains("=")) {
            String id = ctx.Identifier().getText();
            Value value = this.visit(ctx.expr());
            return memory.put(id, value);
        } else {
            String id = ctx.Identifier().getText();
            Value value = Value.VOID;
            return memory.put(id, value);
    }
    }

    @Override public Value visitReassignment(LCTParser.ReassignmentContext ctx)
    {
        String id = ctx.Identifier().getText();

        if (memory.containsKey(id)) {
            Value value = this.visit(ctx.expr());
            return memory.replace(id, value);
        }
        else
            throw new RuntimeException("no such variable: " + id);
    }

    @Override public Value visitForStatement(LCTParser.ForStatementContext ctx)
    {
        String endCheck = ctx.statementBlock().getText();
        if (!endCheck.substring(endCheck.length() - 3).contains("end"))
            throw new RuntimeException("Missing end to encapsulate the loop");

        int start = Integer.parseInt(ctx.forCondition().startExpr.getText());
        int end = Integer.parseInt(ctx.forCondition().endExpr.getText());
        int i;

        for (i = start; i < end; i++){
            this.visit(ctx.statementBlock());
        }

        return Value.VOID;
    }

    @Override public Value visitIfStatement(LCTParser.IfStatementContext ctx) {


        List<LCTParser.ConditionBlockContext> conditions =  ctx.conditionBlock();

        boolean evaluatedBlock = false;

        for(LCTParser.ConditionBlockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.statementBlock());
                break;
            }
        }

        if(!evaluatedBlock && ctx.statementBlock() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.statementBlock());
        }

        return Value.VOID;
    }


     /* Start of all Variables
     *  Start of all Variables
     *  Start of all Variables*/

     @Override public Value visitVariableExpr(LCTParser.VariableExprContext ctx) {
         Value value = this.visit(ctx.variable());
         return value;
     }


    @Override public Value visitIdentifierVariable(LCTParser.IdentifierVariableContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    @Override public Value visitStringVariable(LCTParser.StringVariableContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override public Value visitNumberVariable(LCTParser.NumberVariableContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override public Value visitBooleanVariable(LCTParser.BooleanVariableContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    /* Start of all Expr
    *  Start of all Expr
    *  Start of all Expr*/

    @Override public Value visitPostIncrementExpr(LCTParser.PostIncrementExprContext ctx) {
        Value expression = this.visit(ctx.expr());
        int i = 1;
        return new Value(expression.asDouble() + i);

    }

    @Override public Value visitPostDecrementExpr(LCTParser.PostDecrementExprContext ctx) {
        Value expression = this.visit(ctx.expr());
        int i = 1;
        return new Value(expression.asDouble() - i);
    }

    @Override public Value visitPreIncrementExpr(LCTParser.PreIncrementExprContext ctx) {
        Value expression = this.visit(ctx.expr());
        int i = 1;
        return new Value(i + expression.asDouble());
    }

    @Override public Value visitPreDecrementExpr(LCTParser.PreDecrementExprContext ctx) {
        Value expression = this.visit(ctx.expr());
        int i = -1;
        return new Value(i + expression.asDouble());
    }


    @Override public Value visitPowerExpr(LCTParser.PowerExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));

    }


    @Override public Value visitAdditiveExpr(LCTParser.AdditiveExprContext ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.Plus:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case LCTParser.Minus:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitMultiplicativeExpr(LCTParser.MultiplicativeExprContext ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.Multiply:
                return new Value(left.asDouble() * right.asDouble());
            case LCTParser.Divide:
                if (left.asDouble() == 0 || right.asDouble() == 0) {
                    throw new RuntimeException("Division with 0 is illegal");
                    //return left.asDouble() == 0 ? right : left;
                }
                return new Value(left.asDouble() / right.asDouble());
            case LCTParser.Modulo:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitRelationalExpr(LCTParser.RelationalExprContext ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.LessThan:
                return new Value(left.asDouble() < right.asDouble());
            case LCTParser.LessEqual:
                return new Value(left.asDouble() <= right.asDouble());
            case LCTParser.MoreThan:
                return new Value(left.asDouble() > right.asDouble());
            case LCTParser.MoreEqual:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitEqualExpr(LCTParser.EqualExprContext ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.Equal:
                if (!left.isDouble() && !right.isDouble()){
                    return new Value(left.asString().equals(right.asString()));
                } else
                    return new Value(Math.abs(left.asDouble() - right.asDouble()) < 0.00000000001);
            case LCTParser.NotEqual:
                if (!left.isDouble() && !right.isDouble()){
                    return new Value(!left.asString().equals(right.asString()));
                } else
                    return new Value(Math.abs(left.asDouble() - right.asDouble()) >= 0.00000000001);
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitAndExpr(LCTParser.AndExprContext ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override public Value visitOrExpr(LCTParser.OrExprContext ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    //OUTPUT
    @Override public Value visitOutput(LCTParser.OutputContext ctx)
    {
        if ((ctx.getText().contains("<missing '('>")) || (ctx.getText().contains("<missing ')'>"))) {
            throw new RuntimeException("Missing ( ) around output expression");
        }

        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

}