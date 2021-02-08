package commandpatternexample;

public interface FunctionalCommand {
	String TYPE_ONE= "TYPE_ONE";
	String TYPE_TWO= "TYPE_TWO";
	String TYPE_THREE= "TYPE_THREE";

	void execute();
	
}
