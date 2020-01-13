package generalJavaConcepts.serializationWithInheritance;

import java.io.Serializable;

public class ChildV2 extends ParentWithoutSerialization implements Serializable{
	private static final long serialVersionUID = 4419871634508204751L;
	
	private int childProperty;
	public ChildV2(int childProperty,int parentProperty) {
		super(parentProperty);
		this.childProperty = childProperty;
	}
	public int getChildProperty() {
		return childProperty;
	}
	public void setChildProperty(int childProperty) {
		this.childProperty = childProperty;
	}
}
