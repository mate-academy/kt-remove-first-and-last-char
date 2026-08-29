package mate.academy

fun removeChars(str: String): String {
    // Implement this function
    return if (str.length > 2) str.substring(1, str.length - 1) else ""
}
