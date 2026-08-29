package mate.academy

fun removeChars(str: String): String {
    return str.dropLast(1).drop(1)
}
