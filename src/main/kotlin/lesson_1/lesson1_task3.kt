package org.example.lesson_1

fun main () {
    // Задача 3 к Уроку 1

    val yearFFSpace: Int = 1961  // FFSpace  = first flight into space (первый полёт в космос)
    var hourFFSpace: String = "09"
    var minuteFFSpace: String = "07"

    println("Год первого полёта в космос: $yearFFSpace")
    print("Время старта: $hourFFSpace:")
    println(minuteFFSpace)

    hourFFSpace = "10"
    minuteFFSpace = "55"
    println("Время посадки: $hourFFSpace:$minuteFFSpace")
}
