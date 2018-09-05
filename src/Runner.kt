import classes.*

/**
 * Created by pranavkonduru on 9/4/18.
 */
fun main(args: Array<String>) {

}

/**
 * Function to demo interfaces
 */
fun demoInterface() {
    val human = Toddler("Pranav")
    println(human.speak())

    val basil = Plant()
    println(basil.limbs())
}

/**
 * Function to demo lateinit
 */
fun demoLateInit() {
    val human = Human("pranav")
    println(human.getCapitalizedNamed())

    val human2 = Human("pranav", "male", null)
    println(human2.getCapitalizedNamed())
}


/**
 * Function to demo sealed classes
 */
fun processAuthResult(result: AuthResult): String {
    return when(result) {
        is AuthResult.Processing -> "Loading"
        is AuthResult.Error -> {
            println("Status code: ${result.statusCode}")
            result.exception.toString()
        }
        is AuthResult.Success -> result.response
    }
}

/**
 * Function to demo unused parameters and '_' feature
 */
fun unusedParameters(movie: Movie){
    val (name, director, _, _, yearReleased) = movie
    println("$name is directed by $director which got released in $yearReleased")
}