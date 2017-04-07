package actionsTDS;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;

public class ForTDS {
	public ForTDS(Tree node){
		for(int k=2;k<node.getChildCount();k++)
		{
			BrowseTree.action(node.getChild(k));
		}
	}
}
