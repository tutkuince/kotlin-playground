package com.kotlin.playground.functions

import java.time.LocalDate

// Functions are primarily used in Object Oriented Language to express some behavior or logic

fun main() {
    printName("Tutku")
    val result = additionV2(1, 2)
    println("Result is: $result")
    printPersonDetails("Tutku")
    // Caller can invoke the function using the name of the function arguments, in no particular order
    printPersonDetails(birthDate = LocalDate.parse("2000-01-01"), name = "Utku", email = "utku@mail.com")
}

fun addition(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun additionV2(num1: Int, num2: Int): Int = num1 + num2

// Functions with no return value are represented as "Unit" in Kotlin
// It is like void in Java
fun printName(name: String): Unit {
    println("Name is $name")
}

// Default Value Parameters
// This provides a default value to a function parameter when it's not passed by the caller
fun printPersonDetails(name: String, email: String = "", birthDate: LocalDate = LocalDate.now()) {
    println("Name is $name and the email is $email and the date of birth is $birthDate")
}
