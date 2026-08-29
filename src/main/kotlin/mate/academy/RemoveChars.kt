package mate.academy

fun removeChars(str: String): String {
    str.drop(1).dropLast(1).let {
        return it
    }
}
