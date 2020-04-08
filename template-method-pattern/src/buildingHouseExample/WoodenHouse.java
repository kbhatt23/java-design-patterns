package buildingHouseExample;

public class WoodenHouse extends BuildHouse{

	@Override
	protected void buildWindows() {
		System.out.println("buildign windows with wooden blockages");
	}

	@Override
	protected void buildWalls() {
		System.out.println("building walls with wooden blockages");
	}
	//have made tmplate method final
	//so taht any child class do not override it
	//we have strict algo sequence to follow
	/*
	 * @Override public void buildHouse() { // TODO Auto-generated method stub
	 * super.buildHouse(); }
	 */
}
