package org.example.lesson_5

fun readBoolean(strQuestion: String): Boolean {
    print(strQuestion)
    val inputStr = readlnOrNull()

    return (inputStr != null &&
            (inputStr.equals("да", ignoreCase = true)) ||
            (inputStr.equals("yes", ignoreCase = true)))
}

fun main () {
//    Задача 4 к Уроку 5
//
//    Космический корабль "Heart of Gold" верифицирует каждого входящего пассажира с помощью логина и пароля.
//    Вас встречает параноидальный робот-андройд Марвин.
//
//    Есть зарегистрированный бортовой пользователь с именем "Zaphod" и паролем "PanGalactic".
//    Этот пользователь имеет доступ к управлению кораблем и может осуществлять навигацию по вселенной.
//
//    Бортовой робот-андроид Марвин запрашивает имя пользователя для входа в систему.
//    Система должна проверить, зарегистрирован ли пользователь.
//    Если нет, то система должна предложить пользователю зарегистрироваться и закончить процесс тут (завершить программу).
//
//    Если же пользователь уже зарегистрирован, система должна проверить пароль.
//    При успешной авторизации система должна вывести приветственное сообщение:
//    "Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold"".

    val userAdmName = "Zaphod"
    val userAdmPass = "PanGalactic"

    println("Вас приветствует бортовой робот-андроид Марвин!")
    print("Пожалуйста введите ваше имя пользователя: ")
    val userName = readln()

    print("Пожалуйста введите ваш пароль: ")
    val userPass = readln()

    if (userName == userAdmName) {
        if (userPass == userAdmPass)
            println("Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\"!")
        else
            println("Введён неверный пароль!\nПопробуйте войти в систему ещё раз...")
    } else {
        println("Пользователь $userName в системе корабля не зарегистрирован!")
        if (readBoolean("Зарегистрировать нового пользователя \"$userName\"? ")) {
            print("Подтвердите введённый ранее пароль: ")
            val userPassConfirm = readln()
            if (userPassConfirm == userPass)
                println("Пользователь с именем \"$userName\" успешно зарегистрирован в системе!")
            else
                println("Пароли не совпадают, регистрация нового пользователя отменена!")
        }
    }
}
