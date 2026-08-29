package mate.academy

const val NUMBER_OF_SYMBOLS_TO_REMOVE = 1;

fun removeChars(str: String): String {
    return str.drop(NUMBER_OF_SYMBOLS_TO_REMOVE).dropLast(NUMBER_OF_SYMBOLS_TO_REMOVE);
}
