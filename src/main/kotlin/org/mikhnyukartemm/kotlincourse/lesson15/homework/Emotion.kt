package org.mikhnyukartemm.kotlincourse.lesson15.homework

class Emotion(
    var type: String,
    var intensity: Int
) {

        fun express(){
        println("Сегодня я $type, интенсивность $intensity")
    }
}