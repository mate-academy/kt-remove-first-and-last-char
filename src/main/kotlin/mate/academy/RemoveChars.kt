package mate.academy
const val ONE = 1

fun removeChars(str: String): String {
    if (str != null && str.isNotEmpty()) {
        return str.substring(ONE, str.length - ONE)
    }
    return "";
}
