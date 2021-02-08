package iteratorexample;

import java.util.Arrays;
import java.util.function.Consumer;

public class ArrayITerableClient {

	public static void main(String[] args) {
		ArrayIterable<String> iterable1 = new ArrayIterable<>(new String[] {"sita-ram","radhe-krishna"});
		Consumer<String> consumre1 = str -> System.out.println("array element "+str);
		iterable1.iterateForEach(consumre1);
	}
}
