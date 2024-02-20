package mate.academy

private const val ONE = 1

fun removeChars(str: String): String {
    return str.substring(ONE, str.length - ONE)
}
