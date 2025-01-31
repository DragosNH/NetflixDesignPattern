public class MovieList {

    private int movieId = 0;
    private String movieName = "Top Gun";
    private String movieCategory = "Action";
    private String movieDuration = "1:30";

    public MovieList() {}

    public MovieList(String movieName, String movieCategory, String movieDuration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieCategory = movieCategory;
        this.movieDuration = movieDuration;
    }

    public String toString(){

//        for(int i = 0; i <= 9; i++){
//            movieId = i;
//        }

        return "ID: " + this.movieId + "\n"
                + "Movie name: " + this.movieName + "\n"
                + "Category: " + this.movieCategory + "\n"
                + "Duration: " + this.movieDuration + "\n"
                + "----------------------------";
    }

}
