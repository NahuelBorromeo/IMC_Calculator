package com.nahuelborromeo.androidmaster.syntax


//We use camelCase for variables names.
fun main() {
    numericVariables()
    print("Multiplicate: " + multiplicate(5,6))
}

//Functions
fun numericVariables() {
    /**
     * Numeric Variables
     */

    //Int -2,147,483,647 a 2,147,483,647
    val age: Int = 30
    var age2: Int = 30

    age2 = 25


    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 30

    //Float this type of variable supports 7 decimals
    val floatExample: Float = 30.5f

    //Double similar to float but this supports 14 decimals
    val doubleExample: Double = 30.2342314

    println("Sumar: ")
    println(age + age2)

    println("Restar: ")
    println(age - age2)

    println("Multiplicar: ")
    println(age * age2)

    println("Dividir: ")
    println(age / age2)

    println("Rest: ")
    println(age % age2)

}

fun alphanumericVariables() {
    /**
     * Alphanumeric Variables
     */

    //Char only supports 1 character, we declare a char variable with single quotes
    val charExample1: Char = 'c'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String we declare a string variable with double quotes
    val stringExample: String = "Nahuel Borromeo Android Dev Expert"
    val stringExample2 = "Google developer expert"

}

fun booleanVariables() {
    /**
     * Booleans Variables
     */

    //Boolean it can only be true or false
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3 = false
}

//Funtions with parameters
fun add(firstNumber: Int, secondNumber: Int) {
    print(firstNumber + secondNumber)
}

fun multiplicate(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber * secondNumber

}fun multiplicateCool(firstNumber: Int, secondNumber: Int) = firstNumber * secondNumber
