package actionsTDS;

import org.antlr.runtime.tree.Tree;

import tableInstances.Element;
import tableInstancesVar.Var;

public class ParamTDS {
private Var var;
	
	public ParamTDS(Tree node){
		
		String id = node.getChild(0).getText();
		String type = node.getChild(1).getText();
		Var var;
		
		
	}
	
	public Element getVar(){
		return var;
	}
}
