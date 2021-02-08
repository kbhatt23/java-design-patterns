package iteratorexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalIterableClient {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
	Consumer<Integer> startMessage = number -> System.out.println("Consuming messages for "+numbers.size()+" numbers");
	Consumer<Integer> printNumber = number -> System.out.println("number found "+number);
	FunctionalIterable.iterate(printNumber, numbers);
	
	Consumer<Integer> doubleItemsAndPrint = number -> {
		number= number*2;
		System.out.println("double number found "+number);
	};
	
	Consumer<Integer> chainedconsumer = startMessage.andThen(doubleItemsAndPrint);
	
	FunctionalIterable.iterate(chainedconsumer, numbers);
}
}
