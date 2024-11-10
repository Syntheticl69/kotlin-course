package org.mikhnyukartemm.kotlincourse.lesson20.homework


abstract class ProgrammableDevices : PowerableDevices(), Programmable {
    var requestedAction = ""

    override fun programAction(action: String) {
        requestedAction = action
        println("Your device has requested $requestedAction")
    }

    override fun execute() {
        println("Your device is currently doing $requestedAction")
    }
}