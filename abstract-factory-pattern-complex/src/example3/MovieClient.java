package example3;

public class MovieClient {

	public static void main(String[] args) {

		AbstractMovieCreator bollywoodMovieCreator =
				AbstractMovieCreator.createCreator(AbstractMovieCreator.BOLLYWOOD_TYPE);
		
		BollywoodMovie bollywoodMovie =  bollywoodMovieCreator.createBollywoodMovie(
				AbstractMovieCreator.BOLLYWOOD_ACTION_TYPE
				);
				
		bollywoodMovie.printMovieName();
		
		bollywoodMovie =  bollywoodMovieCreator.createBollywoodMovie(
				AbstractMovieCreator.BOLLYWOOD_COMEDY_TYPE
				);
		bollywoodMovie.printMovieName();
		
	//	System.out.println(bollywoodMovieCreator.createBollywoodMovie(AbstractMovieCreator.HOLLYWOOD_ACTION_TYPE));
				
	}

}
