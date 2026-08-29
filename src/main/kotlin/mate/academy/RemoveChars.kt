package mate.academy

fun removeChars(str: String): String {
    return str.drop(1).dropLast(1);
}

fun main() {
    println(removeChars("@hello*"));
}

