package org.mikhnyukartemm.kotlincourse.lesson7

import kotlin.time.times

fun main() {
    for (i in 1..5) {
        println(i)
    }
    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }
    for (i in 5 downTo 1) {
        println(i)
    }
    for (i in 10 downTo 1) {
        if (i % 2 == 0)
            println(i)
    }
    for (i in 1..9 step 2) {
        println(i)
    }
    for (i in 1..20 step 3) {
        println(i)
    }
    for (i in 1 until 9) {
        println(i)
    }
    for (i in 3 until 15) {
        println(i)
    }
    var i1 = 0
    while (i1++ < 5) {
        println(i1 * i1)
    }
    var i = 10
    while (i >= 5) {
        println(i--)
    }











}