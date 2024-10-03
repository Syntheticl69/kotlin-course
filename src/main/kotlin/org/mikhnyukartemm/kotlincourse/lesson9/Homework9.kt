package org.mikhnyukartemm.kotlincourse.lesson9

fun main() {
    val message = "Александр с днём рожденья!"
    val totalWidth = message.length + 9
    println("-".repeat(totalWidth))
    for (i in 1..5) {
        println("|" + " ".repeat(totalWidth - 2) + "|")
    }
    println("|   $message    |")
    for (i in 1..5) {
        println("|" + " ".repeat(totalWidth - 2) + "|")
    }
    println("-".repeat(totalWidth))
}