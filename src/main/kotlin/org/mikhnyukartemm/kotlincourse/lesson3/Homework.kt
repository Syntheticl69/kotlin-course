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

private val privacyPolicy: String = ""//Политика конфиденциальности

private val privateReviews: String by lazy { "" }//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.

val monitoring: String = "" //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.

var lightingLevel: Int = 1200 //Уровень освещения

private  val eventLog: String = "" //Лог событий мероприятия

val availabilityOfMedicalCare: Boolean = true //Доступность медицинской помощи

val securityPlan: String = ""  //Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.

val eventRegistrationNumber: Int = 234367 //Регистрационный номер мероприятия

val maximumPermissibleNoiseLevel: Int = 123 //Максимально допустимый уровень шума в помещении хакатона.

var noiseLevelIndicator: String = ""  // Индикатор превышения уровня шума

var eventFormat: String = ""  //Формат мероприятия (зависит от геополитической обстановки)

var numberOfAvailableSeats: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field += value
    } //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.

val pressRelationsPlan: String = ""  //План взаимодействия с прессой

private val projectInformation: String by lazy { "" }//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.

var permissionStatus: String = "" //Статус получения всех необходимых разрешений

val exclusiveResources: Boolean = true or false//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)

val listPartners: String = "" //Список партнеров мероприятия

lateinit var report: String //Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.

val prizeDistributionPlan: String = "" //План распределения призов

private val contactInformation: String = "+123953848"//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.










