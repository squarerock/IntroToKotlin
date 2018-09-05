package classes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by pranavkonduru on 9/4/18.
 */
public final class Alien implements LifeForm {

    private Alien(){}

    @NotNull
    @Override
    public Boolean move() {
        return true;
    }

    @NotNull
    @Override
    public String speak() {
        return LifeFormDefaultImpls.speak();
    }

    @Nullable
    @Override
    public Integer limbs() {
        return LifeFormDefaultImpls.limbs();
    }
}
