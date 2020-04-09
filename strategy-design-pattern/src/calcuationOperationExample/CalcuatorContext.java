package calcuationOperationExample;

public class CalcuatorContext {
	//in state there willbe instance variable of  concrete implmentation classes
		//in stretegy concrete classes are passed as method argument
	public double calculate(CalculationStrategy strategy , double a , double b) {
		return strategy.calculate(a, b);
	}
}
