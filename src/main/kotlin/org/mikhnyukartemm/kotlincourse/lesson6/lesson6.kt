package org.mikhnyukartemm.kotlincourse.lesson6

fun main() {
    val number = 6
    if (number > 5) {
        println("число больше 5")
    } else {
        println("число меньше или равно 5")
    }


//fun main(){
    val number2: Int = 5

    if (number2 < 0) {
        println("Число отрицательное")
    } else if (number == 0) {
        println("Число равно 0")
    } else {
        println("Число положительное")
    }


    //    if(условие1) {
//        //код, если условие 1 истинно
//    } else if(уусловие2) {
//        //код, если условие 2 истинно
//    } else {
//        //если оба условия ложны


    val intRange: IntRange = 1..10 //Диапозон возрастающий
    val intRangeUntil = 1 until 10 //Диапозон не включительно
    val downTo = 10 downTo 1 //От большего к меньшему
    val carRange: CharRange = 'd'..'r' //Диапозон символов

    val inRange = 11 in intRange

    println(intRange)
    println(inRange)

//    when (значение){
//        выражение1 -> {kod}
//        выражение2 -> {kod}
//    }

    val score = 111
    when {
        score > 100 -> println("Не коректное значение")
        score in 90..100 -> println("Perfect")
        score in 80..89 -> println("Great")
        score in 70..79 -> println("Norm")
        else -> println("НУЖНО ПОДУЧИТЬ")
    }

    val a = 5
    val b = 4
    val max = if (a > b) {
        val c = a * b
        c
    } else {
        b
    } //Вычесление значения для переменных

    println(max)

    val scoree = 95
    val result = when (scoree) {
        in 90..100 -> ("Perfect")
        in 80..89 -> ("Great")
        in 70..79 -> ("Norm")
        else -> ("НУЖНО ПОДУЧИТЬ")
    }
    println(result)

    fun getTimesOfDay(hour: Int): String {
        return if (hour < 0 || hour > 23) {
            "неверное значение времени"
        } else if (hour in 0..4) {
            "Ночь"
        } else if (hour in 5..11) {
            "Утро"
        } else if (hour in 12..16) {
            "День"
        } else {
            "Вечер"
        }
    }


}

// ЗАДАЧИ Проверить длину пароля
 fun checkPassword (password: String) : Boolean{
     if (password.length <= 8 ) return false
   // if (checkSymvols(password)) return  true
   // return false
    return  checkSymvols(password)
 }

fun checkSymvols (password: String) : Boolean{
    return false
}
//НАПИШИТЕ ФУН БАЛ ОТ 0 до 100 и вернуть оценку в формате от а до с

fun convertMark(mark: Int) : String{
    return when(mark){
        in 0 .. 20 -> "f"
        in 21 .. 40 -> "e"
        in 41 .. 60 -> "d"
        in 61 .. 80 -> "c"
        in 81 .. 90 -> "b"
        in 91 .. 100 -> "a"
        else -> "nvalid mark"
    }
    //return result
}