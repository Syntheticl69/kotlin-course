package org.mikhnyukartemm.kotlincourse.lesson15

fun main() {
    val person = Person("John", 30)
    person.sayHello()

    Logger.setData(5)
    Logger.log("fdf")

    val result = Calculator.add(1, 4)
    println("Result: $result")

    Calculator.VERSION



}