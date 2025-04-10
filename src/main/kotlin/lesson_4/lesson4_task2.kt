package org.example.lesson_4

fun main () {
//Задача 2 к Уроку 4

// При работе на таможенном терминале важно точно определить категорию каждого груза.
// Напиши программу, которая проверяет, соответствует ли груз категории "Average".
// Эта категория имеет следующие параметры: вес от 35 кг (не включительно) до 100 кг (включительно),
// и объем меньше 100 литров (не включительно).

// Создай программу, которая отображает соответствие данных груза категории "Average".
// Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".

// - укажи предварительно заданные параметры категории;
// - проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
// - сделай сравнение непосредственно внутри println() и без использования диапазонов.

    val averageWeightFrom = 35
    val averageWeightTo = 100
    val averageVolume = 100

    val cargo1weight = 20   // вес 1-го проверочного груза
    val cargo1volume = 80   // объём 1-го проверочного груза

    val cargo2weight = 50   // вес 2-го проверочного груза
    val cargo2volume = 100  // объём 2-го проверочного груза

    var strAccordance = if ((cargo1weight > averageWeightFrom)
        and (cargo1weight <= averageWeightTo) and (cargo1volume < averageVolume)) "" else "не"

    println("Груз с весом ${cargo1weight}кг и объемом ${cargo1volume}л $strAccordance соответствует категории 'Average'")

    strAccordance = if ((cargo2weight > averageWeightFrom)
        and (cargo2weight <= averageWeightTo) and (cargo2volume < averageVolume)) "" else "не"

    println("Груз с весом ${cargo2weight}кг и объемом ${cargo2volume}л $strAccordance соответствует категории 'Average'")
}
