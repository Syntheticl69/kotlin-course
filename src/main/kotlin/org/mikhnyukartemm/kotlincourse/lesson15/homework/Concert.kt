package org.mikhnyukartemm.kotlincourse.lesson15.homework

class Concert(
    val band: String,
    val venue: String,
    val ticketPrice: Double,
    val capacity: Int
) {
    private var ticketsSold: Int = 200

    fun buyTicket() {
        if (ticketsSold < capacity) {
            ticketsSold++
            println("Билет куплен! Билетов продано: $ticketsSold")
        } else {
            println("Билеты закончились!")
        }
    }

    fun concertInfo() {
        println("Концерт группы: $band")
        println("Место проведения: $venue")
        println("Стоимость билета: $ticketPrice руб.")
        println("Вместимость зала: $capacity человек")
        println("Продано билетов: $ticketsSold")
    }
}