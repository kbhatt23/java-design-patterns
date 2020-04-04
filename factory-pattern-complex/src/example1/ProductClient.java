package example1;

public class ProductClient {

	public static void main(String[] args) {
		//hiding actualy subclass type
		Product product  = Product.createProduct(Product.PRODUCT_TYPE_POOJA);
		product.generateProduct();
		
		product.sellProduct();
	
		 product  = Product.createProduct(Product.PRODUCT_TYPE_SPORTS);
		product.generateProduct();
		
		product.sellProduct();
		
		product  = Product.createProduct(Product.PRODUCT_TYPE_SHOE);
		product.generateProduct();
		
		product.sellProduct();
	}

}
