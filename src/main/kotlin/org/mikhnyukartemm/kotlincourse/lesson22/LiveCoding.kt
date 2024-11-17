package org.mikhnyukartemm.kotlincourse.lesson22

fun String.funA(arg1: String, arg2: Int): Boolean {
    return true
}

fun List<Int>.funB(arg1: String?) {

}

fun <K, V> Map<K, V>.funC(arg1: K, arg2: V): Boolean {
    return true
}

fun Double?.funD(arg1: Double, arg2: String?): Double {
    return 0.0
}

fun <T> Set<T>.funE(arg1: T): List<T> {
    return listOf()
}

fun Double.format(): String {
    return "%,.2f".format(this)
}

fun String.worldCount(): Int {
    return split(" ").size
}

fun <T> T.createList(n: Int): List<T> {
    return (0 until n).map {
        println("it: $it")
        println("this: $this")
        this
    }

}
//    val list = mutableListOf<T>()
//
//    for (i in 0 until  n){
//        list.add(this)
//    }
//    return list.toList()


fun main() {
    println("sadas".funA("sdasd", 1))
    listOf(1, 2).funB(null)
    mapOf(123 to "sadsa").funC(213, "dsad")

    val num1 = null
    // println(num1.funD(0.0,"sdsd"))

    num1.funD(0.2, "sdsd")

    println(setOf("asdas", "sdadas").funE("asds"))

    var num: Double = 58.12345
    println("%.2f".format(num))

    var str = "aaa bbb ccc dddd"
    println(str.split(" ").size)
    println(str.worldCount())

    var num3 = "123"
    val list = listOf(num3)
    val list2 = listOf(num3, num3, num3)
    println(num3.createList(5))

}