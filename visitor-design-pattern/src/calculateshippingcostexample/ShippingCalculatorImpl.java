package calculateshippingcostexample;

public class ShippingCalculatorImpl implements ShippingCalculatorVistor{

	@Override
	public double calculateShippingPrice(BookShippingItem bookShippingItem) {
		double total = bookShippingItem.getWeight()*bookShippingItem.getDeliveryCostPerKG();
		System.out.println("shipping price for book "+bookShippingItem.getSkuId()+ ": "+total);
		return total;
	}

	@Override
	public double calculateShippingPrice(FruitShippingItem fruitShippingItem) {
		double total = fruitShippingItem.getWeight()*fruitShippingItem.getDeliveryCostPerKG();
		System.out.println("shipping price for fruit "+fruitShippingItem.getSkuId()+ ": "+total);
		return total;
	}

}
