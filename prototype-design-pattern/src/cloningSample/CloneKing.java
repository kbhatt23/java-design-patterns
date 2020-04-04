package cloningSample;

public class CloneKing extends SuperCloneKing implements Cloneable{

	@Override
	public CloneKing clone() throws CloneNotSupportedException {
		return (CloneKing)super.clone();
	}
	private int integerProperty;
	
	public CloneKing(int superProperty , int integerProperty, ChildComposition child, String stringProperty, Integer intObjProperty) {
		super(superProperty);
		this.integerProperty = integerProperty;
		this.child = child;
		this.stringProperty = stringProperty;
		this.intObjProperty = intObjProperty;
	}
	private ChildComposition child;
	
	private String stringProperty;
	
	private Integer intObjProperty;

	@Override
	public String toString() {
		return "CloneKing [integerProperty=" + integerProperty + ", child=" + child + ", stringProperty="
				+ stringProperty + ", intObjProperty=" + intObjProperty + "]"
				+ ", superintproperty=" + getSuperProperty() + "]"
				;
	}

	public int getIntegerProperty() {
		return integerProperty;
	}

	public void setIntegerProperty(int integerProperty) {
		this.integerProperty = integerProperty;
	}

	public ChildComposition getChild() {
		return child;
	}

	public void setChild(ChildComposition child) {
		this.child = child;
	}

	public String getStringProperty() {
		return stringProperty;
	}

	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}

	public Integer getIntObjProperty() {
		return intObjProperty;
	}

	public void setIntObjProperty(Integer intObjProperty) {
		this.intObjProperty = intObjProperty;
	}
	
}
