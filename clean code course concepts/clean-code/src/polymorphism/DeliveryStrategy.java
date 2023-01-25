package polymorphism;

public interface DeliveryStrategy {
	// old way of hardcoding
	// use compile time constant
	public static final String TYPE_STANDARD = "typeStandard";
	public static final String TYPE_EXPRESS = "typeExpress";
	public static final String TYPE_INSURED = "typeInsured";

	public void deliverProduct(String productId, String address);

	public void returnProduct(String productId, String address);

	static DeliveryStrategy of(String type) {
		DeliveryStrategy deliveryStrategy = null;
		switch (type) {
		case TYPE_STANDARD:
			deliveryStrategy = new StandardDelivery();
			break;
		case TYPE_EXPRESS:
			deliveryStrategy = new ExpressDelivery();
			break;
		case TYPE_INSURED:
			deliveryStrategy = new InsuredDelivery();
			break;
		default:
			throw new IllegalArgumentException("unkown delivery type passed:" + type);
		}

		return deliveryStrategy;
	}
}
