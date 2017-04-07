package tableTypes;

import java.util.ArrayList;

import tableInstances.Element;
import tableTypesClassItems.ClassItem;

public class ClassType extends Element{
	
	//public String id; // identificateur de la classe
	public String supClassId; // identificateur de la classe dont elle hérite éventuellement
	public ArrayList<ClassItem> items;//attributs et méthodes de la classe
	
	public ClassType(String id)
	{
		super(id);
	}
	
	public ClassType(String id, String supClassId)
	{
		super(id);
		this.supClassId = supClassId;
	}
	
	public ClassType(String id, ArrayList<ClassItem> classItems )
	{
		super(id);
		this.items = classItems;
	}
	
	public ClassType(String id, String supClassId, ArrayList<ClassItem> items)
	{
		super(id);
		this.supClassId = supClassId;
		this.items = items;
	}
	
}
