package tableInstances;


public abstract class Element {
	public String id; //identificateur de l'élément
	
	//Si l'élément est une classe
	public Element(String id)
	{
		this.id = id;
	}
}
