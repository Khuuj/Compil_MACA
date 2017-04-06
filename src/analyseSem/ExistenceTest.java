package analyseSem;

import java.util.Iterator;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Element;
import tableInstances.Table;

public class ExistenceTest {

	public ExistenceTest(Tree node) {
		
		boolean exists = false;
		
		//L'identifiant de la variable.
		String id = node.getText();
		//Sa clé potentielle dans la TDS locale.
		int key = Table.hash(id);
		//Le sommet de la pile des TDS d'instances.
		int scope = BrowseTree.INSTANCE_TDS.size() -1;
		
		while (scope >= 0)
		{
			//Si aucune entrée de la TDS ne correspond à cette clé, alors la variable n'existe pas.
			if (BrowseTree.INSTANCE_TDS.get(scope).containsKey(key))
			{
				Iterator<Element> it = BrowseTree.INSTANCE_TDS.get(scope).get(key).iterator();
				
				while (it.hasNext())
					exists = exists || it.next().id.equals(id);
				
			}
			scope--;
		}
		
		
		//Affiche une erreur si la variable n'existe pas dans les TDS
		if (!exists)
			System.err.println("Erreur : la variable "+id+" n'est pas définie !\n");
	}

	
}
