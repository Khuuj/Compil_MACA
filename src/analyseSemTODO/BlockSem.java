package analyseSemTODO;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Table;

public class BlockSem {
	public BlockSem(Tree node){
		BrowseTree.browse(node);
	}
}
