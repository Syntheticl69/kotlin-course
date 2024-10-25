package org.mikhnyukartemm.kotlincourse.lesson15.homework

fun main(){
    val Party1 = Party("Саратов", 30)
    Party1.details()

    val myEmotion = Emotion("Радостный", 5)
    myEmotion.express()

    val moon = Moon(false, "Full Moon")
    moon.showPhase()


    val concert = Concert("Кино", "Клуб", 2000.0, 200)
    concert.concertInfo()
    concert.buyTicket()
    concert.concertInfo()
}