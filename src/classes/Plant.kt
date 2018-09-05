package classes

/**
 * Created by pranavkonduru on 9/4/18.
 */
class Plant : LifeForm {

    override fun speak(): String {
        return "Plant Language"
    }

    override fun move(): Boolean {
        println("Plants cannot move")
        return false
    }

    override fun limbs(): Int? {
        println("Plants do not have limbs")
        return null
    }
}