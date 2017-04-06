package actionsTDS;

import org.antlr.runtime.tree.Tree;

import tableInstances.Expr;

public class ForTDS {

	public ForTDS(Tree node) {
		String id = node.getChild(0).getText();
		int start = (new Expr(node.getChild(1).getChild(0))).evaluate();
	}

}
