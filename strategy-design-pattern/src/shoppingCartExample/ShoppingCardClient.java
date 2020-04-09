package shoppingCartExample;

public class ShoppingCardClient {
public static void main(String[] args) {
	
	ShoppingCart cart = new ShoppingCart();
	
	Item item1 = new Item("sku1", 10, 2);
	cart.addItem(item1);
	
	Item item2 = new Item("sku2", 10, 3);
	
	Item item3 = new Item("sku3", 10, 4);
	
	Item item4 = new Item("sku4", 10, 5);
	cart.addItem(item2);
	cart.addItem(item3);
	cart.addItem(item4);
	
	cart.pay(new PayPalPaymentStrategy("hanuman", "jaishreeram"));
}
}
