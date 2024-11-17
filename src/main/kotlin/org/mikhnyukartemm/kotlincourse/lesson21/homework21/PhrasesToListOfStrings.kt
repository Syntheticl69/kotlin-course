package org.mikhnyukartemm.kotlincourse.lesson21.homework21

//Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
//Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun mapper(element: String) = element.split(" ")


    override fun mapperList(element: List<String>): List<List<String>> {
        return element.map { it.split(" ") }
    }
}