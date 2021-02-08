package factoryexample;

public class CementFloor implements IFloor {
	public CementFloor() {
		System.out.println("Created CementFloor");
	}
	@Override
	public void moff() {
		System.out.println("Moffing cement floor");
	}

}
