package org.mikhnyukartemm.kotlincourse.lesson22.homework22

//Кодер-декодер строк
//Реализуйте для класса String два метода расширения: encrypt и decrypt.

fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}