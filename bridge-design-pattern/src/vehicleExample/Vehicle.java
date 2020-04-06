package vehicleExample;

public abstract class Vehicle {
	//will be visible only while extending in different package
	protected WorkShop workshop1;
	
	protected WorkShop workshop2;
	
	protected WorkShop workshop3;

	protected Vehicle(WorkShop workshop1, WorkShop workshop2, WorkShop workshop3) {
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
		this.workshop3 = workshop3;
	}
	
	public  abstract void process();
}

class Car extends Vehicle{

	protected Car(WorkShop workshop1, WorkShop workshop2, WorkShop workshop3) {
		super(workshop1, workshop2, workshop3);
	}

	@Override
	public void process() {
		System.out.println("Starting processing for Car");
		workshop1.work();
		workshop2.work();
		workshop3.work();
		System.out.println("completed processing for Car");
	}
	
}

class Bike extends Vehicle{

	protected Bike(WorkShop workshop1, WorkShop workshop2, WorkShop workshop3) {
		super(workshop1, workshop2, workshop3);
	}

	@Override
	public void process() {
		System.out.println("Starting processing for Bike");
		workshop1.work();
		workshop2.work();
		workshop3.work();
		System.out.println("Completed processing for Bike");
	}
	
}

class Truck extends Vehicle{

	protected Truck(WorkShop workshop1, WorkShop workshop2, WorkShop workshop3) {
		super(workshop1, workshop2, workshop3);
	}

	@Override
	public void process() {
		System.out.println("Starting processing for Truck");
		workshop1.work();
		workshop2.work();
		workshop3.work();
		System.out.println("Completed processing for Truck");
	}
	
}
