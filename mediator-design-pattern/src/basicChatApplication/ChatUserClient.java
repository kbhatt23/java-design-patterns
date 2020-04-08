package basicChatApplication;

public class ChatUserClient {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		IUser user1 = new UserImpl("hanuman", chatMediator);
		
		IUser user2 = new UserImpl("lakshman", chatMediator);
		
		IUser user3 = new UserImpl("bali", chatMediator);
		
		IUser user4 = new UserImpl("sugreev", chatMediator);
		
		IUser user5 = new UserImpl("angad", chatMediator);
		
		IUser user6 = new UserImpl("nal", chatMediator);
		
		IUser user7 = new UserImpl("neel", chatMediator);
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		chatMediator.addUser(user5);
		chatMediator.addUser(user6);
		chatMediator.addUser(user7);
		
		user1.sendMessage("jai shree ram");
		
	}

}
