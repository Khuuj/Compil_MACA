package actionsTDS;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import tableInstances.Element;

public class ParamsTDS {
	private ArrayList<Element> elements;
	
	public ParamsTDS(Tree node, int scope){
		elements=new ArrayList<Element>();
		
		int nbChildren = node.getChildCount();
		
		// on ajoute les composants de la classe
		for (int i = 0 ; i < nbChildren ; i++){
			ParamTDS param = new ParamTDS(node.getChild(i),scope);
			elements.add(param.getVar());

			new DecVarTDS(node.getChild(i));
		}
		
		
	}
	public ArrayList<Element> getElements(){
		return elements;
	}
}
