package builderexample;

import java.util.function.Function;

public class Functionalbuilder {

	private int intProperty;
	
	private double doubleProperty;
	
	private String stringProperty;

//	private Functionalbuilder(int intProperty, double doubleProperty, String stringProperty) {
//		this.intProperty = intProperty;
//		this.doubleProperty = doubleProperty;
//		this.stringProperty = stringProperty;
//	}
	private Functionalbuilder() {
	}

	public int getIntProperty() {
		return intProperty;
	}

	public Functionalbuilder setIntProperty(int intProperty) {
		this.intProperty = intProperty;
		return this;
	}

	public double getDoubleProperty() {
		return doubleProperty;
	}

	public Functionalbuilder setDoubleProperty(double doubleProperty) {
		this.doubleProperty = doubleProperty;
		//coule be creating new instance
		return this;
	}

	public String getStringProperty() {
		return stringProperty;
	}

	public Functionalbuilder setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
		return this;
	}
	
	public static Functionalbuilder build(Function<Functionalbuilder, Functionalbuilder> pipelineBuilder) {
		Functionalbuilder builder = new Functionalbuilder();
		
		pipelineBuilder.apply(builder);
		return builder;
	}

	@Override
	public String toString() {
		return "Functionalbuilder [intProperty=" + intProperty + ", doubleProperty=" + doubleProperty
				+ ", stringProperty=" + stringProperty + "]";
	}
	
	
	
}
