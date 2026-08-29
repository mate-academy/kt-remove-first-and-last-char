package mate.academy

private const val ONE_CHAR = 1

fun removeChars(str: String): String {
    return str.drop(ONE_CHAR).dropLast(ONE_CHAR)
}
