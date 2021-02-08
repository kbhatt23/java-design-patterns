package iteratorexample;

import java.util.Objects;
import java.util.function.Consumer;

public class ArrayIterable<T> {

	private T[] storage;
	public ArrayIterable(T[] storage) {
		this.storage = storage;
	}
	
	//just like iterable itnerface have provided this foreach
	public void iterateForEach(Consumer<T> consumer) {
		Objects.requireNonNull(consumer);
		
		for(T entry:storage) {
			consumer.accept(entry);
		}
	}
}
