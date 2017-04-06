package analyseSem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Element;
import tableInstances.Table;
import tableTypes.ClassType;

public class DecClassSem {

	public DecClassSem(Tree node) {
		boolean alreadyExists = false;
		
		//L'identifiant de la variable.
		String id = node.getText();
		
		//Sa clé potentielle dans la TDS locale.
		int key = Table.hash(id);
		
		for(Entry<Integer,ClassType> entry : BrowseTree.CLASS_TDS.entrySet()) {
		    Integer cle = entry.getKey();
		   // ClassType classType = entry.getValue();
		    if(cle==key){
		    	alreadyExists = true;
		    }
		}
		
		if(alreadyExists){
			System.err.println("Erreur : la classe "+id+" est déjà définie !");
		}
		
	}

	
}
