package org.example.lesson_3

fun main () {
//    Задача 5* к Уроку 3
//
//    Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
//    отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.
//
//    Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих:
//    откуда, куда и номер хода, присвоить соответствующим переменным и распечатать по отдельности.

    val logStr = "D2-D4;0"

    val splitLogStr = logStr.split('-', ';')

    println("Ход номер: ${splitLogStr[2]}")
    println("Откуда: ${splitLogStr[0]}")
    println("Куда: ${splitLogStr[1]}")
}
