package generalJavaConcepts.serializationWithInheritance;

public class SerializationInheritanceV2Client {

	public static void main(String[] args) {
		ChildV2 child = new ChildV2(23, 10);
		
		SerializationUtil.serializeObject(child, "childv2.txt");
		MultiThreadUtil.sleep(500);
		ChildV2 serialzedChild = (ChildV2) SerializationUtil.deserializeObject("childv2.txt");
		System.out.println("======printing main object==============");
		
		System.out.println(child.getChildProperty());
		System.out.println(child.getParentProperty());
		
		
		
		System.out.println("======printing deseriaized object==============");
		System.out.println(serialzedChild.getChildProperty());
		System.out.println(serialzedChild.getParentProperty());
	}

}
