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
    println(collection15.associate { it to it.reversed() })

//   6. Отсортировать список в алфавитном порядке
    println(collection15.sorted())

//    7. Отсортировать список по убыванию
    println(collection12.sortedDescending())

//    8. Распечатать квадраты элементов списка
    val collection18 = listOf(1, 2, 3, 4, 5, 6)
    collection18.forEach {
        println(it * it)
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


    val grade = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(
        ((grade.filter { it >= 60 })
            .sorted())
            .take(3)
    )


//    Задание 4: Создание каталога по первой букве.
//    Начальные значения: val list = listOf(
//        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина",
//        "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка",
//        "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус",
//        "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник",
//        "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")
//    Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.


    val list = listOf(
        "Стол",
        "табурет",
        "ваза",
        "Кружка",
        "Зеркало",
        "ковер",
        "Шкаф",
        "часы",
        "Люстра",
        "подушка",
        "Картина",
        "столик",
        "Вазон",
        "шторы",
        "Пуф",
        "книга",
        "Фоторамка",
        "светильник",
        "Коврик",
        "вешалка",
        "Подставка",
        "телевизор",
        "Комод",
        "полка",
        "Абажур",
        "диван",
        "Кресло",
        "занавеска",
        "Бра",
        "пепельница",
        "Глобус",
        "статуэтка",
        "Поднос",
        "фигурка",
        "Ключница",
        "плед",
        "Тумба",
        "игрушка",
        "Настенные часы",
        "подсвечник",
        "Журнальный столик",
        "сувенир",
        "Корзина для белья",
        "посуда",
        "Настольная лампа",
        "торшер",
        "Этажерка"
    )
    println((list.map { it.lowercase() })
        .groupBy { it[0] })


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
    println(numbers.distinct().sorted().groupBy { if (it % 2 == 0) "четные" else "нечетные" })
//    Задание 7: Поиск первого подходящего элемента
//    Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
//    Цель: Найти первый возраст в списке, который соответствует условию (больше 18), преобразовать его к строке, или
//    вернуть сообщение "Подходящий возраст не найден".

    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    println(ages.filterNotNull().firstOrNull { it > 18 }?.toString() ?: "Подходящий возраст не найден")


    //    Задание 2: Характеристика числовой коллекции
//    Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя
//    конструкцию when.
//    Вызвать метод с данными, подходящими под каждую из веток
    val empty = listOf<Int>()
    println(task2(empty))
    val short = listOf<Int>(1, 2, 3)
    println(task2(short))
    val start = listOf<Int>(0, 1, 2, 3, 4, 5)
    println(task2(start))
    val massive = listOf<Int>(10, 100, 1000, 10000, 100000)
    println(task2(massive))
    val balanced = listOf<Int>(10, 10, 10, 10, 10, 10)
    println(task2(balanced))
    val sticky = List(20) { 1 }
    println(task2(sticky))
    val negative = listOf<Int>(-100, -99, -10, -50, -60)
    println(task2(negative))
    val positive = listOf<Int>(1001, 10000, 100000, 1000000, 10000001)
    println(task2(positive))
    val pussy = listOf<Int>(1, 2, 3, 10, 14)
    println(task2(pussy))
    val unique = listOf<Int>(1, 1, 1, 1, 1)
    println(task2(unique))
    //Почему-то криво проверяется не могу понять почему так
}

fun task2(numList: List<Int>): String {
    return when {
        numList.isEmpty() -> "Пусто"
        numList.size < 5 -> "Короткая"
        numList.getOrNull(0) == 0 -> "Стартовая"
        numList.sum() > 10000 -> "Массивная"
        numList.average() == 10.0 -> "Сбалансированная"
        numList.joinToString("").length == 20 -> "Клейкая"
        numList.max() <= -10 -> "Отрицательная"
        numList.min() > 1000 -> "Положительная"
        numList.contains(3) && numList.contains(14) -> "Пиздатая"
        else -> "Уникальная"
    }
}
