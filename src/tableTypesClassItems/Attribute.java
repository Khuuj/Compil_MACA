package tableTypesClassItems;

public class Attribute extends ClassItem{

	String type;
	int offset;
	
	public Attribute(String id, String type)
	{
		super(id);
		this.type = type;
	}
}
