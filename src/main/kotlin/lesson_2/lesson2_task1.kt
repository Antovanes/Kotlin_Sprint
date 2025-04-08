package org.example.lesson_2

fun main () {
//    Задача 1 к Уроку 2
//
//    В классе с углубленным изучением английского языка учится 4 человека.
//    У них следующие баллы по профильному предмету 3, 4, 3, 5.
//
//    – Написать выражение, которое высчитывает средний балл;
//    – Распечатать результат в консоль;
//    – В консоли должно быть выведено дробное число с 2 знаками после запятой.

    val scoreStudent1 = 3
    val scoreStudent2 = 4
    val scoreStudent3 = 3
    val scoreStudent4 = 5

    val averageScore = (scoreStudent1 + scoreStudent2 + scoreStudent3 + scoreStudent4) / 4.0

    println("Средний балл успеваемости равен: " + String.format("%.2f", averageScore))
}
