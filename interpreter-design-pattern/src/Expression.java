
public interface Expression {
	//if we have been using like operand in param
	//it can change anytime
	//so there will be no segreagtion ofinterfaces
	//hence creating common utility here
	//hence adding context
	//we can even create marker interface for this
	//similar to command interface
	//need to sublass for each method of expressioncontext(playing role of reciever class)
	boolean interpret(ExpressionContext context);
}
