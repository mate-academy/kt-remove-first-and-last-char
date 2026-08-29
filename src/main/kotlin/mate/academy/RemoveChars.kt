package mate.academy

const val DELETE_NUMBER = 1

fun removeChars(str: String): String {
    return return str.drop(DELETE_NUMBER).dropLast(DELETE_NUMBER)
}
