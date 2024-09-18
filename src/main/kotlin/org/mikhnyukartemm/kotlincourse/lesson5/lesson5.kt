package org.mikhnyukartemm.kotlincourse.lesson5
fun main() {

    val sum = "5" + "3"
    val dif = 10 - 5
    val quotient = 10 * 5
    val remainder = 10 % 5
    val remainder2 = 10 % 6
    val isEqual = 5 == 4
    val isNotEqual = (5 != 5)
    val isGreater = (5 > 3)
    val isLesser = (5 < 3)
    val isGreaterOrEqual = (5 >= 3)
    val isLesserOrEqual = (5 <= 3)
    val andResult = false && false
    val orResult = true || false
    val notResult = !(5 > 3)
    var number = 5
    number += 3
    number /= 2

    val a = (3 + 2 < 6) && (4 * 2 == 8) // true
    (10 - 5 >= 5) || (2 * 3 != 6) // true
    (8 / 2 == 4) && (7 % 3 != 1)// false
    (9 - 3 >= 6) && (8 / 2 != 4) // false
    ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1) // true
    ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2) // true
    ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4) //true
     ((9 + 2) < 12) && (15 % 4 != 3) || !(4 * 2 == 8) // false
    val b = ((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6)
    val defaultName = "Unknown"

    var name: String? = "we"

    val result = name ?: throw Exception("Не может быть  null")  //  Если нейм равен налл  то анкноу

    fun printPrice(price: Double, s: Int?){
        val koef = (100 - (s ?: 0))/ 100.0
        println()
    }
println(b)
}



