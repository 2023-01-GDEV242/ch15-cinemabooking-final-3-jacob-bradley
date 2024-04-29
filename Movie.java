
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie {
    private String movieName;
    private String movieRD; //RD = ReleaseDate
    private int runTime;
    /**
     * Constructor for objects of class Movie
     */
    public Movie() {
        movieName = "Name";
        movieRD = "Date";
        runTime = 2; //in hours
    }
    
    public Movie(String movieName, String movieDate, int movieTime) {
        this.movieName = movieName;
        movieRD = movieDate;
        runTime = movieTime;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getMovieDate() {
        return movieRD;
    }
    public int getRunTime() {
        return runTime;
    }
    public void changeDate(String movieDate) {
        movieRD = movieDate;
    }
    public void changeName(String movieName) {
        this.movieName = movieName;
    }
    public void changeTime(int movieTime) {
        runTime = movieTime;
    }
}
