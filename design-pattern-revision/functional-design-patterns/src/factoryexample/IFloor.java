package factoryexample;

import java.util.function.Supplier;

public interface IFloor {

	public static final String CEMENT = "cement";
	public static final String MARBEL = "marbel";
	public static final String WOODEN = "wooden";

	public void moff();
	
	//lets use default methods for factory
	static IFloor create(String type) {
		IFloor floor = null;
		switch (type) {
		case WOODEN:
			floor = new WoodenFloor();
			break;
		case MARBEL:
			floor = new MarbelFloor();
			break;
		case CEMENT:
			floor = new WoodenFloor();
			break;

		default:
			throw new IllegalArgumentException("we do not support passed type "+type);
		}
		return floor;
	}
	
	//no object gets created until asked, thats great
	static Supplier<IFloor> createLazily(String type) {
		Supplier<IFloor> floorSupplier = null;
		switch (type) {
		case WOODEN:
			floorSupplier = () -> new WoodenFloor();
			break;
		case MARBEL:
			floorSupplier = () -> new MarbelFloor();
			break;
		case CEMENT:
			floorSupplier = () ->new WoodenFloor();
			break;

		default:
			throw new IllegalArgumentException("we do not support passed type "+type);
		}
		return floorSupplier;
	}
}
