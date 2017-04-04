package analyseSem;

import org.antlr.runtime.tree.Tree;

/**
 * 
 * Classe qui regroupe tous les tests sémantiques sur les déclaration de variables de type chaîne de caractères.
 *
 */
public class DecStringSem {

	public DecStringSem(Tree node) {
		
		//Teste si la variable existe déjà dans la TDS locale
		new DecVarExistenceId(node);
				
	}

}
