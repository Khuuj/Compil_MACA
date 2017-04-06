package analyseSem;

import org.antlr.runtime.tree.Tree;


public class OperSem {
	
	public OperSem(Tree node){
		
		//System.out.println("Operation reconnue ");
		//On accède à l'opérande de gauche
		String operande = node.getText();
		
		//Si c'est un identificateur
		if ( (int)operande.charAt(0) >= 97 || (int)operande.charAt(0) <=122){
			//On teste s'il est déjà défini
			new ExistenceTest(node);
			//On teste son type
			String type = (new TypeTester(node)).getType();
			if (!type.equals("int")){
				System.err.println("Erreur : Les opérations ne supportent pas le type " + type + "! (utilisation de la variable " + operande + ")\n");
			}
		} else if  ((int)operande.charAt(0) >= 97 || (int)operande.charAt(0) <=122) {
			// TO DO : l'opérande peut être un appel  de fonction
				
		} else if (!operande.matches("[-+]?\\d*\\.?\\d+")) {
			//Gérer par la grammaire
			System.err.println("Erreur : L'opérande " + operande + " n'est pas supportée par les opérations. \n");
		}
				
		
	}

}
