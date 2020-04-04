package cacheCar;

public class Car extends Vehicle{

	public Car(String id ,double price, Accessory accessory) {
		super(id, "Car", price, accessory);
	}

	@Override
	public void printPrice() {
		System.out.println("car price value is "+this.getPrice());
	}

}
