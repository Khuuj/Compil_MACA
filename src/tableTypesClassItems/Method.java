package tableTypesClassItems;

import java.util.ArrayList;

import tableInstances.Element;

//Méthode d'une classe
public class Method extends ClassItem {
	public String returnType;
	public ArrayList<Element> paramsTypes;
	public int paramsNb;
	ArrayList<Element> methodBody;
	
	public Method(String id,ArrayList<Element> methodBody) {
		super(id);
		this.paramsNb = 0;
		this.returnType = "void";
		this.methodBody = methodBody;
	}
	
	public Method(String id, String returnType,ArrayList<Element> methodBody) {
		super(id);
		this.paramsNb = 0;
		this.returnType = returnType;
		this.methodBody = methodBody;
	}
	
	public Method(String id, ArrayList<Element> paramsTypes,ArrayList<Element> methodBody) {
		super(id);
		this.paramsTypes = paramsTypes;
		this.returnType = "void";
		this.methodBody = methodBody;
	}
	
	public Method(String id, ArrayList<Element> paramsTypes, String returnType,ArrayList<Element> methodBody) {
		super(id);
		this.paramsTypes = paramsTypes;
		this.paramsNb = paramsTypes.size();
		this.returnType = returnType;
		this.methodBody = methodBody;
	}

}
