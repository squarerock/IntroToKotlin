package classes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by pranavkonduru on 9/4/18.
 */
public class LifeFormDefaultImpls {

    /**
     * Created as default body for interface method in LifeForm
     * @return non-null string
     */
    @NotNull
    static String speak() {
        return "Random sounds";
    }

    /**
     * Created as default body for interface method in LifeForm
     * @return null Integer
     */
    @Nullable
    static Integer limbs() {
        return null;
    }
}
