package selflearning;

public class GroupedMessageSubscriber<T> implements GroupSelfSubscriber<T>{

	private String name;
	public GroupedMessageSubscriber(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void recieveMessage(T message, GroupedSelfSubscriable<T> selfSubscriable) {
		System.out.println("Recieving message notification "+message+" recieve by "+name+" from channel "+selfSubscriable.getName());		
	}

}
