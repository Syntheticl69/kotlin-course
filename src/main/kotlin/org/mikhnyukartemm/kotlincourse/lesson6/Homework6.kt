package org.mikhnyukartemm.kotlincourse.lesson6

fun main (){

}
//ЗАДАЧА1 Напишите функцию, которая на основе номера месяца возвращает сезон года.
fun convertYear(year: Int) : String {
    return when (year) {
        in 1..2 -> "Zima"
        in 3 .. 5 -> "Vesna"
        in 6 .. 8 -> "Leto"
        in 9 ..11 -> "Osen"
        in 12 .. 1 -> "Zima"
        else -> "nvalid year"

    }
}

//ЗАДАЧА2 ч"Расчет Возраста Питомца" Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
fun convertAge(age: Int): String{
  return  when (age){
      in 0 .. 2 -> "10.5"
      in 2 ..  30 -> "4"
      else -> "nvalid Age"

  }

}

// Задача3 "Определение Вида Транспорта" Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
fun typeOfTransport(transport: Int): String{
    return when (transport){
        in 0 .. 1000 -> "Пешком"
        in 1001 .. 5000 -> "Велосипед"
        else -> "Автомобиль"
    }
}
//Задача4 "Расчет Бонусных Баллов" Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
fun calculateBonusPoints(purchaseAmount: Double): Double{
    return when {
        purchaseAmount < 0 -> 0.0
        purchaseAmount <= 1000 -> (purchaseAmount / 100 * 2)
        else -> (10 + (purchaseAmount - 1000) / 100 * 5)
    }
}

//Задача 5 Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
fun  fileType(extension: String): String{
    return when (extension){
        "txt", "doc" -> "Текстовый документ"
        "png" -> "Изображение "
        "xls" -> "Таблица"
        else -> "Неизвестный тип"
    }
}
// Задача6 Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку. Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия
fun convertTemperature(degrees: Double, unit: String): String {

 if  (unit == "C" ){
    val result = (degrees * 9 / 5) + 32
    return "$result F"}
      if (unit == "F"){
    val resultTwo = ((degrees - 32) / 1.8)
        return "$resultTwo C "
}
else {"Не корректные данные "
}
//Задача7 Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

val temperature = 0
when {
    temperature <= 0 -> println("куртка и шапка")
    temperature in 0..15 -> println("футболка и шорты")
    temperature in -30..35 -> println("не выходить из дома")
    else -> "не корректная температура "
}

//Задача8  "Выбор Фильма по Возрасту"Контекст: Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".
fun movieСategories(year: Int) : String{return when (year) {
    in 0..12 -> {
        "Детские"
    }

    in 13..17 -> {
        "Подростковые"
    }

    in 18..100 -> {
        "18+"
    }

    else -> {
        "Не кореектный возраст"
    }
}







