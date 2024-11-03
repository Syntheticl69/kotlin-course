package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Printer

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = processText(text)
        for (word in words) {
            println("${Colors.BLACK}${Background.WHITE}$word${Colors.RESET}${Background.RESET}")
        }
    }
}