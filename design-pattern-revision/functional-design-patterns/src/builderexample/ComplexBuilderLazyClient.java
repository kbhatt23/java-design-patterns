package builderexample;

public class ComplexBuilderLazyClient {
	public static void main(String[] args) {
		ComplexBuilderLazy build = ComplexBuilderLazy.builder()
				.withProperties(builder -> builder.setDoubleProperty(23.23)
							.setIntProperty(12)
							.setStringProperty("jai shree ram")
						)
					.build();
		System.out.println(build);
	}
}
