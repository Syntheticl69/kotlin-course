package org.mikhnyukartemm.kotlincourse.lesson15.homework

class Moon(
    var isVisible: Boolean,
    var phase: String
) {
    fun showPhase() {
        if (isVisible) {
            println("Луна видима и её текущая фаза: $phase.")
        } else {
            println("Луна не видима.")
        }
    }
}