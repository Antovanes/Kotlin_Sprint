package org.example.lesson_4

fun readBoolean(strQuestion: String): Boolean {
    print(strQuestion)
    val inputStr = readlnOrNull()

    return (inputStr != null && inputStr.equals("да", ignoreCase = true))
}

fun readInt(strQuestion: String): Int {
    print(strQuestion)
    val inputStr = readln()

    return inputStr.toIntOrNull() ?: 0
}

const val CASE_IS_DAMAGED = false
const val CREW_NUMBER_MIN = 55
const val CREW_NUMBER_MAX = 70
const val PROVISION_COUNT = 50

fun main () {
//    Задача 5* к Уроку 4
//
//    Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:
//
//    - корабль не имеет повреждений;
//    - число экипажа составляет от 55 (включительно) до 70 человек (включительно);
//    - на борту есть более 50 ящиков провизии (не включительно);
//    - погода благоприятна или неблагоприятна.
//
//    Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:
//
//    - на борту рекомендованный состав экипажа 70 человек;
//    - погода благоприятная;
//    - на борту есть 50 и более ящиков провизии.
//
//    В качестве входных данных используй информацию, введенную через консоль:
//
//    - наличие повреждений корпуса (Boolean переменная);
//    - текущий состав экипажа;
//    - количество ящиков с провизией на борту;
//    - благоприятность метеоусловий (Boolean переменная).
//
//    Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
//    Программа должна анализировать эти данные и выводить результат в консоль.
//    Для анализа должно использоваться единое составное условие, состоящие только из логических операторов.

    val caseIsDamaged = readBoolean("Корпус корабля повреждён? (да/нет): ")
    val numberOfCrew = readInt("Введите число экипажа: ")
    val numberOfProvision = readInt("Введите количество ящиков провизии: ")
    val weatherIsFavorable = readBoolean("Погода благоприятная? (да/нет): ")

    println()
    if ((caseIsDamaged == CASE_IS_DAMAGED
                && numberOfCrew in CREW_NUMBER_MIN..CREW_NUMBER_MAX
                && numberOfProvision > PROVISION_COUNT)
        or (numberOfCrew == CREW_NUMBER_MAX
                && weatherIsFavorable &&
                numberOfProvision >= PROVISION_COUNT)
    ) {
        println("Корабль может отправиться в плавание!")
    } else {
        println("Кораблю нельзя отправляться в плавание!")
    }
}