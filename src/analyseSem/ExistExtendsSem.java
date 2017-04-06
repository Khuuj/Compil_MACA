package analyseSem;

import java.util.Map.Entry;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Table;
import tableTypes.ClassType;

/**
 * Fonction semantique renvoyant une erreur si une classe mère n'est pas définie 
 * */
public class ExistExtendsSem {
	public ExistExtendsSem(Tree node){
		boolean doNotExists = false;
		
		//L'identifiant de la variable.
		String id = node.getText();
		System.out.println("aaa:"+id);
		//Sa clé potentielle dans la TDS locale.
		int key = Table.hash(id);
		
		for(Entry<Integer,ClassType> entry : BrowseTree.CLASS_TDS.entrySet()) {
		    Integer cle = entry.getKey();
		   // ClassType classType = entry.getValue();
		    if(cle==key){
		    	doNotExists = true;
		    }
		}
		
		if(doNotExists){
			System.err.println("Erreur : la classe "+id+" n'est pas définie, vous ne pouvez pas l'etendre à une autre classe");
		}
	}
}
