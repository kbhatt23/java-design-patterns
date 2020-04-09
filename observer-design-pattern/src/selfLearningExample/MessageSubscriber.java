package selfLearningExample;

public class MessageSubscriber implements Subscriber{
	private String name;
	public MessageSubscriber(String name) {
		this.name = name;
	}
	@Override
	public void recieveMessage(String message) {
		System.out.println("Subscriber "+name+" recieving message "+message);
	}
	@Override
	public String toString() {
		return "MessageSubscriber [name=" + name + "]";
	}

}
