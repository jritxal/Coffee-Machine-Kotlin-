fun main() {
    // write your code here
    val input = readln().split(" ")
    val a = input[0].toLong()
    val op = input[1]
    val b = input[2].toLong()

    println(
        when (op) {
            "+" -> a + b
            "-" -> a - b
            "/" -> {
                if (b == 0L) {
                    "Division by 0!"
                } else
                    a / b
            }

            "*" -> a * b
            else -> "Unknown operator"
        }
    )
}