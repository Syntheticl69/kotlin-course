package org.mikhnyukartemm.kotlincourse.lesson11

// Словари (MAP)
fun main() {

    val pair: Pair<Int, String> = 1 to "a" // 1 ключ и 2 значения
    val pair2 = Pair(2, "a")

    println(pair.first)
    println(pair.second)

    val emptyMap: Map<String, String> = mapOf<String, String>()


    val a1 = "Россия" to "Москва"
    val a2 = "Франция" to "Париж"
    val capitals = mapOf(a1, a2)
    println(capitals)

    val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")

    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

    val capitalOfRussia = capitals["Франция"]
    println(capitalOfRussia)

    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Россия")

    for (entries in mutableCapitals) {
        println("${entries.key}: ${entries.value}")
    }

    for ((country, capital) in capitals) {
        println("$country: $capital")
    }

    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

//Практика

    val myMap = mapOf<String, Int>()
    val myMap2 = mapOf(1 to "a", 2 to "b")
    val myMap3 = mutableMapOf(1 to "a")

    myMap3[34] = "asf"
    myMap3[4] = "g"
    println(myMap3[34])
    println(myMap3[4])
    myMap3.remove(34)

    for (enteries in myMap2) {
        println("${enteries.key}:{${enteries.value}}")
    }

    for ((key, value) in myMap2) {
        println("$key : $value")
    }

    val myOneMap: Map<String, List<Int>> = mapOf("st" to listOf(1, 2, 3))


    fun searchKey(myMap: Map<String, String>, word: String): String {
        for ((key, value) in myMap) {
            if (value == word) return key

        }
        return "Error"
    }


    val daysMap = mapOf<String, List<String>>()
    val mapYear = mapOf<String, MutableMap<String, String>>()
    val mapInventory = mapOf<String, MutableSet<Int>>()


}




