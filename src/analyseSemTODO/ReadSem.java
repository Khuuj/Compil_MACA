package analyseSemTODO;

import org.antlr.runtime.tree.Tree;

public class ReadSem {
	 public ReadSem(Tree node){
		 if(!ExprSem.rightType(node, "int"))
				System.err.println("Erreur READType ligne n°"+node.getLine()+" : on ne peut lire que des entiers ici !");
	 }
}
