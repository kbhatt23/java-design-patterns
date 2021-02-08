package factoryexample;

public class MarbelFloor implements IFloor {
	public MarbelFloor() {
		System.out.println("Created MarbelFloor");
	}
	
	@Override
	public void moff() {
		System.out.println("Moffing marben floor");
	}

}
