package codeToInterfaces;

//interface name should be adjective
public interface Displayable {

	//adding contract
	//client and api will folow this
	//this will make sure changes in child classes wont affect anything on client
	//also will make the code flexible to use any type of interface child
	//also will add data hiding as part of abstraction
	void display();
}
