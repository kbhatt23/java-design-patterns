package generalJavaConcepts.serializationWithInheritance;


public class ParentWithoutSerialization{

	private int parentProperty;

	public ParentWithoutSerialization(int parentProperty) {
		this.parentProperty = parentProperty;
	}
	public ParentWithoutSerialization() {
		this.parentProperty=99;
	}

	public int getParentProperty() {
		return parentProperty;
	}

	public void setParentProperty(int parentProperty) {
		this.parentProperty = parentProperty;
	}
}
