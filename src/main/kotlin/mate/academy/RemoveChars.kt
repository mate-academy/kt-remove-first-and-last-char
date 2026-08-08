package mate.academy

const val INDEX = 1

fun removeChars(str: String): String {
    // Implement this function
    return str.dropLast(INDEX).drop(INDEX)
}
