package classes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * Created by pranavkonduru on 9/2/18.
 */
public final class Movie {
    @NotNull private String name;
    @NotNull private String director;
    @Nullable private Float rating;
    @NotNull private String genre = "comedy";
    @NotNull private String yearReleased = "2018";

    public Movie(@NotNull String name, @NotNull String director, @Nullable Float rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public Movie(@NotNull String name, @NotNull String director, @Nullable Float rating, @NotNull String genre) {
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.genre = genre;
    }

    public Movie(@NotNull String name, @NotNull String director, @Nullable Float rating, @NotNull String genre, @NotNull String yearReleased) {
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getDirector() {
        return director;
    }

    @Nullable
    public Float getRating() {
        return rating;
    }

    public void setRating(@Nullable Float rating) {
        this.rating = rating;
    }

    @NotNull
    public String getGenre() {
        return genre;
    }

    @NotNull
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
