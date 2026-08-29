package mate.academy
const val INDEX = 1

fun removeChars(str: String): String {
    var str = str.drop(INDEX)
    str = str.dropLast(INDEX)
    return str
}
