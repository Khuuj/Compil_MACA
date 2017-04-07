package analyseSemOper;

import java.util.Iterator;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Element;
import tableInstances.Table;
import tableInstancesVar.*;

public class TypeTester {

		private String type ;
		
		public TypeTester(Tree leaf){
			
			boolean found =false;
			
			//La clé dans une TDS du noeud actuel.
			int key = Table.hash(leaf.getText());
			//Le sommet de la pile des TDS d'instances qui correspond aussi à la portée de la variable.
			int scope = BrowseTree.INSTANCE_TDS.size()-1 ;
			

			while (scope >= 0 && !found){
				
				if (BrowseTree.INSTANCE_TDS.get(scope).containsKey(key))
				{

					Iterator<Element> it = BrowseTree.INSTANCE_TDS.get(scope).get(key).iterator();
					
					while (it.hasNext()){
						Element el = it.next();
						if (el.id.equals(leaf.getText()))
						{
							type = ((Var)el).type;
							found = true;
						}
					}
						
				}
				scope --;
			}
		}
		
		public String getType(){
			return type;
		}
}
