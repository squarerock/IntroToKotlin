package classes

/**
 * Created by pranavkonduru on 9/4/18.
 */
class Toddler(val name: String) : Human(name) {

    override fun speak(): String {
        return "$name blabbered"
    }
}