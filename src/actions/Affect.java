package actions;

import org.antlr.runtime.tree.Tree;

import analyseSem.*;

/**
 * Classe centralisant les actions sur la TDS et les analyses sémantiques 
 * relatives aux affectations. 
 *
 */
public class Affect {

	public Affect(Tree node)
	{
		System.out.println("YOOOOOOOOOOOOOo");
		//Teste si la variable affectée est bien définie
		//new TypeTester(node.getChild(0));
		new ExistenceTest(node.getChild(0));
	}
}
