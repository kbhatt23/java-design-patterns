package builderexample;

import java.util.function.Consumer;

public class ComplexBuilderLazy {

	private final int intProperty;
	
	private final double doubleProperty;
	
	private final String stringProperty;

	private ComplexBuilderLazy(int intProperty, double doubleProperty, String stringProperty) {
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
	public static ComplexInnerBuilderLazy builder() {
		return new ComplexInnerBuilderLazy();
	}
	
	public  static class ComplexInnerBuilderLazy{
		private  int intProperty;
		
		private  double doubleProperty;
		
		private  String stringProperty;

		public int getIntProperty() {
			return intProperty;
		}
		
		private ComplexInnerBuilderLazy() {
			
		}

		public ComplexInnerBuilderLazy setIntProperty(int intProperty) {
			this.intProperty = intProperty;
			return this;
		}


		public ComplexInnerBuilderLazy setDoubleProperty(double doubleProperty) {
			this.doubleProperty = doubleProperty;
			return this;
		}


		public ComplexInnerBuilderLazy setStringProperty(String stringProperty) {
			this.stringProperty = stringProperty;
			return this;
		}
		//no need to call setters manually
		public ComplexInnerBuilderLazy withProperties(Consumer<ComplexInnerBuilderLazy> consumer) {
			consumer.accept(this);
			return this;
		}
		
		public ComplexBuilderLazy build() {
			return new ComplexBuilderLazy(intProperty, doubleProperty, stringProperty);
		}
	}
	
}
