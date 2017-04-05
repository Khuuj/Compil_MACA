package actionsTDS;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableTypesClassItems.Attribute;
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
				
				String id = node.getChild(0).getText();
				String type = node.getChild(1).getText();
				int offset = BrowseTree.CLASS_TDS.size()-1;// ????????
				
				Attribute attribute = new Attribute(id,type,offset);
				classItems.add(attribute);
			}
			
			// si c'est une méthode
			if(node.getChild(i).getText().equals("METHOD")){
				// on va appeler la tds de method
				//Method method = new Method();
				//classItems.add(method);
			}
		}
		
	}
	
	public ArrayList<ClassItem> getClassItems(){
		return classItems;
	}
}