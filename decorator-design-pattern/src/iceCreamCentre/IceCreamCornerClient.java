package iceCreamCentre;

public class IceCreamCornerClient {

	public static void main(String[] args) {
		//wrapping on top of base ice cream
		IceCream iceCreamCustom1 = new MintIceCream(new BaseIceCream());
		iceCreamCustom1.createIceCream();
		double custom1Cost=iceCreamCustom1.cost();
		System.out.println("Cost of custom1Cost "+custom1Cost);
		System.out.println("-=========================");
		
		IceCream iceCreamCustom2 = new MintIceCream(new ChocolateIceCream(new BaseIceCream()));
		iceCreamCustom2.createIceCream();
		double custom2Cost=iceCreamCustom2.cost();
		System.out.println("Cost of custom2Cost "+custom2Cost);
	}

}
