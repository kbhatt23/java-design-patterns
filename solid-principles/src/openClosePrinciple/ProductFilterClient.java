package openClosePrinciple;

import java.util.List;
import java.util.function.Predicate;

import openClosePrinciple.db.Color;
import openClosePrinciple.db.Product;
import openClosePrinciple.db.ProductDB;
import openClosePrinciple.db.Size;
import openClosePrinciple.lambdaWay.ProductFilterLambda;
import openClosePrinciple.oldBadWay.ProductFilter;
import openClosePrinciple.specifiationStyle.ColorSpecification;
import openClosePrinciple.specifiationStyle.FilterUsingSpecification;
import openClosePrinciple.specifiationStyle.ProductFilterSpecification;

public class ProductFilterClient {

	public static void main(String[] args) {
		List<Product> products = ProductDB.fetchAllProducts();
		ProductFilter productFilterAll = new ProductFilter();
		System.out.println("Old way of filtering");
		productFilterAll.filterByColor(Color.RED, products)
			.stream()
			.forEach(p -> System.out.println(p.getName() + " is red"));
		
		System.out.println("Old way completed");
		
		System.out.println("lamda way started ");
		
		ProductFilterLambda filterLambda = new ProductFilterLambda();
		//can use multiple filters, but in old days we have to use different feature
		Predicate<Product> p1= prod -> prod.getColor() == Color.RED; 
		Predicate<Product> p2= prod -> prod.getSize() == Size.LARGE; 
		
		filterLambda.filter(products, p1.and(p2))
			.stream()
			.forEach(p -> System.out.println(p.getName() + " is red and large"));
		
		System.out.println("lambda way completed");
		
		System.out.println("specification way started");
		
		ColorSpecification spec1 = new ColorSpecification(Color.RED);
		
		ProductFilterSpecification prodf = new ProductFilterSpecification();
		prodf.filter(products, spec1)
			.stream()
			.forEach(p -> System.out.println(p.getName() + " is red"));
		;
		
		System.out.println("specification way ended");
		
	}

}
