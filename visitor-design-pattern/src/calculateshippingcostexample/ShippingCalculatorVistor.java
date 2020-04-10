package calculateshippingcostexample;

public interface ShippingCalculatorVistor {

	double calculateShippingPrice(BookShippingItem bookShippingItem);
	
	double calculateShippingPrice(FruitShippingItem fruitShippingItem);
}
