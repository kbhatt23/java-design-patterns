package iceCreamCentre;

public class OldSchoolIceCream implements IceCream{

	@Override
	public void createIceCream() {
		System.out.println("Creating Old School Ice Cream");
	}
	//it is costiler than base ice cream
	@Override
	public double cost() {
		return 15;
	}

}
