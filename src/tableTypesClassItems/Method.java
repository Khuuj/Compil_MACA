package tableTypesClassItems;

import java.util.ArrayList;

import tableInstances.Element;

//Méthode d'une classe
public class Method extends ClassItem {
	public String returnType;
	public ArrayList<Element> paramsTypes;
	public int paramsNb;
	
	public Method(String id) {
		super(id);
		this.paramsNb = 0;
		this.returnType = "void";
	}
	
	public Method(String id, String returnType) {
		super(id);
		this.paramsNb = 0;
		this.returnType = returnType;
	}
	
	public Method(String id, ArrayList<Element> paramsTypes) {
		super(id);
		this.paramsTypes = paramsTypes;
		this.paramsNb = paramsTypes.size();
		this.returnType = "void";
	}
	
	public Method(String id, ArrayList<Element> paramsTypes, String returnType) {
		super(id);
		this.paramsTypes = paramsTypes;
		this.paramsNb = paramsTypes.size();
		this.returnType = returnType;;
	}

}
