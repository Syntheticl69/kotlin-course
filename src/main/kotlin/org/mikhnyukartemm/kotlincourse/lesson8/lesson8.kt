package org.mikhnyukartemm.kotlincourse.lesson8

fun  main() {
//    val simpleString = "Это простая строка"
//
//    val firstName = "Ivan"
//    val lastName = "Ivanov"
//    val fullName = firstName + " " + lastName
//
//    val age = 30
//    val greeting = "Privet! Меня зовут $firstName, и мне $age лет."
//
//    println(greeting)
//
//    val  person = Person("Artem", 21)
//    val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет."
//    println(introduction)
//
//
//    val x = 10
//    val y = 20
//    val resultString = "Результат сложения x и y ${x + y}"
//    println(resultString)
//class Person(val name: String, val age: Int)
//     val originalString = "Kotlin is fun"
//    val subString = originalString.substring(7)
//    val subString2 = originalString.substring(3, 6)
//    val replacedString = originalString.replace("n", "w")
//    val words = originalString.split(" ")
//    val length = "Hello".length
//    val upper = "hello".uppercase()
//    val lower = "HELLO".lowercase()
//    val trimmed = "  hello   .".trim( 'h', '.', ' ')
//    val starts = "Kotlin".startsWith("Kot")
//    val ends = "Kotlin".endsWith("lin")
//    val contains = "Hello".contains("ell")
//    val e: String? = null
//    val empty = e.isNullOrEmpty()
//
//    val blank = " ".isNullOrBlank()
//    val repeat = "ab".repeat(3)
//    val letter = originalString[5]
//    val indexOfChar = "Kotlin".indexOf('t')
//    val indexOfWord = "Kotlin is the best language".indexOf("best")
//    val backReverse = "niltoK".reversed()
//    val multiLineString = """
//    Первая строка
//    Вторая строка
//    Третья строка
//""".trimIndent()
//
//    val name = "Алексей"
//    val city = "Москва"
//    val age = 32
//    val friendsCount = 1052
//    val rating = 4.948
//    val balance = 2534.75856
//    val text = """
//   Имя: %s
//   Город: %s
//   Возраст: %d
//   Количество друзей: %,d
//   Рейтинг пользователя: %.1f
//   Баланс счета: $%,.2f
//""".trimIndent()
//    println(text.format(name, city, age, friendsCount, rating, balance)



   fun convert(string: String): String {
      return when{
          string.startsWith("Ошибка", true) -> string.replace("Ошибка", "Небольшое недорозумение ")
          string.endsWith("Важно", true) -> "$string ... но не критично "
          else -> ""
      }


   }
    println(convert("Ошибка"))
    val text1 = "Kotlin: The Fun Way to Learn Programming"
    println(text1.substring(8, 19))
    val text2 = "contact2341@example.com"
    val indexOfAt = text2.indexOf('@')
    println(text2.substring(indexOfAt + 1))


    val number = "123-456-7890"
    val subString = number.substring(8)
    println("XXX-XXX-$subString")
}




