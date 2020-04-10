package shoppingCart;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

	@Override
	public double visit(BookItem bookItem) {
		double total = bookItem.getPrice()*bookItem.getQuantity();
		//discount special for books
		//specialized logic for each different element of list
		if(bookItem.getSkuId().contains("java")) {
			total = total-5;
		}
		System.out.println("total price for book "+bookItem.getSkuId()+ ": "+total);
		return total;
	}

	@Override
	public double visit(FruitItem fruitItem) {
		//fruits do not have complex logic
		//however each of the individual iteration element can have different instance variable
		double total=fruitItem.getPricePerKg()*fruitItem.getWeight();
		System.out.println("total price for fruit "+fruitItem.getSkuId()+ ": "+total);
		return total;
	}

	@Override
	public double visit(ShoeItem shoeItem) {
		double total =shoeItem.getPrice()*shoeItem.getQuantity();
		System.out.println("total price for shoe "+shoeItem.getSkuId()+ ": "+total);
		return  total;
	}

}
