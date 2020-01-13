package staticSingleton;

public class StaticSingletonClient {

	public static void main(String[] args) {

		StaticSingleton s1 = StaticSingleton.getInstance();
		System.out.println(s1);
	}

}
