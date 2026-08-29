package mate.academy

fun removeChars(str: String): String {
    return str.subSequence(1, str.length - 1).toString()
}
