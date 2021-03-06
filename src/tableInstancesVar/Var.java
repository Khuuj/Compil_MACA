package tableInstancesVar;

import org.antlr.runtime.tree.Tree;

import tableInstances.Element;

/**
 * 
 * Classe représentant une variable dans une TDS d'éléments instanciés.
 *
 */
public abstract class Var extends Element {
	
	/**
	 * Type de la variable.
	 */
	public String type;
	
	/**
	 * Initialisation de la variable (ou non)
	 */
	
	public Boolean init;
	
	/**
	 * Décalage de la variable.
	 */
	int offset;
	
	/**
	 * Instancie la variable en gardant son id et son type.
	 * 
	 * @param id : l'identificateur de la variable.
	 * @param type2 : le type de la variable.
	 */
	public Var(String id) {
		super(id);
	}


}
