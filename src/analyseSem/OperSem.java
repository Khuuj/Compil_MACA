package analyseSem;

import org.antlr.runtime.tree.Tree;

public class OperSem {
	
	public OperSem(Tree node){ // Le node dans le constructeur coorespond à un noeud +, - ou *
		
		
	
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
