package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Printer

abstract class Printer {

    abstract fun print(text: String)

    protected fun processText(text: String): List<String> {
        return text.split(" ")
    }
}
