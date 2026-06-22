package mate.academy

fun removeChars(str: String): String {
    val withoutFirstChar = str.drop(1)
    return withoutFirstChar.dropLast(1)
}
