package buildingHouseExample.glassBuilder;

import buildingHouseExample.BuildHouse;

public class GlassHouse extends BuildHouse{


	@Override
	protected void buildWindows() {
		System.out.println("buildign windows with glass");
	}

	@Override
	protected void buildWalls() {
		//utility method
		//was made protected
		//thois class is in different package
		//still can inherit this method
		relaxWorkers();
		System.out.println("building walls with glass");
	}
	
	//hooks method
	//default implementation is there
	//however we want to override it
	@Override
	protected void buildPillars() {
		System.out.println("building pillars with RCC for glass house");
	}
	
	

}
