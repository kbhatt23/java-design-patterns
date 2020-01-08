package openClosePrinciple.lambdaWay;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import openClosePrinciple.db.Product;

public class ProductFilterLambda implements FilterUsingLambda<Product>{

	@Override
	public List<Product> filter(List<Product> items, Predicate<Product> criteria) {
		return items.stream()
					.filter(criteria)
					.collect(Collectors.toList());
	}

}
