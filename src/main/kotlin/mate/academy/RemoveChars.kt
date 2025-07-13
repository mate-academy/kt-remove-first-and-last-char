package mate.academy

fun removeChars(str: String): String {
    if (str.length <= 2) {
        return ""
    }else {
        return srt.drop(1).dropLast(1)
    }
}
