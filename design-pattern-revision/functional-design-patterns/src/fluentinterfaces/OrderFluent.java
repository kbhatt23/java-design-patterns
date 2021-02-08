package fluentinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class OrderFluent {
	private List<String> items;

	private String address;

	private int orderID;
	private static final Random RANDOM = new Random();

	private OrderFluent() {
		// generate random order id
		// can not add it during placeorder lazily as we will need it during tracking of
		// missed order
		orderID = RANDOM.nextInt(10000) + 100;
	}

	// lets be lazy
	public OrderFluent addItem(String item) {
		// validations
		if (item == null || item.length() == 0) {
			throw new IllegalArgumentException("item can not be empty");
		}
		if (items == null)
			items = new ArrayList<>();
		items.add(item);
		return this;
	}

	public OrderFluent addAddress(String address) {
		// validations
		if (address == null || address.length() == 0) {
			throw new IllegalArgumentException("address can not be empty");
		}
		this.address = address;
		return this;
	}

	public static void checkout(Function<OrderFluent, OrderFluent> orderfluentPipeline) {

		OrderFluent orderFluent = new OrderFluent();
		orderFluent = orderfluentPipeline.apply(orderFluent);
		if (orderFluent.items == null || orderFluent.items.size() == 0) {
			throw new IllegalArgumentException("items can not be empty");
		}
		if (orderFluent.address == null || orderFluent.address.length() == 0) {
			throw new IllegalArgumentException("address can not be empty");
		}

		System.out.println(String.format("checking out order with ID %d , with address %s and items %s",
				orderFluent.orderID, orderFluent.address, orderFluent.items));
	}
}
