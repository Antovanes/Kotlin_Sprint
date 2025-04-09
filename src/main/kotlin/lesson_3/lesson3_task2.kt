package org.example.lesson_3

fun main () {
//    Задача 2 к Уроку 3
//
//    Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова, и поменяла фамилию.
//    О ней есть запись в одном из государственных приложений.
//    Приложение отслеживает изменения персональных данных граждан.
//
//    Выведи в консоль данные на момент когда ей было 20 и на момент когда ей было 22 в формате [ФИО, возраст].
//    Все части ФИО и возраст изначально хранятся в отдельных переменных.

    val girlName = "Татьяна"
    val girlPatronymic = "Сергеевна"
    var girlSurname = "Андреева"
    var girlAge = 20

    println("$girlSurname $girlName $girlPatronymic, $girlAge")

    girlSurname = "Сидорова"
    girlAge = 22

    println("$girlSurname $girlName $girlPatronymic, $girlAge")
}
