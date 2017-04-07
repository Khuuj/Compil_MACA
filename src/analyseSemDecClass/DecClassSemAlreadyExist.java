package analyseSemDecClass;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Table;
import tableTypes.ClassType;

public class DecClassSemAlreadyExist {
	public DecClassSemAlreadyExist(Tree node) {
		boolean alreadyExists = false;
		
		//L'identifiant de la variable.
		String id = node.getChild(0).getText();
		
		//Sa clé potentielle dans la TDS locale.
		int key = Table.hash(id);
		
		for(Entry<Integer,ArrayList<ClassType>> entry : BrowseTree.CLASS_TDS.entrySet()) {
		    Integer cle = entry.getKey();
		    ArrayList<ClassType> list = entry.getValue();
		    if(cle==key){
		    	for(ClassType c : list){
		    		if(c.id.equals(id)){
		    			alreadyExists = true;
		    		}
		    	}	
		    }
		}
		
		if(alreadyExists){
			System.err.println("Erreur DecClassAlreadyExists ligne n°"+node.getLine()+" : la classe "+id+" est déjà définie !");
		}
	}
}
