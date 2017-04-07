package actionsTDS;

import org.antlr.runtime.tree.Tree;

import analyseSemDecVar.DecVarSem;
import main.BrowseTree;
import tableTypesClassItems.Attribute;

public class AttributeTDS {
	private Attribute attribute;
	
	public AttributeTDS(Tree node){
		String id = node.getChild(0).getText();
		String type = node.getChild(1).getText();
		int offset = BrowseTree.CLASS_TDS.size()-1;// ????????
		attribute = new Attribute(id,type);
		
		new DecVarSem(node);
		new DecVarTDS(node);
	}
	public Attribute getAttribute(){
		return attribute;
	}
}
