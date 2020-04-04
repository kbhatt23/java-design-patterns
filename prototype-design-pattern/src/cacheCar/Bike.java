package cacheCar;

public class Bike extends Vehicle{

	public Bike(String id, double price, Accessory accessory) {
		super(id, "bike", price, accessory);
	}

	@Override
	public void printPrice() {
		System.out.println("Bike price value is "+this.getPrice());
	}

}
