package mate.academy

fun removeChars(str: String): String {
    val res: String = str.dropLast(1)
    return res.drop(1)
}
