package listkovSubstitutionPrinicple;

public class Rectangle {
	private int width;
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	private int height;
	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
	
	public int calculateArea() {
		return height*width;
	}
}
