package classes

/**
 * Created by pranavkonduru on 9/4/18.
 */
open class Human(name: String) : LifeForm, Mammals {

    /**
     * Non-null modifiable undeclared variable
     */
    lateinit var nameCapitalized: String

    /**
     * Initialization block for the primary constructor
     */
    init {
        println("Hello $name!")
    }

    /**
     * Secondary constructor with nullability check
     */
    constructor(name: String, gender: String, age: Int?): this(name){
        age?.also { println("Age given is $it")}

        nameCapitalized = name.capitalize() // Assigning a value to the lateinit variable
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
     * If two interfaces have same method with code block,
     * return type needs to be explicit
     */
    override fun speak(): String {
        return super<Mammals>.speak()
    }

    /**
     * lateinit variable should only be accessed if it is
     * initialized
     */
    fun getCapitalizedNamed() : String {
        if(::nameCapitalized.isInitialized)
            return nameCapitalized
        else
            throw Exception("Not initialized yet")
    }
}