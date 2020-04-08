package basicChatApplication;

import java.util.ArrayList;
import java.util.List;
//since in our application can have only one mediator communication
//hence not creating interface
public class ChatMediator {
	//mediator comes in picture when complex objects of same type interacts
	//eg aircrafts interacting using aircraft lines
	private List<IUser> users = new ArrayList<IUser>();
	
	public void sendMessage(String message, IUser senderUser) {
		for(IUser user : users) {
			//could have used equals method, logical equal
			if(senderUser != user) {
				user.recieveMessage(message);
			}
		}
	}
	public void addUser(IUser user) {
		users.add(user);
	}
	
	
}
