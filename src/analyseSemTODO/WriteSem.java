package analyseSemTODO;

import org.antlr.runtime.tree.Tree;

public class WriteSem {
	public WriteSem(Tree node){
		if(!ExprSem.rightType(node, "int") && !(ExprSem.rightType(node, "string")))
			System.err.println("Erreur WRITEType ligne n°"+node.getLine()+" : on ne peut afficher que des entiers ou des string !");
	}
}
