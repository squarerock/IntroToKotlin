package classes

/**
 * Created by pranavkonduru on 9/4/18.
 */

/**
 * Instance of the class that cannot be created
 */
class Alien private constructor(): LifeForm {

    override fun move(): Boolean {
        return true
    }
}