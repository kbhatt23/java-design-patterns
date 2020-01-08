package openClosePrinciple.specifiationStyle;

import openClosePrinciple.db.Color;
import openClosePrinciple.db.Product;

public class ColorSpecification implements Specification<Product>{
	public ColorSpecification(Color color) {
		this.color = color;
	}
	private Color color;
	@Override
	public boolean accept(Product item) {
		// TODO Auto-generated method stub
		return item.getColor() == color;
	}

}
