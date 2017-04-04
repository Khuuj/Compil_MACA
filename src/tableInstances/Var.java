package tableInstances;

/**
 * 
 * Classe représentant une variable dans une TDS d'éléments instanciés.
 *
 */
public abstract class Var extends Element {
	
	/**
	 * Type de la variable
	 */
	Element type;
	
	/**
	 * Instancie la variable en gardant son id et son type.
	 * 
	 * @param id : l'identificateur de la variable.
	 * @param type2 : le type de la variable.
	 */
	public Var(String id, int scope) {
		super(id, scope);
		this.type = type;
	}

}
