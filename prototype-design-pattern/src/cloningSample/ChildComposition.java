package cloningSample;

public class ChildComposition {

	private int childAge;

	public ChildComposition(int childAge) {
		super();
		this.childAge = childAge;
	}

	@Override
	public String toString() {
		return "ChildComposition [childAge=" + childAge + "]";
	}

	public int getChildAge() {
		return childAge;
	}

	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}
}
