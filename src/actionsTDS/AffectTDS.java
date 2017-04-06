package actionsTDS;

import java.util.Iterator;

import org.antlr.runtime.tree.Tree;

import analyseSem.OperSem;
import main.BrowseTree;
import tableInstances.Element;
import tableInstances.Table;
import tableInstancesVar.Var;

public class AffectTDS {
	
	public AffectTDS(Tree node){
		
		String name = node.getChild(0).getText();
		
		int key=Table.hash(name);
	
		boolean in = true;
		Element element;
		//Le sommet de la pile des TDS d'instances qui correspond aussi à la portée de la variable.
				int scope = BrowseTree.INSTANCE_TDS.size() - 1;
				
				//Si aucune entrée de la TDS ne correspond à cette clé, alors la variable n'existe pas.
				if (BrowseTree.INSTANCE_TDS.get(scope).containsKey(key))
				{
					Iterator<Element> it = BrowseTree.INSTANCE_TDS.get(scope).get(key).iterator();
					
					while (it.hasNext() && in){
						
						element=it.next();
						
						if (element.id.equals(name)){
							((Var)element).init= true;
							in = false;
						}
					}
						
				}
		
		switch (node.getChild(1).getText())
		{
			case "+" : case "-" : case "*" :
				new OperSem(node.getChild(1).getChild(0));
				new OperSem(node.getChild(1).getChild(1));
				break;
		}
		
	}
}
