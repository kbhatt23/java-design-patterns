package enumBased;

//enum based singleton solves reflection api issue as well as serializble issue both
//but we can not use inheritance on it
public enum EnumBasedClass {

	//INSTANCE(10,"sita ram");
	INSTANCE(10,"pavan putra");
	
	
	  EnumBasedClass(int size, String name) {
		  this.name = name; this.size = size; }
	 
	private int size;
	private String name;
	public int getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void testFunction() {
		System.out.println("jai sita ram");
	}
}
