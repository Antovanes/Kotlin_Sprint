package org.example.lesson_1

fun main () {
    // Задача 5* к Уроку 1

    var secondFFSpace: Int = 6480   // количество секунд
    var minuteFFSpace: Int          // минут, и
    var hourFFSpace: Int            // часов, которое Гагарин провел в космосе

    hourFFSpace = secondFFSpace / 3600
    minuteFFSpace = (secondFFSpace % 3600) / 60
//    secondFFSpace = secondFFSpace % 60

    print("Время, проведённое Гагариным в космосе: ")
    print(hourFFSpace.toString().padStart(2, '0') + ':')
    print(minuteFFSpace.toString().padStart(2, '0') + ':')
    println((secondFFSpace % 60).toString().padStart(2, '0'))
}
