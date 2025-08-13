package mate.academy

fun removeChars(str: String): String {
    val firstRemoved = str.drop(1)
    return firstRemoved.dropLast(1)
}
