package mate.academy

fun removeChars(str: String): String {
    var result = str.drop(1).dropLast(1)
    return result
}
fun main() {
    println(removeChars("abcdef"))
}
