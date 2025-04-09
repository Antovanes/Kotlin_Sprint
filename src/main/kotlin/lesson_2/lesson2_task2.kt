package org.example.lesson_2

fun main() {
//    Задача 2 к Уроку 2
//
//    В компании работало 50 человек с зарплатой по 30000 рублей.
//    Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
//    Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//    – Расходы на выплату зарплаты постоянных сотрудников;
//    – Общие расходы по ЗП после прихода стажеров;
//    – Среднюю ЗП одного сотрудника после устройства стажеров.
//
//    Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
//    Все значения необходимо вывести в виде целых чисел.

    val workerCount = 50
    val workerSalary = 30000
    val internCount = 30
    val internSalary = 20000

    val workerSummary: Int = workerSalary * workerCount
    val allSummary: Int = workerSummary + (internSalary * internCount)
    val averageSalary: Int = allSummary / (workerCount + internCount)

    println("Расходы на выплату зарплаты постоянных сотрудников: $workerSummary")
    println("Общие расходы по ЗП после прихода стажеров: $allSummary")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")
}
