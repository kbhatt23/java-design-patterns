package factoryexample;

public class WoodenFloor implements IFloor {

	public WoodenFloor() {
		System.out.println("Created WoodenFloor");
	}
	
	@Override
	public void moff() {
		System.out.println("Moffing wooden floor");
	}

}
