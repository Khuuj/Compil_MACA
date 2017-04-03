package tableInstances;

/**
 * 
 * Classe représentant une variable dans une TDS d'éléments instanciés.
 *
 */
public class Var extends Element {
	
	/**
	 * Type de la variable
	 */
	String type;
	
	/**
	 * Instancie la variable en gardant son id et son type.
	 * 
	 * @param id : l'identificateur de la variable.
	 * @param type : le type de la variable.
	 */
	public Var(String id, String type) {
		super(id);
		this.type = type;
	}

}
