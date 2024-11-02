package org.mikhnyukartemm.kotlincourse.lesson17.homework17

fun main(){
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )
    println("----на дно-------")
    val bottomContainer = MaterialsBottom()
    ordinalNumbers.forEach { bottomContainer.addMaterial(it) }
    bottomContainer.addToBottom("Material")
    bottomContainer.printContainer()

    println("----список строк-------")
    val newList = listOf(
        "первый", "второй", "третий", "четвертый", "пятый",
        "шестой", "седьмой", "восьмой", "девятый", "десятый",
        "одиннадцатый", "двенадцатый", "тринадцатый", "четырнадцатый", "пятнадцатый",
        "шестнадцатый", "семнадцатый", "восемнадцатый", "девятнадцатый", "двадцатый"
    )

    val throughTheLineContainer = ThroughTheLine()
    ordinalNumbers.forEach { throughTheLineContainer.addMaterial(it) }
    throughTheLineContainer.alternation(newList)
    throughTheLineContainer.printContainer()

    println("----список в алфавитном порядке-------")
    val alphabetContainer = Alphabetical()
    ordinalNumbers.forEach { alphabetContainer.addMaterial(it) }
    alphabetContainer.addAlphabetically("Material")
    alphabetContainer.printContainer()

    println("----ключи/значения-------")
    val pairs = mapOf("key1" to "value1", "key2" to "value2")
    val keyValueContainer = KeyValue()
    ordinalNumbers.forEach { keyValueContainer.addMaterial(it) }
    keyValueContainer.addKeyValuePairs(pairs)
    keyValueContainer.printContainer()

}