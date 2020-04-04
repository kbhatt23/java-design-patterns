package example3;

public class HollywoodMovieCreator implements AbstractMovieCreator {

	@Override
	public HollywoodMovie createHollywoodMovie(String type) {
		HollywoodMovie hollyWoodMovie = null;
		
		switch (type) {
		case BOLLYWOOD_ACTION_TYPE:
			hollyWoodMovie = new HollywoodActionMovie();
			break;
		case BOLLYWOOD_COMEDY_TYPE:
			hollyWoodMovie = new HollywoodComedyMovie();
			break;
		default:
			throw new UnsupportedOperationException("unsupport bollywood movie "+type);
		}
		
		return hollyWoodMovie;
	}

	@Override
	public BollywoodMovie createBollywoodMovie(String type) {
		
		throw new UnsupportedOperationException("can not create bollywood instance");
	}

}
