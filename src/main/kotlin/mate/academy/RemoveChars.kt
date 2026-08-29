package mate.academy

fun removeChars(str: String): String {
    var removeFirst = str.drop(1)
    var removeLast = removeFirst.dropLast(1)
    return removeLast
}
