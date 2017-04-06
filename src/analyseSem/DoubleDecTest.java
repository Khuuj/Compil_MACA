package analyseSem;

import java.util.Iterator;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Element;
import tableInstances.Table;

/**
 * 
 * Vérifie si une variable déclarée n'existe pas déjà dans la TDS locale.
 *
 */
public class DoubleDecTest 
{

	public DoubleDecTest(Tree node) 
	{
		
		boolean alreadyExists = false;
		
		//L'identifiant de la variable.
		String name = node.getChild(0).getText();
		//Sa clé potentielle dans la TDS locale.
		int key = Table.hash(name);
		//Le sommet de la pile des TDS d'instances qui correspond aussi à la portée de la variable.
		int scope = BrowseTree.INSTANCE_TDS.size() - 1;
		
		//Si aucune entrée de la TDS ne correspond à cette clé, alors la variable n'existe pas.
		if (BrowseTree.INSTANCE_TDS.get(scope).containsKey(key))
		{
			Iterator<Element> it = BrowseTree.INSTANCE_TDS.get(scope).get(key).iterator();
			
			while (it.hasNext())
				alreadyExists = alreadyExists || it.next().id.equals(name);
				
		}
		
		//Affiche une erreur si la variable existe déjà dans la TDS locale.
		if (alreadyExists)
			System.err.println("Erreur : la variable "+name+" est déjà définie !");
		
	}
	
	
}
