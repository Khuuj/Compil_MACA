package analyseSem;

import org.antlr.runtime.tree.Tree;

public class OperSem {
	
	public OperSem(Tree node){ // Le node dans le constructeur coorespond à un noeud +, - ou *
		
		
		/*
		int nbChild = node.getChildCount();
		
		for (int i = 0 ; i < nbChild ; i++) { // On regarde pour ses deux fils
			
			// Attention mot clé this, super 
			// si la première lettre est une minuscule (variable)
			if ((int)node.getChild(i).getText().charAt(0) >= 97 && ((int)node.getChild(i).getText().charAt(0)) <= 122) {
				new OperSemVar(node.getChild(i));
			} 
			// si la première lettre est une majuscule (Classe)
			else if ((int)(node.getChild(i).getText().charAt(0)) >= 65 && (int)(node.getChild(i).getText().charAt(0)) <=122) {
				new OperSemClasse(node.getChild(i));
			} 
			// si le fils est un autre signe opératoire
			// PEUT ETRE A VIRER EN FONCTION DE CE QUE FAIT ADAM
			else if (node.getChild(i).getText().equals("[+-\\*]")){
				new OperSem(node.getChild(i));
			} 
			// Si l'opérande n'est pas un int
			else if (!node.getChild(i).getText().matches("[-+]?\\d+") ) {
				//Géré par la grammaire
				System.err.println("Erreur : L'opérande " + node.getChild(i).getText() + " n'est pas supportée par les opérations. \n");
			}	
		}
		*/
		
		
		
		//type à égaler (membre gauche de l'affect ou paramètre d'une fonction)
		
		
		
		
	}
	
	public static boolean rightType(Tree node, String type)
	{
		int nbChild = node.getChildCount();
		boolean rightType = true;
		//C'est une feuille
		if (nbChild == 0)
		{
			//Tester si c'est une parenthèse 
			if (node.getText().matches("[()]")){
				return true;
			}
			
			//terminal string
			if (node.getText().matches("\"*"))
				return type.equals("string");
			
			//terminal entier
			if (node.getText().matches("[-+]?\\d+")) {
				return type.equals("int");
			}
			
			//variable
			if ((int)(node.getText().charAt(0)) >= 97 && ((int)node.getText().charAt(0)) <= 122)
				return ((new TypeTester(node)).getType()).equals(type);
			//sinon
			else return false;
						

		}
		//Sinon rappeller la méthode récursivement
		else
		{
			for ( int i=0 ; i< nbChild; i++)
			{
				rightType = rightType && rightType(node.getChild(i), type);
			}
			return rightType;
		}
			
	}

}
