package com.nahuelborromeo.androidmaster.syntax

fun main() {
    result("Damon")
}

//We can check the type of the variable in a when condition
fun result(value: Any) {
    when (value) {
        is Int -> value + value
        is String -> print(value)
        is Boolean -> if (value) print("True value")
    }
}

//Implicit return
fun getSemester(month: Int) =
    when (month) {
        in 1..6 -> "First Semester"
        in 7..12 -> "Second Semester"
        !in 1..12 -> "Invalid Semester"
        else -> "dasd"
    }


fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> print("First Trimester")
        4, 5, 6 -> print("Second Trimester")
        7, 8, 9 -> print("Third Trimester")
        10, 11, 12 -> print("Fourth Trimester")
        else -> print("Invalid trimester")
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> {
            println("Is")
            print("October")
        }

        11 -> println("November")
        12 -> println("December")
        else -> println("Is not a valid month")
    }
}
