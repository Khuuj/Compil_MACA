package tableInstances;

/**
 * 
 * Classe représentant une instance de classe dans une TDS d'éléments instanciés.
 *
 */
public class Classe extends Var
{
	/**
	 * Identificateur de la classe dont elle est l'instance.
	 */
	Element classId; 
	
	/**
	 * Instancie l'instance de classe en gardant son id et sa classe.
	 * 
	 * @param id : l'identificateur de l'instance de classe.
	 * @param classId : l'identificateur de la classe.
	 */
	public Classe(Element id, int scope, Element classId) {
		super(id, scope);
		this.classId = classId;
	}

}
