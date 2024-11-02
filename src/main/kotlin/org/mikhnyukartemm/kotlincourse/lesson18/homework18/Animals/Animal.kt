package org.mikhnyukartemm.kotlincourse.lesson18.homework18.Animals
/*Животные и Их Звуки
Базовый класс: Animal с методом makeSound().
Классы наследники: Dog, Cat, Bird.
Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.
Создайте список животных List<Animal> и вызовите в цикле метод makeSound()
 */
open class Animal {
    open fun makeSound() {
        println("${Colors.BLUE}This animal makes no sound${Colors.RESET}")
    }
}