package selflearning;

public interface SelfSubscriber<T> {

	public void recieveMessage(T message, SelfSubscriable<T> selfSubscriable);
	
	String getName();
}
