package tableTypes;

public class Attribute extends ClassItem{

	String type;
	int offset;
	
	public Attribute(String id, String type, int offset)
	{
		super(id);
		this.type = type;
		this.offset = offset;
	}
}
