package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingcartVisitorClient {
public static void main(String[] args) {
	List<CartItem> cartItems = new ArrayList<CartItem>();
	
	cartItems.add(new BookItem("learn C", 10, 2));
	//discount
	cartItems.add(new BookItem("learn java", 20,3));
	
	cartItems.add(new ShoeItem("shoe", 100, 1));
	
	cartItems.add(new FruitItem("mango", 5, 20));
	
	double total = cartItems.stream()
			 .map(cartItem -> cartItem.calculatePrice(new ShoppingCartVisitorImpl()))
			 .mapToDouble(e -> e)
			 .sum();
	System.out.println(total);
}
}
