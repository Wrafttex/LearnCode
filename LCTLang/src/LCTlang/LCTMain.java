package LCTlang;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LCTMain
{
    public static void main(String[] args) {
        try {
            CharStream input = (CharStream) new ANTLRFileStream("Tests/test.LCT");
            LCTLexer lexer = new LCTLexer(input);
            LCTParser parser = new LCTParser(new CommonTokenStream(lexer));
            parser.addParseListener(new LCTCustomBaseListener());
            parser.program();
        } catch (IOException ex) {
            Logger.getLogger(LCTMain.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
