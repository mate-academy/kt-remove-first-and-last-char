package mate.academy

fun removeChars(str: String): String {
    if (str.length <= 2) {
        return ""
    } else {
        return str.drop(1).dropLast(1)

    }

}
