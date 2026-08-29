package mate.academy

fun removeChars(str: String): String {
    // Implement this function
    return if (str.length <= 2) "" else
        str.drop(1).dropLast(1)
}
