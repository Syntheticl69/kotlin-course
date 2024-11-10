package org.mikhnyukartemm.kotlincourse.lesson19

import org.mikhnyukartemm.kotlincourse.lesson19.homework19.ChildrenClass
import org.mikhnyukartemm.kotlincourse.lesson19.homework19.SlotMachine

fun main() {
    var slotMachine00 = SlotMachine("red",
        "Model 01",
        false,
        false,
        listOf("Game"),
        true,
        0.0,
        "Owner01")
    slotMachine00.turnOn()
    println(slotMachine00.listGames)
    println (slotMachine00.phoneNumber)

    val childrenClass = ChildrenClass(
        "privateVal1",
        "protectedVal2",
        "publicVal3",
    )
    childrenClass.publicField = "Антонио Бандерас"
    println(childrenClass.publicField)
    childrenClass.setProtectedField1("new Protected Field")
    childrenClass.setPrivateField("new Private field")
    childrenClass.printText()
//    childrenClass.privatePrint()
    println(childrenClass.getAll())
}