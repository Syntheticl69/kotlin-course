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
    var y = 5
    do {
        println(y--)

    }
        while (y >= 1)
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
    var i2 = 1
    while (true) {
        println(i2)
        if (i2 == 10) break
        i2++
    }
    for (i in 1..10) {
        if (i % 2 == 0) continue
            println(i)
    }
    for (i in 1..10) {
        if (i % 3 == 0) continue
        println(i)
    }
    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            print(" ")
        }
       println()
    }
}