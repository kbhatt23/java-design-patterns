package buildingHouseExample.client;

import buildingHouseExample.BuildHouse;
import buildingHouseExample.WoodenHouse;
import buildingHouseExample.glassBuilder.GlassHouse;

public class HouseBuildClient {

	public static void main(String[] args) {
		BuildHouse house1 = new WoodenHouse();
		//only method visible is template method
		house1.buildHouse();
		System.out.println("====================");
		
		BuildHouse house2 = new GlassHouse();
		//only method visible is template method
		house2.buildHouse();
	}

}
