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
	
	public BodyMethodTDS(Tree node){
		
		int n = node.getChildCount();
		for(int i=0; i<n;i++){
			BrowseTree.action(node.getChild(i));	
		}
	}
}
