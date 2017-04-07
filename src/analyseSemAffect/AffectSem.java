package analyseSemAffect;

import org.antlr.runtime.tree.Tree;

import analyseSemOper.OperSem;
import analyseSemOper.TypeTester;


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
		
		//Teste la cohérence des types
		String type = (new TypeTester(node.getChild(0))).getType();
		Boolean concordence = OperSem.rightType(node.getChild(1), type);
		if (!concordence){
			System.err.println("Problème de concordence de type dans l'affectation, " + node.getChild(0) + " est de type "+ type);
		}
		
		
	}
}
