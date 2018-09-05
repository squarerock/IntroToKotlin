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
     *
     * All life form speaks some Human language unless specified
     */
    fun speak() : String {
        return "Human Language"
    }

    /**
     * Interface with nullable return type
     *
     * Certain lifeforms have no limbs
     */
    fun limbs() : Int? {
        return 4
    }
}