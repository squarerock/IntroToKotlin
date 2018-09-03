/**
 * Created by pranavkonduru on 9/2/18.
 */

/**
 * Constructor is defined in the class definition
 * ? after type indicates that the variable can be null
 */
class Variables (var randomMap : Map<String, String>?) {

    /**
     * Custom getter.
     * If randomMap was null, it will not execute .size
     */
    val isMapEmpty get() = randomMap?.size == 1

    /**
     * Custom getter.
     * Backing field is needed to set fields
     */
    var counter = 0
        set(value) {
           if(value > 0) field = value
        }

    /**
     * Static methods or fields are defined
     */
    companion object {
        /**
         * Not a compile time constant.
         * Will generate getters and setters
         */
        val RANDOM_CONSTANT = 15132

        /**
         * Compile time constant
         */
        const val RANDOM_STRING = "hello!"
    }

}