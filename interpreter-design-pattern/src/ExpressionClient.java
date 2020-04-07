
public class ExpressionClient {

	public static void main(String[] args) {
		
		
		String expressionString = "true!=false1";
		ExpressionContext context = new ExpressionContext();
		Expression expression = null;
		//parsing need to be taken care by client
		if(expressionString.contains("==")) {
			expression = new EqualsExpression(expressionString.split("==")[0], expressionString.split("==")[1]);
		}else if(expressionString.contains(">")) {
			expression = new GreaterThanExpression(expressionString.split(">")[0], expressionString.split(">")[1]);
		}else if(expressionString.contains(">=")) {
			expression = new GreaterThanEqualExpression(expressionString.split(">=")[0], expressionString.split(">=")[1]);
		}else if(expressionString.contains("<")) {
			expression = new LessThanExpression(expressionString.split("<")[0], expressionString.split("<")[1]);
		}else if(expressionString.contains("<=")) {
			expression = new LessThanEqualExpression(expressionString.split("<=")[0], expressionString.split("<=")[1]);
		}
		else if(expressionString.contains("!=")) {
			expression = new NotEqualsExpression(expressionString.split("!=")[0], expressionString.split("!=")[1]);
		}
		else  {
			throw new RuntimeException("invalid operation in visible expression");
		}
		System.out.println(expression.interpret(context));
	}

}
