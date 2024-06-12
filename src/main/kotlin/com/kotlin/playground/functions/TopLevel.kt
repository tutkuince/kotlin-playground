package com.kotlin.playground.functions

// Top Level Functions
// Functions that does not belong to a class are top-level functions
// In Java, functions can only be part of class
// In Java applications, you can find classes that just has some static methods which holds some common logic that can be used across the app
// Kotlin avoids this by using top level functions that can be part of a "Kotlin File" not a class

// Top Level Properties
// In Kotlin, properties that does not belong to class are called top-level properties
// - In Java, you can only define properties in a class or an interface
// - Most common use case in a Java application is you may have to be define constants in a class file that can be used across the app
// Kotlin avoid these by allowing us to create properties that can be part of a "Kotlin file" not a class

const val courseName = "Kotlin Programming"

fun topLevelFunction(): Int {
    return (0..100).random()
}

fun main() {
    val num = topLevelFunction()
    println("Num is $num")
}