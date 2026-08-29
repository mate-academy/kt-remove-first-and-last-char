package mate.academy

fun removeChars(str: String): String {
    var str1 = str.drop(1)
    str1 = str1.dropLast(1)
    return str1
}
