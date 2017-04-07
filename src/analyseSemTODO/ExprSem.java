package analyseSemTODO;

import org.antlr.runtime.tree.Tree;

public class OperSem {
	
	public OperSem(Tree node){ // Le node dans le constructeur coorespond à un noeud +, - ou *
		
		
	
	}
	
	public static boolean rightType(Tree node, String type)
	{
		int childrenNb = node.getChildCount();
		boolean rightType = true;
		//C'est une feuille
		if (childrenNb == 0)
		{
			//Tester si c'est une parenthèse 
			if (node.getText().matches("[(]"))
			{
				//Si on a deux parenthèses d'affilées.
				if (node.getParent().getChild(node.getChildIndex()+1).getText().matches("[)]"))
				{
					return false;
				}
				return true;
			}
			
			//terminal string
			if (node.getText().matches("\".*"))
				return type.equals("string");
			
			//terminal entier
			if (node.getText().matches("\\d+")) 
				return type.equals("int");
			
			//OPPOSE (moins unaire)
			if (node.getText().equals("OPPOSE"))
				return rightType(node.getChild(0),type);
			
			//variable
			if ((int)(node.getText().charAt(0)) >= 97 && ((int)node.getText().charAt(0)) <= 122)
				return ((new TypeTester(node)).getType()).equals(type);
			
			//sinon (ce cas ne devrait jamais arriver si les règles syntaxiques sont bien écrites)
			else return false;
						

		}
		//Sinon rappeller la méthode récursivement sur les enfants du noeud
		else
		{
			for ( int i=0 ; i< childrenNb; i++)
			{
				rightType = rightType && rightType(node.getChild(i),type);
			}
			return rightType;
		}
			
	}

}
