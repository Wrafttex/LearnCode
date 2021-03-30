package LCTlang;

import java.util.HashMap;
import java.util.Map;

public class LCTCustomBaseListener extends LCTBaseListener {

    HashMap<String, Integer> variableMap = new HashMap();



    @Override public void exitAssignStmt(LCTParser.AssignStmtContext ctx) {

        this.variableMap.put(ctx.ID().getText(),
                Integer.parseInt(ctx.expr().getText()));
    }


    @Override public void exitInvocationStmt(LCTParser.InvocationStmtContext ctx) {

        this.variableMap.put(ctx.name.getText(),
                Integer.parseInt(ctx.ID().getText()));

    }

    @Override
    public void exitShow(LCTParser.ShowContext ctx) {
        if(ctx.INT() != null){
            System.out.println(ctx.INT().getText());
        }
        if(ctx.STRING() != null)
        {
            System.out.println(ctx.ID().getText());
        }
        else if(ctx.ID() != null){
            System.out.println(this.variableMap.get(ctx.ID().getText()));
        }
    }
}