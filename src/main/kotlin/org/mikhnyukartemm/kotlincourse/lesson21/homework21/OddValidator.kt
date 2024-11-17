package org.mikhnyukartemm.kotlincourse.lesson21.homework21

class OddValidator : Validator<Int> {
    override fun isValid(element: Int) = element % 2 == 0

}