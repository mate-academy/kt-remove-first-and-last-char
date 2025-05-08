package mate.academy

const val REMOVED_CHARS_COUNT = 1

fun removeChars(str: String): String {
    return str.drop(REMOVED_CHARS_COUNT).dropLast(REMOVED_CHARS_COUNT)
}
