package mate.academy

fun removeChars(str: String): String {
    // Implement this function
    if (str.length == 2) {
        println("")
    }
    return str.drop(1).dropLast(1)
}
