package generalJavaConcepts.serializationWithInheritance;

public class ChildV1 extends ParentWithSerialization{
	private static final long serialVersionUID = 4419871634508204751L;
	
	private int childProperty;
	public ChildV1(int childProperty,int parentProperty) {
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
