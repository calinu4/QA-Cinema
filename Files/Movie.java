package Files;

public class Movie {

	String name,length,releaseDate,description;
	Genre genre;
	
	public Movie(String name,String length,String releaseDate,String description,Genre genre){
		this.name=name;
		this.length=length;
		this.releaseDate=releaseDate;
		this.genre=genre;
		this.description=description;
	}

	public String getName() {
		return name;
	}

	public String getLength() {
		return length;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", length=" + length + ", releaseDate=" + releaseDate + ", genre=" + genre
				+ ", description=" + description + "]";
	}
	
	
}

