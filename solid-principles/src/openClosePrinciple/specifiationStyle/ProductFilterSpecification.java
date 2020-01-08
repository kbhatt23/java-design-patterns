package openClosePrinciple.specifiationStyle;

import java.util.ArrayList;
import java.util.List;

import openClosePrinciple.db.Product;

public class ProductFilterSpecification implements FilterUsingSpecification<Product>{
	@Override
	public List<Product> filter(List<Product> items, Specification<Product> specification) {
		List<Product> result = new ArrayList<Product>();
		for(Product item : items) {
			if(specification.accept(item))
			result.add(item);
		}
		return result;
	}

}
