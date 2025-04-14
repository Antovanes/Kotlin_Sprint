package org.example.lesson_5

fun readDouble(strQuestion: String): Double {
    print(strQuestion)
    val inputStr = readln()

    return inputStr.toDouble()
}

fun main() {
//    Задача 6* к Уроку 5       Калькулятор ИМТ
//
//    Создай консольное приложение на Kotlin, которое будет рассчитывать индекс массы тела (ИМТ) пользователя
//    и определять категорию веса на основе полученного значения.
//
//    Запроси у пользователя его вес (в килограммах) и рост (в сантиметрах).
//    Вес и рост должны быть переменными типа Double или Float.
//
//    Преобразуй рост из сантиметров в метры. Используя формулу ИМТ, рассчитай индекс массы тела:
//    ИМТ = масса тела в кг / рост в метрах в квадрате.
//
//    Используй условные операторы для определения категории ИМТ и выведи сообщение с результатом:
//
//    - ИМТ < 18.5: Недостаточная масса тела
//    - 18.5 ≤ ИМТ < 25: Нормальная масса тела
//    - 25 ≤ ИМТ < 30: Избыточная масса тела
//    - ИМТ ≥ 30: Ожирение
//
//    В конце программа должна вывести рассчитанный ИМТ с точностью до двух знаков после запятой
//    и соответствующую категорию веса.

    val userWeight = readDouble("Введите массу вашего тела (в килограммах): ")
    val userHeight = readDouble("Введите ваш рост (в сантиметрах): ") / 100

    val calcIMT = userWeight / (userHeight * userHeight)
    val weightLimit1 = 18.5
    val weightLimit2 = 25
    val weightLimit3 = 30

    val resultIMT =
        when {
            calcIMT < weightLimit1 -> "Недостаточная масса тела"
            calcIMT < weightLimit2 -> "Нормальная масса тела"
            calcIMT < weightLimit3 -> "Избыточная масса тела"
            else -> "Ожирение"
        }

    println("Ваш Индекс Массы Тела составляет: ${String.format("%.2f", calcIMT)}")
    println("Вашему ИМТ соответствует категория: $resultIMT")
}
