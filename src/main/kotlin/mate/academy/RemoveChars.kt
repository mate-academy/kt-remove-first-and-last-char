package mate.academy

fun removeChars(str: String): String {
    return str.substring(1..str.lastIndex - 1)
}
