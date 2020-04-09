package selfLearningExample;

public interface Publisher {

	void subscribe(Subscriber subscriber);
	void unsubscribe(Subscriber subscriber);
	//void notifySubscribers();
	
	void changeState(String state);
}
