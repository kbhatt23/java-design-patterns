package builderexample;

public class ComplexBuilderclient {
	public static void main(String[] args) {
		ComplexBuilder obj = ComplexBuilder.builder().setDoubleProperty(23.23).build();

		System.out.println(obj);
	}
}
