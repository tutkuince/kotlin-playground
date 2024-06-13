package com.kotlin.playground.cast

import com.kotlin.playground.classes.Course

/**
 * Type Checking & Casting
 *
 * Kotlin has some handy operators
 *  - "is" operator
 *      - Check a particular value is of a certain type
 *      value name = "Tutku"
 *      val result = name is String -> true or false
 *  - "as" operator
 *      - Cast a value to a certain type
 *      value name = "Tutku" as String
 *  - If a cast is not possible then it throws java.lang.ClassCastException
 * */

fun checkType(type: Any) {
    when(type) {
        is Course -> {
            // val course = type as Course -> this is redundant
            // This is smart casting
            println(type)
        }
        is String -> {
            println(type.uppercase())
        }
    }
}

fun castNumber(any: Any) {
    when(any) {
        any as Double -> println("Value is Double")
    }
}

fun main() {
    val course: Course = Course(1, "Advanced Kotlin", "Tutku")
    checkType(course)
    checkType("ince")

    castNumber(1.0)
    // castNumber(1) -- class java.lang.Integer cannot be cast to class java.lang.Double
    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)
}

