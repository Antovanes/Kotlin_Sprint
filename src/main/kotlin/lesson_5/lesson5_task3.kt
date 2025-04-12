package org.example.lesson_5

fun readInt(strQuestion: String): Int {

    print(strQuestion)
    val inputStr = readln()

    val i = inputStr.toIntOrNull() ?: -1
    return if (i in 0..42) i else -1
}


fun main() {
//    Задача 3 к Уроку 5
//
//    Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
//    Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.
//    Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных.
//    Оформить ввод текстовыми подсказками о том, что нужно вводить.
//    Вывести отдельным сообщением, какие числа были нужны для победы.
//
//    - если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
//    - если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
//    - если не угадано ничего, вывести “Неудача!”;
//    - программа должна учитывать ввод чисел в обратном порядке

    val numSave1 = 12
    val numSave2 = 23

    val num1 = readInt("Введите первое загаданное число (от 0 до 42): ")
    val num2 = readInt("Введите второе загаданное число (от 0 до 42): ")

//    if (num1 > num2) num1 = num2.also { num2 = num1 }

    val x1 = if (num1 == numSave1) 1 else if (num1 == numSave2) 2 else 0
    var sum = if (x1 > 0) 1 else 0

    if ((x1 == 1 && num2 == numSave2) || (x1 == 2 && num2 == numSave1) ||
        (x1 == 0 && (num2 == numSave1 || num2 == numSave2))) sum++

    val resultStr = when (sum) {
        2 -> "Поздравляем! Вы выиграли главный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(resultStr)
    println("(Были загаданы числа $numSave1 и $numSave2)")
}
