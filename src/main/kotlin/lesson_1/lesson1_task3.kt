package org.example.lesson_1

fun main () {
    // Задача 3 к Уроку 1

    val yearFFSpace: Int = 1961  // FFSpace  = first flight into space (первый полёт в космос)
    var hourFFSpace: Short = 9
    var minuteFFSpace: Short = 7

    println("Год первого полёта в космос: $yearFFSpace")
    print("Время старта: $hourFFSpace часов ")
    println("$minuteFFSpace минут")

    hourFFSpace = 10
    minuteFFSpace = 55
    println("Время посадки: $hourFFSpace:$minuteFFSpace")
}
