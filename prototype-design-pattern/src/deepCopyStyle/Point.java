package deepCopyStyle;

public class Point implements Cloneable{
	private int x;
	private int y;
	private String name;
	private SampleClass sampleClass;
	public Point(int x, int y, String name, SampleClass sampleClass) {
		this.x = x;
		this.y = y;
		this.name = name;
		this.sampleClass = sampleClass;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//should add deep copy code as it has a class instance varaible
		//return new Point(x, y, name,
			//	new SampleClass(sampleClass.getMarks(), sampleClass.getName())
				//);
		
		return new Point(x, y, name,
				(SampleClass)sampleClass.clone())
				;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", name=" + name + ", sampleClass=" + sampleClass + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SampleClass getSampleClass() {
		return sampleClass;
	}
	public void setSampleClass(SampleClass sampleClass) {
		this.sampleClass = sampleClass;
	}
}
