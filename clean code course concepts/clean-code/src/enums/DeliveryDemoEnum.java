package enums;

public class DeliveryDemoEnum {

	public static void main(String[] args) {
		
		DeliveryUtilEnum.deliverProduct(DeliveryStrategy.TYPE_INSURED,"prod-1" , "doon colony");
		
		DeliveryUtilEnum.deliverProduct(DeliveryStrategy.TYPE_STANDARD,"prod-11" , "fake palam");
		DeliveryUtilEnum.returnProduct(DeliveryStrategy.TYPE_STANDARD,"prod-11" , "fake palam");
	}
}
