package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Animals

class Dog : Animal() {
    override fun makeSound() {
        println("${Colors.RED}Bark${Colors.RESET}")
    }
}