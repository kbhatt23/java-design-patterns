package nonGenericExample;

public interface Collection<T> {

	void addItem(T element);

	Iterator getIterator();
}
