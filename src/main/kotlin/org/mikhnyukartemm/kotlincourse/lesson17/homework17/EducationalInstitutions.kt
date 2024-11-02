package org.mikhnyukartemm.kotlincourse.lesson17.homework17

/*
Учебные Заведения
Базовый класс: Учебное Заведение
Производные классы: Школа, …
Дополнительное разветвление для …: …
 */


open class EducationalInstitutions(
    val name: String,
    val address: String,
)

 class School(
     name: String,
     address: String,
     val studentCount: Int): EducationalInstitutions(name, address,)






