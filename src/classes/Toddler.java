package classes;

import org.jetbrains.annotations.NotNull;

/**
 * Created by pranavkonduru on 9/4/18.
 */
public final class Toddler extends Human {

    private final String name;

    public Toddler(@NotNull String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String speak(){
        return name + " blabbered";
    }
}
