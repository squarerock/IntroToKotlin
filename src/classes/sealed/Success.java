package classes.sealed;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Created by pranavkonduru on 9/5/18.
 */
public final class Success extends AuthResult {

    @NotNull
    private final String response;

    public Success(@NotNull String response) {
        this.response = response;
    }

    public final String getResponse(){
        return response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Success success = (Success) o;
        return Objects.equals(response, success.response);
    }

    @Override
    public int hashCode() {

        return Objects.hash(response);
    }

    @Override
    public String toString() {
        return "Success{" +
                "response='" + response + '\'' +
                '}';
    }

    @Override
    protected Success clone() throws CloneNotSupportedException {
        return (Success) super.clone();
    }
}
