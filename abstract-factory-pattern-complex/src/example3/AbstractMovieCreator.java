package example3;

public interface AbstractMovieCreator {
	String BOLLYWOOD_COMEDY_TYPE = "bollywoodComedy";
	String BOLLYWOOD_ACTION_TYPE = "bollywoodAction";
	
	String HOLLYWOOD_COMEDY_TYPE = "hollywoodComedy";
	String HOLLYWOOD_ACTION_TYPE = "hollywoodAction";
	
	String BOLLYWOOD_TYPE = "bollywood";
	String HOLLYWOOD_TYPE = "hollywood";
	

	HollywoodMovie createHollywoodMovie(String type);
	
	BollywoodMovie createBollywoodMovie(String type);
	
	static AbstractMovieCreator createCreator(String type) {

		AbstractMovieCreator creator = null;
		
		switch (type) {
		case HOLLYWOOD_TYPE:
			creator = new HollywoodMovieCreator();
			break;
		case BOLLYWOOD_TYPE:
			creator = new BollywoodMovieCreator();
			break;
		default:
			throw new UnsupportedOperationException("unsupport  movie interface creator type "+type);
		}
		
		return creator;
	
		
	}
}
