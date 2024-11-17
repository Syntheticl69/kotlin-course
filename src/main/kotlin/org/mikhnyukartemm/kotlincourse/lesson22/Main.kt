package org.mikhnyukartemm.kotlincourse.lesson22

import org.mikhnyukartemm.kotlincourse.lesson22.homework22.*

fun main() {

    val arrayNumb = arrayOf(24, 48, 85, 123)
    println(arrayNumb.funPairOfInts())

    'И'.funCharNull(12, 6, false)

    val mutableList = mutableListOf("тест1", "тест2", "тест3")
    println(mutableList.funChangeValue("string1", 3))

    val map: Map<Int?, List<Int>?> = mapOf(
        1 to listOf(5,10,15),
        2 to listOf(3, 13, 23)
    )
    println(map.funMapExt(2))

    val long : Long? = 1145
    println(long.funLongExt())

    val pair = Pair(9, 10)
    val pair1 = Pair("first", "second")
    val pair2 = Pair(null, "second not null")
    println(pair.revert())
    println(pair1.revert())
    println(pair2.revert())

    println(10.within(20,2))
    println(10.within(-0.5,175))

    println("test string encrypt".encrypt(6))
    println("test string decrypt".encrypt(6))

    val letters = listOf("P", "I", "D", "M", "A", "R", "K", "O", "Z")
    val users = listOf("Максим", "Илья", "Артем", "Дима", "Слава")
    letters.pidmarkoz(users)
}