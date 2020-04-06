package imageProxyExample;

public class JPEGImage implements Image {
	private String fileName;
	public JPEGImage(String fileName) {
		System.out.println("constructing jpeg image");
		this.fileName = fileName;
		//proxy will be used to enhance performac ein this case
		//proxy will enablble lazy loading
		//to make sure until everything is correct from clinet side we will create image object
		loadImage(fileName);
	}


	@Override
	public void display() {
		System.out.println("Displaying image "+fileName);
	}
	
	private void loadImage(String fileName) {
		//false simulation to show how heavy is object instantiation ofr this class
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Loading Image for file "+fileName);
	}

}
