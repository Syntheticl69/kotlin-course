package org.mikhnyukartemm.kotlincourse.lesson19.homework19
/*Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

Поля:
цвет
модель
включен
ОС загружена
список доступных игр
наличие джойстика
баланс вырученных средств
владелец
телефон поддержки.*/

class SlotMachine(
    val color: String,
    val model: String,
    private var isOn: Boolean,
    private var isLoaded: Boolean,
    val listGames: List<String>,
    val gamePadPresent: Boolean,
    private var balance: Double = 0.0,
    var owner: String,
    var phoneNumber: String = "+79021729873"
)
/*
Методы:
включить
выключить
загрузить ОС
завершить работу ОС
показать список игр
включить игру
оплатить игровой сеанс
открыть сейф и выдать наличные
выплатить выигрыш*/ {
    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        shutDownOS()
        isOn = false
    }

   private fun loadOS() {
        if (isOn) {
            isLoaded = true
        } else {
            println("Turn on the slot machine first.")
        }
    }

    private fun shutDownOS() {
        isLoaded = false
    }

    fun showGameList(): List<String> {
        println(listGames)
        return listGames
    }

    fun startGame(game: String): Boolean {
        return game in listGames
    }

    fun payForSession(amount: Double): Double {
        balance += amount
        return balance
    }

    private fun openSafe() {
    }

    private fun issueCash(issuedCash: Double): Double {
        openSafe()
        balance -= issuedCash
        return balance
    }

    fun payOut(amount: Double): Double {
        openSafe()
        issueCash(amount)
        balance -= amount
        return balance
    }
}