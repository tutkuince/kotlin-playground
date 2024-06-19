package com.kotlin.playground.exceptions

fun main() {
    println("Name Length is ${nameLength("Tutku")}")
    println("Name Length is ${nameLength(null)}")
}

fun returnNothing(): Nothing {
    throw RuntimeException("Exception!")
}

// In Kotlin, try catch block is an expression.
fun nameLength(name: String?): Int? {
    val result = try {
        name!!.length
    } catch (ex: Exception) {
        println("Exception is: $ex")
        null
    }
    return result
}
