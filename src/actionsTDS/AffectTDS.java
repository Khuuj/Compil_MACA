package actionsTDS;

import org.antlr.runtime.tree.Tree;

import analyseSem.OperSem;

public class AffectTDS {
	public AffectTDS(Tree node){
		switch (node.getChild(1).getText())
		{
			case "+" : case "-" : case "*" :
				new OperSem(node.getChild(1).getChild(0));
				new OperSem(node.getChild(1).getChild(1));
				break;
		}
		
	}
}
