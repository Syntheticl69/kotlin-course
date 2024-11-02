package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Animals

class Cat : Animal() {
    override fun makeSound() {
        println("${Colors.GREEN}Meow${Colors.RESET}")
    }
}