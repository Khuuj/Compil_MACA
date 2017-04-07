package analyseSemAffect;

import org.antlr.runtime.tree.Tree;


/**
 * Classe centralisant les actions sur la TDS et les analyses sémantiques 
 * relatives aux affectations. 
 *
 */
public class AffectSem {

	public AffectSem(Tree node)
	{
		//Teste si la variable affectée est bien définie
		new AffectSemExistVar(node.getChild(0));
		
		new AffectSemType(node);
	}
}
