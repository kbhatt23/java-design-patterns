package areaCalculator;

public class RectangleCalculator implements Rectangle{

	private int length;
	private int width;
	public RectangleCalculator(int length, int width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public void calculateAndPrintArea(int length, int width) {
			System.out.println("Rectangle area: "+(length*width));
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}

}
