package imageProxyExample;

public class ImageClient {

	public static void main(String[] args) {
		//eager loading
		//even when just object is instantiated we are loading actual image from file system
		Image directImage = new JPEGImage("raghav-bhakt-hanuman.jpeg");
		directImage.display();
		directImage.display();
		
		System.out.println("-------------------");
		Image image = new ImageProxy("raghav-bhakt-hanuman.jpeg");
		
		//lazy loading using proxy
		image.display();
		System.out.println("==============");
		//cached
		image.display();
	}

}
