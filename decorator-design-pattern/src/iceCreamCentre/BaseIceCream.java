package iceCreamCentre;

public class BaseIceCream implements IceCream {

	@Override
	public void createIceCream() {
		System.out.println("Creating Base Ice Cream");
	}
//base cost of ice cream cup is 10 Rupees
	@Override
	public double cost() {
		return 10;
	}

}
