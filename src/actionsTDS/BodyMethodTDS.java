package actionsTDS;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Element;
import tableInstancesVar.CClass;
import tableInstancesVar.Int;
import tableInstancesVar.SString;
import tableInstancesVar.Var;

public class BodyMethodTDS {
	private ArrayList<Element> elements;
	
	public BodyMethodTDS(Tree node){
		
		elements=new ArrayList<Element>();
		
		int n = node.getChildCount();
		for(int i=0; i<n;i++){
			BrowseTree.action(node.getChild(i));	
		}
	}
	public ArrayList<Element> getElements(){
		return elements;
	}
}
