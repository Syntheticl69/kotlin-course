package org.mikhnyukartemm.kotlincourse.lesson13

import org.mikhnyukartemm.kotlincourse.lesson12.sum

fun main() {
//    Задачи на приведение коллекций к значению

//    1. Проверить, что размер коллекции больше 5 элементов.
    val collection1 = listOf(1, 2, 3, 4, 5, 6)
    println(collection1.size < 5)
//    2. Проверить, что коллекция пустая
    val collection2 = listOf<Int>()
    println(collection2.isEmpty())
//    3. Проверить, что коллекция не пустая
    val collection3 = listOf(1, 2, 3, 4)
    println(collection3.isNotEmpty())
//    4. Взять элемент по индексу или создать значение если индекса не существует
    val collection4 = listOf(1, 2, 3, 4)
    println(collection4.getOrElse(2) { 0 })

//    5. Собрать коллекцию в строку
    val collection5 = listOf(1, 2, 3, 4)
    println(collection5.joinToString(separator = "|"))

//    6. Посчитать сумму всех значений
    val collection6 = listOf(1, 2, 3, 4)
    println(collection6.sum())

//    7. Посчитать среднее
    val collection7 = listOf(1, 2, 3, 4, 5)
    println(collection7.average())

//   8. Взять максимальное число
    val collection8 = listOf(1, 2, 3, 4, 5)
    println(collection8.maxOrNull())

    //   9. Взять максимальное число
    val collection9 = listOf(1, 2, 3, 4, 5)
    println(collection9.minOrNull())

//   10. Взять первое число или null
    val collection10 = listOf<Int>()
    println(collection10.firstOrNull())

//    11. Проверить что коллекция содержит элемент
    val collection11 = listOf(1, 2, 3, 4, 5)
    println(collection11.contains(2))

//    Задачи на обработку коллекций

//    1. Отфильтровать коллекцию по диапазону 18-30
    val collection12 = listOf(13, 18, 24, 30, 40)
    println(collection12.filter { it in 18..30 })

//    2. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val collection13 = listOf(10, 20, 60)
    println(collection13.filter { it % 2 != 0 || it % 3 != 0 })

//    3. Очистить текстовую коллекцию от null элементов
    val collection14 = listOf("123", null, "456")
    println(collection14.filterNotNull())

//    4. Преобразовать текстовую коллекцию в коллекцию длин слов
    val collection15 = listOf("Привет", "Саша", "Как дела")
    println(collection15.map { it.length })

//    5. Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    println(collection15.associate{ collection15 -> collection15 to collection15.reversed()})

//   6. Отсортировать список в алфавитном порядке
    println(collection15.sorted())

//    7. Отсортировать список по убыванию
    println(collection12.sortedDescending())

//    8. Распечатать квадраты элементов списка
    val collection18 = listOf(1, 2, 3, 4, 5, 6)
   collection18.forEach{
    println (it * it)
   }

//    9. Группировать список по первой букве слов
    println(collection15.groupBy { it.first() })

//    10. Очистить список от дублей
    val collection19 = listOf("1", "2", "3", "2")
    println(collection19.distinct())

//    11. Взять первые 3 элемента списка
    val collection20 = listOf(1, 2, 3, 4, 5, 6)
    println(collection20.take(3))
//    12. Взять последние 3 элемента списка
    val collection21 = listOf(1, 2, 3, 4, 5, 6)
    println(collection21.takeLast(3))



    //почему-то другие условия не проверяются?
//    Задание 3: Анализ Учебных Оценок
//    Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//    Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(((grades.filter { it>=60 }).sorted()).take(3))
//    Задание 4: Создание каталога по первой букве.
//    Начальные значения: val list = listOf(
//        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина",
//        "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка",
//        "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус",
//        "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник",
//        "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")
//    Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.
    val list = listOf("Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")
    println((list.map { it.lowercase() }).groupBy { it[0] })
//    Задание 5: Подсчёт средней длины слов в списке.
//    Начальные значения из задачи 3.
//    Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вывести форматированный текст с двумя
//    знаками после запятой.

    val words = listOf("hello")
 println(words.map { it.length }.average())
    
//    Задание 6: Категоризация чисел.
//    Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//    Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(numbers.distinct().sorted().groupBy { if (it % 2 == 0) "четные" else "нечетные"})
//    Задание 7: Поиск первого подходящего элемента
//    Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
//    Цель: Найти первый возраст в списке, который соответствует условию (больше 18), преобразовать его к строке, или
//    вернуть сообщение "Подходящий возраст не найден".
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    val firstSuitableAge = ages.firstOrNull { it != null && it > 18 }?.toString() ?: "Подходящий возраст не найден"
    println(firstSuitableAge)
    //    Задание 2: Характеристика числовой коллекции
//    Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя
//    конструкцию when.
//    Вызвать метод с данными, подходящими под каждую из веток
    println(task2(emptyList())) // Пусто
    println(task2(listOf(1, 2, 3))) // Короткая
    println(task2(listOf(0, 1, 2, 3))) // Стартовая
    println(task2(listOf(10000, 5000, 6000))) // Массивная
    println(task2(listOf(10, 10, 10))) // Сбалансированная
    println(task2(listOf(1, 2, 3, 4, 5, 6))) // Уникальная
    println(task2(listOf(-11, -20, -30))) // Отрицательная
    println(task2(listOf(1001, 1002))) // Положительная
    println(task2(listOf(3, 14, 5))) // Пи***тая

    //Почему-то криво проверяется не могу понять почему так
}
fun task2(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.first() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.maxOrNull() ?: Int.MIN_VALUE < -10 -> "Отрицательная"
        numbers.minOrNull() ?: Int.MAX_VALUE > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальна"
    }
}
