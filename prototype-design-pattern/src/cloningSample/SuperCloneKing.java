package cloningSample;

public class SuperCloneKing {

	private int superProperty;

	public SuperCloneKing(int superProperty) {
		super();
		this.superProperty = superProperty;
	}

	public int getSuperProperty() {
		return superProperty;
	}

	public void setSuperProperty(int superProperty) {
		this.superProperty = superProperty;
	}

	@Override
	public String toString() {
		return "SuperCloneKing [superProperty=" + superProperty + "]";
	}
}
