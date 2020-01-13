package generalJavaConcepts.serializationWithInheritance;

public class SerializationInheritanceClient {

	public static void main(String[] args) {
		ChildV1 child = new ChildV1(23, 10);
		
		SerializationUtil.serializeObject(child, "childv1.txt");
		MultiThreadUtil.sleep(500);
		ChildV1 serialzedChild = (ChildV1) SerializationUtil.deserializeObject("childv1.txt");
		System.out.println("======printing main object==============");
		
		System.out.println(child.getChildProperty());
		System.out.println(child.getParentProperty());
		
		
		
		System.out.println("======printing deseriaized object==============");
		System.out.println(serialzedChild.getChildProperty());
		System.out.println(serialzedChild.getParentProperty());
	}

}
