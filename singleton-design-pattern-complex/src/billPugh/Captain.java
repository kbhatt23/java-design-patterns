package billPugh;

public class Captain {
	private Captain() {}
	
	private static class CaptainFactory{
		private static Captain instance= new Captain();
	}
	
	public static Captain getInstance() {
		return CaptainFactory.instance;
	}
}
