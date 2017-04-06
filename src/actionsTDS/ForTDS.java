package actionsTDS;

import org.antlr.runtime.tree.Tree;

import analyseSem.ExprSem;

public class ForTDS {

	public ForTDS(Tree node) {
		String id = node.getChild(0).getText();
		int start = (new ExprSem(node.getChild(1).getChild(0))).evaluate();
	}

}
