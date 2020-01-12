package generalJavaConcepts;

public class FinalClassChild extends SuperClassWithFinal{
	private int property1;
	public int getProperty1() {
		return property1;
	}

	public void setProperty1(int property1) {
		this.property1 = property1;
	}

	public static void main(String[] args) {
		FinalClassChild child = new FinalClassChild();
		child.nakleeTest();
		child.nakleeTestFinal();
	}
	
	@Override
	public void nakleeTest() {
		// TODO Auto-generated method stub
		super.nakleeTest();
	}
	
	//can not overide final methods but will inherit it
	
	/*
	 * @Override public void nakleeTestFinal() { // TODO Auto-generated method stub
	 * super.nakleeTestFinal(); }
	 */

}
