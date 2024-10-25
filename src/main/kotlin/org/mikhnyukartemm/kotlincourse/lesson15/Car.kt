package org.mikhnyukartemm.kotlincourse.lesson15

class Car(
    val brand: String,
    val model: String

) {

    companion object{
        val brandList = listOf("BMW", "Audi", "Lada")
    }

    fun sayMyName(){
        println("I am $brand and $model.")
    }
}