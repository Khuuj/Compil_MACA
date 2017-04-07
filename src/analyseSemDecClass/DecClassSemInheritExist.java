package analyseSemDecClass;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Table;
import tableTypes.ClassType;

/**
 * Fonction semantique renvoyant une erreur si une classe mère n'est pas définie 
 * */
public class DecClassSemInheritExist {
	
	public DecClassSemInheritExist(Tree node){
		
		boolean exists = false;
		
		//L'identifiant de la variable.
		String id = node.getChild(0).getText();
		String id_inherit = node.getChild(1).getText();
		
		//Sa clé potentielle dans la TDS locale.
		int key = Table.hash(id_inherit);
		
		for(Entry<Integer,ArrayList<ClassType>> entry : BrowseTree.CLASS_TDS.entrySet()) {
		    Integer cle = entry.getKey();
		    ArrayList<ClassType> list = entry.getValue();
		    if(cle==key){
		    	for(ClassType c : list){
		    		if(c.id.equals(id_inherit)){
		    			exists = true;
		    		}
		    	}	
		    }
		}
		
		if(!exists){
			System.err.println("Erreur DecClassInheritExists ligne n°"+node.getLine()+": la classe "+id_inherit+" n'est pas définie, vous ne pouvez pas l'etendre à la classe"+ id);
		}
	}
}
