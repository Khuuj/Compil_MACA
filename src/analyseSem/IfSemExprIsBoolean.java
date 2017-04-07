package analyseSem;

import org.antlr.runtime.tree.Tree;

public class IfSemExprIsBoolean {
	public IfSemExprIsBoolean(Tree node){
		boolean bool = false;
		
		String str = node.getChild(0).getText();
		String[] symboles = {"<","<=",">",">=","==","!=","+","-","*","OPPOSE"};
		for(String s : symboles){
			if(str.equals(s)){
				bool = true;
			}
		}
		
		if(!bool){
			System.err.println("Erreur : la condition de la structure if doit être un booléen !");
		}
	}
}
