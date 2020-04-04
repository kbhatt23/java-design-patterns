package example3;

public class BollywoodMovieCreator implements AbstractMovieCreator {

	@Override
	public HollywoodMovie createHollywoodMovie(String type) {
		throw new UnsupportedOperationException("can not create hollywood instance");
	}

	@Override
	public BollywoodMovie createBollywoodMovie(String type) {
		BollywoodMovie bollyWoodMovie = null;
		
		switch (type) {
		case BOLLYWOOD_ACTION_TYPE:
			bollyWoodMovie = new BollyWoodActionMovie();
			break;
		case BOLLYWOOD_COMEDY_TYPE:
			bollyWoodMovie = new BollywoodComedyMovie();
			break;
		default:
			throw new UnsupportedOperationException("unsupport bollywood movie "+type);
		}
		
		return bollyWoodMovie;
	}

}
