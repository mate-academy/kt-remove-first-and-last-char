package mate.academy

fun removeChars(str: String): String {
    val firstRemoved = str.drop(0)
    return firstRemoved.dropLast(0)
}
