package mate.academy

fun removeChars(str: String): String {
    return if (str.length > 2) {
        str.drop(1).dropLast(1) // Видаляємо перший і останній символ
    } else {
        "" // Якщо рядок занадто короткий, повертаємо порожній рядок
    }
}
