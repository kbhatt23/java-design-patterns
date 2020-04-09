package shoppingCartExample;
//generally it is session scoped component

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	
	public ShoppingCart() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
	//in state it takes form instance variable
	//sample example Collections.sort method uses comparator
	public void pay(PaymentStrategy paymentStrategy) {
		
		double totalPrice =items.stream()
			 .map(itemEntry -> itemEntry.getQuantity()*itemEntry.getUnitPrice())
			 .mapToDouble(e -> e)
			 .sum();
		paymentStrategy.pay(totalPrice);
	}
}
