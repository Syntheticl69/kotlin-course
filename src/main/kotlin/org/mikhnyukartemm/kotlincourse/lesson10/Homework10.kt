package org.mikhnyukartemm.kotlincourse.lesson10

fun main() {
//    Задание 1: Создание и Инициализация Массива
//    Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val array1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(array1.toList())

//    Задание 2: Создание Пустого Массива
//    Создайте пустой массив строк размером 10 элементов.
    val array2 = Array(10) { "" }
    println(array2.toList())

//    Задание 3: Заполнение Массива в Цикле
//    Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val array3 = Array<Double>(5) { 0.0 }
    for (i in array3.indices) {
        array3[i] = (i * 2.0)
    }
    println(array3.toList())

//    Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3
    val array4 = Array<Int>(5) { 0 }
    for (i in array4.indices) {
        array4[i] = (i + 3)
    }
    println(array4.toList())

//    Задание 5: Работа с Nullable Элементами
//    Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val array5 = arrayOfNulls<String>(3)
    array5[0] = null
    array5[1] = "123"
    array5[2] = "456"
    println(array5.toList())

//    Задание 6: Копирование Массива
//    Создайте массив целых чисел и скопируйте его в новый массив в цикле.\
    val array6 = arrayOf(1, 2, 3, 4, 5)
    val arrayNew = Array(5) { 0 }

    for (i in array6.indices) {
        arrayNew[i] = array6[i]
    }
    println(arrayNew.toList())

//    Задание 7: Разница Двух Массивов
//    Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    val array7 = arrayOf(1, 2, 3)
    val array71 = arrayOf(25, 101, 87)
    val array72 = Array(3) { 0 }

    for (i in array7.indices) {
        array72[i] = array71[i] - array7[i]

    }
    println(array72.toList())

//    Задание 8: Поиск Индекса Элемента
//    Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1.
//    Реши задачу через цикл while.
    val array8 = arrayOf(23, 5, 1, 5)
    var i = 0

    while (i in array8.indices) {
        val index = array8[i]
        if (index == 5) {
            println(index)
        } else {
            println(-1)
        }
        i++
    }

    //Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента
//в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val array9 = arrayOf(37,120,24,11,87)
    for (i in array9.indices) {
        if (array9[i]%2 == 0) {
            println("${array9[i]} - чётное")
        }
        else {
            println("${array9[i]} - не чётное")
        }
    }


}