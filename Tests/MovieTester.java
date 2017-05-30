package Tests;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import Files.*;

public class MovieTester {

	@Test
	public void testCreateMovie() {
		Movie movie=new Movie("The Boss Baby","120 minutes","01 Apr 2017 ","A seven-year-old manner of a businessman.",Genre.COMEDY);
		String title=movie.getName();
		assertEquals(title,"The Boss Baby");
		
	}
	
	@Test
	public void testAddingToDatabase() {
		Movie movie=new Movie("The Boss Baby","120 minutes","01 Apr 2017 ","A seven-year-old manner of a businessman.",Genre.COMEDY);
		MoviesDatabase data=new MoviesDatabase();
		data.addMovie(movie);
		List<Movie> databaseMovies=data.getAllMovies();
		assertNotNull(databaseMovies.size());
		
	}
	
	

}
