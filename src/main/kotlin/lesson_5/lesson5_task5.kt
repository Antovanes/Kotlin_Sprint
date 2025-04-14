package org.example.lesson_5

fun readInt(strQuestion: String): Int {

    print(strQuestion)
    val inputStr = readln()

    val i = inputStr.toIntOrNull() ?: -1
    return if (i in 0..42) i else -1
}

fun main () {
//Задача 5* к Уроку 5

// Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42.
// Пользователь вводит числа через консоль.
//
// Требования к программе:
//
//- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
//- Поочередно введенные пользователем числа должны также храниться в списке.
//- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции в отдельную переменную.
//
//В зависимости от количества угаданных чисел программа выводит результат:
//
//- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
//- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
//- Если угадано одно число, пользователю выплачивается утешительный приз.
//- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
//- В конце игры вне зависимости от результата программа выводит выигрышные числа.

    val hiddenList = mutableListOf<Int>()
    hiddenList.add((0..42).random())
    hiddenList.add((0..42).random())
    hiddenList.add((0..42).random())

    val numList = mutableListOf<Int>()
    println("Угадайте 3 загаданных числа в диапазоне от 0 до 42 - и получите приз!")
    numList.add(readInt("Введите первое загаданное число: "))
    numList.add(readInt("Введите второе загаданное число: "))
    numList.add(readInt("Введите третье загаданное число: "))

    val resultList = numList.intersect(hiddenList)

    val resultStr = when (resultList.size) {
        3 -> "Поздравляем! Вы выиграли джекпот!!!"
        2 -> "Поздравляем! Вы выиграли крупный приз!"
        1 -> "Вы угадали одно из 3-х чисел и получаете утешительный приз!"
        else -> "К сожалению вы не угадали ни одного из 3-х чисел..."
    }

    println(resultStr)
    println("(Были загаданы числа $hiddenList)")
}
