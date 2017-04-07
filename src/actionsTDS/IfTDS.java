package actionsTDS;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Table;

public class IfTDS {
	public IfTDS(Tree node){
		BrowseTree.INSTANCE_TDS.add(new Table());
		for(int k=1;k<node.getChildCount();k++){
			BrowseTree.action(node.getChild(k));
		}
		BrowseTree.INSTANCE_TDS.remove(BrowseTree.INSTANCE_TDS.size()-1);
	}
}
