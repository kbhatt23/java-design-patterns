package selflearning;

public class StringMessageChannelClient {
	public static void main(String[] args) {
		int numOfUsers = 5;
		int unsubscribeIndex = -1;
		MessageUtil.startMessaging("jai shree ram", numOfUsers,unsubscribeIndex);

		System.out.println("==============");
		unsubscribeIndex=3;
		MessageUtil.startMessaging(108, numOfUsers, unsubscribeIndex);
	}
}
