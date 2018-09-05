package classes

/**
 * Created by pranavkonduru on 9/4/18.
 */
interface LifeForm {

    /**
     * Simple interface method which returns a Boolean
     */
    fun move() : Boolean

    /**
     * Interfaces can have code block
     */
    fun speak() : String {
        return "Random sounds"
    }

    /**
     * Interface with nullable return type
     */
    fun limbs() : Int? {
        return null
    }
}