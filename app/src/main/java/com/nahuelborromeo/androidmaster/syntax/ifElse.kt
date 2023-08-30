package com.nahuelborromeo.androidmaster.syntax

fun main(){
//    ifBasico("DamOn")

    ifMultipleOr()
}

fun ifBasico(name: String){

    if(name.lowercase() == "damon") {
        println("Nombre correcto")
    } else {
        println("Mi nombre no es ${name.lowercase()}")
    }
}

fun ifMultipleOr(){
    var pet = "cat"
    var isHappy = true

    if(pet == "dog" || (pet == "cat" && isHappy)){
        print("Is a dog or a happy cat")
    }
}