
public class GreaterThanEqualExpression implements Expression{
	private String operand1;
	private String operand2;
	@Override
	public boolean interpret(ExpressionContext context) {
		return context.greaterThanEqualsOperation(operand1, operand2);
	}
	public GreaterThanEqualExpression(String operand1, String operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

}
