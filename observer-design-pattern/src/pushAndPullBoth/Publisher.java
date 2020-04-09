package pushAndPullBoth;

public interface Publisher {

	void subscribe(Listener listener);
	
	void unsubscribe(Listener listener);
	
	void notifyUpdate();
	
	void publishState(String state);
	
	String publisStateNow();
}
