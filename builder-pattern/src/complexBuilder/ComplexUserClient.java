package complexBuilder;

public class ComplexUserClient {

	public static void main(String[] args) {
		ComplexUser user = new ComplexUser.ComplexUserBuilder()
					   .setFirstName("raghuapati")
					   .setLastName("ram")
					   .setNickName("purushotamam")
					   .build();
		System.out.println(user);
	}

}
