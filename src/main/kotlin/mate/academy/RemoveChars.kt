package mate.academy

const val REMOVED_CHARS = 1
fun removeChars(str: String): String {
    return str.dropLast(REMOVED_CHARS).drop(REMOVED_CHARS)
}
