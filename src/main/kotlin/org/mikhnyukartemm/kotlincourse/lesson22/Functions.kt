package org.mikhnyukartemm.kotlincourse.lesson22

import org.mikhnyukartemm.kotlincourse.lesson22.extensions.removeSpaces

fun main() {
    val result = " Строчка с пробелами".removeSpaces()
    println(result)

    val s: List<Int?> = listOf(1, null)
    s.isElementsNullOrEmpty()
}


fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}