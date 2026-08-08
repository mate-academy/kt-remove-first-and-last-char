package mate.academy

fun removeChars(str: String): String = str.drop(CHARS_TO_DROP).dropLast(CHARS_TO_DROP)

const val CHARS_TO_DROP = 1
