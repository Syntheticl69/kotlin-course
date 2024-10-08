@file:Suppress("UNUSED_EXPRESSION")

package org.mikhnyukartemm.kotlincourse.lesson5
//Простой уровень
//(12 / 3 > 3) && (5 * 2 == 10) пример решения: true && true = true
//(14 - 4 <= 10) || (6 / 2 != 3) true||false = true
//(9 + 1 == 10) && (8 % 2 == 0) true && false = true
//(7 - 2 < 5) || (4 * 3 != 12) false || false = false
//(18 / 6 >= 3) && (5 + 5 == 10) true && true = true
//(11 % 3 != 2) || (9 - 3 == 6) false || true = true
//(5 * 2 < 11) && (14 / 2 == 7) true && true = true
//(8 + 2 <= 10) || (7 % 2 != 1) true || false = true
//(16 / 4 > 3) && (3 + 4 == 7) true && true = true
//(10 % 2 == 0) || (5 - 3 != 1) false || true = true
//
//
//Сложный уровень
//((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1) true && false || false = false
//((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7) true || true && true = true
//((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0) true && True || false = true
//((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8) false && false || true = true
//((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6) true || false && false = false
//
//
//Продвинутый уровень
//(var f = 6; --f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5)) true || true && false = true
//((var g = 0; g++ != 0) && (4 + 2 == 6)) || (5 / 1 == 5) false && true || true = true
//(var h = 7; h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1) true || true && false = true
//((var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5) true || false & true = true
//(var j = 4; j-- < 4) && ((6 + 0 == 6) || (5 % 2 != 1)) false && true || false = false



fun main() {
    printSound(100.0, 0.8)
    printSound(50.0, null)

    printfullShippingCoast(200.0,)
    printfullShippingCoast(null)

    printgetPressureReading("123")
    printgetPressureReading(null)
}
fun  printSound(sound: Double, attenuationCoefficient: Double?){
    val koef = attenuationCoefficient ?: (0.5) // если значение слева null использовать значение с права
    println(sound * koef)

}
fun printfullShippingCoast(cargoValue: Double?, ){
    val effectiveCargoValue = cargoValue ?: 50.0
    val insurance = effectiveCargoValue * 0.05
    println(effectiveCargoValue + insurance)
}

fun printgetPressureReading(report: String?){
    println(report ?: throw Exception("Нет отчета"))
}

//printCargoCost (insurance: Double = 0.5, cargo: Double?) {
//val cost = (((insurance / 100.0) * (cargo ?: 50.0)) + (cargo ?: 50.0))
//printin (cost)

fun convertTemperature(degrees: Double, unit: String): String {

    if (unit == "C") {
        val result = (degrees * 9 / 5) + 32
        return "$result F"
    }
    return if (unit == "F") {
        val resultTwo = ((degrees - 32) / 1.8)
        return "$resultTwo C "
    } else {
        "Не корректные данные "
    }
}