package actionsTDS;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import tableInstances.Element;

public class BodyMethodTDS {
	private ArrayList<Element> elements;
	
	public BodyMethodTDS(Tree node){
		elements=new ArrayList<Element>();
		
		int n = node.getChildCount();
		for(int i=0; i<n;i++){
			
		}
		//var_decl* instr+ 
	}
	public ArrayList<Element> getElements(){
		return elements;
	}
}
