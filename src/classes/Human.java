package classes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by pranavkonduru on 9/4/18.
 */
public class Human implements LifeForm, Mammals {

    private String nameCapitalized;

    public Human(@NotNull String name) {
        System.out.println("Hello " +name);
    }

    public Human(@NotNull String name, @NotNull String gender, @Nullable Integer age){
        this(name);
        if (age != null) {
            System.out.println("Age given is: "+age);
        }

        nameCapitalized = name.toUpperCase();
    }

    @NotNull
    @Override
    public Boolean move() {
        return true;
    }

    @NotNull
    @Override
    public String speak() {
        return MammalsDefaultImpls.speak();
    }

    @Nullable
    @Override
    public Integer limbs() {
        return 2;
    }

    public String getCapitalizedName() throws Exception {
        if (nameCapitalized != null) {
            return nameCapitalized;
        }

        throw new Exception("Not initialized yet");
    }
}
