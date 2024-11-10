package org.mikhnyukartemm.kotlincourse.lesson20.homework

abstract class TemperatureRegulatableDevices : ProgrammableDevices(), TemperatureRegulatable, Openable {

    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }
}