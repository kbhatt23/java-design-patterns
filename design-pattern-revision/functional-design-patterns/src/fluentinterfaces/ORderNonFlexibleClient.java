package fluentinterfaces;

public class ORderNonFlexibleClient {
public static void main(String[] args) {
	OrderNonflexible order = new OrderNonflexible();
	order.addItem("phone");
	order.addItem("laptop");
	
	order.addAddress("dwarka");
	
	order.checkout();
}
}
