package mate.academy

const val MIN_LENGTH: Int = 2

fun removeChars(str: String): String {
    if (str.length <= MIN_LENGTH) {
        return ""
    }else {
        return str.drop(1).dropLast(1)
    }
}
