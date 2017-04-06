package actionsTDS;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Table;

public class BlockTDS {
	public BlockTDS(Tree node){
		BrowseTree.INSTANCE_TDS.add(new Table());
		for(int k=0;k<node.getChildCount();k++){
			BrowseTree.action(node.getChild(k));
		}
		BrowseTree.INSTANCE_TDS.remove(BrowseTree.INSTANCE_TDS.size()-1);
	}
}
