package Files;

import java.util.Map;

public class Runner {

	public static void main(String[] args){
		
		//Create a database just for testing purposes
		MoviesDatabase database=new MoviesDatabase();
		Movie movie1=new Movie("The Boss Baby","120 minutes","01 Apr 2017 ","A seven-year-old manner of a businessman.",Genre.COMEDY);
		Movie movie2=new Movie("The Hunter","95 minutes","01 Apr 2017 ","Adventure starring The Sons of Anarchy's Charlie Hunnam as King Arthur",Genre.DRAMA);
		Movie movie3=new Movie("The King Arthur","90 minutes","01 March 2017","Wears a suit and has the brusque manner of a businessman",Genre.ADVENTURE);
		database.addMovie(movie1);
		database.addMovie(movie2);
		database.addMovie(movie3);
	    
		//Create a schedule for weekly showtimes
		Schedule schedule=new Schedule();
		schedule.addMovie(Day.monday, database.getMovieByIndex(0), new String[]{"11:00","15:00"});
		schedule.addMovie(Day.monday, database.getMovieByIndex(1), new String[]{"13:00","16:00"});
		schedule.addMovie(Day.wednesday, database.getMovieByIndex(0), new String[]{"10:00","14:00"});
		schedule.addMovie(Day.wednesday, database.getMovieByIndex(1), new String[]{"16:00","19:00"});
		
	    
		//Create a test order
	    Day selectedDay=Day.monday;
	    Map<Movie, String[]> availableMovies=schedule.getMovies(selectedDay);
	    Movie selectedMovie=movie1;
	    
	    //Get first available showtime
	    String time=availableMovies.get(movie1)[0];
	    
	    
		Order order=new Order(1,1,1,1,selectedMovie,selectedDay,time);
		
		System.out.println(order);
	
	
	}
	
	
}
