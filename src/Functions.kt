import classes.Movie

/**
 * Created by pranavkonduru on 9/2/18.
 */
class Functions {


    /**
     * Basic function definition.
     * Accepts two parameters a, b as Integers
     * Returns an integer
     */
    fun sum(a : Int, b : Int) : Int {
        return a + b
    }

    /**
     * Since the above function has a simple return
     * it can be simplified
     */
    fun sumSimplified (a: Int, b: Int) = a + b

    /**
     * Function returning no meaningful value
     * returns Unit as type
     */
    fun printName(name: String) : Unit{
        println(name)
    }

    /**
     *  This function doesnt return anything too
     *  Return type can be omitted
     *
     *  String templates are used for string formatting
     */
    fun printNameWithTemplates(name: String) {
        println("My name is $name")
    }

    /**
     * Default arguments for variables.
     */
    fun company(name: String = "Citrix"){
        println("I work at $name")

        val movie = Movie("test", "dir1", 4.5f)

    }

}