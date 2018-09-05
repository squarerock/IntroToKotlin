package classes

/**
 * Created by pranavkonduru on 9/4/18.
 */
class Human(val name: String) : LifeForm, Babies {

    /**
     * Initialization block for the primary constructor
     */
    init {
        println("Name supplied is $name")
    }

    /**
     * Secondary constructor with nullability check
     */
    constructor(name: String, gender: String, age: Int?): this(name){
        age?.also { println("Age given is $it")}
    }

    /**
     * Normal override
     */
    override fun move(): Boolean {
        return true
    }

    /**
     * Overriding method from interface
     * that has a default code block
     *
     * Calling super is optional
     */
    override fun limbs(): Int? {
        return 2
    }

    /**
     * If two interfaces have methods with same signatures and names,
     *
     * return type should specify which interface it is calling.
     */
    override fun speak(): String {
        return super<Babies>.speak()
    }
}