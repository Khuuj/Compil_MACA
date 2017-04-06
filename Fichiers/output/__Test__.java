import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
<<<<<<< HEAD
        ExprLexer lex = new ExprLexer(new ANTLRFileStream("/home/adam/workspace/Compil_MACA/FichiersTests/input.txt", "UTF8"));
=======
        ExprLexer lex = new ExprLexer(new ANTLRFileStream("/home/clement/workspace/Compil_MACA/Fichiers/output/__Test___input.txt", "UTF8"));
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ExprParser g = new ExprParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}