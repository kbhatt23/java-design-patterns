package basicexample;

//represent the functioanlity class
public interface NumberVisitor {

	//for each type we will define different item
	int visit(NumberManipulationVisitable numberManipulationVisitable);
	
	int visit(ThreeNumberManipulationVisitable numberManipulationVisitable);
}
