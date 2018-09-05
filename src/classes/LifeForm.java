package classes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by pranavkonduru on 9/4/18.
 */
public interface LifeForm {

    /**
     * Simple interface method which returns a Boolean
     */
    @NotNull Boolean move();

    /**
     * Interfaces can have code block
     */
    @NotNull String speak();

    /**
     * Interface with nullable return type
     */
    @Nullable Integer limbs();
}
