package billPugh;

public class CaptainClient {

	public static void main(String[] args) {
		Captain i1 = Captain.getInstance();
		Captain i2 = Captain.getInstance();
		System.out.println(i1==i2);
	}

}
