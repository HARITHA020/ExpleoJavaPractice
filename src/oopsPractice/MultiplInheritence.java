package oopsPractice;

import java.text.*;
import java.util.*;
class Movie {
    private String title;  
    private String genre;
    private int duration;
    private String language;
    private String country;
    private String movieType;
    private Date releaseDate;  

    public Movie(String title, String genre, int duration, String language, Date releaseDate, String country, String movieType) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.language = language;
        this.releaseDate = releaseDate;
        this.country = country;
        this.movieType = movieType;
    }

    public void getMovieDetail() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " hrs");
        System.out.println("Language: " + language);
        System.out.println("Country: " + country);
        System.out.println("Movie Type: " + movieType);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("------------------------");
    }


    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
	
}
interface SearchByGenre{
	public abstract void searchbyGenre(String genre);
}

interface SearchByTitle{
	public abstract void searchbyTitle(String title);
}

class Catalog implements SearchByGenre, SearchByTitle{
	private static Date lastUpdated;
	private static List<Movie> movielist=new ArrayList<Movie>();
	
	public static void addMovie(Movie m) {
        movielist.add(m);
    }
	@Override
	public void searchbyTitle(String title) {
		for(Movie movie: movielist) {
			if(movie.getTitle().equals(title)) {
				movie.getMovieDetail();
			}
		}
	}
	@Override
	public void searchbyGenre(String genre) {
		for(Movie movie: movielist) {
			if(movie.getTitle().equals(genre)) {
				movie.getMovieDetail();
			}
		}	
	}
}
public class MultiplInheritence {

	public static void main(String[] args) {
		Catalog c=new Catalog();
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat dateformat=new SimpleDateFormat("mm//dd//yyyy");
		Date date=cal.getTime();
		String todaysDate = dateformat.format(date);

		System.out.println("Today's Date: " + todaysDate);
		Movie m1=new Movie("AAA","Drama",3,"english",date,"france","action");
		Catalog.addMovie(m1);
		
		 //c.searchbyTitle("AAA");
	     c.searchbyGenre("Drama");

	}

}
