package functionPractice;
/** the functionDeclare class implements an application that display the movie details 
 * using the user defined methods(Static)
 */
public class MovieTicket {
	static void getMovieDetails(String movieName,String movieDescription, int movieDuration,String movieLanguage,
			String movieReleaseDate,String movieCountry, String movieGenre) {
		System.out.println("Movie Title:"+movieName);
		System.out.println("Movie Description:"+movieDescription);
		System.out.println("Movie Duration:"+movieDuration);
		System.out.println("Movie Language:"+movieLanguage);
		System.out.println("Movie Release Date:"+movieReleaseDate);
		System.out.println("Movie Country:"+movieCountry);
		System.out.println("Movie Genre:"+movieGenre);
	}
	public static void main(String[] args) {
		String movieName="Premam";
		String movieDescription="drama based on different life stage.";
		int movieDuration=2;
		String movieLanguage="Tamil";
		String movieReleaseDate="12-04-2010";
		String movieCountry= "India";
		String movieGenre="Love/ drama";
		System.out.println("-------Movie Deatials------");
		getMovieDetails(movieName, movieDescription, movieDuration, movieLanguage, movieReleaseDate, movieCountry, movieGenre);
		System.out.println("----------------------------");
	}

}
