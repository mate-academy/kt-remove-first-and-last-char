package mate.academy

const val BOOK = "book"
const val REMOVED_CHARS_NUMBER = 1

fun main() {
    println(removeChars(BOOK))
}

fun removeChars(str: String): String {
    return str.drop(REMOVED_CHARS_NUMBER).dropLast(REMOVED_CHARS_NUMBER)
}
