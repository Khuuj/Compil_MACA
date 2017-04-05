package tableInstances;


/**
 * 
 * Classe abstraite représentant un élément d'une TDS d'éléments instanciés.
 * 
 *
 */
public abstract class Element {
	
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
	public Element(String id)
	{
		this.id = id;
	}
}
