package buildingHouseExample.client;

import buildingHouseExample.BuildHouse;
import buildingHouseExample.WoodenHouse;

public class FakeClient {
public static void main(String[] args) {
	BuildHouse fake = new WoodenHouse();
	//if mehtod was public it would be accesible by client
	//the only emthod visible to clietn should be tempate method
	//fake.relaxWorkers();
	
}
}
