package actionsTDS;

import org.antlr.runtime.tree.Tree;

import analyseSemDecVar.DecVarSem;
import tableTypesClassItems.Attribute;

public class AttributeTDS {
	private Attribute attribute;
	
	public AttributeTDS(Tree node){
		String id = node.getChild(0).getText();
		String type = node.getChild(1).getText();
		attribute = new Attribute(id,type);
		
		new DecVarSem(node);
		new DecVarTDS(node);
	}
	public Attribute getAttribute(){
		return attribute;
	}
}
