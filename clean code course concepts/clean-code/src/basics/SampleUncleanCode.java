package basics;

import java.util.function.Function;

public class SampleUncleanCode {

	private static final String MIN = "min";
	private static final String MAX = "max";

	public static void main(String[] args) {
		// Function<Integer, Boolean> createLogic = createLogic("fake", 10);

		Function<Integer, Boolean> max = createLogicUnclean(MAX, 10);

		System.out.println(max.apply(23));

		Function<Integer, Boolean> maxCompareNumber = compareNumber(MAX, 100);

		System.out.println(maxCompareNumber.apply(23));
		System.out.println(maxCompareNumber.apply(123));

		Function<Integer, Boolean> minCompareNumber = compareNumber(MIN, 100);

		System.out.println(minCompareNumber.apply(23));
		System.out.println(minCompareNumber.apply(123));
	}

	private static Function<Integer, Boolean> createLogicUnclean(String m, int n) {
		if (m.equals(MAX)) {
			return a -> a > n;
		} else if (m.equals(MIN)) {
			return a -> a < n;
		}
		throw new IllegalArgumentException("unknown m passed: " + m);
	}

	private static Function<Integer, Boolean> compareNumber(String type, int baseNumber) {
		if (type.equals(MAX)) {
			return numToCompare -> numToCompare > baseNumber;
		} else if (type.equals(MIN)) {
			return numToCompare -> numToCompare < baseNumber;
		}
		throw new IllegalArgumentException("unknown type passed: " + type);
	}
}
