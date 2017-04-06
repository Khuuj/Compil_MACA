package actionsTDS;

import org.antlr.runtime.tree.Tree;

import analyseSem.*;

public class AffectTDS {
	public AffectTDS(Tree node){
		if (node.getChild(1).getText().equals("[+-\\*]")){
			new OperSem(node.getChild(1));
		}
	}

}
