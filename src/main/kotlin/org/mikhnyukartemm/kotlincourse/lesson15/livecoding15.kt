package org.mikhnyukartemm.kotlincourse.lesson15

fun main(){

    val lamp1 = Lamp(false)
    lamp1.switch()

    val wind1 = Wind(10)
   println(wind1.convertSpeed())

   var car1 = Car(Car.brandList[0], "m5")
    car1.sayMyName()

}