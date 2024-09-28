package org.mikhnyukartemm.kotlincourse.lesson8

fun main(){
//    Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
//    делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.


    fun convert(string: String): String {
        return when {
            string.contains("невозможно", ) -> string.replace("невозможно", "совершенно точно возможно, просто требует времени")
            string.startsWith("Я не уверен", ) -> "$string , но моя интуиция говорит об обратном"
            string.contains("катастрофа", ) -> string.replace("катастрофа", "интересное событие")
            string.endsWith("без проблем", ) -> string.replace("без проблем", "с парой интересных вызовов на пути")
            string.split(" ").size == 1 -> "Иногда, $string , но не всегда"

            else -> ""
        }
    }
    println(convert("удача"))

//    Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
    val text1 = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    println(text1.substring(32, 42))
    println(text1.substring(43, 51))

//    Задание 2: Маскирование Личных Данных
    val number = "4539 1488 0343 6467"
    val subString = number.substring(15)
    println("XXXX XXXX XXXX $subString")

//    Задание 3: Форматирование Адреса Электронной Почты. Используй replace
    val text = "username@example.com"
    val replace = text.replace("@", " [at] ")
        .replace(".", " [dot] ")
    println(replace)
}