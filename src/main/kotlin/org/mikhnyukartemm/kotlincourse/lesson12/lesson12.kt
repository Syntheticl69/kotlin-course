package org.mikhnyukartemm.kotlincourse.lesson12
fun main() {
    println(sum(5.0, 7.0, true))
    println(getMax(3, 7))
}

fun sayHello() {
    println("Hello, world!")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int) = a * b

fun doSmth() {

}

fun geUserName(): String {
    return ""
}
fun printGreeting(arg: String) {
}
fun calc(a: Double, b: Double): Double {
    return 9.0
}
fun findMax(a: Int, b: Int): Int {
    return 0
}
fun isNullOrEmpty(a: String?): Boolean {
    return false
}
fun calcDisc(a: List<String>, b: Int?): Double? {
    return null
}
fun sum(a: Double, b: Double, flag: Boolean): Double {
    return if (flag) {
        a + b
    }
    else {
        a - b
    }
}
fun getMax(a: Int, b: Int): Int {
    return if ( a > b) {
        a
    } else {
        b
    }
}