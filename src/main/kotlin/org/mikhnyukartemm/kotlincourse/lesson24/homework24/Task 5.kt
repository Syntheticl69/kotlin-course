package org.mikhnyukartemm.kotlincourse.lesson24.homework24

class AnotherCustomExeption(
    cause: ArrayIndexOutOfBoundsException
) : RuntimeException("ArrayIndexOutOfBoundsException") {
}