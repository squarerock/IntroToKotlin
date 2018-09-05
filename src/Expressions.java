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
        return a > b ? a : b;
    }

    /**
     * Simple if-else
     */
    String payOrSpend(Integer x){
        String output;
        if (x != 15 && x != 31) {
            weirdLabel: {
                if (x >= 1) {
                    if (x <= 14) {
                        break weirdLabel;
                    }
                }

                if (x >= 16) {
                    if (x <= 30) {
                        break weirdLabel;
                    }
                }

                output = "Weird day";
                return output;
            }

            output = "Spend day";
        } else {
            output = "Pay day";
        }

        return output;
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
