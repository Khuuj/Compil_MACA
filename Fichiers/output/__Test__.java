import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
<<<<<<< HEAD
        ExprLexer lex = new ExprLexer(new ANTLRFileStream("/home/clement/workspace/Compil_MACA/FichiersTests/ExemplesFournis/test1.txt", "UTF8"));
=======
        ExprLexer lex = new ExprLexer(new ANTLRFileStream("/home/etudiants/farizon1u/Bureau/Workspace/Compil_MACA/Fichiers/output/__Test___input.txt", "UTF8"));
>>>>>>> dfa2957a6e8378dcedd6a283a431ff1415ed069d
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ExprParser g = new ExprParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}