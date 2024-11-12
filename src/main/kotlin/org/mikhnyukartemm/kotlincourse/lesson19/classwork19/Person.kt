package org.mikhnyukartemm.kotlincourse.lesson19.classwork19

open class Person(private val name: String, protected val age: Int) {

    // Публичный метод
    fun greet() {
        println("Привет, меня зовут $name.")
    }

    // Защищённый метод
    protected fun getName(pin: String): String {
        if (pin == "123") return name
        return ""
    }

    // Приватный метод
    private fun secret() {
        println("Это секретный метод.")
    }
}