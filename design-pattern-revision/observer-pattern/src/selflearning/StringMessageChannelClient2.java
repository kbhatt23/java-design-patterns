package selflearning;

public class StringMessageChannelClient2 {
	public static void main(String[] args) {
		int numOfUsers = 5;
		int unsubscribeIndex = -1;
		MessageUtil.startGroupMessaging("jai shree ram", numOfUsers,unsubscribeIndex);

		System.out.println("==============");
		unsubscribeIndex=3;
		//MessageUtil.startGroupMessaging(108, numOfUsers,unsubscribeIndex);
	}
}
