package selflearning;

public class MessageSubscriber<T> implements SelfSubscriber<T>{

	private String name;
	public MessageSubscriber(String name) {
		this.name = name;
	}


	@Override
	public void recieveMessage(T message, SelfSubscriable<T> selfSubscriable) {
		System.out.println("Recieving message notification "+message+" recieve by "+name+" from channel "+selfSubscriable.getName());
	}


	@Override
	public String getName() {
		return name;
	}

}
