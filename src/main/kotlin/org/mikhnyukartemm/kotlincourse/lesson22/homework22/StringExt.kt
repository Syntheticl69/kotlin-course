package org.mikhnyukartemm.kotlincourse.lesson22.homework22

//Кодер-декодер строк
//Реализуйте для класса String два метода расширения: encrypt и decrypt.

fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

//Напиши метод расширения строки, который будет принимать список имён пользователей и
// выводить в консоли эту строку побуквенно в столбик: имя автора и букву под ним.

fun List<String>.pidmarkoz(listUsers: List<String>) {
    for (i in 0 until this.size) {
        val user = listUsers.getOrNull(i)
        val letter = this.getOrNull(i)
        println("$user, $letter")
    }
}