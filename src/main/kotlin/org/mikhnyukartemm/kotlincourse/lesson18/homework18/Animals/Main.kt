package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Animals

fun main() {
    val animals: List<Animal> = listOf(Animal(), Dog(), Cat(), Bird())
    for (animal in animals){
        animal.makeSound()
    }
}