package mate.academy

const val STRING_MIN_LENGTH = 3

fun removeChars(str: String): String {
    // Implement this function
    if (str.length < STRING_MIN_LENGTH) return ""
    return str.replaceRange(0, 1, "")
        .replaceRange(str.length - 2, str.length - 1, "")
}
