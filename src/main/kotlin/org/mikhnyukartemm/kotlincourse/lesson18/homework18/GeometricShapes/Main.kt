package org.mikhnyukartemm.kotlincourse.lesson18.homework18.GeometricShapes
/*Геометрические Фигуры и Их Площадь
Абстрактный (базовый) класс: Shape с open методом area().
Классы наследники: Circle, Square, Triangle.
Метод area() возвращает 0.0.
Переопределите метод area() в каждом классе-наследнике для расчета площади соответствующей фигуры.
Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие вычислить площадь (для круга это радиус, для квадрата это сторона, для треугольника это две стороны и угол между ними)
Создай набор геометрических фигур и выведи в цикле их площадь
 */


fun main() {

    val shapes: List<Shape> = listOf(
        Circle(10.0),
        Square(4.0),
        Triangle(3.0, 4.0, 60.0)
    )

    // Выводим площади фигур
    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }

}