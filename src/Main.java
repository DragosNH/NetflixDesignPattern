public class Main {
    public static void main(String[] args) {

        MovieList movie = new MovieList();
        System.out.println(movie);

        MovieList sc = new MovieList("RRRRrrrrrr","Comedy", "1:50");
        MovieList sc2 = new MovieList("RRRRrrrrrr","Comedy", "1:50");

        System.out.println(sc);
        System.out.println(sc2);

    }
}