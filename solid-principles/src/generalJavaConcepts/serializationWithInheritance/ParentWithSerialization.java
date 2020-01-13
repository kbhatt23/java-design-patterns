package generalJavaConcepts.serializationWithInheritance;

import java.io.Serializable;

public class ParentWithSerialization implements Serializable{

	private static final long serialVersionUID = 4419871634508204751L;
	private int parentProperty;

	public ParentWithSerialization(int parentProperty) {
		this.parentProperty = parentProperty;
	}

	public int getParentProperty() {
		return parentProperty;
	}

	public void setParentProperty(int parentProperty) {
		this.parentProperty = parentProperty;
	}
}
