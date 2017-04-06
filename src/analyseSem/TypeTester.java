package analyseSem;

import java.util.Iterator;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Element;
import tableInstances.Table;
import tableInstancesVar.*;

public class TypeTester {

		String type ;
		
		public TypeTester(Tree node){
			
			//Sa clé dans la TDS locale.
			int key = Table.hash(node.getText());
			//Le sommet de la pile des TDS d'instances qui correspond aussi à la portée de la variable.
			int scope = BrowseTree.INSTANCE_TDS.size()-1 ;
			boolean found =false;

			while (scope >= 0 && !found){
				
				if (BrowseTree.INSTANCE_TDS.get(scope).containsKey(key))
				{

					Iterator<Element> it = BrowseTree.INSTANCE_TDS.get(scope).get(key).iterator();
					
					while (it.hasNext()){
						Element el = it.next();
						if (el.id.equals(node.getText())){
							type = ((Var)el).type;
							found = true;
						}
						//System.out.println("Element : " + el.id + "\t type : " +type );
					}
						
				}
				scope --;
			}
		}
		
		public String getType(){
			return type;
		}
}
