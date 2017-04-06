package actions;

import org.antlr.runtime.tree.Tree;

import analyseSem.*;

public class Oper {
	public Oper(Tree node)
	{
		
		//On accède à l'opérande de gauche
		String opGauche = node.getChild(0).getText();
		

		//Si c'est un identificateur
		if ( (int)opGauche.charAt(0) >= 97 || (int)opGauche.charAt(0) <=122){
			//On teste s'il est déjà défini
			new ExistenceTest(node.getChild(0));
			//On teste son type
			new TypeTester(node.getChild(0));
			
		}
		
		
		//On accède à l'opérande de droite:
		String opDroit = node.getChild(1).getText();
		
		
	}
}
