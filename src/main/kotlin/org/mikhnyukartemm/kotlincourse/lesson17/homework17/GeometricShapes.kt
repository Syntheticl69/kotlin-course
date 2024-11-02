package org.mikhnyukartemm.kotlincourse.lesson17.homework17

/*
Потренируйся в создании иерархии классов с расширением базовой сущности.
Для каждого задания опиши в коде базовый класс с базовыми свойствами и если применимо - методами.
Для произвольных классов также добавь особенные свойства. Детально описывать не нужно, упражнение на то, чтобы усвоить
иерархию наследования.

Геометрические Фигуры
Базовый класс: Геометрическая Фигура
Производные классы: Многоугольник, Круг
Дополнительное разветвление для многоугольника: Треугольник, Четырехугольник
 */

import kotlin.math.sqrt

open class GeometricShapes {
    open fun figurePerimeter(): Double {
        return TODO("Provide the return value")
    }
    open fun figureArea(): Double {
        return TODO("Provide the return value")
    }
}

open class Polygon(val sides: List<Double>) : GeometricShapes() {
    override fun figurePerimeter(): Double = sides.sum()
}

class Triangle(a: Double, b: Double, c: Double) : Polygon(listOf(a, b, c)) {
    override fun figureArea(): Double {
        val p = figurePerimeter() / 2 // Периметр делим на 2 для вычисления полупериметра
        val (a, b, c) = sides
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }
}

class Tetragon(a: Double, b: Double, c: Double, d: Double) : Polygon(listOf(a, b, c, d)) {
    override fun figureArea(): Double {
        // Для простоты используем формулу для прямоугольника
        // Если нужно, можно добавить другие методы для расчета площади.
        return TODO("Provide the area calculation for Tetragon")
    }

    override fun figurePerimeter(): Double {
        return sides.sum() // Периметр как сумма сторон
    }
}

class Circle(private val radius: Double) : GeometricShapes() {
    private val pi: Double = 3.14159
    override fun figureArea(): Double {
        return pi * radius * radius
    }

    override fun figurePerimeter(): Double {
        return 2 * pi * radius
    }
}