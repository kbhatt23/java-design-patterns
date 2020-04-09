package calcuationOperationExample;

public class CalculationStrategyClietn {
public static void main(String[] args) {
	double a = 23;
	double b=32;
	
	CalcuatorContext context = new CalcuatorContext();
	System.out.println(context.calculate(new AdditionStrategy(), a, b));
	
	System.out.println("================");
	
	System.out.println(context.calculate(new MultiplicationStrategy(), a, b));
}
}
