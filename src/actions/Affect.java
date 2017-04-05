package actions;

import org.antlr.runtime.tree.Tree;

import analyseSem.DoubleDecTest;
import analyseSem.ExistenceTest;

/**
 * Classe centralisant les actions sur la TDS et les analyses sémantiques 
 * relatives aux affectations. 
 *
 */
public class Affect {

	public Affect(Tree node)
	{
		//Teste si la variable affectée est bien définie
		new ExistenceTest(node);
	}
}
