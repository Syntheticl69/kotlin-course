package org.mikhnyukartemm.kotlincourse.lesson21.homework21

class StringValidator : Validator<String?> {
    override fun isValid(element: String?): Boolean {
        return !element.isNullOrBlank()
    }
}