package analyseSemOper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Element;
import tableInstances.Table;
import tableInstancesVar.*;
import tableTypes.ClassType;
import tableTypesClassItems.ClassItem;
import tableTypesClassItems.Method;

public class TypeTester {

		private String type = "void";
		
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
		
		public TypeTester(String classId,Tree methodId){
			for(Entry<Integer,ArrayList<ClassType>> entry : BrowseTree.CLASS_TDS.entrySet()) {
			    Integer cle = entry.getKey();
			    ArrayList<ClassType> list = entry.getValue();
			    for(ClassType c : list){
			    	if(c.id.equals(classId))
			    	{
			    		for(ClassItem i : c.items){
			    			if(i instanceof Method && i.id.equals(methodId)){
			    				type = ((Method)i).returnType;
			    			}	
			    		}
			    	}
		    	}
			}
		}
		public String getType(){
			return type;
		}
}
