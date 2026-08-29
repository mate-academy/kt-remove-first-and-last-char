package mate.academy

fun removeChars(str: String): String {
    var a = str.drop(1)
    return a.dropLast(1)
}
