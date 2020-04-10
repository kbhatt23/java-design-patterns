package selfExample.goodway;

 interface Visitor {
	//visitor will have common method that have logic of each if instance of cases
	void executeLogic();
}
 
 class Item1Visitor implements Visitor{

	@Override
	public void executeLogic() {
		System.out.println("printing item 1");
	}
	 
 }
 
 class Item2Visitor implements Visitor{

	@Override
	public void executeLogic() {
		System.out.println("printing item 2");
	}
	 
 }
 
 class Item3Visitor implements Visitor{

	@Override
	public void executeLogic() {
		System.out.println("printing item 3");
	}
	 
 }
 
 class Item4Visitor implements Visitor{

	@Override
	public void executeLogic() {
		System.out.println("printing item 4");
	}
	 
 }
