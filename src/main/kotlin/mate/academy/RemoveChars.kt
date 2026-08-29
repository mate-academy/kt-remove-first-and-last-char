package mate.academy

fun removeChars(str: String): String {
    return if (str.length <= 2) {
        ""
    } else {
        str.substring(1, str.length - 1)
    }
}
