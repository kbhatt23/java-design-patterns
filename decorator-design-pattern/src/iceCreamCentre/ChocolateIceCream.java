package iceCreamCentre;

public class ChocolateIceCream extends IceCreamDecorator{

	public ChocolateIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public void createIceCream() {
		super.createIceCream();
		System.out.println("Creating Chocolate Ice Cream");
	}

	@Override
	public double cost() {
		return super.cost() + 30;
	}
}
