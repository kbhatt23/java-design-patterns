package buildingHouseExample;
//can have abstract or non abstract method
//the template method as name suggest holds sequence of method call in order
//however some method can be concerete some can not be
public abstract class BuildHouse {
	//public so taht client form anypackage can call this
	//final so that child class inherit it but can not override it
	public final void buildHouse() {
		digForFoundation();
		concreteFoundationBase();
		//utility method usable by child class only
		//no method shud be visible to client other than tempoate method
		relaxWorkers();
		buildPillars();
		buildWindows();
		buildWalls();
	}
	//abstract methods are made protected
	//so that outside package child classes can still intehit and hence implement it
	protected abstract void buildWindows();
	
	protected abstract void buildWalls();
	
	//hook method
	//default is concrete
	//however RCC can still be used
	//made proptected so that child class who want to use RCC can override it
	protected void buildPillars() {
		System.out.println("building pillars with concrete");
	}
	//concret methods , wont be used by child classes
	//this should not be visible to anyone part from teplate method class
	private void digForFoundation() {
		System.out.println("Machines digging to build huge foundation");
	}
	//concret methods , wont be used by child classes
	//this should not be visible to anyone part from teplate method class
	private void concreteFoundationBase() {
		System.out.println("Building Base concrete to strengthen foundation");
	}
	
	//utiltiy methods, should be used only by child class
	//client should not be able to call this method
	//concrete but can be used by child classes
	//hence protected
	protected void relaxWorkers() {
		System.out.println("workers are relaxing to get strength back");
	}
	
	//made it protected so that clietn in other package can not access it directly
	//anyways this method cna not be called from o
	
}
