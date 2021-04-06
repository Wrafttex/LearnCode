package LCTlang;

import java.util.HashMap;

public class LCTCustomBaseListener extends LCTBaseListener {

    HashMap<String, Integer> variableMap = new HashMap();



    @Override public void exitAssignStatement(LCTParser.AssignStatementContext ctx) {

        this.variableMap.put(ctx.Var().getText(),
                Integer.parseInt(ctx.expression().getText()));
    }


    @Override public void exitInvocationStatement(LCTParser.InvocationStatementContext ctx) {

        this.variableMap.put(ctx.name.getText(),
                Integer.parseInt(ctx.Identifier().getText()));

    }

    @Override
    public void exitShow(LCTParser.ShowContext ctx) {
        if(ctx.Int() != null){
            System.out.println(ctx.Int().getText());
        }
        if(ctx.String() != null)
        {
            System.out.println(ctx.Identifier().getText());
        }
        else if(ctx.Identifier() != null){
            System.out.println(this.variableMap.get(ctx.Identifier().getText()));
        }
    }
}