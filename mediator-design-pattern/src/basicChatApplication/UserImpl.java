package basicChatApplication;

public class UserImpl implements IUser {

	//instead of having has a relationship of all the users
	//we can just have single has a relationship with mediator
	//mediator will hold list of all user
	private String name;
	public UserImpl(String name, ChatMediator chatMediator) {
		this.name = name;
		this.chatMediator = chatMediator;
	}

	private ChatMediator chatMediator;
	@Override
	public void sendMessage(String message) {
		System.out.println("User "+name+" sending message "+message);
		chatMediator.sendMessage(message, this);
	}

	@Override
	public void recieveMessage(String message) {
		System.out.println("User "+name+" recieving message "+message);
	}

}
