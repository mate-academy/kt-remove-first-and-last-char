package mate.academy

fun removeChars(str: String): String {
    if (str.length < 2) {
        return ""
    }

    return str.slice(str.indices.drop(1).dropLast(1))

}

fun main() {
    println("book -> ${removeChars("book")}")
    println("house -> ${removeChars("house")}")
    println("us -> ${removeChars("us")}")
}
