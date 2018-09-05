package classes.sealed;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Created by pranavkonduru on 9/5/18.
 */
public final class Error extends AuthResult {

    @NotNull
    private final Throwable exception;

    private final int statusCode;

    public Error(@NotNull Throwable exception, int statusCode) {
        this.exception = exception;
        this.statusCode = statusCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Error error = (Error) o;
        return statusCode == error.statusCode &&
                Objects.equals(exception, error.exception);
    }

    @Override
    public int hashCode() {

        return Objects.hash(exception, statusCode);
    }

    @Override
    public String toString() {
        return "Error{" +
                "exception=" + exception +
                ", statusCode=" + statusCode +
                '}';
    }

    @NotNull
    public final int getStatusCode(){
        return statusCode;
    }

    @NotNull
    public final Throwable getException(){
        return exception;
    }
}
