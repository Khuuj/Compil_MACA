package tableTypes;

import java.util.ArrayList;

//Méthode d'une classe
public class Method extends ClassItem {

	ArrayList<String> paramsTypes;
	int paramsNb;
	String returnType;
	
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
	
	public Method(String id, ArrayList<String> paramsTypes) {
		super(id);
		this.paramsTypes = paramsTypes;
		this.returnType = "void";
	}
	
	public Method(String id, ArrayList<String> paramsTypes, String returnType) {
		super(id);
		this.paramsTypes = paramsTypes;
		this.paramsNb = paramsTypes.size();
		this.returnType = returnType;
	}

}
