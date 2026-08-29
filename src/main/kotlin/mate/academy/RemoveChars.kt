package mate.academy

const val CHARACTERS_REMOVED_START = 1
const val CHARACTERS_REMOVED_END = 1

fun removeChars(str: String): String {
    // Implement this function
    return str.drop(CHARACTERS_REMOVED_START).dropLast(CHARACTERS_REMOVED_END)
}
