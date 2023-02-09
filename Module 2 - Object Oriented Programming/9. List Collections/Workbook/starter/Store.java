import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    public Store() {
        // TODO    this.movies = new ArrayList<>();
        this.movies = new ArrayList<>();
    }

    public Movie getMovie(int index) {
        // TODO
        return newMovie(movies.)
    }

    public void setMovie(int index, Movie movie) {
        // TODO
    }

    public void addMovie(Movie movie) {
        // TODO
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}