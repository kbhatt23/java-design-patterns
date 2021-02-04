package selflearning;

public interface GroupSelfSubscriber<T> {

	public void recieveMessage(T message, GroupedSelfSubscriable<T> selfSubscriable);
	
	String getName();
}
