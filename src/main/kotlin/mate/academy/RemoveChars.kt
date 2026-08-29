package mate.academy

const val COUNT = 1

fun removeChars(str: String): String {
    val dropFirst :String = str.drop(COUNT)
    val dropLast: String = dropFirst.dropLast(COUNT)
    return dropLast
}
