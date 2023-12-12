enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");
}

fun belongs(colorToCheck: String): Boolean {
    for (color in Rainbow.values()) {
        if (color.color == colorToCheck) {
            return true
        }
    }
    return false
}

fun main() {
    // put your code here
    val color = readln()
    println(belongs(color))
}