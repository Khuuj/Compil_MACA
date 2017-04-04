package tableInstances;


/**
 * 
 * Classe abstraite représentant un élément d'une TDS d'éléments instanciés.
 * 
 *
 */
public abstract class Element {
	
	/**
	 * Portée de l'élément
	 */
	public int scope;
	
	/**
	 * Identificateur de l'élément.
	 */
	public String id;
	
	/**
	 * Instancie l'élément à stocker en gardant son id.
	 * 
	 * @param id : identificateur de l'élément à stocker.
	 * @param scope : portée de l'élément à stocker.
	 */
	public Element(String id, int scope)
	{
		this.id = id;
		this.scope = scope;
	}
}
