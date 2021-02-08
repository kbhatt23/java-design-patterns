package iteratorexample;

import java.util.Iterator;
import java.util.function.Consumer;

public class FunctionalIterable {

	//pass any iterable
	//and also pass the consumer loigc u want
	public static <T> void iterate(Consumer<T> forEach, Iterable<T> iterable) {
		Iterator<T> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			T element = iterator.next();
			forEach.accept(element);
		}
	}
	
	//post java8
	public static <T> void iterateWitghJava8(Consumer<T> forEach, Iterable<T> iterable) {
		iterable.forEach(forEach);
	}
}
