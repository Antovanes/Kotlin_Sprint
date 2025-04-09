package org.example.lesson_1

const val SECOND_PER_HOUR = 3600
const val MINUTE_PER_HOUR = 60

fun main () {
    // Задача 5* к Уроку 1

    var secondFFSpace: Int = 6480   // количество секунд
    var minuteFFSpace: Int          // минут, и
    var hourFFSpace: Int            // часов, которое Гагарин провел в космосе

    hourFFSpace = secondFFSpace / SECOND_PER_HOUR
    minuteFFSpace = (secondFFSpace % SECOND_PER_HOUR ) / MINUTE_PER_HOUR

    print("Время, проведённое Гагариным в космосе: ")
    print(String.format("%02d", hourFFSpace) + ':')
    print(String.format("%02d", minuteFFSpace) + ':')
    println(String.format("%02d", secondFFSpace % MINUTE_PER_HOUR))
}
