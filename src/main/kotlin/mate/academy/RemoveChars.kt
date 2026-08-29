package mate.academy

fun main() {
    println(removeChars("string"))
}
fun removeChars(str: String): String {
    return str.drop(1).dropLast(1)
}
