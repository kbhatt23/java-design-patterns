package shoppingCart;
//each element of cart will implementthis interface
//eg bookitem, fruititem, shoeItem etc
public interface CartItem {

	//we should add a common method here
	//instead of forcing the logic in same method
	//lets move out to diffrenet class
	//decoupled
	
	double calculatePrice(ShoppingCartVisitor shoppingCartVisitor);
}
