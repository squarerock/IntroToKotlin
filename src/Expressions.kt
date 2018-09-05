/**
 * Created by pranavkonduru on 9/4/18.
 */
class Expressions {

    /**
     * Simple for loop
     *
     * Range can be denoted
     *      by 1..n
     *      by 1 until n
     *      by 10 downTo 0
     *      step can also be set
     */
    fun printNumbers(n : Int) {
        for(i in 1 until n){
            println(i)
        }

        for(j in 10 downTo 0 step 2) {
            println(j)
        }
    }

    /**
     * Return labels for loops
     *
     * Function would return to the specified point
     *
     * Return labels can be customized
     */
    fun returnToLabel() {
        listOf(1, 2, 3, 4, 5).forEach customReturn@{
            if(it == 3) return@customReturn
            println("Executable code 1 and $it")
        }
        println("Executable code 2")
    }

    /**
     * Simple if expressions with 'lifting'
     */
    fun getMax(a: Int, b: Int) : Int {
        return if (a > b) a else b
    }

    /**
     * Simple when expression with 'lifting'
     */
    fun payOrSpend(x : Int) : String {
        return when(x) {
            15, 31 ->  "Pay day"
            in 1..14, in 16..30 -> "Spend day"
            else -> "Weird day"
        }
    }

    /**
     * Simple for loop to iterate through map
     */
    fun printMap(map: Map<String, Int>) {
        for((k, v) in map){
            println("Key is $k and value is $v")
        }
    }

}