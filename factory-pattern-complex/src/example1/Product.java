package example1;

public interface Product {
	String PRODUCT_TYPE_SHOE = "shoe";
	String PRODUCT_TYPE_POOJA = "pooja";
	String PRODUCT_TYPE_SPORTS = "sports";
	void generateProduct();
	
	void sellProduct();
	
	static Product createProduct(String type) {
		Product product = null;
		switch (type) {
		case PRODUCT_TYPE_SHOE:
			product = new ShoesProduct();
			break;
		case PRODUCT_TYPE_POOJA:
			product = new PoojaSamagriProduct();
			break;
		case PRODUCT_TYPE_SPORTS:
			product = new SportsProduct();
			break;	
		default:
			throw new RuntimeException("Product Ype not Supoorted");
		}
		return product;
	}
}
