package analyseSem;

import org.antlr.runtime.tree.Tree;

import analyseSemTODO.ExprSem;

public class IfSemExprHomogene {
	public IfSemExprHomogene(Tree node){
		if(!ExprSem.rightType(node.getChild(0), "int") && !(ExprSem.rightType(node.getChild(0), "string")))
			System.err.println("Erreur ligne n°"+node.getLine()+" : expression non homogène dans la condition du if !");
	}
}
