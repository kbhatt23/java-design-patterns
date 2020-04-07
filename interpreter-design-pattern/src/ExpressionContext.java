
//this class is the utlity class
//need ot be instantiate by client 
//need to be passed to expression class to actually call th main logc
//this is not created in expression concrete class so as to add flexibility
//like dependency injection or autowiring
public class ExpressionContext {

	public boolean equalsOperation(String operand1 , String operand2) {
		 boolean equals = false;
		 if(operand1 !=null && operand2 !=null && operand1.compareToIgnoreCase(operand2) == 0) {
			 equals = true;
		 }
		 return equals;
	}
	
	public boolean notEqualsOperation(String operand1 , String operand2) {
		 boolean equals = false;
		 if(operand1 !=null && operand2 !=null && operand1.compareToIgnoreCase(operand2) != 0) {
			 equals = true;
		 }
		 return equals;
	}
	
	public boolean lessThanOperation(String operand1 , String operand2) {
		 boolean equals = false;
		 if(operand1 !=null && operand2 !=null && operand1.compareToIgnoreCase(operand2) < 0) {
			 equals = true;
		 }
		 return equals;
	}
	
	public boolean lessThanEqualsOperation(String operand1 , String operand2) {
		 boolean equals = false;
		 if(operand1 !=null && operand2 !=null && operand1.compareToIgnoreCase(operand2) <= 0) {
			 equals = true;
		 }
		 return equals;
	}
	
	public boolean greaterThanOperation(String operand1 , String operand2) {
		 boolean equals = false;
		 if(operand1 !=null && operand2 !=null && operand1.compareToIgnoreCase(operand2) > 0) {
			 equals = true;
		 }
		 return equals;
	}
	
	public boolean greaterThanEqualsOperation(String operand1 , String operand2) {
		 boolean equals = false;
		 if(operand1 !=null && operand2 !=null && operand1.compareToIgnoreCase(operand2) >= 0) {
			 equals = true;
		 }
		 return equals;
	}
}
