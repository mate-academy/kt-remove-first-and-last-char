package mate.academy

const val NUMBER_OF_CHARS_TO_DROP_FIRST = 1
const val NUMBER_OF_CHARS_TO_DROP_LAST = 1

fun removeChars(str: String): String {
    return str.drop(NUMBER_OF_CHARS_TO_DROP_FIRST).dropLast(NUMBER_OF_CHARS_TO_DROP_LAST)
}
