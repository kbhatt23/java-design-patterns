package builderexample;

import java.util.function.Function;

public class FunctionalBuilderclient {
	public static void main(String[] args) {
		Function<Functionalbuilder, Functionalbuilder> pipeline = functionalbuilder -> functionalbuilder
				.setDoubleProperty(99.99)
				.setStringProperty("jai shree ram");

		Functionalbuilder build = Functionalbuilder.build(pipeline);
		System.out.println("final result " + build);

	}
}
