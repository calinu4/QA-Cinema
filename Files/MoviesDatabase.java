package Files;


import java.util.*;

public class MoviesDatabase {

	public List<Movie> movies=new ArrayList<Movie>();
	
	
	public void addMovie(Movie movie){
		movies.add(movie);
	}
	
	public void removeMovie(Movie movie){
		movies.remove(movie);
	}
	
	public Movie getMovieByIndex(int index){
		return movies.get(index);
	}
	public List<Movie> getAllMovies(){
		return movies;
	}
}
