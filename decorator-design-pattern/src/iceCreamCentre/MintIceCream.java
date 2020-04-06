package iceCreamCentre;

public class MintIceCream extends IceCreamDecorator{

	public MintIceCream(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public void createIceCream() {
		super.createIceCream();
		System.out.println("Creating Mint Ice Cream");
	}

	@Override
	public double cost() {
		return super.cost() + 20;
	}

}
