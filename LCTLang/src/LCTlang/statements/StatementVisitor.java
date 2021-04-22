package LCTlang.statements;

import LCTlang.LCTFunctionCall;
import LCTlang.Value;
import LCTlang.LCTBaseVisitor;
import LCTlang.LCTParser;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.parser.ExprParser;
import org.matheclipse.core.expression.Symbol;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class StatementVisitor extends LCTBaseVisitor<Value>
{
    private final Map<String, Value> memory = new HashMap<String, Value>();
    private final Map<String, LCTFunctionCall> functions = new HashMap<String, LCTFunctionCall>();

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

        Value start = this.visit(ctx.forCondition().startExpr);
        Value end = this.visit(ctx.forCondition().endExpr);
        double i;

        for (i = start.asDouble() ; i < end.asDouble(); i++){
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

    @Override public Value visitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        String[] arguments = null;

        if (ctx.arguments() != null) {
            arguments = ctx.arguments().getText().split(",");
            for (String arg: arguments) {
                Value value = Value.VOID;
                memory.put(arg, value);
            }
        }

        LCTFunctionCall funcCall = new LCTFunctionCall(ctx.statementBlock(), arguments);
        functions.put(id, funcCall);
        return Value.VOID;
    }

    @Override public Value visitFunctionCall(LCTParser.FunctionCallContext ctx) {
        ArrayList<Value> values = new ArrayList<Value>();
        int i = 0;
        String id = ctx.identifier().getText();
        LCTFunctionCall funcCall = functions.get(id);


        if (funcCall.getArguments() != null) {
            for (LCTParser.ExprContext expr : ctx.arguments().expr()){
                values.add(this.visit(expr));
            }

            for (String arg: funcCall.getArguments()) {
                memory.replace(arg, values.get(i));
                i++;
            }
        }

        this.visit(funcCall.getStatements());
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

    //Solve
    //TODO checker for correct parameter
    //TODO talk about if our solve should send which letter should be solved or backend should find out by it self
   @Override public Value visitSolve(LCTParser.SolveContext ctx){
       //System.out.println(ctx.getText());

       if ((ctx.getText().contains("<missing '('>")) || (ctx.getText().contains("<missing ')'>"))) {
           throw new RuntimeException("Missing ( ) around output expression");
       }

       Value value = this.visit(ctx.expr());
       // System.out.println(value);
       String input = value.toString();
       ExprEvaluator util = new ExprEvaluator();
       IExpr Result =  util.eval("N(Solve(" +input + "))");
       System.out.println("Result - " + Result);
        return value;
   }

    @Override public Value visitLog10(LCTParser.Log10Context ctx) {

        if ((ctx.getText().contains("<missing '('>")) || (ctx.getText().contains("<missing ')'>"))) {
            throw new RuntimeException("Missing ( ) around output expression");
        }

        //System.out.println(ctx.getText());
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        System.out.println(value.isDouble());
        String checkForNumber = value.toString();

        if (!checkForNumber.matches("^\\d*(\\.\\d+)?$")){
            throw new RuntimeException("Log10 expression only number");

        }
        ExprEvaluator util = new ExprEvaluator();
        IExpr Result = util.eval("N(log10(" + value +"))");


        System.out.println(Result);


        return value; }

}