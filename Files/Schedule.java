package Files;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Schedule {

	public Map<Movie, String[]> mondayMovies = new HashMap();
	public Map<Movie, String[]> tuesdayMovies = new HashMap();
	public Map<Movie, String[]> wednesdayMovies = new HashMap();
	public Map<Movie, String[]> thursdayMovies = new HashMap();
	public Map<Movie, String[]> fridayMovies = new HashMap();
	public Map<Movie, String[]> saturdayMovies = new HashMap();
	public Map<Movie, String[]> sundayMovies = new HashMap();
   
	public void addMovie(Day day, Movie movie, String[] showtimes) {
		switch (day) {
		case monday:
			mondayMovies.put(movie, showtimes);
			break;
		case tuesday:
			tuesdayMovies.put(movie, showtimes);
			break;
		case wednesday:
			wednesdayMovies.put(movie, showtimes);
			break;
		case thursday:
			thursdayMovies.put(movie, showtimes);
			break;
		case friday:
			fridayMovies.put(movie, showtimes);
			break;
		case saturday:
			saturdayMovies.put(movie, showtimes);
			break;
		case sunday:
			sundayMovies.put(movie, showtimes);
			break;
		}
	}

	public Map<Movie, String[]> getMovies(Day day) {
		switch (day) {
		case monday:
			return mondayMovies;

		case tuesday:
			return tuesdayMovies;

		case wednesday:
			return wednesdayMovies;

		case thursday:
			return thursdayMovies;

		case friday:
			return fridayMovies;

		case saturday:
			return saturdayMovies;

		case sunday:
			return sundayMovies;

		}

		return mondayMovies;
	}
}
