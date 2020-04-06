package imageProxyExample;

//proxy is complete substitution of target class
//client will think it is calling actual api
//liuke decorator we need to have isa and has a for Super interfae
public class ImageProxy implements Image{

	//enable lazy loading
	private String fileName;
	
	private Image image;
	
	//in target class constructoir is eager
	//her we are beeing lazy to enact performacnce
	
	
	@Override
	public void display() {
		//lazy loading
		if(image== null) {
			image = new JPEGImage(fileName);
		}
		image.display();
	}

	public ImageProxy(String fileName) {
		//in target class constructro we initialized the whole image eagerly
		//we can even add auth code here
		this.fileName = fileName;
	}

}
