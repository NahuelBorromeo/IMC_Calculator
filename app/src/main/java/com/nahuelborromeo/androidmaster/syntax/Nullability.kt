package com.nahuelborromeo.androidmaster.syntax

fun main() {
    var name: String? = null

    /*Elvis operator ?: */
    println(name?.get(3) ?: "Is a null value")
}