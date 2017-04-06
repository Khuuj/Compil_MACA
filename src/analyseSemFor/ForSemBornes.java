package analyseSemFor;

import org.antlr.runtime.tree.Tree;

public class ForSemBornes {
	public ForSemBornes(Tree node){
		new ForSemIncIsInt(node.getChild(0));
		new ForSemIncIsInt(node.getChild(1));
	}
}
