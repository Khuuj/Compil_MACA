package actionsTDS;

import org.antlr.runtime.tree.Tree;

<<<<<<< HEAD
import main.BrowseTree;
import tableInstances.Table;

public class ForTDS {
	public ForTDS(Tree node){
		BrowseTree.INSTANCE_TDS.add(new Table());
		for(int k=3;k<node.getChildCount();k++){
			BrowseTree.action(node.getChild(k));
		}
		BrowseTree.INSTANCE_TDS.remove(BrowseTree.INSTANCE_TDS.size()-1);
=======
import analyseSem.ExprSem;

public class ForTDS {

	public ForTDS(Tree node) {
		String id = node.getChild(0).getText();
		int start = (new ExprSem(node.getChild(1).getChild(0))).evaluate();
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
	}
}
