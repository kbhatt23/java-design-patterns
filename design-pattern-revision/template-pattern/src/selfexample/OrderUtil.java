package selfexample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OrderUtil {

	public static List<Order> findAllOrders(){
		return IntStream.rangeClosed(1, 20)
			.mapToObj(i -> new Order("order-"+i, i*10))
			.collect(Collectors.toList())
			;
	}
}
