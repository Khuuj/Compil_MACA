package analyseSemTODO;

import org.antlr.runtime.tree.Tree;

public class DoSem {
	public DoSem(Tree node){
		Tree expr = node.getChild(0);
		if (node.getChildCount() == 0 || node.getChild(0).getText().equals("APPELMETHODE")  )
		{
			System.err.println("Erreur DOAppelMethode ligne n°"+node.getLine()+" : on ne peut lire que des entiers ici !");
		}
	}
}
