package selflearning;

public class MessageSubscriber<T> implements SelfSubscriber<T>{

	private String name;
	private String channelName;
	public MessageSubscriber(String name) {
		this.name = name;
	}


	@Override
	public void recieveMessage(T message, SelfSubscriable<T> selfSubscriable) {
		String channelNewName = selfSubscriable.getName();
		System.out.println("Recieving message notification "+message+" recieve by "+name+" from channel "+channelNewName);
		if(channelName == null || !channelName.equals(channelNewName)) {
			//update the state
			channelName = channelNewName;
		}
	}


	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "MessageSubscriber [name=" + name + ", channelName=" + channelName + "]";
	}
	
	

}
