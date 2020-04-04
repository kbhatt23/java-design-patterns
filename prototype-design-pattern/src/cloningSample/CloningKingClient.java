package cloningSample;

public class CloningKingClient {

	public static void main(String[] args) throws CloneNotSupportedException {
ChildComposition child = new ChildComposition(99);
	CloneKing king1 = new CloneKing(77,23, child, "jai shree ram", 32);
	
	CloneKing king2 = king1.clone();
	king2.getChild().setChildAge(108);
	king2.setIntegerProperty(66);
	king2.setIntObjProperty(28);
	king2.setStringProperty("jai radha madhav");
	king2.setSuperProperty(99);
	System.out.println(king2);
	System.out.println(king1);
	
	}

}
