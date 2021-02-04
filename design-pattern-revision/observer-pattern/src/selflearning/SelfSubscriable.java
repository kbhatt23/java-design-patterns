package selflearning;

public interface SelfSubscriable<T> {

	void subscribe(SelfSubscriber<T> selfSubscriber);
	
	void publishMessage(T message);
	
	String getName();
	
	void unsubscribe(SelfSubscriber<T> selfSubscriber);
}
