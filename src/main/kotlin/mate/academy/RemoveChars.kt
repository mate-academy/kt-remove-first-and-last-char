package mate.academy

const val ONE = 1

fun removeChars(str: String): String {
    return str.drop(ONE).dropLast(ONE)
}
