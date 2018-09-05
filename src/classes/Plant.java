package classes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by pranavkonduru on 9/4/18.
 */
public final class Plant implements LifeForm {
    @NotNull
    @Override
    public Boolean move() {
        System.out.println("Plants cannot move");
        return false;
    }

    @NotNull
    @Override
    public String speak() {
        return "Plant Language";
    }

    @Nullable
    @Override
    public Integer limbs() {
        System.out.println("Plants do not have limbs");
        return null;
    }
}
