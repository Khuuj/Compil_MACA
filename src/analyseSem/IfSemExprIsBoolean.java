package analyseSem;

import org.antlr.runtime.tree.Tree;

public class IfSemExprIsBoolean {
	public IfSemExprIsBoolean(Tree node){
		boolean bool = false;
		//AJouter si un entier : OK
		String str = node.getChild(0).getText();
		String[] symboles = {"<","<=",">",">=","==","!=","+","-","*","OPPOSE"};
		for(String s : symboles){
			if(str.equals(s)){
				bool = true;
			}
		}
		
		if(!bool){
			System.err.println("Erreur ligne n°"+node.getLine()+" : la condition de la structure if doit être un booléen !");
		}
	}
}
