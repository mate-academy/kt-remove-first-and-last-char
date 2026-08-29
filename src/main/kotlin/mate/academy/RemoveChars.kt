package mate.academy

fun removeChars(str: String): String {
    val result = str.dropLast(1).drop(1)
    return result
}
