import java.util.Objects;

/**
 * Created by pranavkonduru on 9/2/18.
 */
public class Movie {
    private String name;
    private String director;
    private float rating;
    private String genre = "comedy";
    private String yearReleased = "2018";

    public Movie(String name, String director, float rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public Movie(String name, String director, float rating, String genre) {
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.genre = genre;
    }

    public Movie(String name, String director, float rating, String genre, String yearReleased) {
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Float.compare(movie.rating, rating) == 0 &&
                Objects.equals(name, movie.name) &&
                Objects.equals(director, movie.director) &&
                Objects.equals(genre, movie.genre) &&
                Objects.equals(yearReleased, movie.yearReleased);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, director, rating, genre, yearReleased);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", yearReleased='" + yearReleased + '\'' +
                '}';
    }
}
