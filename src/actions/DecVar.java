package actions;

import org.antlr.runtime.tree.Tree;

import analyseSem.DecVarSem;
import analyseTDS.DecVarTDS;

/**
 * Classe centralisant les actions sur la TDS et les analyses sémentiques 
 * relatives à la déclaration de variable. 
 *
 */
public class DecVar {
	
	public DecVar(Tree node)
	{
		//Analyse sémantique pour la déclaration d'une variable.
		new DecVarSem(node);
		
		//Action sur la TDS pour la déclaration d'une variable.
		new DecVarTDS(node);
	}
	
	
}
