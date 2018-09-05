package classes.sealed;

/**
 * Created by pranavkonduru on 9/5/18.
 */
public final class Processing extends AuthResult {

    public static final Processing INSTANCE;
    static {
        INSTANCE = new Processing();
    }

    private Processing() { }

}
