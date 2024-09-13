package org.mikhnyukartemm.kotlincourse.lesson3

val name: String = "Hackathon Survival" // Название мероприятия

var date: String = "09.10.2024" // Дата

val place: String = "Sochi, St.Ivanovskaya 125" // Адресс

private val budget: String = "50000" // Бюджет

var member: Int = 0
    get() = field
    private set(value) {field=value} // Число участников может изминиться, кто-то не придет, но оно не может быть отрицательным

var duration: Long = 8*60*60  //Длительность хаккатона может измениться по стечению обстоятельств

private lateinit var contactinformation: String   // Контактная информация будет позднее

var status: String = "Не начат"   //  Статус мероприятия

val sponsors: String = "список спонсоров" //Мне кажется, что список спонсоров может меняться в какихто случаях

var internetAccessLevel: Int = 0 // Уровень интернета может быть разым

val mood: String by lazy { "" }// Настроение определяется по результатам опроса

private var information: String = "Информация о транспартировке"; //Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.

lateinit var  plan: String   //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия

lateinit var specialGuest: String // Специальный гость который будет обьявлен перед началом мероприятия

var numberOfCommands: Int = 0
     //Количество команд

val tasks: String = "Задачи" //Перечень задач

val evacuationPlan: String = "План эвакуации" //План эвакуации

var listOfAvailableEquipment: String = "50" //Список доступного оборудования

var listOfFreeEquipment: String = "50" //Список свободного оборудования

val planInCaseOfFailures: String = "План мероприятия на случай сбоев" //План мероприятий на случай сбоев

lateinit var mealSchedule: String //График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

var listOfExpertsAndJury: String = "" //Список экспертов и жюри

val metod: String = ""//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

var temperatureIndoor: Int = 24  //Температура помещения



