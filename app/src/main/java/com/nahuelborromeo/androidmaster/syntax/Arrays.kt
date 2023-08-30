package com.nahuelborromeo.androidmaster.syntax

val weekDays= arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" )

fun main() {

    //LOOPS

    for(weekDay in weekDays){
        println(weekDay)
    }

    for(position in weekDays.indices){
        println(position)
    }

    for((position,value) in weekDays.withIndex()){
        println("The position $position have the value $value")
    }

}

fun validWeeklyDay(name: String) {
    if( weekDays.contains(name)){
        println("valid")
    } else {
        println("invalid")
    }
}

