package analyseSem;

import org.antlr.runtime.tree.Tree;


public class OperSemVar {
	
	public OperSemVar(Tree node){
		
		//System.out.println("Operation reconnue ");
		//On accède à l'opérande de gauche
		String operande = node.getText();
		
		//On teste s'il est déjà défini
		new ExistenceTest(node);
		//On teste son type
		String type = (new TypeTester(node)).getType();
		System.out.println("L'opérande : " + operande + " est de type " + type);
		if (!type.equals("int")){
			System.err.println("Erreur : Les opérations ne supportent pas le type " + type + "! (utilisation de la variable " + operande + ")\n");
		}
		
	}

}
