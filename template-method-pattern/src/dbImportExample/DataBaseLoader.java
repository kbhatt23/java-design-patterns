package dbImportExample;

public abstract class DataBaseLoader {
//only entrey point for client
	//other methods can either be visible or not visible to child classes
	public final void loadData() {
		System.out.println("Data load process started by "+this.getClass().getName());
		
		StringBuilder dataFetched = fetchData();
		boolean lockState = lockState(dataFetched);
		if(lockState) {
			saveDataInDB(dataFetched);
		}
		relaseLock();
		
	}
	//protected so taht only child class can see it
	//abstract as it can be read form file or from webservice
   protected abstract StringBuilder fetchData();
   
   protected abstract void saveDataInDB(StringBuilder sb);
   
   //wont be used by child class at all
   private boolean lockState(StringBuilder dataFetched) {
	   boolean done = false;
	   if(dataFetched!= null ) {
		   System.out.println("locking the state");
		   done=true;
	   }
	  return done;
   }
   
   private void relaseLock() {
	   System.out.println("releasing lock");
   }
   
}
