import java.util.Map;

/**
 * Created by pranavkonduru on 9/2/18.
 */
public class Variables {

    public static final Integer RANDOM_CONSTANT = 15132;
    public static final String RANDOM_STRING = "hello!";

    private Map<String, String> randomMap;

    /**
     * Constructor
     * @param randomMap
     */
    public Variables(Map<String, String> randomMap) {
        this.randomMap = randomMap;
    }

    private boolean isEmpty = false;
    /**
     * Custom getter with nullability checks
     * @return
     */
    public boolean isMapEmpty() {
        if(randomMap != null){
            isEmpty = randomMap.size() == 0;
        }
        return isEmpty;
    }


    private int counter;
    /**
     * Custom setter
     * @param counter
     */
    public void setCounter(int counter) {
        if(counter > 0) {
            this.counter = counter;
        }
    }
}
