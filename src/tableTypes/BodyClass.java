package tableTypes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

public class BodyClass {
	private ArrayList<ClassItem> classItems;
	
	public BodyClass(Tree node)
	{
		classItems = new ArrayList<ClassItem>();
		
		int nbChildren = node.getChildCount();
		for (int i = 0 ; i < nbChildren ; i++){
			if(node.getChild(i).getText().equals("DEC_VAR")){
				//DecVar = new DecVar();
				//classItems.add();
			}
			if(node.getChild(i).getText().equals("METHOD")){
				//Method = new Method
				//classItems.add();
			}
		}
	}
	
	public ArrayList<ClassItem> getClassItems(){
		return classItems;
	}
}