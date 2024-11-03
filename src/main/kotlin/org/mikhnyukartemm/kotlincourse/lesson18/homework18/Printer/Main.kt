package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Printer

fun main() {
    val text = "Пример длинного текста не знаю что сюда писать пусть будет так"

    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    println("\nЛазерный принтер:")
    laserPrinter.print(text)

    println("\nСтруйный принтер:")
    inkjetPrinter.print(text)

}