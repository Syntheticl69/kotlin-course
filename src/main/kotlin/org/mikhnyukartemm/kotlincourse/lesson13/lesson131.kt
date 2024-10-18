package org.mikhnyukartemm.kotlincourse.lesson13

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)
    if (numbers.size < 6) {
        println("Ok")
    }

    numbers.isEmpty()
    numbers.isNotEmpty()

    val defValue = numbers.getOrElse(22) { it }
    println(defValue)

    val ageArmy = listOf(17, 19, 18, 25, 38, 29)

    println(ageArmy.filter { it in 18..30 })

}