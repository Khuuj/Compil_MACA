package analyseSem;

import org.antlr.runtime.tree.Tree;

public class IfSem {
	public IfSem(Tree node){
		new IfSemExprIsBoolean(node);
		new IfSemExprHomogene(node);
	}
}
