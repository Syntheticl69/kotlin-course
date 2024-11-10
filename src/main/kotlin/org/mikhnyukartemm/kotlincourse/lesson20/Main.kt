package org.mikhnyukartemm.kotlincourse.lesson20


import org.mikhnyukartemm.kotlincourse.lesson20.homework.FridgeNotAbstract
import org.mikhnyukartemm.kotlincourse.lesson20.homework.KettleNotAbstract
import org.mikhnyukartemm.kotlincourse.lesson20.homework.OvenNotAbstract
import org.mikhnyukartemm.kotlincourse.lesson20.homework.WashingMachineNotAbstract

fun main() {

    val fridge = FridgeNotAbstract()
    fridge.powerOn()
    fridge.emitLight()
    fridge.setTemperature(60)

    val kettle = KettleNotAbstract()
    kettle.programAction("water")
    kettle.getWater(200)

    val washingMachine = WashingMachineNotAbstract()
    washingMachine.powerOn()
    washingMachine.drain()
    washingMachine.connectToWaterSupply()

    val oven = OvenNotAbstract()
    oven.move("thee", 400)
    oven.powerOn()



}