package org.mikhnyukartemm.kotlincourse.lesson3

val name: String = "День рождения" // Название мероприятия

val date: String = "09.10.2024" // Дата

val place: String = "Sochi, St.Ivanovskaya 125" // Адресс

var budget: Double = 0.0 // Бюджет

var member: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
        else field  = 50
    }      // Число участников может изминиться, кто-то не придет

var duration: String = "8 hours"  //Длительность хаккатона может измениться по стечению обстоятельств

lateinit var contactinformation: String   // Контактная информация будет позднее

lateinit var status: String    //  Статус мероприятия

 var sponsors: String = "список спонсоров" //Мне кажется, что список спонсоров может меняться в какихто случаях

var Internetaccesslevel: String = "Высокий" // Уровень интернета может быть разым

lateinit var mood: String  // Настроение

val Information: String = "Информация о транспартировке"; //Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.

val plan: String by lazy { "09:00, Встреча гостей"  } //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия

lateinit var specialGuest: String // Специальный гость который будет обьявлен перед началом мероприятия

var Numberofcommands: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
        else field  = 5
    }  //Количество команд

val tasks: String = "Задачи" //Перечень задач

var Evacuationplan: String = "План эвакуации" //План эвакуации

lateinit var Listofavailableequipment: String //Список доступного оборудования

lateinit var Listoffreeequipment: String //Список свободного оборудования






