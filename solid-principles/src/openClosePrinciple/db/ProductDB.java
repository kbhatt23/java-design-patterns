package openClosePrinciple.db;

import java.util.Arrays;
import java.util.List;

public class ProductDB {

	public static List<Product> fetchAllProducts(){
		Product p1 = new Product("mango", Size.LARGE, Color.YELLOW);
		Product p2 = new Product("Apple", Size.MEDIUM, Color.RED);
		Product p3 = new Product("house", Size.EXTRALARGE, Color.WHITE);
		Product p4 = new Product("Mouse", Size.SMALL, Color.WHITE);
		Product p5 = new Product("phone", Size.SMALL, Color.BLUE);
		Product p6 = new Product("Coat", Size.LARGE, Color.RED);
		return Arrays.asList(p1,p2,p3,p4,p5,p6);
	}
}
