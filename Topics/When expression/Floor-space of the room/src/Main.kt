import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    // write your code here
    val figure = readln()

    println(
        when (figure) {
            "triangle" -> {
                val a = readln().toDouble()
                val b = readln().toDouble()
                val c = readln().toDouble()

                val s: Double = (a + b + c) / 2
                sqrt(s * (s - a) * (s - b) * (s - c))
            }

            "rectangle" -> readln().toDouble() * readln().toDouble()

            "circle" -> 3.14 * readln().toDouble().pow(2.0)

            else -> "Not a shape"
        }
    )
}