package polymorphism;

public class DeliveryDemo {

	public static void main(String[] args) {
		DeliveryStrategy insuredDelivery = DeliveryStrategy.of(DeliveryStrategy.TYPE_INSURED);
		
		DeliveryUtil.deliverProduct(insuredDelivery,"prod-1" , "doon colony");
		
		DeliveryStrategy standardDelivery = DeliveryStrategy.of(DeliveryStrategy.TYPE_STANDARD);
		
		DeliveryUtil.deliverProduct(standardDelivery,"prod-11" , "fake palam");
		DeliveryUtil.returnProduct(standardDelivery,"prod-11" , "fake palam");
	}
}
