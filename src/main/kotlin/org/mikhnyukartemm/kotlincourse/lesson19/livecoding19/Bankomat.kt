package org.mikhnyukartemm.kotlincourse.lesson19.livecoding19

class Bankomat(private var balance: Float = 0f) {
    private var pin = "123"
     fun deposit(amount: Float, pin: String) {
        checkPin(pin)
    }

    fun withdraw(amount: Float, pin: String) {
        checkPin(pin)
    }

    fun getBalance(pin: String): Float {
        checkPin(pin)
        return balance
    }

   private fun checkPin(pin: String) {
        if (pin != this.pin)
            throw Exception("ERROR")
    }
}