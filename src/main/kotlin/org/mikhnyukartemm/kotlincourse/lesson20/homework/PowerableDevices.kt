package org.mikhnyukartemm.kotlincourse.lesson20.homework


abstract class PowerableDevices : Powerable {
    var isOn = false

    override fun powerOn() {
        isOn = true
        println("Device is Powered On")
    }

    override fun powerOff() {
        println("Device is Powered Off")
    }
}