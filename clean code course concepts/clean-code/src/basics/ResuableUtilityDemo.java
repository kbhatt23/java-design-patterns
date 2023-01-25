package basics;

public class ResuableUtilityDemo {
	public static void main(String[] args) {

		Integer result = ResuableUtility.calculations(Math :: addExact, 1,9,4,-4);
		
		System.out.println(result);
	}
}
