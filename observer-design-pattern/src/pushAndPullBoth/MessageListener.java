package pushAndPullBoth;

public class MessageListener implements Listener,PullableListener{
	//listener name
	private String name;

	//for pull based mehcanism listener itslef becomes active
	private Publisher publisher;
	
	public MessageListener(String name) {
		this.name = name;
	}

	@Override
	public void recieveMessage(String state) {
		System.out.println("Listner "+name+ " recieveing message "+state);
	}

	@Override
	public void setMessagePublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public void pullStateUpdate() {
		String pullState = publisher.publisStateNow();
		System.out.println("pull based forceful state update for listner "+name+ "is: "+pullState);
	}

	@Override
	public String toString() {
		return "MessageListener [name=" + name + "]";
	}
	


}
