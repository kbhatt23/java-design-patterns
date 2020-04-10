package calculateshippingcostexample;

import java.util.ArrayList;
import java.util.List;

public class ShippingCalculatorClient {
public static void main(String[] args) {
	List<ShippingItem> items = new ArrayList<ShippingItem>();
	
	items.add(new FruitShippingItem("mango", 10, 2));
	items.add(new FruitShippingItem("banana", 2, 1));
	items.add(new BookShippingItem("ramayan", 10, 5));
	
	double total = items.stream()
		 .map(shippingItem -> shippingItem.calculateShipping(new ShippingCalculatorImpl()))
		 .mapToDouble(e -> e)
		 .sum();
	System.out.println(total);
}
}
