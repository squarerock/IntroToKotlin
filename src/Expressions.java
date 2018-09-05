import java.util.Map;

/**
 * Created by pranavkonduru on 9/5/18.
 */
public class Expressions {

    /**
     * Simple for loop
     */
    void printNumbers(Integer n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }

        for(int j = 10; j >= 0; j = j-2){
            System.out.println(j);
        }
    }

    /**
     * Simple if
     */
    Integer getMax(Integer a, Integer b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    /**
     * Simple switch
     */
    String payOrSpend(Integer x){
        switch (x){
            case 15:
            case 31:
                return "Pay day";
            default:
                return "Spend day";
        }
    }

    /**
     * Simple for loop to print map elements
     */
    void printMap(Map<String, Integer> map){
        for(String key: map.keySet()){
            System.out.println("Key is: "+key+ " and value is "+map.get(key));
        }
    }
}
