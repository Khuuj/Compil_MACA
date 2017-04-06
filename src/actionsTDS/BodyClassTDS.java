package actionsTDS;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import tableTypesClassItems.ClassItem;

/**
 * Cette classe continue la tds en appelant les attributs et methodes constituants la classe
 * Ainsi elle permet à la classe DecClass de récupérer son "corps"
 * */

public class BodyClassTDS {
	
	private ArrayList<ClassItem> classItems;
	
	public BodyClassTDS(Tree node)
	{
		classItems = new ArrayList<ClassItem>();
		
		int nbChildren = node.getChildCount();
		
		// on ajoute les composants de la classe
		for (int i = 0 ; i < nbChildren ; i++){
			
			// si c'est un attribut
			if(node.getChild(i).getText().equals("DEC_VAR")){
				
				// on ajoute l'attribut à la liste d'items
				AttributeTDS attribute = new AttributeTDS(node.getChild(i));
				classItems.add(attribute.getAttribute());
			}
			
			// si c'est une méthode
			if(node.getChild(i).getText().equals("METHOD")){

				// on ajoute la méthode à la liste d'items
				MethodTDS method = new MethodTDS(node.getChild(i));
				classItems.add(method.getMethod());
			}
		}		
	}
	
	public ArrayList<ClassItem> getClassItems(){
		return classItems;
	}
}