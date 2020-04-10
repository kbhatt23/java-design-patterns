package shoppingCart;

public interface ShoppingCartVisitor {
//this interface represents the actual logic whihc we have moved out from amin iterable elements
	//overloading
	double visit(BookItem bookItem);
	
	double visit(FruitItem fruitItem);
	
	double visit(ShoeItem shoeItem);
}
