package actions;

import org.antlr.runtime.tree.Tree;

import analyseSem.DecIntSem;
import analyseTDS.DecVarTDS;

/**
 * Classe centralisant les actions sur la TDS et les analyses sémantiques 
 * relatives à la déclaration de variable. 
 *
 */
public class DecVar {
	
	public DecVar(Tree node)
	{
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
				break;
			//Si c'est une instance de classe
			default:
				break;
		}
		
		//Action sur la TDS pour la déclaration d'une variable.
		new DecVarTDS(node);
	}
	
	
}
