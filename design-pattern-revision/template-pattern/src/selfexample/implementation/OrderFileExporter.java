package selfexample.implementation;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

import selfexample.Order;
import selfexample.OrderExporter;

public class OrderFileExporter extends OrderExporter{

	@Override
	protected void exportOrders(List<Order> allOrders) {

		try(PrintWriter printWriter = new PrintWriter("orders.txt")){
			allOrders.stream()
				.map(order -> new StringBuilder()
						.append(order.getId())
						.append("\t\t")
						.append(order.getTotalPrice())
						.toString()
						).forEach(str -> printWriter.println(str));
				
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected List<Order> filterOrders(List<Order> allOrders) {

	return allOrders.stream()
						.filter(order -> order.getTotalPrice() > 100)
						.collect(Collectors.toList());
	}

}
