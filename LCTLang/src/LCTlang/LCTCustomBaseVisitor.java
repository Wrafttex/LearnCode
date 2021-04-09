package LCTlang;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LCTCustomBaseVisitor extends LCTBaseVisitor<Value> {
    private final Map<String, Value> memory = new HashMap<String, Value>();

    @Override
    public Value visitAssignment(LCTParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        if (memory.containsKey(id)) {
            System.out.println("Hov hov");
        }
        return memory.put(id, value);
    }

    @Override
    public Value visitReassignment(LCTParser.ReassignmentContext ctx) {
        String id = ctx.ID().getText();

        if (memory.containsKey(id)) {
            Value value = this.visit(ctx.expr());
            return memory.replace(id, value);
        } else
            throw new RuntimeException("no such variable: " + id);
    }

    @Override
    public Value visitIdVariable(LCTParser.IdVariableContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if (value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    @Override
    public Value visitStringVariable(LCTParser.StringVariableContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberVariable(LCTParser.NumberVariableContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanVariable(LCTParser.BooleanVariableContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitOutput(LCTParser.OutputContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    @Override
    public Value visitForStatement(LCTParser.ForStatementContext ctx) {
        String endCheck = ctx.statementBlock().getText();
        if (!endCheck.substring(endCheck.length() - 3).contains("end"))
            throw new RuntimeException("Missing end to encapsulate the loop");

        int start = Integer.parseInt(ctx.forCondition().startExpr.getText());
        int end = Integer.parseInt(ctx.forCondition().endExpr.getText());
        int i;

        for (i = start; i < end; i++) {
            this.visit(ctx.statementBlock());
        }

        return Value.VOID;
    }

    @Override
    public Value visitPlusMinusExpr(LCTParser.PlusMinusExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.PLUS:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case LCTParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitMultiDivExpr(LCTParser.MultiDivExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.MULTIPLICATION:
                return new Value(left.asDouble() * right.asDouble());
            case LCTParser.DIVISION:
                if (left.asDouble() == 0 || right.asDouble() == 0) {
                    //throw new RuntimeException("Division with 0 is illegal");
                    System.out.println("Division with 0 is illegal");
                    return left.asDouble() == 0 ? right : left;
                }
                return new Value(left.asDouble() / right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpr(LCTParser.RelationalExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.LESSTHAN:
                return new Value(left.asDouble() < right.asDouble());
            case LCTParser.LESSEQUAL:
                return new Value(left.asDouble() <= right.asDouble());
            case LCTParser.GREATERTHAN:
                return new Value(left.asDouble() > right.asDouble());
            case LCTParser.GREATEREQUAL:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualExpr(LCTParser.EqualExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.EQUAL:
                if (left.isDouble() && right.isDouble())
                    return new Value(!left.equals(right));
            case LCTParser.NOTEQUAL:
                if (left.isDouble() && right.isDouble())
                    return new Value(left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(LCTParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(LCTParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitIfStatement(LCTParser.IfStatementContext ctx) {

        String endCheck = ctx.statementBlock().getText();
        if (!endCheck.substring(endCheck.length() - 3).contains("end"))
            throw new RuntimeException("Missing end to encapsulate the if statement");

        List<LCTParser.ConditionBlockContext> conditions = ctx.conditionBlock();

        boolean evaluatedBlock = false;

        for (LCTParser.ConditionBlockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if (evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.statementBlock());
                break;
            }
        }

        if (!evaluatedBlock && ctx.statementBlock() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.statementBlock());
        }

        return Value.VOID;
    }
}