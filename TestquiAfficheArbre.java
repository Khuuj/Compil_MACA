import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.File;

public class Test {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
  
	Tree t = (Tree) parser.prog().getTree();
	System.out.println(t.toStringTree());
    }
}
