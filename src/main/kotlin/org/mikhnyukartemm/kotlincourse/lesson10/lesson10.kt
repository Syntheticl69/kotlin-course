package org.mikhnyukartemm.kotlincourse.lesson10

fun main() {
    // Массивы
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" }
    val emptyNullableArray = arrayOfNulls<Int>(5)

    // Список
    val readOnlyList: List<String> = listOf("a", "b", "c") // Не изменяемая

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") // Изменяемая

    // Множество
    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5) // Индексов нет

    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    println(doubles[0])

    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("'${list[index--]}'")
    }
    val array = Array(100) { 0 }

    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
//Массивы
    val array1 = Array(10) { 0 }
    array1[0] = 10
    for (i in array1.indices) {
        array1[i] = (i * 1) * 10
    }
    println(array1.toList())

    val array2 = arrayOf("q", "w", "e", "r", "t")
    for (q in array2.indices) {
        array2[q] = " "
    }
    println(array2.toList())

    val array3 = arrayOf(1, 2, 3)
    val array4 = arrayOf(4, 5, 6)
    val array5 = Array(3) { 0 }
    for (i in array5.indices) {
        array5[i] = array3[i] + array4[i]
    }
    println(array5.toList())
// Списки
    val readList = listOf<Int>() // Пустой неизменяемый список

    val list2 = listOf("w", "e", "r")
    for (i in list2) {
        println(i)
    }

    val list3 = mutableListOf<Float>()
    list3.add(12f)
    list3.add(32f)
    list3.remove(12f)
    list3.removeAt(0)
    println(list3)


    // Множества
    val emptySet = setOf<Int>()

    val setNum = setOf(1, 2, 3, 4, 5)

    val setNum2 = mutableSetOf(1, 2, 3)
    setNum2.add(6)
    setNum2.remove(2)
    println(setNum2)

    for (i in setNum2) {
        println(i * i)
    }

    val set1 = setOf(1, 2, 3)
    val set2 = setOf(3, 4, 5, 6, 7, 8, 9)
    val emptySet1 = mutableSetOf<Int>()

    for (i in set1) {
        emptySet1.add(i)
    }
    for (i in set2) {
        emptySet1.add(i)
    }
    println(emptySet1)


}

fun findNumber(setNum: Set<Int>, num: Int): Boolean {
    for (i in setNum) {
        if (i == num) {
            return true
        }
    }
    return false
}
