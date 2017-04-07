package analyseSemDecVar;

import org.antlr.runtime.tree.Tree;

/**
 * Classe centralisant les actions sur la TDS et les analyses sémantiques 
 * relatives à la déclaration de variable. 
 *
 */
public class DecVarSem {
	
	public DecVarSem(Tree node)
	{
		
		//Teste si la variable existe déjà dans la TDS locale
		new DecVarSemAlreadyExist(node);
		
		/*
		//le type de la variable déclarée
		String type = node.getChild(1).getText();
		
		switch (type)
		{
			//Si c'est un entier
			case "int" :
				//Analyse sémantique pour la déclaration d'un entier.
				new DecIntSem(node);
				break;
			//Si c'est une chaîne de caractères
			case "string" :
				new DecStringSem(node);
				break;
			//Si c'est une instance de classe
			default:
				new DecClassSem(node);
				break;
		}*/
		
	}
	
	
}
