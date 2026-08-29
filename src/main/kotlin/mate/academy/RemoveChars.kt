package mate.academy

const val STR = "XihorX"

fun main() {
    println(removeChars(STR))
}

fun removeChars(str: String): String {
    return str.drop(1).dropLast(1)
}
