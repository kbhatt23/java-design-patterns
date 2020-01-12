package deepCopyStyle;

public class SampleClass implements Cloneable{
	private int marks;
	private String name;
	public SampleClass(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "SampleClass [marks=" + marks + ", name=" + name + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//deep copy not needed as paramteres have int and string only
		return super.clone();
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
