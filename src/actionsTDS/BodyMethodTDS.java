package actionsTDS;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import tableInstances.Element;

public class BodyMethodTDS {
	private ArrayList<Element> elements;
	
	public BodyMethodTDS(Tree node){
		elements=new ArrayList<Element>();
		
	}
	public ArrayList<Element> getElements(){
		return elements;
	}
}
