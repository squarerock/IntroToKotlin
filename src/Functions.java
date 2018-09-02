import java.text.MessageFormat;

/**
 * Created by pranavkonduru on 9/2/18.
 */
public class Functions {

    /**
     * Simple method
     * @param a variable of type int
     * @param b another variable of type int
     * @return returns the sum which is int
     *
     * this is the simplest form to write this
     */
    public int sum(int a, int b){
        return a + b;
    }

    /**
     * Prints the given input to console
     *
     * return type needs to be explicitly mentioned
     * @param name name to be printed
     */
    public void printName(String name){
        System.out.println(name);
    }

    /**
     * prints the name concatenation
     *
     * @param name name to be printed
     *
     * Functionality exists in a separate package and not baked into language
     */
    public void printNameWithTemplates(String name){
        System.out.println(MessageFormat.format("My name is {0}", name));
    }

    /**
     * Simple function to print name of company
     * @param name name to print
     */
    public void company(String name){
        System.out.println("I work at "+name);
    }

    /**
     * Java does not support default parameters.
     * This causes to create method overloading
     */
    public void company(){
        company("Citrix");
    }

}
