package listkovSubstitutionPrinicple;

public class Square extends Rectangle {
	public Square(int size) {
		super(size, size);
	}
	
	@Override
	public void setHeight(int height) {
		setHeight(height);
		setWidth(height);
		}
	
	@Override
	public void setWidth(int width) {
		setWidth(width);
		setHeight(width);
	}

}
