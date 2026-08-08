package mate.academy

fun removeChars(str: String): String {
    // Implement this function
    return str.drop(1).dropLast(1)
}
