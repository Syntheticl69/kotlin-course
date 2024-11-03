package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Printer

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"

    val colorPairs = listOf(
        Pair("\u001B[31m", "\u001B[47m"), // Красный текст на белом фоне
        Pair("\u001B[32m", "\u001B[43m"), // Зеленый текст на желтом фоне
        Pair("\u001B[34m", "\u001B[45m"), // Синий текст на фиолетовом фоне
        Pair("\u001B[35m", "\u001B[46m"), // Фиолетовый текст на голубом фоне
        Pair("\u001B[36m", "\u001B[41m")  // Голубой текст на красном фоне
    )
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}