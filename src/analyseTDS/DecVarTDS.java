package analyseTDS;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Int;

public class DecVarTDS {
	
	public DecVarTDS(Tree node)
	{
		String id = node.getChild(0).getText();
		int scope = BrowseTree.INSTANCE_TDS.size()-1;
		
		BrowseTree.INSTANCE_TDS.get(scope).addElement(new Int(id,scope));
	}
}