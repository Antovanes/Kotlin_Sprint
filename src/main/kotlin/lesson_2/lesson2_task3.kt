package org.example.lesson_2

const val MINUTE_PER_HOUR = 60

fun main () {
//    Задача 3 к Уроку 2
//
//    Сайт с расписанием поездов получает данные с сервера.
//    Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
//    Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//
//    – Создай целочисленные переменные и проинициализируй их этими данными;
//    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//    – Выведи результат в консоль.

    val trainStartTime = 9 * MINUTE_PER_HOUR + 39   // (время отправления поезда в минутах)
    val trainRouteTime = 457                        // (время в пути в минутах)

    val trainArrivalTime = trainStartTime + trainRouteTime // (время прибытия поезда в минутах)
    val trainArrivalTimeHour = trainArrivalTime / MINUTE_PER_HOUR
    val trainArrivalTimeMinute = trainArrivalTime % MINUTE_PER_HOUR

    print("Время прибытия поезда: ${String.format("%02d", trainArrivalTimeHour)}")
    println(":${String.format("%02d", trainArrivalTimeMinute)}")
}
