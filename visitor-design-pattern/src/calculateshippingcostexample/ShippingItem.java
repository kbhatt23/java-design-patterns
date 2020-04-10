package calculateshippingcostexample;

public interface ShippingItem {

	//vissitor introduction and delgation
	//no need ot add method of claculation in real shippingitem concrete classes
	
	double calculateShipping(ShippingCalculatorVistor visitor);
}
