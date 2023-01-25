package basics;

import java.util.function.BinaryOperator;

//utility means static only
public class ResuableUtility {
	

	private ResuableUtility() {
	}

	public static <T> T calculations(BinaryOperator<T> transformer, T... inputs) {
		if (inputs == null || inputs.length == 0)
			throw new IllegalArgumentException("inputs can not empty");
		
		T result = inputs[0];
		for (int i = 0; i < inputs.length - 1; i++) {
			result = transformer.apply(result, inputs[i+1]);
		}
		
		return result;
	}

}
