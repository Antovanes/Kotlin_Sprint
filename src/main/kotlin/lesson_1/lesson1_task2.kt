package org.example.lesson_1

fun main () {
    // Задача 2 к Уроку 1

    var numberOrders: Int = 75
    val textThanks: String = "Благодарим за покупку"

    println("Количество заказов: $numberOrders")
    println("Текст благодарности за покупку: " + textThanks)

    var employeesCount: Int = 2000
//    println("Количество работников магазина: $employeesCount")

    employeesCount -= 1 // увольнение одного работника
    println("Количество работников магазина: $employeesCount")
}