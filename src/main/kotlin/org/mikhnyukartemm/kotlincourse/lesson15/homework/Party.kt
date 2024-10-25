package org.mikhnyukartemm.kotlincourse.lesson15.homework

class Party(
    val location: String,
    var attendees: Int
) {

    fun details(){
        println(" локация $location, $attendees")
    }
}