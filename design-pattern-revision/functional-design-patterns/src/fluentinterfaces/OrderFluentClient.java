package fluentinterfaces;

import java.util.function.Function;

public class OrderFluentClient {
public static void main(String[] args) {
//	Function<OrderFluent, OrderFluent> fluentPipeline = order -> {
//		return order
//			 .addItem("phone")
//			 .addItem("tv")
//		     .addAddress("dwarka")
//				;
//		//return order;
//	};
	Function<OrderFluent, OrderFluent> fluentPipeline = order -> 
			order
			 .addItem("phone")
			 .addItem("tv")
		     .addAddress("dwarka");
	OrderFluent.checkout(fluentPipeline);
}
}
