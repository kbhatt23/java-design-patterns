package builderexample;

public class ComplexBuilder {

	private final int intProperty;
	
	private final double doubleProperty;
	
	private final String stringProperty;

	private ComplexBuilder(int intProperty, double doubleProperty, String stringProperty) {
		this.intProperty = intProperty;
		this.doubleProperty = doubleProperty;
		this.stringProperty = stringProperty;
	}
//	private ComplexBuilder() {
//	}

	public int getIntProperty() {
		return intProperty;
	}


	public double getDoubleProperty() {
		return doubleProperty;
	}


	public String getStringProperty() {
		return stringProperty;
	}

	@Override
	public String toString() {
		return "ComplexBuilder [intProperty=" + intProperty + ", doubleProperty=" + doubleProperty
				+ ", stringProperty=" + stringProperty + "]";
	}
	public static ComplexInnerBuilder builder() {
		return new ComplexInnerBuilder();
	}
	
	public static class ComplexInnerBuilder{
		private  int intProperty;
		
		private  double doubleProperty;
		
		private  String stringProperty;

		public int getIntProperty() {
			return intProperty;
		}
		
		private ComplexInnerBuilder() {
			
		}

		public ComplexInnerBuilder setIntProperty(int intProperty) {
			this.intProperty = intProperty;
			return this;
		}


		public ComplexInnerBuilder setDoubleProperty(double doubleProperty) {
			this.doubleProperty = doubleProperty;
			return this;
		}


		public ComplexInnerBuilder setStringProperty(String stringProperty) {
			this.stringProperty = stringProperty;
			return this;
		}
		
		public ComplexBuilder build() {
			return new ComplexBuilder(intProperty, doubleProperty, stringProperty);
		}
	}
	
}
