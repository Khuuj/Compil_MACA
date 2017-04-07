package actionsTDS;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Table;

public class ForTDS {
	public ForTDS(Tree node){
		BrowseTree.INSTANCE_TDS.add(new Table());
		for(int k=2;k<node.getChildCount();k++){
			BrowseTree.action(node.getChild(k));
		}
		BrowseTree.INSTANCE_TDS.remove(BrowseTree.INSTANCE_TDS.size()-1);
	}
}
