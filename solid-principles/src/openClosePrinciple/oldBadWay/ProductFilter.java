package openClosePrinciple.oldBadWay;

import java.util.List;
import java.util.stream.Collectors;

import openClosePrinciple.db.Color;
import openClosePrinciple.db.Product;
import openClosePrinciple.db.Size;

//bad approach as per open-closed principle
public class ProductFilter {
	//this way for each criteria we will keep on adding filter function
	public List<Product> filterByColor(Color color, List<Product> products){
		return products.stream()
					.filter(product -> product.getColor() == color)
					.collect(Collectors.toList());
		
	}
	
	public List<Product> filterBySize(Size size, List<Product> products){
		return products.stream()
					.filter(product -> product.getSize() == size)
					.collect(Collectors.toList());
		
	}

}
