package codeToInterfaces;

public class DisplayableClient {
	//strategy pattern
	public DisplayableClient(Displayable displayable) {
		this.displayable = displayable;
	}
	//flexible can be any sub type
	//hiding the actual implenmentation class
	private Displayable displayable;
	
	public void consumeDisplayable() {
		//client do not know actual sublclass using it
		displayable.display();
	}
	public static void main(String[] args) {
		//Displayable displyableItem = new Monitor();
		Displayable displyableItem = new TV();
		DisplayableClient client = new DisplayableClient(displyableItem);
		client.consumeDisplayable();
}
}
