package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Printer

class InkjetPrinter : Printer() {
    override fun print(text: String) {
        val words = processText(text)
        var colorIndex = 0
        for (word in words) {
            val (textColor, backgroundColor) = Colors.colorPairs[colorIndex]
            println("$textColor$backgroundColor$word${Colors.RESET}")
            colorIndex = (colorIndex + 1) % Colors.colorPairs.size
        }
    }
}