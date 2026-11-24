package mate.academy

fun removeChars(str: String): String {
    val strRemovedChars = str.drop(1).dropLast(1)
    return strRemovedChars
}
