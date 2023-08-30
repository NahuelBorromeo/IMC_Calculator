package com.nahuelborromeo.androidmaster.syntax

fun main(){
    mutableList()
}

fun mutableList() {

    val weekDays:MutableList<String> = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    weekDays.add("NahuelDay")
    weekDays.add(0, "DamonDay")
    print(weekDays)

    //isEmpty validation
    if(weekDays.isEmpty()){
        //I dont print nothing
    } else {
        weekDays.forEach{ weekDay -> println(weekDay) }
    }

    //isNotEmpty Validation
    if(weekDays.isNotEmpty()){
        weekDays.forEach{ weekDay -> println(weekDay) }
    }

    println(weekDays.last())

    for( weekDay in weekDays) {

    }

}

fun inmutableList(){
    //Isn't necesary specific the type if we'll initializer the list now.
    val weekDays:List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    println(weekDays.size)
    println(weekDays)
    println(weekDays[0])
    println(weekDays.last())
    println(weekDays.first())

//    Filter
    val example = weekDays.filter { it.contains("o") }
    println(example)

    weekDays.forEach{ weekDay -> println(weekDay) }
    val example2 = weekDays.filter{ weekDay -> weekDay.contains("T")}
    println(example2)
}