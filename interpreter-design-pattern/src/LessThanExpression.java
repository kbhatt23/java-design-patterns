
public class LessThanExpression implements Expression{
	private String operand1;
	private String operand2;
	@Override
	public boolean interpret(ExpressionContext context) {
		return context.lessThanOperation(operand1, operand2);
	}
	public LessThanExpression(String operand1, String operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

}
