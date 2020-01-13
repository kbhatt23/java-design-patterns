package generalJavaConcepts.serializationWithInheritance;

public class SerializationInheritanceV3Client {

	public static void main(String[] args) {
		ChildV3 child = new ChildV3(23, 10);
		
		SerializationUtil.serializeObject(child, "childv1.txt");
		MultiThreadUtil.sleep(500);
		ChildV3 serialzedChild = (ChildV3) SerializationUtil.deserializeObject("childv1.txt");
		System.out.println("======printing main object==============");
		
		System.out.println(child.getChildProperty());
		System.out.println(child.getParentProperty());
		
		
		
		System.out.println("======printing deseriaized object==============");
		System.out.println(serialzedChild.getChildProperty());
		System.out.println(serialzedChild.getParentProperty());
	}

}
