package mate.academy

const val INDEX = 1

fun removeChars(str: String): String {
    return str.drop(INDEX).dropLast(INDEX)
}
