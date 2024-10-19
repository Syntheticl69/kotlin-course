package org.mikhnyukartemm.kotlincourse.lesson14

fun main() {
    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    for ((fruit, price) in fruitsPrices) {
        println("Key: $fruit, Value: $price")
    }

    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values

    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { throw IllegalArgumentException() }
    val priceOfApple = fruitsPrices.getValue("apple")
//    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)
//}
}